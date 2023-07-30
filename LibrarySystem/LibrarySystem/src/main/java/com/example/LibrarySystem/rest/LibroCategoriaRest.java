package com.example.LibrarySystem.rest;

import com.example.LibrarySystem.models.LibroCategoria;
import com.example.LibrarySystem.services.LibroCategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
