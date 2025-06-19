package entities;

public final class Livro {
    private int isbn;
    private String nome;
    private String autor;
    private String assunto;
    private String categoria;
    private String titulo;
    private double preco;
    private int quantidadeEstoque;
    private Funcionario funcionario; // quem cadastrou
    private Fornecedor fornecedor;

    public Livro() {
        isbn = 0;
        nome = "";
        autor = "";
        assunto = "";
        categoria = "";
        titulo = "";
        preco = 0.0;
        quantidadeEstoque = 0;
        funcionario = null;
        fornecedor = null;
    }

    public Livro(int isbn, String nome, String autor, String assunto, String categoria, String titulo, double preco,
            int quantidadeEstoque, Funcionario funcionario, Fornecedor fornecedor) {
        this.isbn = isbn;
        this.nome = nome;
        this.autor = autor;
        this.assunto = assunto;
        this.categoria = categoria;
        this.titulo = titulo;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
        this.funcionario = funcionario;
        this.fornecedor = fornecedor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
}
