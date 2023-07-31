package com.example.LibrarySystem.rest;

import com.example.LibrarySystem.models.Privilegio;
import com.example.LibrarySystem.services.PrivilegioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Privilegio/")
public class PrivilegioRest {
    @Autowired
    private PrivilegioService privilegioService;

    @GetMapping("/ObtenerPrivilegios")
    public ResponseEntity<List<Privilegio>> obtenerTodosLosPrivilegios() {
        List<Privilegio> privilegios = privilegioService.findAll();
        return ResponseEntity.ok(privilegios);
    }
    @GetMapping("/ObtenerPrivilegioPorId/{idPrivilegio}")
    public ResponseEntity<Privilegio> obtenerPrivilegioPorId(@PathVariable Long idPrivilegio) {
        Privilegio privilegio = privilegioService.obtenerPrivilegioPorId(idPrivilegio);
        if (privilegio != null) {
            return ResponseEntity.ok(privilegio);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/AgregarPrivilegio")
    public ResponseEntity<Privilegio> agregarPrivilegio(@RequestBody String nombrePrivilegio) {
        Privilegio nuevoPrivilegio = privilegioService.agregarPrivilegio(nombrePrivilegio);
        return ResponseEntity.ok(nuevoPrivilegio);
    }
    //http://localhost:8080/Privilegio/editar-privilegio/1?nuevoRol=NUEVO_PRIVILEGIO
    @PutMapping("/EditarPrivilegio/{id}")
    public ResponseEntity<String> editarRolDeUsuario(@PathVariable Long id, @RequestParam String nuevoPrivilegio) {
        privilegioService.editarPrivilegio(id, nuevoPrivilegio);
        return ResponseEntity.ok("Rol del usuario editado con éxito");
    }

    @DeleteMapping("/EliminarPrivilegio/{id}")
    public ResponseEntity<String> eliminarPrivilegio(@PathVariable("id") Long id) {
        privilegioService.eliminarPrivilegio(id);
        return new ResponseEntity<>("Privilegio eliminado exitosamente", HttpStatus.OK);
    }


}
