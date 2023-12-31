package com.example.LibrarySystem.models;

import jakarta.persistence.*;

@Entity
@Table(name="carro")
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_carro")
    private long id;

    @Column(name = "n_transaccion")
    private long n_transaccion;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @Column(name = "precio_total")
    private Integer precioTotal;

    @Column(name = "cantidad")
    private Integer cantidad;

    @Column(name = "bool_stock")
    private Boolean boolStock;
    public Carro(){

    }
    public Carro(long id, long n_transaccion, Usuario usuario, Integer precioTotal, Integer cantidad, Boolean boolStock) {
        this.id = id;
        this.n_transaccion = n_transaccion;
        this.usuario = usuario;
        this.precioTotal = precioTotal;
        this.cantidad = cantidad;
        this.boolStock = boolStock;
    }

    //GETTERS Y SETTERS

    public long getIdCarro() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getN_transaccion() {
        return n_transaccion;
    }

    public void setN_transaccion(long n_transaccion) {
        this.n_transaccion = n_transaccion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Integer getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(Integer precioTotal) {
        this.precioTotal = precioTotal;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Boolean getBoolStock() {
        return boolStock;
    }

    public void setBoolStock(Boolean boolStock) {
        this.boolStock = boolStock;
    }
}
