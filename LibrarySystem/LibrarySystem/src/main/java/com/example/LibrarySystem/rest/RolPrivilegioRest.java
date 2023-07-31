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
    /**
     * Obtiene todos los objetos de tipo RolPrivilegio disponibles.
     *
     * @return Una lista de objetos de tipo RolPrivilegio que contiene todos los registros disponibles.
     */
    @GetMapping("/ObtenerRolPrivilegios")
    public List<RolPrivilegio> obtenerTodosLosRolPrivilegios() {
        return rolPrivilegioService.findAll();
    }
    /**
     * Obtiene un objeto de tipo RolPrivilegio por su identificador (ID).
     *
     * @param id El identificador del objeto RolPrivilegio que se desea obtener.
     * @return Un objeto de tipo RolPrivilegio si se encuentra, o null si no existe un registro con el ID proporcionado.
     */
    @GetMapping("/ObtenerRolPrivilegiosPorId/{id}")
    public RolPrivilegio obtenerRolPrivilegioPorId(@PathVariable Long id) {
        return rolPrivilegioService.obtenerRolPrivilegioPorId(id);
    }
    /**
     * Asigna un privilegio específico a un rol y se crea una nueva tupla en la tabla.
     *
     * @param idRol El identificador del rol al que se le asignará el privilegio.
     * @param idPrivilegio El identificador del privilegio que se asignará al rol.
     * @return ResponseEntity con un mensaje de éxito si la asignación se realiza correctamente.
     */
    @PostMapping("/AsignarPrivilegioARol")
    public ResponseEntity<String> asignarPrivilegioARol(@RequestParam int idRol, @RequestParam int idPrivilegio) {
        Rol rol = new Rol();
        rol.setId_rol(idRol);
        Privilegio privilegio = new Privilegio();
        privilegio.setId_privilegio(idPrivilegio);
        rolPrivilegioService.agregarRolPrivilegio(rol, privilegio);
        return new ResponseEntity<>("Tupla creada exitosamente.", HttpStatus.CREATED);
    }
    /**
     * Edita el privilegio de un rol específico.
     *
     * @param idRol El identificador del rol al que se le actualizará el privilegio.
     * @param idPrivilegioNuevo El nuevo identificador del privilegio que se asignará al rol.
     * @return ResponseEntity con un mensaje de éxito si la actualización se realiza correctamente, o un mensaje de error si ocurre un problema.
     */
    @PutMapping("/EditarRolPrivilegio/{idRol}")
    public ResponseEntity<String> editarRolPrivilegio(@PathVariable Long idRol,@RequestBody Integer idPrivilegioNuevo) {
        try {
            rolPrivilegioService.editarRolPrivilegio(idRol, idPrivilegioNuevo);
            return ResponseEntity.ok("Rol-Privilegio actualizado correctamente");
        }  catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Ocurrió un error al actualizar el Rol-Privilegio");
        }
    }
    /**
     * Elimina un objeto de tipo RolPrivilegio por su identificador (ID).
     *
     * @param id El identificador del objeto RolPrivilegio que se desea eliminar.
     * @return ResponseEntity con un mensaje de éxito si la eliminación se realiza correctamente, o un mensaje de error si ocurre un problema.
     */
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
