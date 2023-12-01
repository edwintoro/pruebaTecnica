package com.modelo;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import javax.persistence.Entity;
import javax.persistence.Table;



@Entity
@Table (name="ciudad")
public class Ciudad {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nombre;
    private String codigo;

    @ManyToOne
    @JoinColumn(name="id_pais")
    private Pais id_pais;


    

    public Ciudad(String nombre, String codigo, Pais id_pais) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.id_pais = id_pais;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Pais getId_pais() {
        return id_pais;
    }

    public void setId_pais(Pais id_pais) {
        this.id_pais = id_pais;
    }


    

    
    
    
}