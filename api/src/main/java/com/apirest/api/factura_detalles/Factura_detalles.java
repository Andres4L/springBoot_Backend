package com.apirest.api.factura_detalles;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Factura_detalles {
 @Id
 private Long consecutivo;
 private Long id_producto;
 private Long cantidad;
 private Long valor_unitario;

 public Factura_detalles() {
}

public Factura_detalles(Long cantidad, Long valor_unitario) {
    this.cantidad = cantidad;
    this.valor_unitario = valor_unitario;
}

public Factura_detalles(Long consecutivo, Long id_producto, Long cantidad, Long valor_unitario) {
    this.consecutivo = consecutivo;
    this.id_producto = id_producto;
    this.cantidad = cantidad;
    this.valor_unitario = valor_unitario;
}

public Long getConsecutivo() {
    return consecutivo;
}

public void setConsecutivo(Long consecutivo) {
    this.consecutivo = consecutivo;
}

public Long getId_producto() {
    return id_producto;
}

public void setId_producto(Long id_producto) {
    this.id_producto = id_producto;
}

public Long getCantidad() {
    return cantidad;
}

public void setCantidad(Long cantidad) {
    this.cantidad = cantidad;
}

public Long getValor_unitario() {
    return valor_unitario;
}

public void setValor_unitario(Long valor_unitario) {
    this.valor_unitario = valor_unitario;
}


    
}
