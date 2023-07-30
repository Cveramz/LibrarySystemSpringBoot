package com.example.LibrarySystem.models;

import jakarta.persistence.*;

@Entity
@Table(name = "carro_libro")
public class CarroLibro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_carro_libro")
    private Integer idCarroLibro;

    @Column(name = "isbn")
    private Long isbn;

    @ManyToOne
    @JoinColumn(name = "id_carro")
    private Carro carro;
    public CarroLibro(){}
    public CarroLibro(Long isbn, Carro carro) {
        this.isbn = isbn;
        this.carro = carro;
    }

    public Integer getIdCarroLibro() {
        return idCarroLibro;
    }

    public void setIdCarroLibro(Integer idCarroLibro) {
        this.idCarroLibro = idCarroLibro;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }
}
