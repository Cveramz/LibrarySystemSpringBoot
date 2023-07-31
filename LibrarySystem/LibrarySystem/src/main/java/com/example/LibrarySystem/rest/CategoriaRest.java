package com.example.LibrarySystem.rest;

import com.example.LibrarySystem.models.Categoria;
import com.example.LibrarySystem.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
        return categoriaService.findByIdCategoria(id);
    }


    /* ------ Ejemplo de JSON para crear una nueva categoría ------
    {
    "tipo": "Nueva categoría"
    }
    */
    @PostMapping
    public Categoria createCategoria(@RequestBody Categoria categoria) {
        return categoriaService.save(categoria);
    }

    @DeleteMapping("{id}")
    public void deleteCategoriaById(@PathVariable Long id) {
        categoriaService.deleteById(id);
    }

    @GetMapping("tipo/{tipo}")
    public List<Categoria> getCategoriasByTipo(@PathVariable String tipo) {
        return categoriaService.findByTipo(tipo);
    }


    /* ------ Ejemplo de JSON para actualizar una categoría ------
    {
    "tipo": "Nueva categoría actualizada"
    }
    */
    @PutMapping("{id}")
    public ResponseEntity<Categoria> updateCategoria(@PathVariable Long id, @RequestBody Categoria categoriaData) {
        Optional<Categoria> categoriaOptional = categoriaService.findByIdCategoria(id);

        if (categoriaOptional.isPresent()) {
            Categoria categoria = categoriaOptional.get();
            categoria.setTipo(categoriaData.getTipo());

            Categoria updatedCategoria = categoriaService.save(categoria);
            return ResponseEntity.ok(updatedCategoria);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
