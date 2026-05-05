<html>
  <body>
     <table align="center">
     <tr>
      <p align="center">    <img width="1300" height="600" alt="Img0" src="https://github.com/user-attachments/assets/92f6d5ab-6019-4d79-8b8c-28d3b51c4fd0" />
</p>
     </tr>
    </table>

  <ol>
    <h3><li><b>Descrição do Projeto</b></li></h3>
    <p align="justify">
      O projeto consiste em uma aplicação desktop desenvolvida em Java que permite a usuários não técnicos interagirem com dados por meio de linguagem natural. O sistema funciona como um chatbot inteligente: o usuário insere um documento PDF e faz perguntas em linguagem natural através de uma interface semelhante a um chat. A inteligência artificial — utilizando o modelo Mistral via Ollama4j — lê e interpreta o conteúdo do PDF, processa a pergunta do usuário e devolve a resposta em linguagem natural de forma clara e objetiva.</br>
      O projeto foi desenvolvido durante o segundo semestre do curso de Análise e Desenvolvimento de Sistemas (ADS) na FATEC, como parte da disciplina de Aprendizagem por Projetos Integrados (API), tendo como cliente interno o Prof. Giuliano Bertoti.</br>  
    </p>
      <ol>
        <h4><li><b>Objetivo Geral</b></li></h4>
        <p align="justify">
       Desenvolvimento de uma aplicação desktop em Java capaz de receber perguntas em linguagem natural, interpretar documentos PDF com auxílio de inteligência artificial e retornar respostas de forma acessível, eliminando a necessidade de conhecimento técnico por parte do usuário.
        </p>
        <h4><li><b>Objetivos Específicos</b></li></h4>
        <p align="justify">
        Como objetivos específicos temos:
          <ul>
            <li>Uso de Metodologia Ágil Scrum para Planejamento, desenvolvimento de Backlog do Produto e consolidação do Mínimo Produto Viável (MVP) para cada Sprint;</li>
            <li>Integração do modelo de linguagem Mistral (Hugging Face) via Ollama4j para processamento de linguagem natural e interpretação de documentos;</li>
            <li>Desenvolvimento de interface gráfica em Java com experiência de uso semelhante a um chat;</li>
            <li>Armazenamento e gerenciamento de dados utilizando MySQL;</li>
            <li>Leitura e interpretação de arquivos PDF para extração de contexto e geração de respostas.</li>
          </ul>
          </p> 
        </ol>    
        <p align="justify">
        A partir dos objetivos propostos, a aplicação foi dividida em dois módulos principais: <b>interface de chat</b> e <b>motor de processamento</b>.</br>
        No módulo de <b>interface de chat</b>, o usuário realiza o upload de um documento PDF e interage com o sistema por meio de perguntas em linguagem natural, como se estivesse conversando com um assistente virtual. No módulo de <b>motor de processamento</b>, o sistema utiliza o Ollama4j integrado ao modelo Mistral para ler o conteúdo do PDF, interpretar a pergunta do usuário, processar a informação e transformar o resultado em uma resposta em linguagem natural de volta para o usuário.
        </p>
        <details>
        <summary><b>Interface da Aplicação</b></summary>
        <br>
        <table aling="center">
          <tr>
            <td align="center"><img style="border-radius: 50%;" src="" widht="50%" alt="Tela de Chat"/></td>
            <td align="center"><img style="border-radius: 50%;" src="" widht="50%" alt="Upload de PDF"/></td>
            <td align="center"><img style="border-radius: 50%;" src="" widht="50%" alt="Resposta da IA"/></td>
          </tr>
        </table>
        </details>
  </ol>
  <ol start="2"> 
    <h3><li><b>Tecnologias Utilizadas</b></li></h3>
      <p align="justify">
      As principais tecnologias utilizadas para o desenvolvimento do Sistema, são:
        <ul>
          <li><a href="https://www.java.com/">Java</a></li>
          <p align="justify">Java foi a linguagem de programação principal do projeto, utilizada tanto para o desenvolvimento da interface gráfica desktop quanto para a lógica de negócio da aplicação. Por meio de Java, foi construída a interface de chat, o módulo de leitura de PDF, a comunicação com o modelo de IA e a integração com o banco de dados MySQL.</p>
          <li><a href="https://github.com/amithkoujalgi/ollama4j">Ollama4j</a> e <a href="https://huggingface.co/mistralai">Mistral</a></li>
          <p align="justify">O Ollama4j é uma biblioteca Java para integração com modelos de linguagem executados localmente via Ollama. No projeto, foi utilizado o modelo Mistral, disponibilizado pelo Hugging Face, para o processamento de linguagem natural. A integração permitiu que o sistema interpretasse o conteúdo dos documentos PDF e as perguntas do usuário, gerando respostas em linguagem natural de forma autônoma e sem necessidade de conexão com APIs externas pagas.</p>
          <li><a href="https://www.mysql.com/">MySQL</a></li>
          <p align="justify">
          MySQL foi o sistema de gerenciamento de banco de dados relacional utilizado para o armazenamento e gerenciamento dos dados da aplicação, incluindo o histórico de conversas, metadados dos documentos processados e informações de configuração do sistema.
          </p>
          <li><a href="https://www.figma.com/">Figma</a></li>
          <p align="justify">
          O Figma foi utilizado para a criação dos protótipos e wireframes da interface da aplicação. Por meio dessa ferramenta, foi possível validar o fluxo de navegação e a experiência do usuário com o cliente antes do início do desenvolvimento, garantindo alinhamento de expectativas e reduzindo retrabalho.
          </p>
          <li><a href="https://git-scm.com/">Git</a></li>
          <p align="justify">
          Git foi o sistema de controle de versão utilizado para o gerenciamento do código-fonte do projeto, permitindo o trabalho colaborativo entre os membros da equipe com rastreabilidade de alterações, criação de branches e resolução de conflitos.
          </p>
      </ul>
      </p>
    <h3><li><b>Contribuição para o Projeto</b></li></h3>
    <p align="justify">Como <b>Product Owner</b> e <b>Dev Team</b> da equipe, exerci um papel duplo que me permitiu ter uma visão completa tanto das necessidades do cliente quanto do desenvolvimento técnico do projeto.</p>
  <p align="justify">Como Product Owner, fui responsável pelo contato direto com o cliente interno (Prof. Giuliano Bertoti) e pelo planejamento e priorização do <b>Product Backlog</b>, garantindo que as entregas de cada Sprint estivessem alinhadas com as expectativas e necessidades do cliente.</p>
  <p align="justify">Conduzi o levantamento de requisitos junto ao cliente, identificando as principais dores — como a dependência de conhecimento técnico para consultar informações em documentos — e traduzi essas necessidades em <b>User Stories</b> claras e priorizadas para o time de desenvolvimento.</p>
  <p align="justify">Fui responsável pela validação das entregas de cada Sprint junto ao cliente durante as <b>Sprint Reviews</b>, coletando feedbacks e ajustando o backlog para as sprints seguintes, garantindo a melhoria contínua do produto.</p>
  <p align="center">       

