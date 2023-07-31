package com.example.LibrarySystem.rest;

import com.example.LibrarySystem.models.Privilegio;
import com.example.LibrarySystem.models.Rol;
import com.example.LibrarySystem.models.RolPrivilegio;
import com.example.LibrarySystem.services.RolPrivilegioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/RolPrivilegio/")
public class RolPrivilegioRest {
    @Autowired
    private RolPrivilegioService rolPrivilegioService;
    @GetMapping("/ObtenerRolPrivilegios")
    public List<RolPrivilegio> obtenerTodosLosRolPrivilegios() {
        return rolPrivilegioService.findAll();
    }
    @GetMapping("/ObtenerRolPrivilegiosPorId/{id}")
    public RolPrivilegio obtenerRolPrivilegioPorId(@PathVariable Long id) {
        return rolPrivilegioService.obtenerRolPrivilegioPorId(id);
    }
    @PostMapping("/AsignarPrivilegioARol")
    public ResponseEntity<String> asignarPrivilegioARol(@RequestParam int idRol, @RequestParam int idPrivilegio) {
        Rol rol = new Rol();
        rol.setId_rol(idRol);
        Privilegio privilegio = new Privilegio();
        privilegio.setId_privilegio(idPrivilegio);
        rolPrivilegioService.agregarRolPrivilegio(rol, privilegio);
        return new ResponseEntity<>("Tupla creada exitosamente.", HttpStatus.CREATED);
    }
    @PutMapping("/EditarRolPrivilegio/{idRol}")
    public ResponseEntity<String> editarRolPrivilegio(@PathVariable Long idRol,@RequestBody Integer idPrivilegioNuevo) {
        try {
            rolPrivilegioService.editarRolPrivilegio(idRol, idPrivilegioNuevo);
            return ResponseEntity.ok("Rol-Privilegio actualizado correctamente");
        }  catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Ocurrió un error al actualizar el Rol-Privilegio");
        }
    }
    @DeleteMapping("/EliminarRolPrivilegio/{id}")
    public ResponseEntity<String> eliminarRolPrivilegio(@PathVariable Long id) {
        try {
            rolPrivilegioService.eliminarRolPrivilegio(id);
            return ResponseEntity.ok("Rol-Privilegio eliminado correctamente");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Ocurrió un error al eliminar el Rol-Privilegio");
        }
    }
}
