package com.services;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.modelo.Cotizaciones;
import com.repositorio.CotizacionesRepository;

/*@Service
public class CotizacionServices implements CotizacionesRepository  {


    @Autowired
    private CotizacionesRepository cotizacionesRepository;


    @Override
    public List<Cotizaciones> findAll() {
        // TODO Auto-generated method stub
        return cotizacionesRepository.findAll();
    }


    @Override
    public <S extends Cotizaciones> S save(S entity) {
        // TODO Auto-generated method stub
        return cotizacionesRepository.save(entity);
    }

    
    @Override
    public void delete(Cotizaciones entity) {
        cotizacionesRepository.delete(entity);
        
    }

     @Override
    public void deleteById(Long id) {
        cotizacionesRepository.deleteById(id);
        
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> ids) {
        // TODO Auto-generated method stub
        
    }
    

    @Override
    public void deleteAllInBatch() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAllInBatch(Iterable<Cotizaciones> entities) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public <S extends Cotizaciones> List<S> findAll(Example<S> example) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Cotizaciones> List<S> findAll(Example<S> example, Sort sort) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void flush() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Cotizaciones getById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Cotizaciones getOne(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Cotizaciones getReferenceById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Cotizaciones> List<S> saveAllAndFlush(Iterable<S> entities) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Cotizaciones> S saveAndFlush(S entity) {
        // TODO Auto-generated method stub
        return null;
    }



    @Override
    public List<Cotizaciones> findAllById(Iterable<Long> ids) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Cotizaciones> List<S> saveAll(Iterable<S> entities) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long count() {
        // TODO Auto-generated method stub
        return 0;
    }


    @Override
    public void deleteAll() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAll(Iterable<? extends Cotizaciones> entities) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> ids) {
        // TODO Auto-generated method stub
        
    }

   

    @Override
    public boolean existsById(Long id) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Optional<Cotizaciones> findById(Long id) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

 

    @Override
    public List<Cotizaciones> findAll(Sort sort) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Page<Cotizaciones> findAll(Pageable pageable) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Cotizaciones> long count(Example<S> example) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public <S extends Cotizaciones> boolean exists(Example<S> example) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public <S extends Cotizaciones> Page<S> findAll(Example<S> example, Pageable pageable) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Cotizaciones, R> R findBy(Example<S> example,
            Function<FetchableFluentQuery<S>, R> queryFunction) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Cotizaciones> Optional<S> findOne(Example<S> example) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }
    
}
*/