package com.example.LibrarySystem.rest;

import com.example.LibrarySystem.models.LibroCategoria;
import com.example.LibrarySystem.services.LibroCategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/LibroCategoria/")
public class LibroCategoriaRest {
    @Autowired
    private LibroCategoriaService libroCategoriaService;
}
