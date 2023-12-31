package com.example.LibrarySystem.models;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="privilegio")
public class Privilegio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_privilegio;
    @Column(name="nombre_privilegio")
    private String nombre_privilegio;

    @OneToMany(mappedBy = "id_privilegio", cascade = CascadeType.REMOVE)
    private List<RolPrivilegio> rolesPrivilegios;
    public Privilegio(){}
    public Privilegio( String nombre_privilegio) {
        this.nombre_privilegio = nombre_privilegio;
    }

    public Integer getId_privilegio() {
        return id_privilegio;
    }

    public void setId_privilegio(int id_privilegio) {
        this.id_privilegio = id_privilegio;
    }

    public String getNombre_privilegio() {
        return nombre_privilegio;
    }

    public void setNombre_privilegio(String nombre_privilegio) {
        this.nombre_privilegio = nombre_privilegio;
    }
}
