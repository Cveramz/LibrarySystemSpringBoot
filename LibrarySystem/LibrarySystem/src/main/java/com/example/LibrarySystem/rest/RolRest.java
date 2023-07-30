package com.example.LibrarySystem.rest;

import com.example.LibrarySystem.models.Rol;
import com.example.LibrarySystem.models.Usuario;
import com.example.LibrarySystem.services.RolService;
import com.example.LibrarySystem.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Rol/")
public class RolRest {
    @Autowired
    private RolService rolService;
    @Autowired
    private UsuarioService usuarioService;
    @GetMapping("/obtenerRol")
    public ResponseEntity<List<Rol>> findAll() {
        List<Rol> roles = rolService.findAll();
        return ResponseEntity.ok(roles);
    }
    @GetMapping("/obtenerRolPorId/{id}")
    public ResponseEntity<Rol> obtenerRolPorId(@PathVariable Long id) {
        Optional<Rol> rol = rolService.findRolById(id);
        if (rol.isPresent()) {
            return ResponseEntity.ok(rol.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @PostMapping("/asignar-rol")
    public ResponseEntity<String> asignarRolAUsuario(@RequestParam Long usuarioId, @RequestParam String nombreRol) {
        Usuario usuario = usuarioService.getUsuarioByid(usuarioId);

        if (usuario == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuario no encontrado");
        }

        rolService.asignarRolAUsuario(usuario, nombreRol);
        return ResponseEntity.ok("Rol asignado con éxito");
    }

    //http://localhost:8080/Rol/editar-rol/1?nuevoRol=NUEVO_ROL
    @PutMapping("/editar-rol/{usuarioId}")
    public ResponseEntity<String> editarRolDeUsuario(@PathVariable Long usuarioId, @RequestParam String nuevoRol) {
        rolService.editarRolDeUsuario(usuarioId, nuevoRol);
        return ResponseEntity.ok("Rol del usuario editado con éxito");
    }
    // http://localhost:8080/Rol/eliminar-rol/29
    @DeleteMapping("/eliminar-rol/{rolId}")
    public ResponseEntity<String> eliminarRolPorId(@PathVariable Long rolId) {
        rolService.eliminarRolPorId(rolId);
        return ResponseEntity.ok("Rol eliminado con éxito");
    }

}
