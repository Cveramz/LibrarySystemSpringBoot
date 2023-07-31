package com.example.LibrarySystem.models;

import jakarta.persistence.*;

@Entity
@Table(name = "carro_libro")
public class CarroLibro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_carro_libro")
    private long id;

    @Column(name = "isbn")
    private long isbn;

    @ManyToOne
    @JoinColumn(name = "id_carro")
    private Carro carro;


    public CarroLibro(){}
    public CarroLibro(long id, long isbn, Carro carro) {
        this.id = id;
        this.isbn = isbn;
        this.carro = carro;
    }

    //GETTERS Y SETTERS


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }
}
