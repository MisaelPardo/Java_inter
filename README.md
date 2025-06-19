# 📚 Sistema de Controle de Estoque de Livraria

Este projeto foi desenvolvido pelos integrantes:
Misael Francisco Pardo,
Caio Samuel do Espirito Santo Montes,
Luciano César Marques da Costa Inocêncio 
e João Paulo de Almeida Biló.    

como parte do trabalho da disciplina Informática para Negócios, com o objetivo de aplicar conceitos de Programação Orientada a Objetos em Java.

## 🧾 Descrição

O sistema simula a estrutura de uma livraria, permitindo o gerenciamento de:

- Livros e seu estoque
- Pedidos de compra
- Pagamentos realizados
- Cadastro de clientes, fornecedores e funcionários (gerentes e vendedores)

O foco principal está na modelagem de classes e relacionamentos entre elas, preparando o código para uma futura integração com banco de dados via JDBC.

## 🧱 Estrutura de Classes

As classes estão organizadas no pacote `entities`:

### 👥 Pessoas
- `Pessoa` (abstrata)
  - `Funcionario` (abstrata)
    - `Gerente`
    - `Vendedor`
  - `Cliente`

### 📦 Estoque e Vendas
- `Livro`
- `Pedido`
- `LivroPedido`
- `Pagamento`
- `Fornecedor`

## 💻 Tecnologias Utilizadas

- Java 23
- `java.sql.Date` para integração com banco de dados
- Orientação a Objetos (Herança, Encapsulamento, Composição)

## 🛠️ Como Usar

1. Clone o repositório:
   ```bash
   git clone https://github.com/MisaelPardo/Java_inter
