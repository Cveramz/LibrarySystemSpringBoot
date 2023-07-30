package com.example.LibrarySystem.models;

import jakarta.persistence.*;

@Entity
@Table(name = "restriccion")
public class Restriccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_restriccion")
    private Integer idRestriccion;

    @Column(name = "edad", length = 50)
    private String edad;

    @ManyToOne
    @JoinColumn(name = "isbn")
    private Libro libro;
    public Restriccion(){}
    public Restriccion(String edad, Libro libro) {
        this.edad = edad;
        this.libro = libro;
    }

    public Integer getIdRestriccion() {
        return idRestriccion;
    }

    public void setIdRestriccion(Integer idRestriccion) {
        this.idRestriccion = idRestriccion;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }
}
