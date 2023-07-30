package com.example.LibrarySystem.repositories;

import com.example.LibrarySystem.models.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria,Long> {
}
