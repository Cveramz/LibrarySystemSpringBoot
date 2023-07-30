package com.example.LibrarySystem.rest;

import com.example.LibrarySystem.services.UsuarioLibroFavoritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/UsuarioLibroFavorito/")
public class UsuarioLibroFavoritoRest {
    @Autowired
    private UsuarioLibroFavoritoService usuarioLibroFavoritoService;
}
