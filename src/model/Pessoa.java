package model;

public abstract class Pessoa {

    private String nome;
    private int ddd;
    private String telefone;
    private String email;

    public Pessoa() {
        nome = "";
        ddd = 0;
        telefone = "";
        email = "";
    }

    public Pessoa(String nome, int ddd, String telefone, String email) {
        this.nome = nome;
        this.ddd = ddd;
        this.telefone = telefone;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
