package entities;

public final class Fornecedor {
    private int id;
    private String nome;
    private int ddd;
    private String telefone;
    private String endereco;
    private String cnpj;

    public Fornecedor() {
        id = 0;
        nome = "";
        ddd = 0;
        telefone = "";
        endereco = "";
        cnpj = "";
    }

    public Fornecedor(int id, String nome, int ddd, String telefone, String endereco, String cnpj) {
        this.id = id;
        this.nome = nome;
        this.ddd = ddd;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cnpj = cnpj;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
