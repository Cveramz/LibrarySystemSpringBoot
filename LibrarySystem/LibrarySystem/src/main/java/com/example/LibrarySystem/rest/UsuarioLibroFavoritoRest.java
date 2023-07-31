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

    @PostMapping("addUserLibFav")
    public UsuarioLibroFavorito addUserLibFav(@RequestBody UsuarioLibroFavorito ulf) {
        return usuarioLibroFavoritoService.addUserLibFav(ulf.getUsuario(),ulf.getLibro());
    }

    @GetMapping("getByIdUserLibFav/{id}")
    public UsuarioLibroFavorito getByIdUserLibFav(@RequestParam("idLibroFavorito") long idLibroFavorito){
        return usuarioLibroFavoritoService.getByIdUserLibFav(idLibroFavorito);
    }

    @GetMapping("listUserLibFav")
    public List<UsuarioLibroFavorito> listUserLibFav(){
        return usuarioLibroFavoritoService.listUserLibFav();
    }

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

    @DeleteMapping("deleteUserLibFav/{id}")
    public void deleteByIdUserLibFav(@PathVariable Long id){
        usuarioLibroFavoritoService.deleteByIdUserLibFav(id);
    }







}
