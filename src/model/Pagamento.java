package model;

import java.sql.Date;

public final class Pagamento {
    private int id;
    private Date dataPagamento;
    private double valorPago;
    private String formaPagamento;
    private Pedido pedido;

    public Pagamento() {
        id = 0;
        dataPagamento = new Date(System.currentTimeMillis());
        valorPago = 0.0;
        formaPagamento = "";
        pedido = null;
    }

    public Pagamento(int id, Date dataPagamento, double valorPago, String formaPagamento, Pedido pedido) {
        this.id = id;
        this.dataPagamento = dataPagamento;
        this.valorPago = valorPago;
        this.formaPagamento = formaPagamento;
        this.pedido = pedido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
