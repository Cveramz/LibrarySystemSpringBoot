package com.example.LibrarySystem.rest;

import com.example.LibrarySystem.models.UsuarioLibroFavorito;
import com.example.LibrarySystem.models.Valoracion;
import com.example.LibrarySystem.services.ValoracionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Valoracion/")
public class ValoracionRest {
    @Autowired
    private ValoracionService valoracionService;

    @PostMapping("createValoracion")
    public Valoracion createValoracion(@RequestBody Valoracion val){
        return valoracionService.createValoracion(val);
    }

    @GetMapping("getByIdVal")
    public Valoracion getByIdVal(@RequestParam("id_valoracion") long id_valoracion){
        return valoracionService.getByIdVal(id_valoracion);
    }

    @GetMapping
    public List<Valoracion> listValoracion(){
        return valoracionService.listValoracion();
    }
    @PostMapping("updateValoracion")
    public Valoracion updateValoracion(@RequestBody Valoracion valNueva){
        Valoracion valoracion = valoracionService.updateValoracion(valNueva);
        if(valoracion != null){
            return valoracion;
        }
        else{
            return null;
        }}

    @DeleteMapping("deleteValoracion/{id}")
    public void deleteValoracion(@PathVariable long id){
        valoracionService.deleteValoracion(id);
    }


}
