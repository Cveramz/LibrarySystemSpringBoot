package com.example.LibrarySystem.repositories;

import com.example.LibrarySystem.models.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    List<Categoria> findByTipo(String tipo);
    Optional<Categoria> findByIdCategoria(Long idCategoria);
}