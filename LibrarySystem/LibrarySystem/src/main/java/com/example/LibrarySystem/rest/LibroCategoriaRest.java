package com.example.LibrarySystem.rest;

import com.example.LibrarySystem.models.LibroCategoria;
import com.example.LibrarySystem.services.LibroCategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/LibroCategoria/")
public class LibroCategoriaRest {
    @Autowired
    private LibroCategoriaService libroCategoriaService;


    /*--------------------------------------------------------------------------------------------------------
     * getAllLibroCategoria: retorna a todos los libro_categoria presentes en el sistema;
     *
     * @return - todos los libro_categoria registrados en base de datos;
     *
     --------------------------------------------------------------------------------------------------------*/
    @GetMapping("/findAll")
    public List<LibroCategoria> findAll(){
        return libroCategoriaService.findAll();
    }

    /*--------------------------------------------------------------------------------------------------------
     * findByIdLibroCategoria: obtiene un libro_categoria de la base de datos por el id_libro_categoria;
     *
     * @param id_libro_categoria - el id del libro_categoria;
     * @return - el libro_categoria buscado en el sistema;
     --------------------------------------------------------------------------------------------------------*/
    @GetMapping("/findByIdLibroCategoria/{id_libro_categoria}")
    public List<LibroCategoria> findByIdLibroCategoria(@PathVariable Long id_libro_categoria){
        return libroCategoriaService.findByIdLibroCategoria(id_libro_categoria);
    }

    /*--------------------------------------------------------------------------------------------------------
     * findByIdLibro: obtiene un libro_categoria de la base de datos por el id_libro;
     *
     * @param id_libro - el id del libro;
     * @return - el libro_categoria buscado en el sistema;
     --------------------------------------------------------------------------------------------------------*/
    @GetMapping("/findByIdCategoria/{id_categoria}")
    public List<LibroCategoria> findByIdCategoria(@PathVariable Long id_categoria){
        return libroCategoriaService.findByIdCategoria(id_categoria);
    }

    /*--------------------------------------------------------------------------------------------------------
     * findByIsbn: obtiene un libro_categoria de la base de datos por el isbn;
     *
     * @param isbn - el isbn del libro;
     * @return - el libro_categoria buscado en el sistema;
     --------------------------------------------------------------------------------------------------------*/
    @GetMapping("/findByIsbn/{isbn}")
    public List<LibroCategoria> findByIsbn(@PathVariable String isbn){
        return libroCategoriaService.findByIsbn(isbn);
    }

    /*--------------------------------------------------------------------------------------------------------
     * agregarLibroCategoria: crea un nuevo libro_categoria y lo registra la base de datos;
     *
     * @param libroCategoria - objeto LibroCategoria a guardar en el sistema;
     * @return - el libro_categoria creado y registrado;
     --------------------------------------------------------------------------------------------------------*/
    @PostMapping("/agregarLibroCategoria")
    public LibroCategoria agregarLibroCategoria(@RequestBody LibroCategoria libroCategoria) {
        return libroCategoriaService.agregarLibroCategoria(libroCategoria);
    }




}
