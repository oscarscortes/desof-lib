package org.oscars.models.desof.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "compradetalle")
public class CompraDetalle {

    @Id
    private Long id;

    private Float subtotal;

    private Integer cantidad;

    private Float precio;

    @ManyToOne
    @JoinColumn(name = "inventarioid", referencedColumnName = "id")
    private Inventario inventario;

    @ManyToOne
    @JoinColumn(name = "compraid", referencedColumnName = "id")
    private Compra compra;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Float subtotal) {
        this.subtotal = subtotal;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }
}
