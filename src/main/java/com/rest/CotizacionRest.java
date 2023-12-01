package com.rest;


import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.services.CotizacionServices;
import com.modelo.Cotizaciones;




/*@RestController
@RequestMapping(value = "/cotizacion/")
public class CotizacionRest {

    @Autowired
    private CotizacionServices cotizacionServices;

    @GetMapping
    private ResponseEntity<java.util.List<Cotizaciones>> getAllCotizaciones(){

          return ResponseEntity.ok(cotizacionServices.findAll());

    }


    @PostMapping
    private ResponseEntity<Cotizaciones> saveCotizaciones(@RequestBody Cotizaciones cotizaciones){

        Cotizaciones cotizacionGuardada = cotizacionServices.save(cotizaciones);
    try {
        return ResponseEntity.created(new URI("/cotizacion/"+ cotizacionGuardada.getNumero_cotizacion())).body(cotizacionGuardada); 
        } catch (Exception e) {
        return   ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
     
    }


        
}

*/