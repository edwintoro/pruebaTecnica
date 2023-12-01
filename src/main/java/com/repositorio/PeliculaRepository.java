package com.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.modelo.Pelicula;


public interface PeliculaRepository extends JpaRepository<Pelicula, String> {

    
    
}
