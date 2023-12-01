package com.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.modelo.Ciudad;


public interface CiudadRepository extends JpaRepository<Ciudad, Long> {

    
    
}
