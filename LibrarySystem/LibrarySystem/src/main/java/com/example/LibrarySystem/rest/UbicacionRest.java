package com.example.LibrarySystem.rest;

import com.example.LibrarySystem.services.UbicacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Ubicacion/")
public class UbicacionRest {
    @Autowired
    private UbicacionService ubicacionService;
}
