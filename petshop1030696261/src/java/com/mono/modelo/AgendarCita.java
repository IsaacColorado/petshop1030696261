package com.mono.modelo;

import java.time.LocalDateTime;


public class AgendarCita {
    private int numeroc;
    private LocalDateTime fecha;
    private int personasdocumento;
    private int ncelular;
    private String raza;
    private String nmascotas;
    private int catalogoid;

    public AgendarCita() {
    }

    public AgendarCita(int numeroc, LocalDateTime fecha, int personasdocumento, int ncelular, String nmascotas, int catalogoid) {
        this.numeroc = numeroc;
        this.fecha = fecha;
        this.personasdocumento = personasdocumento;
        this.ncelular = ncelular;
        this.nmascotas = nmascotas;
        this.catalogoid = catalogoid;
    }

    public AgendarCita(int numeroc, LocalDateTime fecha, int personasdocumento, int ncelular, String raza, String nmascotas, int catalogoid) {
        this.numeroc = numeroc;
        this.fecha = fecha;
        this.personasdocumento = personasdocumento;
        this.ncelular = ncelular;
        this.raza = raza;
        this.nmascotas = nmascotas;
        this.catalogoid = catalogoid;
    }

    public int getCatalogoid() {
        return catalogoid;
    }

    public void setCatalogoid(int catalogoid) {
        this.catalogoid = catalogoid;
    }

    public int getNumeroc() {
        return numeroc;
    }

    public void setNumeroc(int numeroc) {
        this.numeroc = numeroc;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public int getPersonasdocumento() {
        return personasdocumento;
    }

    public void setPersonasdocumento(int personasdocumento) {
        this.personasdocumento = personasdocumento;
    }

    public int getNcelular() {
        return ncelular;
    }

    public void setNcelular(int ncelular) {
        this.ncelular = ncelular;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNmascotas() {
        return nmascotas;
    }

    public void setNmascotas(String nmascotas) {
        this.nmascotas = nmascotas;
    }

    @Override
    public String toString() {
        return "AgendarCita set numeroc='" + numeroc + "', fecha='" + fecha + "', personasdocumento='" + personasdocumento + "', ncelular='" + ncelular + "', raza='" + raza + "', nmascotas='" + nmascotas + "', catalogoid='" + catalogoid + "'";
    }
    
    
    
}
