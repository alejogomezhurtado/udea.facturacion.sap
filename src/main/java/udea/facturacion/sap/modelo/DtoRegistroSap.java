package udea.facturacion.sap.modelo;

public class DtoRegistroSap {

    private String codigoSap;
    private Integer numeroFactura;
    private Integer valorTotal;
    private Integer idCliente;

    public DtoRegistroSap(String codigoSap) {
        this.codigoSap = codigoSap;
    }

    public DtoRegistroSap(String codigoSap, Integer numeroFactura, Integer valorTotal, Integer idCliente) {
        this.codigoSap = codigoSap;
        this.numeroFactura = numeroFactura;
        this.valorTotal = valorTotal;
        this.idCliente = idCliente;
    }

    public String getCodigoSap() {
        return codigoSap;
    }

    public void setCodigoSap(String codigoSap) {
        this.codigoSap = codigoSap;
    }

    public Integer getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(Integer numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public Integer getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Integer valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return "DtoRegistroSap{" +
                "codigoSap='" + codigoSap + '\'' +
                ", numeroFactura=" + numeroFactura +
                ", valorTotal=" + valorTotal +
                ", idCliente=" + idCliente +
                '}';
    }
}
