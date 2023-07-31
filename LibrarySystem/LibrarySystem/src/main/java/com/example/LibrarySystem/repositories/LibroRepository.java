package com.example.LibrarySystem.repositories;

import com.example.LibrarySystem.models.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro,Long> {
    Libro getLibroById(long idLibro);

    Libro updateLibro(Libro libroUpdate);
}
