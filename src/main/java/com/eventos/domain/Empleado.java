package com.eventos.domain;

import java.io.Serializable;

import javax.persistence.*;
import lombok.Data;

/**
 *
 * @author carta
 */
@Data
@Entity
@Table(name = "empleado")
public class Empleado implements Serializable{
    @Id
    private String identificacion;
    private String nombres;
    private String apellidos;
    private String email;
    private String tipo_contratacion;
    private String tipo_empleado;
    private int facultadCodigo;
    private int codigoSede;
    private int lugarNacimiento;

//    public String getIdentificacion() {
//        return identificacion;
//    }
//
//    public Empleado(String identificacion, String nombres, String apellidos, String email, String tipo_contratacion, String tipo_empleado, int facultadCodigo, int codigoSede, int lugarNacimiento) {
//        this.identificacion = identificacion;
//        this.nombres = nombres;
//        this.apellidos = apellidos;
//        this.email = email;
//        this.tipo_contratacion = tipo_contratacion;
//        this.tipo_empleado = tipo_empleado;
//        this.facultadCodigo = facultadCodigo;
//        this.codigoSede = codigoSede;
//        this.lugarNacimiento = lugarNacimiento;
//    }
//
//    public Empleado(String nombres, String apellidos, String email, String tipo_contratacion, String tipo_empleado, int facultadCodigo, int codigoSede, int lugarNacimiento) {
//        this.nombres = nombres;
//        this.apellidos = apellidos;
//        this.email = email;
//        this.tipo_contratacion = tipo_contratacion;
//        this.tipo_empleado = tipo_empleado;
//        this.facultadCodigo = facultadCodigo;
//        this.codigoSede = codigoSede;
//        this.lugarNacimiento = lugarNacimiento;
//    }
//    
//
//    public void setIdentificacion(String identificacion) {
//        this.identificacion = identificacion;
//    }
//
//    public String getNombres() {
//        return nombres;
//    }
//
//    public void setNombres(String nombres) {
//        this.nombres = nombres;
//    }
//
//    public String getApellidos() {
//        return apellidos;
//    }
//
//    public void setApellidos(String apellidos) {
//        this.apellidos = apellidos;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getTipo_contratacion() {
//        return tipo_contratacion;
//    }
//
//    public void setTipo_contratacion(String tipo_contratacion) {
//        this.tipo_contratacion = tipo_contratacion;
//    }
//
//    public String getTipo_empleado() {
//        return tipo_empleado;
//    }
//
//    public void setTipo_empleado(String tipo_empleado) {
//        this.tipo_empleado = tipo_empleado;
//    }
//
//    public int getFacultadCodigo() {
//        return facultadCodigo;
//    }
//
//    public void setFacultadCodigo(int facultadCodigo) {
//        this.facultadCodigo = facultadCodigo;
//    }
//
//    public int getCodigoSede() {
//        return codigoSede;
//    }
//
//    public void setCodigoSede(int codigoSede) {
//        this.codigoSede = codigoSede;
//    }
//
//    public int getLugarNacimiento() {
//        return lugarNacimiento;
//    }
//
//    public void setLugarNacimiento(int lugarNacimiento) {
//        this.lugarNacimiento = lugarNacimiento;
//    }
}
