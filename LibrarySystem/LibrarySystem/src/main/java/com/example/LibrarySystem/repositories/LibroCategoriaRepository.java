package com.example.LibrarySystem.repositories;

import com.example.LibrarySystem.models.LibroCategoria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LibroCategoriaRepository extends JpaRepository<LibroCategoria,Long> {

    /*--------------------------------------------------------------------------------------------------------
        * findByIdLibroCategoria: Busca una tupla de LibroCategoria por su id_libro_categoria;
        *
        * @param id_libro_categoria - id de la tupla de LibroCategoria;
        * @return - Tupla de LibroCategoria;
     */
    List<LibroCategoria> findByIdLibroCategoria(Long idLibroCategoria);


    /*--------------------------------------------------------------------------------------------------------
        * findByIdCategoria: Busca una tupla de LibroCategoria por su id_categoria;
        *
        * @param id_categoria - id de la tupla de LibroCategoria;
        * @return - Tupla de LibroCategoria;
     */
    List<LibroCategoria> findByIdCategoria(Long idCategoria);



    /*--------------------------------------------------------------------------------------------------------
        * findByIsbn: Busca una tupla de LibroCategoria por su isbn;
        *
        * @param isbn - isbn de la tupla de LibroCategoria;
        * @return - Tupla de LibroCategoria;
     */
    List<LibroCategoria> findByIsbn(String isbn);



    /*--------------------------------------------------------------------------------------------------------
        * findByNombreCategoria: Busca una tupla de LibroCategoria por su nombre_categoria;
        *
        * @param nombre_categoria - nombre_categoria de la tupla de LibroCategoria;
        * @return - Tupla de LibroCategoria;
     */
    LibroCategoria agregarLibroCategoria(LibroCategoria libroCategoria);
}
