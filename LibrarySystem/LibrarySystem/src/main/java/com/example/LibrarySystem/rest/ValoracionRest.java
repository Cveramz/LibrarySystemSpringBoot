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
    /*--------------------------------------------------------------------------------------------------------
     * createValoracion: crea una nueva valoracion y lo registra la base de datos;
     *
     * @param val - objeto Valoracion a guardar en el sistema;
     * @return - el valoracion creada y registrada;
      --------------------------------------------------------------------------------------------------------*/

    @PostMapping("createValoracion")
    public Valoracion createValoracion(@RequestBody Valoracion val){
        return valoracionService.createValoracion(val);
    }
    /*--------------------------------------------------------------------------------------------------------
     * getByIdVal: obtiene una valoracion de la base de datos por el id;
     *
     * @param id_valoracion - el id de la valoracion;
     * @return - la valoracion buscada en el sistema;
      --------------------------------------------------------------------------------------------------------*/

    @GetMapping("getByIdVal")
    public Valoracion getByIdVal(@RequestParam("id_valoracion") long id_valoracion){
        return valoracionService.getByIdVal(id_valoracion);
    }
     /*--------------------------------------------------------------------------------------------------------
         * listValoracion: retorna a todas las valoraciones presentes en el sistema;
         *
         * @return - todas las valoraciones registradas en base de datos;
          --------------------------------------------------------------------------------------------------------*/

    @GetMapping
    public List<Valoracion> listValoracion(){
        return valoracionService.listValoracion();
    }

    /*--------------------------------------------------------------------------------------------------------
     * updateValoracion: metodo que actualiza los datos de una valoracion del mismo id;
     *
     * @param valNueva - el objeto con el id y los datos nuevos de la valoracion;
     * @return - la valoracion actualizada;
     --------------------------------------------------------------------------------------------------------*/

    @PostMapping("updateValoracion")
    public Valoracion updateValoracion(@RequestBody Valoracion valNueva){
        Valoracion valoracion = valoracionService.updateValoracion(valNueva);
        if(valoracion != null){
            return valoracion;
        }
        else{
            return null;
        }}
    /*--------------------------------------------------------------------------------------------------------
         * deleteValoracion: metodo que elimina una valoracion por su id;
         *
         * @param id - id de la valoracion a eliminar;
         *
         --------------------------------------------------------------------------------------------------------*/
    @DeleteMapping("deleteValoracion/{id}")
    public void deleteValoracion(@PathVariable long id){
        valoracionService.deleteValoracion(id);
    }


}
