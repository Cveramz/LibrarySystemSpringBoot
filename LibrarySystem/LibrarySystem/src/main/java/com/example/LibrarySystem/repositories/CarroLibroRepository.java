package com.example.LibrarySystem.repositories;


import com.example.LibrarySystem.models.CarroLibro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroLibroRepository extends JpaRepository<CarroLibro, Long>{
    CarroLibro getCarroLibroById(long id);
}
