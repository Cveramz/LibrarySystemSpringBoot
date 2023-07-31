package com.example.LibrarySystem.rest;

import com.example.LibrarySystem.models.Categoria;
import com.example.LibrarySystem.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Categoria/")
public class CategoriaRest {
    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public List<Categoria> getAllCategorias() {
        return categoriaService.findAll();
    }

    @GetMapping("{id}")
    public Optional<Categoria> getCategoriaById(@PathVariable Long id) {
        return categoriaService.findById(id);
    }

    @PostMapping
    public Categoria createCategoria(@RequestBody Categoria categoria) {
        return categoriaService.save(categoria);
    }

    @DeleteMapping("{id}")
    public void deleteCategoriaById(@PathVariable Long id) {
        categoriaService.deleteById(id);
    }
}
