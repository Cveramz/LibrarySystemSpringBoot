package com.example.LibrarySystem.repositories;

import com.example.LibrarySystem.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

    public Usuario getUsuarioByid(long id_usuario);
}
