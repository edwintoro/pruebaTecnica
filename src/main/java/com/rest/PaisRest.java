package com.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//import com.services.PaisService;
import com.modelo.Pais;



/*@RestController
@RequestMapping(value = "/pais/", method = RequestMethod.GET)
public class PaisRest {

    @Autowired
    private PaisService paisService;

    @GetMapping
    private ResponseEntity<java.util.List<Pais>> getAllPaises(){

          return ResponseEntity.ok(paisService.findAll());

 }
    
}

*/