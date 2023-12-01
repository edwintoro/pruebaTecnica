package com.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.services.CiudadService;
import com.modelo.Ciudad;


/*@RestController
@RequestMapping ("/ciudad/")
public class CiudadRest {

    @Autowired
    private CiudadService ciudadService;

    @GetMapping ("{id}")
    private ResponseEntity<java.util.List<Ciudad>> getCiudadesByPais(@PathVariable("id") int idPais){

          return ResponseEntity.ok(ciudadService.findAllByPais(idPais));

    }
    
}
*/