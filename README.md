# 💾 Projeto Banco de Dados

Este projeto é um sistema CRUD de produtos desenvolvido em **Java** com interface gráfica usando **Swing**, persistência com **MySQL** e separação em camadas (`DAO`, `GUI`, `Model`, etc).

---

## 🚀 Funcionalidades

- ✅ Cadastrar produtos  
- ✅ Listar produtos existentes  
- ✅ Atualizar dados de produtos  
- ✅ Remover produtos  
- ✅ Interface gráfica simples com Swing  
- ✅ Operações direto no banco de dados MySQL  

---

## 🛠️ Tecnologias usadas

- Java 17+  
- Swing (GUI)  
- JDBC (Java Database Connectivity)  
- MySQL  
- CSS (para estilizar tabelas, opcional)  
- Padrão DAO (Data Access Object)  

---

## 📂 Estrutura do projeto

📁 Projeto-Banco-De-Dados
├── ConexaoDB.java # Classe de conexão com MySQL
├── CriadorTabela.java # Criação de tabela no banco
├── Produto.java # Classe modelo (entidade)
├── ProdutoDAO.java # Camada de acesso a dados
├── ProdutoGUI.java # Interface gráfica com Swing
├── RemovedorTabela.java # Remoção de tabela do banco
├── TesteCMD.java # Teste via linha de comando
├── TesteCMD2.java # Outro exemplo de teste CMD
├── styles-produtos.css # Estilo para tabelas (opcional)
└── README.md # Você está aqui!


---

## ⚙️ Como executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/inaldojuniors/Projeto-Banco-De-Dados.git
