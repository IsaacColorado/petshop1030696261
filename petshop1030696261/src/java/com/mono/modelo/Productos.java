
package com.mono.modelo;


public class Productos {
    private String cb;
    private String nombre;
    private String descripcion;
    private int cantidad;
    private Double precio;

    public Productos() {
    }

    public Productos(String cb, String nombre, int cantidad, Double precio) {
        this.cb = cb;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public Productos(String cb, String nombre, String descripcion, int cantidad, Double precio) {
        this.cb = cb;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getCb() {
        return cb;
    }

    public void setCb(String cb) {
        this.cb = cb;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Productos set cb='" + cb + "', nombre='" + nombre + "', descripcion='" + descripcion + "', cantidad='" + cantidad + "', precio='" + precio + "'";
    }
    
    
    
}
