package co.com.sophos.tienda.persistent.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "compras_productos")
public class CompraProducto {
    @EmbeddedId
    private CompraProductoPK id;

    private Integer cantidad;

    private double total;

    private boolean estado;


   @ManyToOne
   @MapsId("idCompra")
   @JoinColumn(name ="id_compra_prod", insertable = false, updatable = false)
   private Compra compra;

   @ManyToOne
   @JoinColumn(name = "id_producto_prod", insertable = false,updatable = false)
   private Producto producto;
    public CompraProductoPK getId() {
        return id;
    }

    public void setId(CompraProductoPK id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
