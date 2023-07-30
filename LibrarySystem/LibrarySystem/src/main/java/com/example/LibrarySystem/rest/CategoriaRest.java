package com.example.LibrarySystem.rest;

import com.example.LibrarySystem.models.Categoria;
import com.example.LibrarySystem.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Categoria/")
public class CategoriaRest {
    @Autowired
    private CategoriaService categoriaService;
}
