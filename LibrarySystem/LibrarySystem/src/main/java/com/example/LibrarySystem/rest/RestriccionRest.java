package com.example.LibrarySystem.rest;

import com.example.LibrarySystem.services.RestriccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Restriccion/")
public class RestriccionRest {
    @Autowired
    private RestriccionService restriccionService;
}
