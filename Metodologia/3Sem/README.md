<html>
  <body>
     <table align="center">
     <tr>
      <p align="center"><img src="" width=75%></img></p>
     </tr>
    </table>

  <ol>
    <h3><li><b>Descrição do Projeto</b></li></h3>
    <p align="justify">
      O projeto consiste em uma plataforma web para feedback e pesquisa de clima e cultura organizacional. O sistema permite a criação de pesquisas estruturadas e transparentes, com o objetivo de garantir o bem-estar de toda a equipe, promovendo o desenvolvimento, a motivação e a diminuição de índices de TurnOver dentro de uma empresa.</br>
      A aplicação conta com diferentes perfis de acesso — Admin, Líder e Liderado — cada um com funcionalidades específicas, como cadastro de usuários, criação e gerenciamento de pesquisas de autoavaliação e avaliação, e dashboards interativos para análise comparativa e gerencial dos resultados.</br>
      O projeto foi desenvolvido durante o terceiro semestre do curso de Análise e Desenvolvimento de Sistemas (ADS) na FATEC, como parte da disciplina de Aprendizagem por Projetos Integrados (API), pelo grupo Byte Benders.</br>  
    </p>
      <ol>
        <h4><li><b>Objetivo Geral</b></li></h4>
        <p align="justify">
       Desenvolvimento de uma plataforma web para pesquisa de clima e cultura organizacional, com sistema de feedback estruturado, perfis de acesso diferenciados e dashboards para análise dos resultados.
        </p>
        <h4><li><b>Objetivos Específicos</b></li></h4>
        <p align="justify">
        Como objetivos específicos temos:
          <ul>
            <li>Uso de Metodologia Ágil Scrum para Planejamento, desenvolvimento de Backlog do Produto e consolidação do Mínimo Produto Viável (MVP) para cada Sprint;</li>
            <li>Desenvolvimento de sistema de cadastro e gerenciamento de usuários com perfis diferenciados (Admin, Líder, Liderado);</li>
            <li>Criação de módulo para cadastro e gerenciamento de pesquisas com diferentes formatos de perguntas (texto longo, escolha única, múltipla escolha);</li>
            <li>Implementação de dashboards interativos para autoavaliação, avaliação de liderados e visão gerencial;</li>
            <li>Funcionalidade de exportação de avaliações em PDF para consultas futuras.</li>
          </ul>
          </p> 
        </ol>    
        <p align="justify">
        A partir dos objetivos propostos, a plataforma foi dividida em quatro módulos principais: <b>gestão de usuários</b>, <b>gestão de pesquisas</b>, <b>respostas e avaliações</b> e <b>dashboards</b>.</br>
        No módulo de <b>gestão de usuários</b>, o Admin pode cadastrar, visualizar, editar e remover usuários, atribuindo os perfis corretos de acesso. No módulo de <b>gestão de pesquisas</b>, o Admin cria e gerencia pesquisas de autoavaliação e avaliação com até 20 perguntas organizadas por categorias. O módulo de <b>respostas e avaliações</b> permite que Líderes e Liderados respondam às pesquisas de forma estruturada. Já o módulo de <b>dashboards</b> apresenta visualizações personalizadas por perfil — autoavaliação pessoal, visão do Líder sobre seus liderados e visão gerencial para o Admin — com filtros por data e categoria e a possibilidade de download em PDF.
        </p>
  </ol>
  <ol start="2"> 
    <h3><li><b>Tecnologias Utilizadas</b></li></h3>
      <p align="justify">
      As principais tecnologias utilizadas para o desenvolvimento do Sistema, são:
        <ul>
          <li><a href="https://www.typescriptlang.org/">TypeScript</a> e <a href="https://react.dev/">React</a></li>
          <p align="justify">TypeScript foi a linguagem principal utilizada no front-end do projeto, trazendo tipagem estática ao JavaScript e maior segurança no desenvolvimento. O React foi o framework escolhido para a construção de toda a interface da plataforma, permitindo a criação de componentes reutilizáveis, gerenciamento de estado eficiente e uma experiência de usuário dinâmica e responsiva nas telas de cadastro, pesquisa e dashboards.</p>
          <li><a href="https://developer.mozilla.org/pt-BR/docs/Web/HTML">HTML</a> e <a href="https://developer.mozilla.org/pt-BR/docs/Web/CSS">CSS</a></li>
          <p align="justify">HTML e CSS foram utilizados como base para a estruturação e estilização das páginas da aplicação, complementando o React na construção do layout, definição de formulários, tabelas e elementos visuais dos dashboards.</p>
          <li><a href="https://nodejs.org/">Node.js</a></li>
          <p align="justify">
          Node.js foi utilizado no back-end da aplicação, responsável pela criação das APIs REST que gerenciam a comunicação entre o front-end e o banco de dados. Com ele, foram desenvolvidas as rotas de cadastro de usuários, criação de pesquisas, coleta de respostas e geração dos dados para os dashboards.
          </p>
          <li><a href="https://www.mysql.com/">MySQL</a></li>
          <p align="justify">
          MySQL foi o sistema de gerenciamento de banco de dados relacional utilizado para o armazenamento de todas as informações da plataforma — dados de usuários, perfis, pesquisas, perguntas, categorias, respostas e resultados das avaliações.
          </p>
      </ul>
      </p>
    <h3><li><b>Contribuição para o Projeto</b></li></h3>
    <p align="justify">Como <b>Product Owner</b> e <b>Dev Team</b> da equipe Byte Benders, exerci um papel duplo que me permitiu ter uma visão completa tanto das necessidades do cliente quanto do desenvolvimento técnico do projeto.</p>
  <p align="justify">Como Product Owner, fui responsável pelo contato direto com a empresa parceira e pelo planejamento e priorização do <b>Product Backlog</b>, garantindo que as entregas de cada Sprint estivessem alinhadas com as expectativas e necessidades do cliente.</p>
  <p align="justify">Conduzi o levantamento de requisitos junto ao cliente, identificando as principais dores — como a falta de um processo estruturado de feedback e a dificuldade em medir o clima organizacional — e traduzi essas necessidades em <b>User Stories</b> claras e priorizadas para o time de desenvolvimento.</p>
  <p align="justify">Fui responsável pela validação das entregas de cada Sprint junto ao cliente durante as <b>Sprint Reviews</b>, coletando feedbacks e ajustando o backlog para as sprints seguintes. A priorização foi realizada considerando o valor de negócio de cada funcionalidade, partindo do cadastro de usuários e perfis (Sprint 1) até os dashboards com filtros e exportação em PDF (Sprint 4).</p>
  <p align="center">   

