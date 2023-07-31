package com.example.LibrarySystem.rest;

import com.example.LibrarySystem.models.Usuario;
import com.example.LibrarySystem.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/Usuario/")
public class UsuarioRest {
    @Autowired
    private UsuarioService usuarioService;

    /*--------------------------------------------------------------------------------------------------------
     * getAllUsuarios: retorna a todos los usuarios presentes en el sistema;
     *
     * @return - todos los usuarios registrados en base de datos;
      --------------------------------------------------------------------------------------------------------*/
  @GetMapping()
    private ResponseEntity<List<Usuario>> getAllUsuarios(){
        return ResponseEntity.ok(usuarioService.findAll());
    }

    /*--------------------------------------------------------------------------------------------------------
     * getUsuarioByid: obtiene un usuario de la base de datos por el id;
     *
     * @param id_usuario - el id del usuario;
     * @return - el usuario buscado en el sistema;
      --------------------------------------------------------------------------------------------------------*/
    @GetMapping("getById")
    private Usuario getUsuarioByid(@RequestParam("id_usuario") long id_usuario){
        return usuarioService.getUsuarioByid(id_usuario);
    }

    /*--------------------------------------------------------------------------------------------------------
     * createUser: crea un nuevo usuario y lo registra la base de datos;
     *
     * @param user - objeto Usuario a guardar en el sistema;
     * @return - el usuario creado y registrado;
      --------------------------------------------------------------------------------------------------------*/
    @PostMapping("createUser")
    public Usuario createUser(@RequestBody Usuario user){
        return usuarioService.createUser(user);
    }

    /*--------------------------------------------------------------------------------------------------------
     * updateUser: metodo que actualiza los datos de un user del mismo id;
     *
     * @param usuarioUpdate - el objeto con el id y los datos nuevos del usuario;
     * @return - el usuario actualizado;
     --------------------------------------------------------------------------------------------------------*/
    @PostMapping("updateUser")
    public Usuario updateUser(@RequestBody Usuario usuarioActualizado) {
        Usuario user = usuarioService.updateUser(usuarioActualizado);
        if(user != null){
            return user;
        }else{return null;}
    }

    /*--------------------------------------------------------------------------------------------------------
     * deleteByIdUsuario: metodo que elimina un usuario por su id;
     *
     * @param id - id del usuario a eliminar;
     *
     --------------------------------------------------------------------------------------------------------*/
    @DeleteMapping("/deleteById/{id}")
    public void deleteByIdUsuario(@PathVariable Long id) {
        usuarioService.deleteByIdUsuario(id);
    }
}


