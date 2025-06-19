package model;

import java.sql.Date;

public abstract class Funcionario extends Pessoa {

    private String endereco;
    private Date dataNascimento;

    public Funcionario() {
        super();
        endereco = "";
        dataNascimento = null;
    }

    public Funcionario(String nome, int ddd, String telefone, String email, String endereco, Date dataNascimento) {
        super(nome, ddd, telefone, email);
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
