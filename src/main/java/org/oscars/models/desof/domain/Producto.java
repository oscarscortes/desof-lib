package org.oscars.models.desof.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "producto")
public class Producto {

    @Id
    private Long codigo;

    private String talla;

    private String color;

    private String modelo;

    private String nombre;

    private String url;

    @ManyToOne
    @JoinColumn(name = "proveedorid", referencedColumnName = "id")
    private Proveedor proveedor;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
}
