package com.apirest.api.productos;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity

public class Productos {
    @Id
	private Long id_producto;
    @Column(unique = true)
	private String nombre; 
	private String estado; 
	private float valor_unitario;
    
    
    
    
    public Productos() {
    }




    public Productos(Long id_producto, String nombre, String estado, float valor_unitario) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.estado = estado;
        this.valor_unitario = valor_unitario;
    }




    public Productos(String nombre, String estado, float valor_unitario) {
        this.nombre = nombre;
        this.estado = estado;
        this.valor_unitario = valor_unitario;
    }




    public Long getId_producto() {
        return id_producto;
    }




    public void setId_producto(Long id_producto) {
        this.id_producto = id_producto;
    }




    public String getNombre() {
        return nombre;
    }




    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




    public String getEstado() {
        return estado;
    }




    public void setEstado(String estado) {
        this.estado = estado;
    }




    public float getValor_unitario() {
        return valor_unitario;
    }




    public void setValor_unitario(float valor_unitario) {
        this.valor_unitario = valor_unitario;
    }

    

    
}
