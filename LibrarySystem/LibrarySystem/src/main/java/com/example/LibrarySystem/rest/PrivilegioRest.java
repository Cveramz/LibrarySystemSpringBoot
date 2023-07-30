package com.example.LibrarySystem.rest;

import com.example.LibrarySystem.models.Privilegio;
import com.example.LibrarySystem.services.PrivilegioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Privilegio/")
public class PrivilegioRest {
    @Autowired
    private PrivilegioService privilegioService;

    @GetMapping
    public ResponseEntity<List<Privilegio>> obtenerTodosLosPrivilegios() {
        List<Privilegio> privilegios = privilegioService.findAll();
        return ResponseEntity.ok(privilegios);
    }
    @GetMapping("/{idPrivilegio}")
    public ResponseEntity<Privilegio> obtenerPrivilegioPorId(@PathVariable Long idPrivilegio) {
        Privilegio privilegio = privilegioService.obtenerPrivilegioPorId(idPrivilegio);
        if (privilegio != null) {
            return ResponseEntity.ok(privilegio);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/CrearPrivilegio")
    public ResponseEntity<Privilegio> crearNuevoPrivilegio(@RequestParam String nombrePrivilegio) {
        Privilegio nuevoPrivilegio = privilegioService.crearNuevoPrivilegio(nombrePrivilegio);
        return ResponseEntity.ok(nuevoPrivilegio);
    }





}
