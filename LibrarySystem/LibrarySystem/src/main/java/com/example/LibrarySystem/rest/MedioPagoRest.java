package com.example.LibrarySystem.rest;

import com.example.LibrarySystem.services.MedioPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/MedioPago/")
public class MedioPagoRest {
    @Autowired
    private MedioPagoService medioPagoService;
}
