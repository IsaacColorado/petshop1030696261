
package com.mono.modelo;

import java.time.LocalDateTime;


public class Pedidos {
    private int numerop;
    private LocalDateTime fecha;
    private int personasdocumento;
    private String productoscb;

    public Pedidos() {
    }

    public Pedidos(int numerop, LocalDateTime fecha, int personasdocumento, String productoscb) {
        this.numerop = numerop;
        this.fecha = fecha;
        this.personasdocumento = personasdocumento;
        this.productoscb = productoscb;
    }

    public String getProductoscb() {
        return productoscb;
    }

    public void setProductoscb(String productoscb) {
        this.productoscb = productoscb;
    }

    public int getNumerop() {
        return numerop;
    }

    public void setNumerop(int numerop) {
        this.numerop = numerop;
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

    @Override
    public String toString() {
        return "Pedidos set numerop='" + numerop + "', fecha='" + fecha + "', personasdocumento='" + personasdocumento + "', productoscb='" + productoscb + "'";
    }
    
    
    
}
