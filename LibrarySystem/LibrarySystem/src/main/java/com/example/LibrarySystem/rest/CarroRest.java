package com.example.LibrarySystem.rest;

import com.example.LibrarySystem.models.Carro;
import com.example.LibrarySystem.services.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Carro/")
public class CarroRest {
    @Autowired
    private CarroService carroService;

    /*--------------------------------------------------------------------------------------------------------
     * createCarro: metodo que guarda un nuevo carro en la base de datos;
     *
     * @param carro - un objeto de tipo Carro que contiene los datos del carro a guardar;
     * @return - el carro creado y registrado;
     *
     * Comentario: genera el ID automaticamente;
     --------------------------------------------------------------------------------------------------------*/
    @PostMapping("createCarro")
    public Carro createCarro(@RequestBody Carro carro) {
        return carroService.createCarro(carro);
    }

    /*--------------------------------------------------------------------------------------------------------
     * getCarroByIdCarro: metodo que obtiene un carro según su id;
     *
     * @param id_carro - el id del carro en la base de datos;
     * @return - el carro correspondiente al id especificado;
     --------------------------------------------------------------------------------------------------------*/
    @GetMapping("getCarro")
    public Carro getCarroByIdCarro(@RequestParam("id_carro") long id_carro) {
        return carroService.getCarroById(id_carro);
    }

    /*--------------------------------------------------------------------------------------------------------
     * updateCarro: metodo que actualiza los datos de un carro del mismo id;
     *
     * @param carroUpdate - el objeto con el id y los datos nuevos del carro;
     * @return - el carro actualizado;
     --------------------------------------------------------------------------------------------------------*/
    @PostMapping("updateCarro")
    public Carro updateCarro(@RequestBody Carro carroUpdate) {
        return carroService.updateCarro(carroUpdate);
    }

    /*--------------------------------------------------------------------------------------------------------
     * deleteByIdCarro: metodo que elimina un carro por su id;
     *
     * @param id - id del carro a eliminar;
     --------------------------------------------------------------------------------------------------------*/
    @DeleteMapping("deleteCarro/{id}")
    public void deleteByIdCarro(@PathVariable("id") Long id) {
        carroService.deleteByIdCarro(id);
    }

}
