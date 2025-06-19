package entities;

public final class Gerente extends Funcionario {

    private String setor;

    public Gerente() {
        super();
        setor = "";
    }

    public Gerente(String nome, int ddd, String telefone, String email, String endereco, java.sql.Date dataNascimento,
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
