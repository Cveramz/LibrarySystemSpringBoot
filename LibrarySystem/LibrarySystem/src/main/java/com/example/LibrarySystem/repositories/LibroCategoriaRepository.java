package com.example.LibrarySystem.repositories;

import com.example.LibrarySystem.models.LibroCategoria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LibroCategoriaRepository extends JpaRepository<LibroCategoria,Long> {
    List<LibroCategoria> findByIdLibroCategoria(Long idLibroCategoria);

    List<LibroCategoria> findByIdCategoria(Long idCategoria);

    List<LibroCategoria> findByIsbn(String isbn);

    // Agregar una nueva tupla de LibroCategoria
    LibroCategoria agregarLibroCategoria(LibroCategoria libroCategoria);
}
