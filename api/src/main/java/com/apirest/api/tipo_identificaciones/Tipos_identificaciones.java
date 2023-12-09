package com.apirest.api.tipo_identificaciones;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Tipos_identificaciones {
    @Id
    private Long tipo_identificacion;
    private String descripcion;
    private String abreviatura;
    public Tipos_identificaciones() {
    }
    public Tipos_identificaciones(String descripcion, String abreviatura) {
        this.descripcion = descripcion;
        this.abreviatura = abreviatura;
    }
    public Tipos_identificaciones(Long tipo_identificacion, String descripcion, String abreviatura) {
        this.tipo_identificacion = tipo_identificacion;
        this.descripcion = descripcion;
        this.abreviatura = abreviatura;
    }
    public Long getTipo_identificacion() {
        return tipo_identificacion;
    }
    public void setTipo_identificacion(Long tipo_identificacion) {
        this.tipo_identificacion = tipo_identificacion;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getAbreviatura() {
        return abreviatura;
    }
    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    
}
