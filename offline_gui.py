import tkinter as tk
import sounddevice as sd
from scipy.io.wavfile import write
from faster_whisper import WhisperModel
from transformers import AutoTokenizer, AutoModelForCausalLM
import torch
import pyttsx3
import os

# Configurações do Whisper
whisper_model = WhisperModel("base", device="cpu")

# Configurações do modelo LLM (GPT-2)
current_dir = os.path.dirname(os.path.abspath(__file__))
llm_model_name = os.path.join(current_dir, "gpt2_model")
    
# Verifica se o modelo existe localmente
if not os.path.exists(llm_model_name):
    print(f"Modelo não encontrado em {llm_model_name}. Baixando o modelo...")
    llm_tokenizer = AutoTokenizer.from_pretrained("gpt2")
    llm_model = AutoModelForCausalLM.from_pretrained("gpt2")
    
    # Salva o modelo localmente
    llm_tokenizer.save_pretrained(llm_model_name)
    llm_model.save_pretrained(llm_model_name)
    print(f"Modelo salvo em {llm_model_name}")
else:
    print(f"Carregando modelo de {llm_model_name}")
    llm_tokenizer = AutoTokenizer.from_pretrained(llm_model_name, local_files_only=True)
    llm_model = AutoModelForCausalLM.from_pretrained(llm_model_name, local_files_only=True)

# Configurações do áudio
SAMPLE_RATE = 16000  # Taxa de amostragem para Whisper
DURATION = 5  # Duração da gravação em segundos

# Inicializar o motor de TTS
tts_engine = pyttsx3.init()

# Função para gravar áudio
def gravar_audio():
    print("Gravando áudio...")
    audio = sd.rec(int(SAMPLE_RATE * DURATION), samplerate=SAMPLE_RATE, channels=1, dtype="int16")
    sd.wait()
    print("Gravação finalizada.")
    return audio

# Função para salvar áudio
def salvar_audio(audio, arquivo):
    write(arquivo, SAMPLE_RATE, audio)

# Função para transcrever o áudio
def transcrever_audio(arquivo):
    try:
        segments, _ = whisper_model.transcribe(arquivo)
        transcricao = " ".join(segment.text for segment in segments)
        print(f"Transcrição: {transcricao}")
        return transcricao.strip()
    except Exception as e:
        print(f"Erro na transcrição: {e}")
        return "Erro na transcrição."

# Função para gerar resposta do modelo LLM
def responder_pergunta(pergunta):
    try:
        input_ids = llm_tokenizer.encode(pergunta, return_tensors="pt")
        output = llm_model.generate(input_ids, max_length=100, num_return_sequences=1, no_repeat_ngram_size=2)
        resposta = llm_tokenizer.decode(output[0], skip_special_tokens=True)
        print(f"Resposta do modelo: {resposta}")
        return resposta
    except Exception as e:
        print(f"Erro ao gerar resposta do modelo: {e}")
        return "Erro ao gerar resposta."

# Função para converter texto em fala
def falar_resposta(resposta):
    try:
        print(f"Falando a resposta: {resposta}")
        tts_engine.say(resposta)
        tts_engine.runAndWait()
    except Exception as e:
        print(f"Erro ao falar a resposta: {e}")

# Função principal do botão
def gravar_e_responder():
    try:
        # Gravar áudio
        audio = gravar_audio()
        audio_path = "audio_microfone.wav"
        salvar_audio(audio, audio_path)

        # Transcrever o áudio
        transcricao = transcrever_audio(audio_path)
        caixa_texto.config(state="normal")
        caixa_texto.insert(tk.END, f"\nPergunta: {transcricao}\n")
        caixa_texto.config(state="disabled")

        if "Erro" in transcricao:
            return

        # Gerar resposta do modelo
        resposta = responder_pergunta(transcricao)
        caixa_texto.config(state="normal")
        caixa_texto.insert(tk.END, f"Resposta: {resposta}\n")
        caixa_texto.config(state="disabled")

        # Converter resposta em fala
        falar_resposta(resposta)
    except Exception as e:
        print(f"Erro no fluxo principal: {e}")

# Interface gráfica com Tkinter
root = tk.Tk()
root.title("Chat com Gravação de Voz")
root.geometry("500x500")

# Caixa de texto para exibir mensagens
caixa_texto = tk.Text(root, width=60, height=20, state="disabled", wrap="word")
caixa_texto.pack(pady=10, padx=10, fill=tk.BOTH, expand=True)

# Botão para gravar áudio e responder
botao_gravar = tk.Button(root, text="Gravar Voz e Responder", command=gravar_e_responder)
botao_gravar.pack(pady=20)

# Inicia o loop principal do Tkinter
root.mainloop()

