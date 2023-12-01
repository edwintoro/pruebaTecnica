package com.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.services.PeliculaService;
import com.modelo.Cotizaciones;
import com.modelo.Pelicula;



@RestController
@RequestMapping("/api")
public class peliculaRest {

    @Autowired
    private PeliculaService peliculaService;

    @GetMapping("/pelicula/{id}")
    ResponseEntity<Pelicula> getPeliculaId(@PathVariable("id") String id)  {
    	 System.out.print("entroaca 1");
          return ResponseEntity.ok(peliculaService.getById(id));

 }
    
}