package com.example.LibrarySystem.rest;

import com.example.LibrarySystem.models.MedioPago;
import com.example.LibrarySystem.models.Valoracion;
import com.example.LibrarySystem.services.MedioPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/MedioPago/")
public class MedioPagoRest {
    @Autowired
    private MedioPagoService medioPagoService;
        /*--------------------------------------------------------------------------------------------------------
     * createMedioPago: crea un nuevo medio de pago y lo registra la base de datos;
     *
     * @param mPago - objeto MedioPago a guardar en el sistema;
     * @return - el medio de pago creado y registrado;
      --------------------------------------------------------------------------------------------------------*/

    @PostMapping("createMedioPago")
    public MedioPago createMedioPago(@RequestBody MedioPago mPago){
        return medioPagoService.createMedPago(mPago);
    }
    /*--------------------------------------------------------------------------------------------------------
     * getByIdMPago: obtiene un medio de pago de la base de datos por el id;
     *
     * @param id_mediopago - el id del medioPago;
     * @return - el medio de pago buscado en el sistema;
      --------------------------------------------------------------------------------------------------------*/

    @GetMapping("getByIdMPago")
    public MedioPago getByIdMPago(@RequestParam("id_mediopago") long id_mediopago){
        return medioPagoService.getByIdMedPago(id_mediopago);
    }
    /*--------------------------------------------------------------------------------------------------------
         * listMedioPAGO: retorna a todos los medios de pago presentes en el sistema;
         *
         * @return - todos los medios de pago registrados en base de datos;
          --------------------------------------------------------------------------------------------------------*/
    @GetMapping
    public List<MedioPago> listMedioPago(){
        return medioPagoService.listMedioPago();
    }
   /*--------------------------------------------------------------------------------------------------------
     * updateMedioPago: metodo que actualiza los datos de un mediopago del mismo id;
     *
     * @param mPagoNueva - el objeto con el id y los datos nuevos del medio de pago;
     * @return - el medio de pago actualizado;
     --------------------------------------------------------------------------------------------------------*/
    @PostMapping("updateMedioPago")
    public MedioPago updateMedioPago(@RequestBody MedioPago mPagoNueva){
        MedioPago medioPago = medioPagoService.updateMedioPago(mPagoNueva);
        if(medioPago != null){
            return medioPago;
        }
        else{
            return null;
        }}
    /*--------------------------------------------------------------------------------------------------------
     * deleteMedioPago: metodo que elimina un medioPago por su id;
     *
     * @param id - id del medio de pago a eliminar;
     *
     --------------------------------------------------------------------------------------------------------*/

    @DeleteMapping("deleteMedioPago/{id}")
    public void deleteMedioPago(@PathVariable long id){
        medioPagoService.deleteMedioPago(id);
    }
}
