package com.example.LibrarySystem.rest;

import com.example.LibrarySystem.models.CarroLibro;
import com.example.LibrarySystem.services.CarroLibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/CarroLibro/")
public class CarroLibroRest {
    @Autowired
    private CarroLibroService carroLibroService;

    /*--------------------------------------------------------------------------------------------------------
     * getAllCarroLibros: Retorna todos los CarroLibros presentes en el sistema.
     *
     * @return - Todos los CarroLibros registrados en la base de datos.
     --------------------------------------------------------------------------------------------------------*/
    @GetMapping
    public ResponseEntity<List<CarroLibro>> getAllCarroLibros() {
        List<CarroLibro> carroLibros = carroLibroService.findAll();
        return ResponseEntity.ok(carroLibros);
    }

    /*--------------------------------------------------------------------------------------------------------
     * getCarroLibroById: Obtiene un CarroLibro de la base de datos por el id.
     *
     * @param id_carro_libro - El id del CarroLibro.
     * @return - El CarroLibro buscado en el sistema.
     --------------------------------------------------------------------------------------------------------*/
    @GetMapping("/getById")
    public CarroLibro getCarroLibroById(@RequestParam("id_carro_libro") long id) {
        return carroLibroService.getCarroLibroById(id);
    }

    /*--------------------------------------------------------------------------------------------------------
     * createCarroLibro: Crea un nuevo CarroLibro y lo registra en la base de datos.
     *
     * @param carroLibro - Objeto CarroLibro a guardar en el sistema.
     * @return - El CarroLibro creado y registrado.
     --------------------------------------------------------------------------------------------------------*/
    @PostMapping("/createCarroLibro")
    public CarroLibro createCarroLibro(@RequestBody CarroLibro carroLibro) {
        return carroLibroService.createCarroLibro(carroLibro);
    }

    /*--------------------------------------------------------------------------------------------------------
     * updateCarroLibro: Método que actualiza los datos de un CarroLibro con el mismo id.
     *
     * @param carroLibroActualizado - El objeto con el id y los datos nuevos del CarroLibro.
     * @return - El CarroLibro actualizado.
     --------------------------------------------------------------------------------------------------------*/
    @PostMapping("/updateCarroLibro")
    public CarroLibro updateCarroLibro(@RequestBody CarroLibro carroLibroActualizado) {
        CarroLibro carroLibro = carroLibroService.updateCarroLibro(carroLibroActualizado);
        return carroLibro;
    }

    /*--------------------------------------------------------------------------------------------------------
     * deleteByIdCarroLibro: Método que elimina un CarroLibro por su id.
     *
     * @param id - Id del CarroLibro a eliminar.
     --------------------------------------------------------------------------------------------------------*/
    @DeleteMapping("/deleteById/{id}")
    public void deleteByIdCarroLibro(@PathVariable Long id) {
        carroLibroService.deleteByIdCarroLibro(id);
    }
}
