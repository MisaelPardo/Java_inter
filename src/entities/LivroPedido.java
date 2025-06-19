package entities;

public final class LivroPedido {

    private Livro livro;
    private int quantidade;

    public LivroPedido() {
        livro = null;
        quantidade = 0;
    }

    public LivroPedido(Livro livro, int quantidade) {
        this.livro = livro;
        this.quantidade = quantidade;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
