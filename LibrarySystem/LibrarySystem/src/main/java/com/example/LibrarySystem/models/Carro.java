package com.example.LibrarySystem.models;

import jakarta.persistence.*;

@Entity
@Table(name="carro")
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_carro")
    private Integer id;

    @Column(name = "n_transaccion")
    private Long n_transaccion;

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
    public Carro(Long n_transaccion, Usuario usuario, Integer precioTotal, Integer cantidad, Boolean boolStock) {
        this.n_transaccion = n_transaccion;
        this.usuario = usuario;
        this.precioTotal = precioTotal;
        this.cantidad = cantidad;
        this.boolStock = boolStock;
    }

    public Integer getIdCarro() {
        return id;
    }

    public void setIdCarro(Integer idCarro) {
        this.id = idCarro;
    }

    public Long getN_transaccion() {
        return n_transaccion;
    }

    public void setN_transaccion(Long n_transaccion) {
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
