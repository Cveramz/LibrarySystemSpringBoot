package com.example.LibrarySystem.repositories;

import com.example.LibrarySystem.models.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<Libro,Long> {
}
