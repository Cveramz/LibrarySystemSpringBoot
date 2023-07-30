package com.example.LibrarySystem.repositories;

import com.example.LibrarySystem.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {


    /*--------------------------------------------------------------------------------------------------------
     * getUsuarioByid: metodo que retorna un usuario segun su id;
     *
     * @param id_usuario - el id del usuario en la base de datos;
      --------------------------------------------------------------------------------------------------------*/
    public Usuario getUsuarioByid(long id_usuario);

}
