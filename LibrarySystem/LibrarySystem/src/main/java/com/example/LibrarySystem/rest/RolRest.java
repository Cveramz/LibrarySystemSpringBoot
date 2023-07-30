package com.example.LibrarySystem.rest;

import com.example.LibrarySystem.services.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Rol/")
public class RolRest {
    @Autowired
    private RolService rolService;
}
