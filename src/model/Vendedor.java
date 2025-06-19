package model;

public final class Vendedor extends Funcionario {

    private String setor;

    public Vendedor() {
        super();
        setor = "";
    }

    public Vendedor(String nome, int ddd, String telefone, String email, String endereco, java.sql.Date dataNascimento,
            String setor) {
        super(nome, ddd, telefone, email, endereco, dataNascimento);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}
