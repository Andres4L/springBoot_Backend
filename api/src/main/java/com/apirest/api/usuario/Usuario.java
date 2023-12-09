package com.apirest.api.usuario;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Usuario {
    @Id
    private Long idusuario;
    private String nombre;
    private String apellido;
    @Column(unique = true)
    private String usuario;
    private String contraseña;
    private Long id_perfil;

    public Usuario() {
        
    }

    public Usuario(String nombre, String apellido, String usuario, String contraseña, Long id_perfil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.id_perfil = id_perfil;
    }

    public Usuario(Long idusuario, String nombre, String apellido, String usuario, String contraseña, Long id_perfil) {
        this.idusuario = idusuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.id_perfil = id_perfil;
    }

    public Long getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Long idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Long getId_perfil() {
        return id_perfil;
    }

    public void setId_perfil(Long id_perfil) {
        this.id_perfil = id_perfil;
    }
   
}

