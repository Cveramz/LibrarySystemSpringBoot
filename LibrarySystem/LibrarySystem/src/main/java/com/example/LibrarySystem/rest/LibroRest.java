package com.example.LibrarySystem.rest;



import com.example.LibrarySystem.models.Carro;
import com.example.LibrarySystem.models.Libro;
import com.example.LibrarySystem.services.LibroService;
import com.example.LibrarySystem.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Libro/")
public class LibroRest {
    @Autowired
    private LibroService libroService;

    /*--------------------------------------------------------------------------------------------------------
     * createLibro: metodo que guarda un nuevo libro en la base de datos;
     *
     * @param libro - un objeto de tipo Libro que contiene los datos del libro a guardar;
     * @return - el libro creado y registrado;
     *
     * Comentario: genera el ID automaticamente;
     --------------------------------------------------------------------------------------------------------*/
    @PostMapping("createLibro")
    public Libro createLibro(@RequestBody Libro libro) {
        return libroService.createLibro(libro);
    }

    /*--------------------------------------------------------------------------------------------------------
     * getLibroByID: metodo que obtiene un libro según su isbn;
     *
     * @param isbn - el isbn del libro en la base de datos
     * @return - el libro correspondiente al isbn especificado;
     --------------------------------------------------------------------------------------------------------*/
    @GetMapping("getLibro")
    public Libro getLibroByIdLibro(@RequestParam("isbn") long isbn) {
        return libroService.getLibroByIsbn(isbn);
    }

    /*--------------------------------------------------------------------------------------------------------
     * updateLibro: metodo que actualiza los datos de un libro del mismo isbn;
     *
     * @parametro libroUpdate - el objeto con el isbn y los datos nuevos del isbn;
     * @return - el libro actualizado;
     --------------------------------------------------------------------------------------------------------*/
    @PostMapping("updateLibro")
    public Libro updateLibro(@RequestBody Libro libroUpdate) {
        return libroService.updateLibro(libroUpdate);
    }

    /*--------------------------------------------------------------------------------------------------------
     * deleteByIsbnLibro: metodo que elimina un libro por su isbn;
     *
     * @param isbn - isbn del libro a eliminar;
     --------------------------------------------------------------------------------------------------------*/
    @DeleteMapping("deleteLibro/{isbn}")
    public void deleteByIdLibro(@PathVariable("isbn") Long isbn) {
        libroService.deleteByIdLibro(isbn);
    }



}
