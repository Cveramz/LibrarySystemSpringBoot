package com.example.LibrarySystem.rest;

import com.example.LibrarySystem.models.Restriccion;
import com.example.LibrarySystem.services.RestriccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Restriccion/")
public class RestriccionRest {
    @Autowired
    private RestriccionService restriccionService;

    /*--------------------------------------------------------------------------------------------------------
     * getAllRestricciones: Obtiene todas las restricciones de los libros de la base de datos
     *
     * @param
     * @return - List<Restriccion>: Lista de restricciones de los libros
     *
     * Ejemplo de uso: http://localhost:8080/Restriccion/
      --------------------------------------------------------------------------------------------------------*/
    @GetMapping
    public List<Restriccion> getAllRestricciones() {
        return restriccionService.findAll();
    }

    /*--------------------------------------------------------------------------------------------------------
     * getRestriccionById: Obtiene una restriccion de un libro de la base de datos
     *
     * @param id - int: Id de la restriccion a buscar
     * @return - ResponseEntity<Restriccion>: Restriccion del libro
     *
     * Ejemplo de uso: http://localhost:8080/Restriccion/1
      --------------------------------------------------------------------------------------------------------*/
    @GetMapping("{id}")
    public ResponseEntity<Restriccion> getRestriccionById(@PathVariable int id) {
        Optional<Restriccion> restriccionOptional = restriccionService.findByIdRestriccion(id);

        if (restriccionOptional.isPresent()) {
            return ResponseEntity.ok(restriccionOptional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    /*--------------------------------------------------------------------------------------------------------
     * getRestriccionesByEdad: Obtiene una restriccion de un libro de la base de datos
     *
     * @param edad - String: Edad de la restriccion a buscar
     * @return - List<Restriccion>: Restriccion del libro
     *
     * Ejemplo de uso: http://localhost:8080/Restriccion/edad/{edad}
      --------------------------------------------------------------------------------------------------------*/
    @GetMapping("edad/{edad}")
    public List<Restriccion> getRestriccionesByEdad(@PathVariable String edad) {
        return restriccionService.findByEdad(edad);
    }


    /*--------------------------------------------------------------------------------------------------------
     * getRestriccionesByIsbn: Obtiene una restriccion de un libro de la base de datos
     *
     * @param isbn - Long: Isbn del libro a buscar
     * @return - List<Restriccion>: Restriccion del libro
     *
     * Ejemplo de uso: http://localhost:8080/Restriccion/isbn/{isbn}
      --------------------------------------------------------------------------------------------------------*/
    @GetMapping("isbn/{isbn}")
    public List<Restriccion> getRestriccionesByIsbn(@PathVariable Long isbn) {
        return restriccionService.findByLibroIsbn(isbn);
    }


    /*--------------------------------------------------------------------------------------------------------
     * createRestriccion: Crea una restriccion de un libro en la base de datos
     *
     * @param restriccion - Restriccion: Restriccion a crear
     * @return - ResponseEntity<Restriccion>: Restriccion creada
     *
     * Ejemplo de uso: http://localhost:8080/Restriccion/
      --------------------------------------------------------------------------------------------------------*/
    @PostMapping
    public ResponseEntity<Restriccion> createRestriccion(@RequestBody Restriccion restriccion) {
        Restriccion nuevaRestriccion = restriccionService.saveRestriccion(restriccion);
        if (nuevaRestriccion != null) {
            return ResponseEntity.ok(nuevaRestriccion);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }



    /*--------------------------------------------------------------------------------------------------------
     * updateRestriccion: Actualiza una restriccion de un libro en la base de datos
     * @param id - int: Id de la restriccion a actualizar
     * @param restriccionData - Restriccion: Restriccion a actualizar
      --------------------------------------------------------------------------------------------------------*/
    @PutMapping("{id}")
    public ResponseEntity<Restriccion> updateRestriccion(@PathVariable Integer id, @RequestBody Restriccion restriccionData) {
        Optional<Restriccion> restriccionOptional = restriccionService.findByIdRestriccion(id);

        if (restriccionOptional.isPresent()) {
            Restriccion restriccion = restriccionOptional.get();
            restriccion.setEdad(restriccionData.getEdad());
            restriccion.setLibro(restriccionData.getLibro());

            Restriccion updatedRestriccion = restriccionService.updateRestriccion(restriccion);
            return ResponseEntity.ok(updatedRestriccion);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    /*--------------------------------------------------------------------------------------------------------
     * deleteRestriccionById: Elimina una restriccion de un libro de la base de datos
     *
     * @param idRestriccion - int: Id de la restriccion a eliminar
     * @return - ResponseEntity<String>: Mensaje de confirmacion
     *
     * Ejemplo de uso: http://localhost:8080/Restriccion/{idRestriccion}
      --------------------------------------------------------------------------------------------------------*/
    @DeleteMapping("{idRestriccion}")
    public ResponseEntity<String> deleteRestriccionById(@PathVariable Integer idRestriccion) {
        restriccionService.deleteByRestriccionId(idRestriccion);
        return ResponseEntity.ok("Restriccion eliminada correctamente");
    }
}
