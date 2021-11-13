package com.mono.modelo;

public class Personas {
    private int documento;
    private String pnombre;
    private String snombre;
    private String papellido;
    private String sapellido;
        
    public Personas() {}

    public Personas(int documento, String pnombre, String papellido) {
        this.documento = documento;
        this.pnombre = pnombre;
        this.papellido = papellido;
    }

    public Personas(int documento, String pnombre, String snombre, String papellido, String sapellido) {
        this.documento = documento;
        this.pnombre = pnombre;
        this.snombre = snombre;
        this.papellido = papellido;
        this.sapellido = sapellido;
        
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getPnombre() {
        return pnombre;
    }

    public void setPnombre(String pnombre) {
        this.pnombre = pnombre;
    }

    public String getSnombre() {
        return snombre;
    }

    public void setSnombre(String snombre) {
        this.snombre = snombre;
    }

    public String getPapellido() {
        return papellido;
    }

    public void setPapellido(String papellido) {
        this.papellido = papellido;
    }

    public String getSapellido() {
        return sapellido;
    }

    public void setSapellido(String sapellido) {
        this.sapellido = sapellido;
    }

    @Override
    public String toString() {
        return "Personas set  documento='" + documento + "', pnombre='" + pnombre + "', snombre='" + snombre + "', papellido='" + papellido + "', sapellido='" + sapellido + "'" ;
    }
    
}
