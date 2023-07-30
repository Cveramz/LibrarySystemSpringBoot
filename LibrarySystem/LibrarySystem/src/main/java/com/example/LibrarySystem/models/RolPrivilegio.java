package com.example.LibrarySystem.models;

import jakarta.persistence.*;

@Entity
@Table(name="rol_privilegio")
public class RolPrivilegio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_rol_privilegio;
    @ManyToOne
    @JoinColumn(name="id_rol")
    private Rol id_rol;
    @ManyToOne
    @JoinColumn(name="id_privilegio")
    private Privilegio id_privilegio;
    public RolPrivilegio(){}
    public RolPrivilegio(Rol id_rol, Privilegio id_privilegio) {
        this.id_rol = id_rol;
        this.id_privilegio = id_privilegio;
    }

    public Integer getId_rol_privilegio() {
        return id_rol_privilegio;
    }

    public void setId_rol_privilegio(Integer id_rol_privilegio) {
        this.id_rol_privilegio = id_rol_privilegio;
    }

    public Rol getId_rol() {
        return id_rol;
    }

    public void setId_rol(Rol id_rol) {
        this.id_rol = id_rol;
    }

    public Privilegio getId_privilegio() {
        return id_privilegio;
    }

    public void setId_privilegio(Privilegio id_privilegio) {
        this.id_privilegio = id_privilegio;
    }
}
