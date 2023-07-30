package com.example.LibrarySystem.rest;

import com.example.LibrarySystem.models.Compra;
import com.example.LibrarySystem.models.Usuario;
import com.example.LibrarySystem.services.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Compra/")
public class CompraRest {
    @Autowired
    private CompraService compraService;

    /*--------------------------------------------------------------------------------------------------------
     * createCompra: metodo que registra una compra en la base de datos;
     *
     * @param compra - objeto que representa la compra a registrar;
     *
     * @return - la compra registrada en el sistema;
     *
     * Comentario: genera el ID automaticamente;
      --------------------------------------------------------------------------------------------------------*/
    @PostMapping("createCompra")
    public Compra createCompra(@RequestBody Compra compra) {
        return compraService.createCompra(compra);
    }

    /*--------------------------------------------------------------------------------------------------------
     * getCompraByNTransaccion: obtiene una compra por su numero de transaccion;
     *
     * @param n_transaccion - el numero de transaccion de la compra;
     *
     * @return - la compra buscada en el sistema;
     *
      --------------------------------------------------------------------------------------------------------*/
    @GetMapping("getById")
    public Compra getCompraByNTransaccion(@RequestParam("n_transaccion") long n_transaccion) {
        return compraService.getCompraByNTransaccion(n_transaccion);
    }

    /*--------------------------------------------------------------------------------------------------------
     * updateCompra: metodo que actualiza una compra dentro de la base de datos;
     *
     * @param compraActualizada - la compra con el numero de transaccion y los datos actualizados;
     *
     * @return - la compra actualizada;
     *
      --------------------------------------------------------------------------------------------------------*/
    @PostMapping("updateCompra")
    public Compra updateCompra(@RequestBody Compra compraActualizada) {
        Compra compra = compraService.updateCompra(compraActualizada);
        if(compra != null){
            return compra;
        }else{return null;}
    }

    /*--------------------------------------------------------------------------------------------------------
     * deleteByIdCompra: borra una compra en la base de datos segun numero de transaccion;
     *
     * @param id - numero de transaccion de la compra a borrar;
     *
      --------------------------------------------------------------------------------------------------------*/
    @DeleteMapping("/deleteById/{id}")
    public void deleteByIdCompra(@PathVariable Long id) {
        compraService.deleteByIdCompra(id);
    }
}
