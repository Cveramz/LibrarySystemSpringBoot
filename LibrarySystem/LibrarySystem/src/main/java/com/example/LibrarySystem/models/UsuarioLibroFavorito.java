package com.example.LibrarySystem.models;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario_libro_favorito")
public class UsuarioLibroFavorito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_libro_fav")
    private Integer idLibroFavorito;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "isbn")
    private Libro libro;
    public UsuarioLibroFavorito(){}
    public UsuarioLibroFavorito(Usuario usuario, Libro libro) {
        this.usuario = usuario;
        this.libro = libro;
    }

    public Integer getIdLibroFavorito() {
        return idLibroFavorito;
    }

    public void setIdLibroFavorito(Integer idLibroFavorito) {
        this.idLibroFavorito = idLibroFavorito;
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
