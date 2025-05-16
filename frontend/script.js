const API_BASE = "http://localhost:8080/api";

// CADASTRAR EMPRESA
document.getElementById("empresaForm").addEventListener("submit", async (e) => {
  e.preventDefault();
  const cnpj = document.getElementById("cnpj").value;
  const nome = document.getElementById("nomeEmpresa").value;
  const endereco = document.getElementById("enderecoEmpresa").value;

  const empresa = { cnpj, nome, endereco };

  const resp = await fetch(`${API_BASE}/empresas`, {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify(empresa)
  });

  if (resp.ok) {
    alert("Empresa cadastrada com sucesso!");
    e.target.reset();
  } else {
    alert("Erro ao cadastrar empresa.");
  }
});

// CADASTRAR FUNCIONÁRIO + UPLOAD DE IMAGEM
document.getElementById("funcionarioForm").addEventListener("submit", async (e) => {
  e.preventDefault();

  const nome = document.getElementById("nomeFuncionario").value;
  const cpf = document.getElementById("cpfFuncionario").value;
  const funcao = document.getElementById("funcaoFuncionario").value;
  const email = document.getElementById("emailFuncionario").value;
  const empresa = document.getElementById("empresaFuncionario").value; // CNPJ da empresa
  const cargaHorariaStr = document.getElementById("cargaHorariaFuncionario").value;
  const carga_horaria = cargaHorariaStr ? Number(cargaHorariaStr) : null;
  const imagem = document.getElementById("imagemFuncionario").files[0];

  const funcionarioData = {
    nome,
    cpf,
    funcao,
    email,
    empresa,
    carga_horaria
  };

  const funcionarioResp = await fetch(`${API_BASE}/funcionarios`, {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify(funcionarioData)
  });

  if (!funcionarioResp.ok) {
    alert("Erro ao cadastrar funcionário.");
    return;
  }

  const funcionario = await funcionarioResp.json();

  if (imagem) {
    const formData = new FormData();
    formData.append("file", imagem);

    await fetch(`${API_BASE}/funcionarios/${funcionario.id}/imagem`, {
      method: "POST",
      body: formData
    });
  }

  alert("Funcionário cadastrado com sucesso!");
  e.target.reset();
  carregarFuncionarios();
});

// LISTAR FUNCIONÁRIOS
async function carregarFuncionarios() {
  const lista = document.getElementById("listaFuncionarios");
  lista.innerHTML = "";

  const resp = await fetch(`${API_BASE}/funcionarios`);
  if (!resp.ok) {
    lista.innerHTML = "Erro ao carregar funcionários.";
    return;
  }

  const funcionarios = await resp.json();

  funcionarios.forEach(func => {
    const item = document.createElement("li");
    item.innerHTML = `
      <strong>${func.nome}</strong> - ${func.funcao} <br />
      Email: ${func.email} <br />
      Empresa: ${func.empresa} <br />
      Carga Horária: ${func.carga_horaria ?? 'N/A'} <br />
        <img src="http://localhost:8080${func.imagem}" width="100" />
    `;
    lista.appendChild(item);
  });
}

carregarFuncionarios();
