package com.example.LibrarySystem.models;

import jakarta.persistence.*;

@Entity
@Table(name = "libro_categoria")
public class LibroCategoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_libro_categoria")
    private Integer idLibroCategoria;

    @ManyToOne
    @JoinColumn(name = "isbn")
    private Libro libro;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;

    public LibroCategoria(){}
    public LibroCategoria(Libro libro, Categoria categoria) {
        this.libro = libro;
        this.categoria = categoria;
    }

    public Integer getIdLibroCategoria() {
        return idLibroCategoria;
    }

    public void setIdLibroCategoria(Integer idLibroCategoria) {
        this.idLibroCategoria = idLibroCategoria;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}

