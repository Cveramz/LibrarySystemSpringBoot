package com.example.LibrarySystem.rest;

import com.example.LibrarySystem.models.LibroCategoria;
import com.example.LibrarySystem.services.LibroCategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping("/LibroCategoria/")
public class LibroCategoriaRest {
    @Autowired
    private LibroCategoriaService libroCategoriaService;

    /*--------------------------------------------------------------------------------------------------------
     * getAllLibroCategorias: Obtiene todas las relaciones Libro-Categoria
     *
     * @param
     * @return - Lista de relaciones Libro-Categoria
     *
     * Ejemplo de uso: GET -> http://localhost:8080/LibroCategoria/
     --------------------------------------------------------------------------------------------------------*/
    @GetMapping
    public List<LibroCategoria> getAllLibroCategorias() {
        return libroCategoriaService.findAll();
    }

    /*--------------------------------------------------------------------------------------------------------
     * getLibroCategoriaById: Obtiene una relación libro-categoría por su id_libro_categoria
     *
     * @param idLibroCategoria - Integer: Id de la relación libro-categoría a buscar
     * @return - ResponseEntity<LibroCategoria>: Relación libro-categoría encontrada
     *
     * Ejemplo de uso: http://localhost:8080/LibroCategoria/{idLibroCategoria}
     --------------------------------------------------------------------------------------------------------*/
    @GetMapping("{idLibroCategoria}")
    public ResponseEntity<LibroCategoria> getLibroCategoriaById(@PathVariable Integer idLibroCategoria) {
        Optional<LibroCategoria> libroCategoriaOptional = libroCategoriaService.findByIdLibroCategoria(idLibroCategoria);

        if (libroCategoriaOptional.isPresent()) {
            return ResponseEntity.ok(libroCategoriaOptional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    /*--------------------------------------------------------------------------------------------------------
     * getLibroCategoriaByIdCategoria: Obtiene relaciones libro-categoría por su ID de Categoría
     *
     * @param idCategoria - Long: ID de la categoría a buscar
     * @return - List<LibroCategoria>: Lista de relaciones libro-categoría encontradas
     *
     * Ejemplo de uso: GET -> http://localhost:8080/LibroCategoria/categoria/{idCategoria}
     --------------------------------------------------------------------------------------------------------*/
    @GetMapping("categoria/{idCategoria}")
    public List<LibroCategoria> getLibroCategoriaByIdCategoria(@PathVariable Long idCategoria) {
        return libroCategoriaService.findByIdCategoria(idCategoria);
    }

    /*--------------------------------------------------------------------------------------------------------
     * getLibroCategoriaByIsbn: Obtiene relaciones libro-categoría por su ISBN
     *
     * @param isbn - Long: ISBN del libro a buscar
     * @return - List<LibroCategoria>: Lista de relaciones libro-categoría encontradas
     *
     * Ejemplo de uso: GET -> http://localhost:8080/LibroCategoria/isbn/{isbn}
     --------------------------------------------------------------------------------------------------------*/
    @GetMapping("isbn/{isbn}")
    public List<LibroCategoria> getLibroCategoriaByIsbn(@PathVariable Long isbn) {
        return libroCategoriaService.findByIsbn(isbn);
    }

    /*--------------------------------------------------------------------------------------------------------
     * createLibroCategoria: Crea una nueva relación libro-categoría
     *
     * @param libroCategoria - LibroCategoria: La nueva relación libro-categoría a crear
     * @return - ResponseEntity<LibroCategoria>: La relación libro-categoría creada
     *
     * Ejemplo de uso: POST -> http://localhost:8080/LibroCategoria/
     * Cuerpo de la solicitud (JSON): { "libro": { ... }, "categoria": { ... } }
     --------------------------------------------------------------------------------------------------------*/
    @PostMapping
    public ResponseEntity<LibroCategoria> createLibroCategoria(@RequestBody LibroCategoria libroCategoria) {
        LibroCategoria nuevaLibroCategoria = libroCategoriaService.saveLibroCategoria(libroCategoria);
        if (nuevaLibroCategoria != null) {
            return ResponseEntity.ok(nuevaLibroCategoria);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    /*--------------------------------------------------------------------------------------------------------
     * deleteLibroCategoriaById: Elimina una relación libro-categoría por su id_libro_categoria
     *
     * @param id - Long: Id de la relación libro-categoría a eliminar
     * @return - ResponseEntity<String>: Respuesta con mensaje indicando que la relación ha sido eliminada
     *
     * Ejemplo de uso: DELETE -> http://localhost:8080/LibroCategoria/{id}
     --------------------------------------------------------------------------------------------------------*/
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteLibroCategoriaById(@PathVariable Long id) {
        libroCategoriaService.deleteById(id);
        return ResponseEntity.ok("Relación Libro-Categoria eliminada correctamente");
    }


}
