package com.example.LibrarySystem.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "compra")
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "n_transaccion")
    private long n_Transaccion;

    @ManyToOne
    @JoinColumn(name = "id_mediopago")
    private MedioPago medioPago;

    @Column(name = "total_pago")
    private Integer totalPago;

    @Column(name = "fecha")
    private LocalDate fecha;
    public Compra(){}
    public Compra(long n_transaccion, MedioPago medioPago, Integer totalPago, LocalDate fecha) {
        this.n_Transaccion = n_transaccion;
        this.medioPago = medioPago;
        this.totalPago = totalPago;
        this.fecha = fecha;
    }

    public long getN_Transaccion() {
        return n_Transaccion;
    }

    public void setN_Transaccion(Integer n_Transaccion) {
        this.n_Transaccion = n_Transaccion;
    }

    public MedioPago getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(MedioPago medioPago) {
        this.medioPago = medioPago;
    }

    public Integer getTotalPago() {
        return totalPago;
    }

    public void setTotalPago(Integer totalPago) {
        this.totalPago = totalPago;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
