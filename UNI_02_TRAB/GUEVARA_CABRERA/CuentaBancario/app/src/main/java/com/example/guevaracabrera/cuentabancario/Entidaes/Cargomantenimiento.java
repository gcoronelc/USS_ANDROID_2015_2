package com.example.guevaracabrera.cuentabancario.Entidaes;
// Generated 10-nov-2015 17:47:58 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Cargomantenimiento generated by hbm2java
 */
public class Cargomantenimiento  implements java.io.Serializable {


     private String chrMonecodigo;
     private Moneda moneda;
     private BigDecimal decCargMontoMaximo;
     private BigDecimal decCargImporte;

    public Cargomantenimiento() {
    }

    public Cargomantenimiento(Moneda moneda, BigDecimal decCargMontoMaximo, BigDecimal decCargImporte) {
       this.moneda = moneda;
       this.decCargMontoMaximo = decCargMontoMaximo;
       this.decCargImporte = decCargImporte;
    }
   
    public String getChrMonecodigo() {
        return this.chrMonecodigo;
    }
    
    public void setChrMonecodigo(String chrMonecodigo) {
        this.chrMonecodigo = chrMonecodigo;
    }
    public Moneda getMoneda() {
        return this.moneda;
    }
    
    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }
    public BigDecimal getDecCargMontoMaximo() {
        return this.decCargMontoMaximo;
    }
    
    public void setDecCargMontoMaximo(BigDecimal decCargMontoMaximo) {
        this.decCargMontoMaximo = decCargMontoMaximo;
    }
    public BigDecimal getDecCargImporte() {
        return this.decCargImporte;
    }
    
    public void setDecCargImporte(BigDecimal decCargImporte) {
        this.decCargImporte = decCargImporte;
    }




}


