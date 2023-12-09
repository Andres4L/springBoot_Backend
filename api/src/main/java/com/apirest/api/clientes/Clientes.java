package com.apirest.api.clientes;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Clientes {
    @Id
    private Long cliente;
    private Long tipo_identificacion;
    @Column(unique = true)
    private String identificacion;
    private String razon_social;
    private Date fecha_registro;
    private String estado;

    public Clientes() {
    }

    public Clientes(Long tipo_identificacion, String identificacion, String razon_social, Date fecha_registro, String estado) {
        this.tipo_identificacion = tipo_identificacion;
        this.identificacion = identificacion;
        this.razon_social = razon_social;
        this.fecha_registro = fecha_registro;
        this.estado = estado;
    }

   

    public Clientes(Long cliente, Long tipo_identificacion, String identificacion, String razon_social, Date fecha_registro, String estado) {
        this.cliente = cliente;
        this.tipo_identificacion = tipo_identificacion;
        this.identificacion = identificacion;
        this.razon_social = razon_social;
        this.fecha_registro = fecha_registro;
        this.estado = estado;
    }

    public Long getCliente() {
        return cliente;
    }

    public void setCliente(Long cliente) {
        this.cliente = cliente;
    }

    public Long getTipo_identificacion() {
        return tipo_identificacion;
    }

    public void setTipo_identificacion(Long tipo_identificacion) {
        this.tipo_identificacion = tipo_identificacion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }
    
    
    
}

