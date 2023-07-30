package com.example.LibrarySystem.models;

import jakarta.persistence.*;

@Entity
@Table(name = "ubicacion")
public class Ubicacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ubicacion")
    private Integer idUbicacion;

    @Column(name = "pais_origen", length = 50)
    private String paisOrigen;

    @ManyToOne
    @JoinColumn(name = "isbn")
    private Libro libro;

    public Ubicacion(){}
    public Ubicacion(String paisOrigen, Libro libro) {
        this.paisOrigen = paisOrigen;
        this.libro = libro;
    }

    public Integer getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(Integer idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }
}
