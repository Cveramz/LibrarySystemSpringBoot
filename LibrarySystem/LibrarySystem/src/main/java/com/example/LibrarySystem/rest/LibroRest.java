package com.example.LibrarySystem.rest;



import com.example.LibrarySystem.models.Libro;
import com.example.LibrarySystem.services.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Libro/")
public class LibroRest {
    @Autowired
    private LibroService libroService;
    @GetMapping
    private ResponseEntity<List<Libro>> getAllUsuarios(){
        return ResponseEntity.ok(libroService.findAll());
    }
}