https://github.com/user-attachments/assets/7308c544-77d3-4718-8719-0bd18f1d308e

</p>
  <p align="justify">Como Dev Team, contribuí ativamente no desenvolvimento front-end da aplicação utilizando <b>TypeScript e React</b>, construindo componentes reutilizáveis para as telas de cadastro, login, gerenciamento de usuários e pesquisas.</p>
  <p align="justify">Participei do desenvolvimento das telas de <b>cadastro e edição de usuários</b>, implementando a lógica de perfis diferenciados (Admin, Líder, Liderado) e as permissões de acesso correspondentes a cada perfil.</p>
  <p align="justify">Atuei na construção do módulo de <b>criação e gerenciamento de pesquisas</b>, desenvolvendo a interface para cadastro de perguntas com diferentes formatos (texto longo, escolha única, múltipla escolha) e a organização por categorias.</p>
  <p align="justify">Contribuí no desenvolvimento dos <b>dashboards interativos</b>, implementando a visualização dos resultados por perfil — autoavaliação, visão do Líder e visão gerencial do Admin — com filtros por data e categoria.</p>
  <p align="justify">Participei da implementação da funcionalidade de <b>download de avaliações em PDF</b>, permitindo que os usuários salvassem seus resultados para consultas futuras.</p>
  </ol>
  <ol start="4">
     <h3><li><b>Lições Aprendidas</b></li></h3>
     <ol>
      <li>Consolidei minhas competências como Product Owner, aprimorando a priorização de backlog baseada em valor de negócio e a comunicação com stakeholders;</li>
      <li>Aprimorei minha capacidade de traduzir necessidades do cliente em User Stories com critérios de aceitação claros e testáveis;</li>
      <li>Evoluí significativamente no desenvolvimento front-end com TypeScript e React, construindo componentes reutilizáveis e interfaces dinâmicas;</li>
      <li>Aprofundei meus conhecimentos em Node.js para desenvolvimento de APIs REST no back-end;</li>
      <li>Aprimorei meus conhecimentos em MySQL, trabalhando com modelagem de dados relacional envolvendo perfis, pesquisas, categorias e respostas;</li>
      <li>Desenvolvi habilidades na construção de dashboards interativos com filtros e visualizações diferenciadas por perfil de acesso;</li>
      <li>Aprendi a implementar funcionalidades de geração e exportação de PDF a partir de dados da aplicação;</li>
      <li>Aprimorei a capacidade de atuar em múltiplos papéis simultaneamente (Product Owner e Dev), equilibrando a gestão do produto com as entregas técnicas.</li>
      </ol>
 </ol>
  </body>
</html>
