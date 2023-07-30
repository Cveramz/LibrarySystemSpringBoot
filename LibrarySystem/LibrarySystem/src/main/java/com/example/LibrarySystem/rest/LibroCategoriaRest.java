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


    //Función para obtener todas los libro_categoria
    @GetMapping("/findAll")
    public List<LibroCategoria> findAll(){
        return libroCategoriaService.findAll();
    }

    //hacer función para otener todas las libro_categoria según id_libro_categoria
    @GetMapping("/findByIdLibroCategoria/{id_libro_categoria}")
    public List<LibroCategoria> findByIdLibroCategoria(@PathVariable Long id_libro_categoria){
        return libroCategoriaService.findByIdLibroCategoria(id_libro_categoria);
    }

    //hacer función para otener todas las libro_categoria según id_categoria
    @GetMapping("/findByIdCategoria/{id_categoria}")
    public List<LibroCategoria> findByIdCategoria(@PathVariable Long id_categoria){
        return libroCategoriaService.findByIdCategoria(id_categoria);
    }

    //hacer función para otener todas las libro_categoria según isbn
    @GetMapping("/findByIsbn/{isbn}")
    public List<LibroCategoria> findByIsbn(@PathVariable String isbn){
        return libroCategoriaService.findByIsbn(isbn);
    }

    // Agregar una nueva tupla de LibroCategoria
    @PostMapping("/agregarLibroCategoria")
    public LibroCategoria agregarLibroCategoria(@RequestBody LibroCategoria libroCategoria) {
        return libroCategoriaService.agregarLibroCategoria(libroCategoria);
    }




}
