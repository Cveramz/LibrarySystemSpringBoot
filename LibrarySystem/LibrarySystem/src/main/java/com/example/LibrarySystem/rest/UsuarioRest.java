package com.example.LibrarySystem.rest;

import com.example.LibrarySystem.models.Usuario;
import com.example.LibrarySystem.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Usuario/")
public class UsuarioRest {
    @Autowired
    private UsuarioService usuarioService;

  @GetMapping
    private ResponseEntity<List<Usuario>> getAllUsuarios(){
        return ResponseEntity.ok(usuarioService.findAll());
    }

    @GetMapping("getById")
    private Usuario getUsuarioByid(@RequestParam("id_usuario") long id_usuario){
        return usuarioService.getUsuarioByid(id_usuario);
    }
}
