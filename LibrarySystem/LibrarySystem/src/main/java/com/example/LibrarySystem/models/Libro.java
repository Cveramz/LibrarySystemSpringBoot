package com.example.LibrarySystem.models;

import jakarta.persistence.*;

@Entity
@Table(name = "libro")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "isbn")
    private long isbn;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @Column(name = "nombre", length = 50)
    private String nombre;

    @Column(name = "visualizaciones")
    private Integer visualizaciones;

    @Column(name = "valoracion_prom")
    private Integer valoracionPromedio;

    @Column(name = "link_referencia", length = 50)
    private String linkReferencia;

    @Column(name = "precio")
    private Integer precio;

    @Column(name = "int_stock")
    private Integer stock;

    public Libro(){}

    public Libro(Long isbn, Usuario usuario, String nombre, Integer visualizaciones, Integer valoracionPromedio, String linkReferencia, Integer precio, Integer stock) {
        this.isbn = isbn;
        this.usuario = usuario;
        this.nombre = nombre;
        this.visualizaciones = visualizaciones;
        this.valoracionPromedio = valoracionPromedio;
        this.linkReferencia = linkReferencia;
        this.precio = precio;
        this.stock = stock;
    }

    //GETTERS Y SETTERS

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getVisualizaciones() {
        return visualizaciones;
    }

    public void setVisualizaciones(Integer visualizaciones) {
        this.visualizaciones = visualizaciones;
    }

    public Integer getValoracionPromedio() {
        return valoracionPromedio;
    }

    public void setValoracionPromedio(Integer valoracionPromedio) {
        this.valoracionPromedio = valoracionPromedio;
    }

    public String getLinkReferencia() {
        return linkReferencia;
    }

    public void setLinkReferencia(String linkReferencia) {
        this.linkReferencia = linkReferencia;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}