package com.example.LibrarySystem.rest;

import com.example.LibrarySystem.services.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Carro/")
public class CarroRest {
    @Autowired
    private CarroService carroService;
}
