package com.example.LibrarySystem.rest;

import com.example.LibrarySystem.services.ValoracionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Valoracion/")
public class ValoracionRest {
    @Autowired
    private ValoracionService valoracionService;


}