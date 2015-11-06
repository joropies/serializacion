/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joropies.serializacion;

import java.io.Serializable;

/**
 *
 * @author T-107
 */
public class Nomina implements Serializable {
    
    private Empleado empleado;
    private Departamento departamento;
    
    public Nomina() {
    
    }

    public Nomina(Empleado empleado, Departamento departamento) {
        this.empleado = empleado;
        this.departamento = departamento;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    
}