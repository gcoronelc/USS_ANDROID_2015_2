package com.example.guevaracabrera.cuentabancario.Entidaes;
// Generated 10-nov-2015 17:47:58 by Hibernate Tools 4.3.1



/**
 * Parametro generated by hbm2java
 */
public class Parametro  implements java.io.Serializable {


     private String chrParacodigo;
     private String vchParadescripcion;
     private String vchParavalor;
     private String vchParaestado;

    public Parametro() {
    }

    public Parametro(String chrParacodigo, String vchParadescripcion, String vchParavalor, String vchParaestado) {
       this.chrParacodigo = chrParacodigo;
       this.vchParadescripcion = vchParadescripcion;
       this.vchParavalor = vchParavalor;
       this.vchParaestado = vchParaestado;
    }
   
    public String getChrParacodigo() {
        return this.chrParacodigo;
    }
    
    public void setChrParacodigo(String chrParacodigo) {
        this.chrParacodigo = chrParacodigo;
    }
    public String getVchParadescripcion() {
        return this.vchParadescripcion;
    }
    
    public void setVchParadescripcion(String vchParadescripcion) {
        this.vchParadescripcion = vchParadescripcion;
    }
    public String getVchParavalor() {
        return this.vchParavalor;
    }
    
    public void setVchParavalor(String vchParavalor) {
        this.vchParavalor = vchParavalor;
    }
    public String getVchParaestado() {
        return this.vchParaestado;
    }
    
    public void setVchParaestado(String vchParaestado) {
        this.vchParaestado = vchParaestado;
    }




}

