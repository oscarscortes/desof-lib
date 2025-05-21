package org.oscars.models.desof.domain;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "compra")
public class Compra {

    @Id
    private Long id;

    @Column(name = "f_pedido")
    private LocalDate fechaPedido;

    @Column(name = "f_entrega")
    private LocalDate fechaEntrega;

    @Column(name = "montotl")
    private Float montoTotal;

    private String calle;

    private String colonia;

    @Column(name = "cp")
    private Integer codigoPostal;

    @Column(name = "num")
    private Integer numero;

    @ManyToOne
    @JoinColumn(name = "clienteid", referencedColumnName = "id")
    private Cliente cliente;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Float getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(Float montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public Integer getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(Integer codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
