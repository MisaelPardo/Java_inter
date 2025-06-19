package model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public final class Pedido {

    private int id;
    private Date dataPedido;
    private Cliente cliente;    // relacionamento 1:1
    private List<LivroPedido> livros;  // lista de livros nesse pedido
    private Pagamento pagamento;    // pagamento referente a esse pedido

    public Pedido() {
        livros = new ArrayList<>();
        dataPedido = new Date(System.currentTimeMillis());
        cliente = null;
        pagamento = null;
    }

    public Pedido(int id, Date dataPedido, Cliente cliente, List<LivroPedido> livros, Pagamento pagamento) {
        this.id = id;
        this.dataPedido = dataPedido;
        this.cliente = cliente;
        this.livros = livros;
        this.pagamento = pagamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<LivroPedido> getLivros() {
        return livros;
    }

    public void setLivros(List<LivroPedido> livros) {
        this.livros = livros;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }
}
