
package com.mono.modelo;


public class Catalogo {
    private int id;
    private String nombrecorte;

    public Catalogo() {
    }

    public Catalogo(int id, String nombrecorte) {
        this.id = id;
        this.nombrecorte = nombrecorte;
    }

    public String getNombrecorte() {
        return nombrecorte;
    }

    public void setNombrecorte(String nombrecorte) {
        this.nombrecorte = nombrecorte;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Catalogo set id='" + id + "', nombrecorte='" + nombrecorte + "'";
    }
    
    
    
}
