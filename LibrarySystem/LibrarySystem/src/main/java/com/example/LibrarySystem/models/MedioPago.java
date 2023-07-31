package com.example.LibrarySystem.models;


import jakarta.persistence.*;

@Entity
@Table(name = "medio_pago")
public class MedioPago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mediopago")
    private long id;

    @Column(name = "medio_pago", length = 50)
    private String medioPago;

    public MedioPago(long id, String medioPago){
        this.id = id;
        this.medioPago = medioPago;
    }
    public MedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public long getIdMedioPago() {
        return id;
    }

    public void setIdMedioPago(long idMedioPago) {
        this.id = idMedioPago;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }
}

