package com.example.LibrarySystem.repositories;

import com.example.LibrarySystem.models.LibroCategoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface LibroCategoriaRepository extends JpaRepository<LibroCategoria, Long> {

    @Query("SELECT lc FROM LibroCategoria lc WHERE lc.idLibroCategoria = ?1")
    Optional<LibroCategoria> findByIdLibroCategoria(Integer idLibroCategoria);

    List<LibroCategoria> findByCategoriaId(@Param("idCategoria") Long idCategoria);
    List<LibroCategoria> findByLibroIsbn(Long isbn);

}
