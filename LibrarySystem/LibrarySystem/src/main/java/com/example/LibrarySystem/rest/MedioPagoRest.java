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

    @PostMapping("createMedioPago")
    public MedioPago createMedioPago(@RequestBody MedioPago mPago){
        return medioPagoService.createMedPago(mPago);
    }

    @GetMapping("getByIdMPago")
    public MedioPago getByIdMPago(@RequestParam("id_mediopago") long id_mediopago){
        return medioPagoService.getByIdMedPago(id_mediopago);
    }

    @GetMapping
    public List<MedioPago> listMedioPago(){
        return medioPagoService.listMedioPago();
    }
    @PostMapping("updateMedioPago")
    public MedioPago updateMedioPago(@RequestBody MedioPago mPagoNueva){
        MedioPago medioPago = medioPagoService.updateMedioPago(mPagoNueva);
        if(medioPago != null){
            return medioPago;
        }
        else{
            return null;
        }}

    @DeleteMapping("deleteMedioPago/{id}")
    public void deleteMedioPago(@PathVariable long id){
        medioPagoService.deleteMedioPago(id);
    }
}