https://github.com/user-attachments/assets/f74c2678-468a-4d8a-b10a-170e2c37b940

</p>
  <p align="justify">Como Dev Team, contribuí ativamente no desenvolvimento da <b>interface gráfica em Java</b>, construindo a tela de chat onde o usuário interage com o sistema, incluindo o layout, a navegação, o campo de upload de PDF e o tratamento de erros visuais.</p>
  <p align="justify">Participei da <b>criação dos protótipos no Figma</b>, definindo o fluxo de navegação e a experiência visual da aplicação antes da implementação.</p>
  <p align="justify">Atuei na definição da <b>arquitetura de comunicação entre o módulo de NLP (Ollama4j/Mistral) e o banco de dados MySQL</b>, garantindo que a pergunta do usuário fosse corretamente processada pelo modelo de linguagem e que a resposta fosse transformada em linguagem natural de volta.</p>
  <p align="justify">Participei da implementação do módulo de <b>leitura e interpretação de PDF</b>, integrando a extração de texto do documento com o envio de contexto para o modelo Mistral processar as perguntas do usuário.</p>
  <p align="justify">Contribuí nos <b>testes de usabilidade e refinamentos visuais</b>, garantindo que a experiência do usuário final fosse intuitiva e que as respostas da IA fossem apresentadas de forma clara e acessível.</p>
  </ol>
  <ol start="4">
     <h3><li><b>Lições Aprendidas</b></li></h3>
     <ol>
      <li>Desenvolvi competências como Product Owner, aprendendo a priorizar demandas, gerenciar o backlog e manter o alinhamento entre as expectativas do cliente e as entregas do time;</li>
      <li>Aprimorei minha capacidade de levantamento de requisitos e tradução de necessidades do cliente em User Stories claras e acionáveis;</li>
      <li>Evoluí no desenvolvimento de interfaces gráficas em Java, construindo uma aplicação desktop com experiência de chat;</li>
      <li>Aprendi a integrar modelos de linguagem (LLM) em aplicações Java por meio do Ollama4j, entendendo o fluxo de processamento de linguagem natural;</li>
      <li>Aprofundei meus conhecimentos em MySQL, trabalhando com armazenamento de dados, histórico de conversas e metadados de documentos;</li>
      <li>Desenvolvi habilidade de prototipação com Figma, criando wireframes e validando a experiência do usuário com o cliente;</li>
      <li>Aprimorei a capacidade de atuar em múltiplos papéis simultaneamente (Product Owner e Dev), gerenciando tanto as demandas do produto quanto as entregas técnicas;</li>
      <li>Evoluí no entendimento de arquiteturas que envolvem integração entre IA, banco de dados e interface gráfica em uma aplicação desktop.</li>
      </ol>
 </ol>
  </body>
</html>
