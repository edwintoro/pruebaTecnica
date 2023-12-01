package com.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.modelo.Cotizaciones;

public interface CotizacionesRepository extends JpaRepository<Cotizaciones, Long> {
    
}
