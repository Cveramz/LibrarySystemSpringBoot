package com.example.LibrarySystem.rest;

import com.example.LibrarySystem.models.Compra;
import com.example.LibrarySystem.models.Ubicacion;
import com.example.LibrarySystem.services.UbicacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Ubicacion/")
public class UbicacionRest {
    @Autowired
    private UbicacionService ubicacionService;
    /*--------------------------------------------------------------------------------------------------------
     * createUbicacion: metodo que registra una Ubicacion en la base de datos;
     *
     * @param ubicacion - objeto que representa la Ubicacion a registrar;
     *
     * @return - la ubicacion registrada en el sistema;
     *
     * Comentario: genera el ID automaticamente;
      --------------------------------------------------------------------------------------------------------*/
    @PostMapping("createUbicacion")
    public Ubicacion createUbicacion(@RequestBody Ubicacion ubicacion) {
        return ubicacionService.createUbicacion(ubicacion);
    }

    /*--------------------------------------------------------------------------------------------------------
     * getUbicacionByID: obtiene una ubibacion por su id;
     *
     * @param id_ubicacion - el numero de ubicacion;
     *
     * @return - la ubicacion buscada en el sistema;
     *
      --------------------------------------------------------------------------------------------------------*/
    @GetMapping("getById")
    public Ubicacion getUbicacionbyId(@RequestParam("id_ubicacion") long id_ubicacion) {
        return ubicacionService.getUbicacionById(id_ubicacion);
    }

    /*--------------------------------------------------------------------------------------------------------
     * updateUbicacion: metodo que actualiza una ubicacion dentro de la base de datos;
     *
     * @param ubicacionActualizada - la ubicacion con el id y los datos actualizados;
     *
     * @return - la ubicacion actualizada;
     *
      --------------------------------------------------------------------------------------------------------*/
    @PostMapping("updateUbicacion")
    public Ubicacion updateUbicacion(@RequestBody Ubicacion UbicacionActualizada) {
        Ubicacion ubicacion = ubicacionService.updateUbicacion(UbicacionActualizada);
        if(ubicacion != null){
            return ubicacion;
        }else{return null;}
    }

    /*--------------------------------------------------------------------------------------------------------
     * deleteByIdUbicacion: borra una ubicacion en la base de datos segun id;
     *
     * @param id - id de la ubicacion a borrar;
     *
      --------------------------------------------------------------------------------------------------------*/
    @DeleteMapping("/deleteById/{id_ubicacion}")
    public void deleteByIdUbicacion(@PathVariable Long id_ubicacion) {
        ubicacionService.deleteByIdUbicacion(id_ubicacion);
    }

}
