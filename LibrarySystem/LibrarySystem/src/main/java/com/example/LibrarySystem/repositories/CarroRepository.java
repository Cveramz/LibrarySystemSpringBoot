package com.example.LibrarySystem.repositories;

import com.example.LibrarySystem.models.Carro;
import com.example.LibrarySystem.models.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<Carro,Long> {


    /*--------------------------------------------------------------------------------------------------------
     * getCarroById: metodo que obtiene un carro según su id;
     *
     * @param id_carro - el id del carro en la base de datos;
      --------------------------------------------------------------------------------------------------------*/

    public Carro getCarroById(long id);
}
