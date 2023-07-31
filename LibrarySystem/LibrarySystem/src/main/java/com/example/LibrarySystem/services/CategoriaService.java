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

    /*--------------------------------------------------------------------------------------------------------
     * findAll: Obtiene todas las categorías
     *
     * @param - Nulo
     * @return - List<Categoria>
      --------------------------------------------------------------------------------------------------------*/
    public List<Categoria> findAll() {
        return categoriaRepository.findAll();
    }

    /*--------------------------------------------------------------------------------------------------------
     * findByIdCategoria: Obtiene una categoría por su id
     *
     * @param - Long idCategoria
     * @return - Optional<Categoria>
      --------------------------------------------------------------------------------------------------------*/
    public Optional<Categoria> findByIdCategoria(Long idCategoria) {
        return categoriaRepository.findByIdCategoria(idCategoria);
    }

    /*--------------------------------------------------------------------------------------------------------
     * save: Crea una nueva categoría
     *
     * @param - Categoria categoria
     * @return - Categoria
     *
     * Ejemplo de JSON para crear una categoría:
     *   {
     *       "tipo": "Nueva categoría"
     *   }
     --------------------------------------------------------------------------------------------------------*/
    public Categoria save(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    /*--------------------------------------------------------------------------------------------------------
     * deleteById: Elimina una categoría por su id
     *
     * @param - Long id
     * @return - Nulo
      --------------------------------------------------------------------------------------------------------*/
    public void deleteById(Long id) {
        categoriaRepository.deleteById(id);
    }

    /*--------------------------------------------------------------------------------------------------------
     * findByTipo: Obtiene una categoría por su tipo
     *
     * @param - String tipo
     * @return - List<Categoria>
      --------------------------------------------------------------------------------------------------------*/
    public List<Categoria> findByTipo(String tipo) {
        return categoriaRepository.findByTipo(tipo);
    }


}
