package com.example.LibrarySystem.rest;

import com.example.LibrarySystem.models.Compra;
import com.example.LibrarySystem.models.UsuarioLibroFavorito;
import com.example.LibrarySystem.services.UsuarioLibroFavoritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/UsuarioLibroFavorito/")
public class UsuarioLibroFavoritoRest {
    
    @Autowired
    private UsuarioLibroFavoritoService usuarioLibroFavoritoService;
    /*--------------------------------------------------------------------------------------------------------
     * addUserLibFav: crea un nuevo UserLibFav y lo registra la base de datos;
     *
     * @param ulf - objeto UsuarioLibroFavorito a guardar en el sistema;
     * @return - el Usuario libro favorito creado y registrado;
      --------------------------------------------------------------------------------------------------------*/

    @PostMapping("createLibUsFav")
    public UsuarioLibroFavorito addUserLibFav(@RequestBody UsuarioLibroFavorito ulf) {
        return usuarioLibroFavoritoService.addUserLibFav(ulf);
    }
    /*--------------------------------------------------------------------------------------------------------
         * getByIdUserLibFav: obtiene un UserLibFav de la base de datos por el id;
         *
         * @param idLibroFavorito - el id del UserLibFav;
         * @return - el Usuario libro favorito buscado en el sistema;
          --------------------------------------------------------------------------------------------------------*/
    @GetMapping("getByIdUserLibFav")
    public UsuarioLibroFavorito getByIdUserLibFav(@RequestParam("id_libro_fav") long idLibroFavorito){
        return usuarioLibroFavoritoService.getByIdUserLibFav(idLibroFavorito);
    }
    /*--------------------------------------------------------------------------------------------------------
             * listUserLibFav: retorna a todos los usuarios libros favoritos presentes en el sistema;
             *
             * @return - todos los usuarios libro favorito registrados en base de datos;
              --------------------------------------------------------------------------------------------------------*/
    @GetMapping
    public List<UsuarioLibroFavorito> listUserLibFav(){
        return usuarioLibroFavoritoService.listUserLibFav();
    }
    /*--------------------------------------------------------------------------------------------------------
     * updateUserLibFav: metodo que actualiza los datos de un usuario libro favorito del mismo id;
     *
     * @param ulfNueva - el objeto con el id y los datos nuevos del usuario libro favorito;
     * @return - el usuario libro favorito actualizado;
     --------------------------------------------------------------------------------------------------------*/

    @PostMapping("updateUserLibFav")
    public UsuarioLibroFavorito updateUserLibFav(@RequestBody UsuarioLibroFavorito ulfNueva){
        UsuarioLibroFavorito ulf = usuarioLibroFavoritoService.updateUserLibFav(ulfNueva);
        if(ulf != null){
            return ulf;
        }
        else{
            return null;
        }
    }
    /*--------------------------------------------------------------------------------------------------------
     * deleteByIdUserLibFav: metodo que elimina un UserLibFav  por su id;
     *
     * @param id - id del usuario libro favorito a eliminar;
     *
     --------------------------------------------------------------------------------------------------------*/

    @DeleteMapping("deleteUserLibFav/{id}")
    public void deleteByIdUserLibFav(@PathVariable long id){
        usuarioLibroFavoritoService.deleteByIdUserLibFav(id);
    }

}
