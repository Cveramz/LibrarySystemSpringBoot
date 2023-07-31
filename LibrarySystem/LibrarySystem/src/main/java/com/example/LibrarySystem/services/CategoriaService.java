package com.example.LibrarySystem.services;

import com.example.LibrarySystem.models.Categoria;
import com.example.LibrarySystem.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    // Método para obtener todas las categorías
    public List<Categoria> findAll() {
        return categoriaRepository.findAll();
    }

    // Método para obtener una categoría por su ID
    public Optional<Categoria> findByIdCategoria(Long idCategoria) {
        return categoriaRepository.findByIdCategoria(idCategoria);
    }

    // Método para guardar una nueva categoría
    public Categoria save(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    // Método para eliminar una categoría por su ID
    public void deleteById(Long id) {
        categoriaRepository.deleteById(id);
    }

    // Método para obtener categorías por su "tipo"
    public List<Categoria> findByTipo(String tipo) {
        return categoriaRepository.findByTipo(tipo);
    }

    public Categoria updateCategoria(Long idCategoria, String tipo) {
        Optional<Categoria> categoriaOptional = categoriaRepository.findByIdCategoria(idCategoria);

        if (categoriaOptional.isPresent()) {
            Categoria categoria = categoriaOptional.get();
            categoria.setTipo(tipo);
            return categoriaRepository.save(categoria);
        } else {
            return null; // Opcional: puedes manejar el caso de que no se encuentre la categoría.
        }
    }
}
