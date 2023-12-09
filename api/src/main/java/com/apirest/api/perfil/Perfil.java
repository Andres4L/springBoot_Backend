package com.apirest.api.perfil;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Perfil {
    @Id
    private Long id_perfil;
    private String nombre;

    public Perfil() {
        
    }

    public Perfil(String nombre) {
        this.nombre = nombre;
    }

    public Perfil(Long id_perfil, String nombre) {
        this.id_perfil = id_perfil;
        this.nombre = nombre;
    }

    public Long getId_perfil() {
        return id_perfil;
    }

    public void setId_perfil(Long id_perfil) {
        this.id_perfil = id_perfil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
