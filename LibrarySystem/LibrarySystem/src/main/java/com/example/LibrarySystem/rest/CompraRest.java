package com.example.LibrarySystem.rest;

import com.example.LibrarySystem.services.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Compra/")
public class CompraRest {
    @Autowired
    private CompraService compraService;
}
