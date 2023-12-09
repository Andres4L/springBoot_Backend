package com.apirest.api.facturas;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Facturas {
    @Id
    private Long consecutivo;
    private Long cliente;
    private LocalDate fecha;


    public Facturas() {
        
    }


    public Facturas(Long cliente, LocalDate fecha) {
        this.cliente = cliente;
        this.fecha = fecha;
    }


    public Facturas(Long consecutivo, Long cliente, LocalDate fecha) {
        this.consecutivo = consecutivo;
        this.cliente = cliente;
        this.fecha = fecha;
    }


    public Long getConsecutivo() {
        return consecutivo;
    }


    public void setConsecutivo(Long consecutivo) {
        this.consecutivo = consecutivo;
    }


    public Long getCliente() {
        return cliente;
    }


    public void setCliente(Long cliente) {
        this.cliente = cliente;
    }


    public LocalDate getFecha() {
        return fecha;
    }


    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    

}


