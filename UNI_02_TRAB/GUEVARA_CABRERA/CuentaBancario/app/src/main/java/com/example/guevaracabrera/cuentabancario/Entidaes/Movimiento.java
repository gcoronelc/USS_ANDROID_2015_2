package com.example.guevaracabrera.cuentabancario.Entidaes;
// Generated 10-nov-2015 17:47:58 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * Movimiento generated by hbm2java
 */
public class Movimiento implements java.io.Serializable {


    private int id;
    private Cuenta cuenta;
    private Empleado empleado;
    private Tipomovimiento tipomovimiento;
    private String dttMovifecha;

    public Cuenta getCuenta() {
        return cuenta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private double decMoviimporte;
    private String chrCuenreferencia;

    public Movimiento() {
    }


    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public Empleado getEmpleado() {
        return this.empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Tipomovimiento getTipomovimiento() {
        return this.tipomovimiento;
    }

    public void setTipomovimiento(Tipomovimiento tipomovimiento) {
        this.tipomovimiento = tipomovimiento;
    }

    public String getDttMovifecha() {
        return this.dttMovifecha;
    }

    public void setDttMovifecha(String dttMovifecha) {
        this.dttMovifecha = dttMovifecha;
    }

    public Double getDecMoviimporte() {
        return this.decMoviimporte;
    }

    public void setDecMoviimporte(double decMoviimporte) {
        this.decMoviimporte = decMoviimporte;
    }

    public String getChrCuenreferencia() {
        return this.chrCuenreferencia;
    }

    public void setChrCuenreferencia(String chrCuenreferencia) {
        this.chrCuenreferencia = chrCuenreferencia;
    }


}


