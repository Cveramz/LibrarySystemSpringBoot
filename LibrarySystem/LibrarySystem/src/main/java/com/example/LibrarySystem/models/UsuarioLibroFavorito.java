package com.example.LibrarySystem.models;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario_libro_favorito")
public class UsuarioLibroFavorito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_libro_fav")
    private long id;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "isbn")
    private Libro libro;
    public UsuarioLibroFavorito(){}
    public UsuarioLibroFavorito(long id, Usuario usuario, Libro libro) {
        this.id = id;
        this.usuario = usuario;
        this.libro = libro;
    }

    //GETTERS Y SETTERS

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
