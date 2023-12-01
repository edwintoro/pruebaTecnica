package com.modelo;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table (name="cotizaciones")
public class Cotizaciones {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer numero_cotizacion;
    private String estado;
    private Date fecha_creacion;
    private Date vigencia_cotizacion;  	 
    private String moneda;	
    private Date fecha_modificacion;  
    private String naviera;  
    private String mercancia;	
    private Integer valor_mercancia;
    private Integer id_ciudad_origen;
    private Integer id_ciudad_destino;
    private Date fecha_cierre;


    


    public Cotizaciones(String estado, Date fecha_creacion, Date vigencia_cotizacion, String moneda,
            Date fecha_modificacion, String naviera, String mercancia, Integer valor_mercancia,
            Integer id_ciudad_origen, Integer id_ciudad_destino, Date fecha_cierre) {
        this.estado = estado;
        this.fecha_creacion = fecha_creacion;
        this.vigencia_cotizacion = vigencia_cotizacion;
        this.moneda = moneda;
        this.fecha_modificacion = fecha_modificacion;
        this.naviera = naviera;
        this.mercancia = mercancia;
        this.valor_mercancia = valor_mercancia;
        this.id_ciudad_origen = id_ciudad_origen;
        this.id_ciudad_destino = id_ciudad_destino;
        this.fecha_cierre = fecha_cierre;
    }

    

    
    public Integer getNumero_cotizacion() {
        return numero_cotizacion;
    }
    public void setNumero_cotizacion(Integer numero_cotizacion) {
        this.numero_cotizacion = numero_cotizacion;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Date getFecha_creacion() {
        return fecha_creacion;
    }
    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }
    public Date getVigencia_cotizacion() {
        return vigencia_cotizacion;
    }
    public void setVigencia_cotizacion(Date vigencia_cotizacion) {
        this.vigencia_cotizacion = vigencia_cotizacion;
    }
    public String getMoneda() {
        return moneda;
    }
    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }
    public Date getFecha_modificacion() {
        return fecha_modificacion;
    }
    public void setFecha_modificacion(Date fecha_modificacion) {
        this.fecha_modificacion = fecha_modificacion;
    }
    public String getNaviera() {
        return naviera;
    }
    public void setNaviera(String naviera) {
        this.naviera = naviera;
    }
    public String getMercancia() {
        return mercancia;
    }
    public void setMercancia(String mercancia) {
        this.mercancia = mercancia;
    }
    public Integer getValor_mercancia() {
        return valor_mercancia;
    }
    public void setValor_mercancia(Integer valor_mercancia) {
        this.valor_mercancia = valor_mercancia;
    }
    public Integer getId_ciudad_origen() {
        return id_ciudad_origen;
    }
    public void setId_ciudad_origen(Integer id_ciudad_origen) {
        this.id_ciudad_origen = id_ciudad_origen;
    }
    public Integer getId_ciudad_destino() {
        return id_ciudad_destino;
    }
    public void setId_ciudad_destino(Integer id_ciudad_destino) {
        this.id_ciudad_destino = id_ciudad_destino;
    }
    public Date getFecha_cierre() {
        return fecha_cierre;
    }
    public void setFecha_cierre(Date fecha_cierre) {
        this.fecha_cierre = fecha_cierre;
    }
    
    

    

    
    
    
    
}