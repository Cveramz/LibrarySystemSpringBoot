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
    /**
     * Obtiene todos los roles disponibles.
     *
     * @return ResponseEntity con una lista de objetos de tipo Rol en el cuerpo de la respuesta.
     */
    @GetMapping("/ObtenerRol")
    public ResponseEntity<List<Rol>> findAll() {
        List<Rol> roles = rolService.findAll();
        return ResponseEntity.ok(roles);
    }
    /**
     * Obtiene un rol por su identificador (ID).
     *
     * @param id El identificador del rol que se desea obtener.
     * @return ResponseEntity con un objeto de tipo Rol en el cuerpo de la respuesta si se encuentra, o ResponseEntity not found si no se encuentra.
     */
    @GetMapping("/ObtenerRolPorId/{id}")
    public ResponseEntity<Rol> obtenerRolPorId(@PathVariable Long id) {
        Optional<Rol> rol = rolService.findRolById(id);
        if (rol.isPresent()) {
            return ResponseEntity.ok(rol.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    /**
     * Asigna un rol específico a un usuario y se crea una nueva tupla en la tabla.
     *
     * @param usuarioId El identificador del usuario al que se le asignará el rol.
     * @param nombreRol El nombre del rol que se asignará al usuario.
     * @return ResponseEntity con un mensaje de éxito si el rol se asigna correctamente, o ResponseEntity con un mensaje de error si el usuario no se encuentra.
     */
    @PostMapping("/AsignarRol")
    public ResponseEntity<String> asignarRolAUsuario(@RequestParam Long usuarioId, @RequestParam String nombreRol) {
        Usuario usuario = usuarioService.getUsuarioByid(usuarioId);
        if (usuario == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuario no encontrado");
        }
        rolService.asignarRolAUsuario(usuario, nombreRol);
        return ResponseEntity.ok("Rol asignado con éxito");
    }
    //http://localhost:8080/Rol/editar-rol/1?nuevoRol=NUEVO_ROL
    /**
     * Edita el rol de un usuario específico.
     *
     * @param usuarioId El identificador del usuario al que se le editará el rol.
     * @param nuevoRol El nuevo rol que se asignará al usuario.
     * @return ResponseEntity con un mensaje de éxito si el rol se edita correctamente.
     */
    @PutMapping("/EditarRolDeUsuario/{usuarioId}")
    public ResponseEntity<String> editarRolDeUsuario(@PathVariable Long usuarioId, @RequestParam String nuevoRol) {
        rolService.editarRolDeUsuario(usuarioId, nuevoRol);
        return ResponseEntity.ok("Rol del usuario editado con éxito");
    }
    // http://localhost:8080/Rol/eliminar-rol/29
    /**
     * Elimina un rol por su identificador (ID).
     *
     * @param rolId El identificador del rol que se desea eliminar.
     * @return ResponseEntity con un mensaje de éxito si el rol se elimina correctamente.
     */
    @DeleteMapping("/EliminarRol/{rolId}")
    public ResponseEntity<String> eliminarRolPorId(@PathVariable Long rolId) {
        rolService.eliminarRolPorId(rolId);
        return ResponseEntity.ok("Rol eliminado con éxito");
    }

}
