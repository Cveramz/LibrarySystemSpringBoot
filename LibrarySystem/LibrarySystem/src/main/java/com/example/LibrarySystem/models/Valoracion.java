package com.example.LibrarySystem.models;

import jakarta.persistence.*;
@Entity
@Table(name = "valoracion")
public class Valoracion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_valoracion")
    private long id;

    @Column(name = "valor")
    private Integer valor;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "isbn")
    private Libro libro;
    public Valoracion(){}
    public Valoracion(long id, Integer valor, Usuario usuario, Libro libro) {
        this.id = id;
        this.valor = valor;
        this.usuario = usuario;
        this.libro = libro;
    }

    public long getIdValoracion() {
        return id;
    }

    public void setIdValoracion(Integer idValoracion) {
        this.id = idValoracion;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }
}