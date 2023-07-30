package com.example.LibrarySystem.models;


import jakarta.persistence.*;

@Entity
@Table(name = "medio_pago")
public class MedioPago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mediopago")
    private Integer idMedioPago;

    @Column(name = "medio_pago", length = 50)
    private String medioPago;

    public MedioPago(){}
    public MedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public Integer getIdMedioPago() {
        return idMedioPago;
    }

    public void setIdMedioPago(Integer idMedioPago) {
        this.idMedioPago = idMedioPago;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }
}

