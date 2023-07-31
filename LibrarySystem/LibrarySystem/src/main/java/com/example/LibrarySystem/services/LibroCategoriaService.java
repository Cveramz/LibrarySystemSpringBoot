package com.example.LibrarySystem.services;

import com.example.LibrarySystem.models.LibroCategoria;
import com.example.LibrarySystem.repositories.LibroCategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.Function;

@Service
public class LibroCategoriaService {

    @Autowired
    private LibroCategoriaRepository libroCategoriaRepository;

    /*--------------------------------------------------------------------------------------------------------
     * findAll: Obtiene todas las relaciones Libro-Categoria
     *
     * @return - Lista de relaciones Libro-Categoria
     *
      --------------------------------------------------------------------------------------------------------*/
    public List<LibroCategoria> findAll() {
        return libroCategoriaRepository.findAll();
    }

    /*--------------------------------------------------------------------------------------------------------
     * saveLibroCategoria: Guarda una relación Libro-Categoria
     *
     * @param libroCategoria - Relación Libro-Categoria a guardar
     * @return - Relación Libro-Categoria guardada
     *
      --------------------------------------------------------------------------------------------------------*/
    public LibroCategoria saveLibroCategoria(LibroCategoria libroCategoria) {
        return libroCategoriaRepository.save(libroCategoria);
    }

    /*--------------------------------------------------------------------------------------------------------
     * deleteById: Elimina una relación Libro-Categoria por su id_libro_categoria
     *
     * @param id - Long: Id de la relación Libro-Categoria a eliminar
     * @return - void
     *
      --------------------------------------------------------------------------------------------------------*/
    public void deleteById(Long id) {
        libroCategoriaRepository.deleteById(id);
    }

    /*--------------------------------------------------------------------------------------------------------
     * findByIdLibroCategoria: Busca una relación libro-categoría por su id_libro_categoria
     *
     * @param idLibroCategoria - Integer: Id de la relación libro-categoría a buscar
     * @return - Optional<LibroCategoria>: Relación libro-categoría encontrada (puede estar presente o no)
     *
      --------------------------------------------------------------------------------------------------------*/
    public Optional<LibroCategoria> findByIdLibroCategoria(Integer idLibroCategoria) {
        return libroCategoriaRepository.findByIdLibroCategoria(idLibroCategoria);
    }

    /*--------------------------------------------------------------------------------------------------------
     * findByIdCategoria: Busca relaciones libro-categoría por su ID de Categoría
     *
     * @param idCategoria - Long: ID de la categoría a buscar
     * @return - List<LibroCategoria>: Lista de relaciones libro-categoría encontradas
     *
      --------------------------------------------------------------------------------------------------------*/
    public List<LibroCategoria> findByIdCategoria(Long idCategoria) {
        return libroCategoriaRepository.findByCategoriaId(idCategoria);
    }

    /*--------------------------------------------------------------------------------------------------------
     * findByIsbn: Busca relaciones libro-categoría por su ISBN
     *
     * @param isbn - Long: ISBN del libro a buscar
     * @return - List<LibroCategoria>: Lista de relaciones libro-categoría encontradas
     *
      --------------------------------------------------------------------------------------------------------*/
    public List<LibroCategoria> findByIsbn(Long isbn) {
        return libroCategoriaRepository.findByLibroIsbn(isbn);
    }



}
