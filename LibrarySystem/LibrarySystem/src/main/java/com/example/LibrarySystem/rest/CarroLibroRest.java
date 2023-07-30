package com.example.LibrarySystem.rest;

import com.example.LibrarySystem.services.CarroLibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/CarroLibro/")
public class CarroLibroRest {
    @Autowired
    private CarroLibroService carroLibroService;
}
