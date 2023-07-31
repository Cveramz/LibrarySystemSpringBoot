package com.example.LibrarySystem.repositories;

import com.example.LibrarySystem.models.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    public List<Categoria> findAll();
    public Optional<Categoria> findByIdCategoria(Long idCategoria);
    public Categoria save(Categoria categoria);
    public void deleteById(Long id);
    public List<Categoria> findByTipo(String tipo);
}