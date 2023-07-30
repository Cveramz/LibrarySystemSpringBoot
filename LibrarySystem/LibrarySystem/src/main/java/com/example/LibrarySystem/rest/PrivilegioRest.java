package com.example.LibrarySystem.rest;

import com.example.LibrarySystem.services.PrivilegioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Privilegio/")
public class PrivilegioRest {
    @Autowired
    private PrivilegioService privilegioService;
}
