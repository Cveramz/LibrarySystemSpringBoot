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
    /**
     * Obtiene todos los privilegios disponibles.
     *
     * @return ResponseEntity con una lista de objetos de tipo Privilegio en el cuerpo de la respuesta.
     */
    @GetMapping("/ObtenerPrivilegios")
    public ResponseEntity<List<Privilegio>> obtenerTodosLosPrivilegios() {
        List<Privilegio> privilegios = privilegioService.findAll();
        return ResponseEntity.ok(privilegios);
    }
    /**
     * Obtiene un privilegio por su identificador (ID).
     *
     * @param idPrivilegio El identificador del privilegio que se desea obtener.
     * @return ResponseEntity con un objeto de tipo Privilegio en el cuerpo de la respuesta si se encuentra, o ResponseEntity not found si no se encuentra.
     */
    @GetMapping("/ObtenerPrivilegioPorId/{idPrivilegio}")
    public ResponseEntity<Privilegio> obtenerPrivilegioPorId(@PathVariable Long idPrivilegio) {
        Privilegio privilegio = privilegioService.obtenerPrivilegioPorId(idPrivilegio);
        if (privilegio != null) {
            return ResponseEntity.ok(privilegio);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    /**
     * Agrega un nuevo privilegio con el nombre especificado y se crea una nueva tupla en la tabla.
     *
     * @param nombrePrivilegio El nombre del nuevo privilegio que se desea agregar.
     * @return ResponseEntity con un objeto de tipo Privilegio en el cuerpo de la respuesta que representa el nuevo privilegio creado.
     */
    @PostMapping("/AgregarPrivilegio")
    public ResponseEntity<Privilegio> agregarPrivilegio(@RequestBody String nombrePrivilegio) {
        Privilegio nuevoPrivilegio = privilegioService.agregarPrivilegio(nombrePrivilegio);
        return ResponseEntity.ok(nuevoPrivilegio);
    }
    //http://localhost:8080/Privilegio/editar-privilegio/1?nuevoRol=NUEVO_PRIVILEGIO
    /**
     * Edita el nombre de un privilegio específico.
     *
     * @param id El identificador del privilegio que se desea editar.
     * @param nuevoPrivilegio El nuevo nombre que se asignará al privilegio.
     * @return ResponseEntity con un mensaje de éxito si el privilegio se edita correctamente.
     */
    @PutMapping("/EditarPrivilegio/{id}")
    public ResponseEntity<String> editarRolDeUsuario(@PathVariable Long id, @RequestParam String nuevoPrivilegio) {
        privilegioService.editarPrivilegio(id, nuevoPrivilegio);
        return ResponseEntity.ok("Rol del usuario editado con éxito");
    }
    /**
     * Elimina un privilegio por su identificador (ID).
     *
     * @param id El identificador del privilegio que se desea eliminar.
     * @return ResponseEntity con un mensaje de éxito si el privilegio se elimina correctamente.
     */
    @DeleteMapping("/EliminarPrivilegio/{id}")
    public ResponseEntity<String> eliminarPrivilegio(@PathVariable("id") Long id) {
        privilegioService.eliminarPrivilegio(id);
        return new ResponseEntity<>("Privilegio eliminado exitosamente", HttpStatus.OK);
    }


}
