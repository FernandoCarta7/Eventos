package com.eventos.domain;

import java.io.Serializable;

import javax.persistence.*;
import lombok.Data;

/**
 *
 * @author Fernando Carta
 */
@Data
@Entity
@Table(name = "facultad")
public class Facultad implements Serializable{

    @Id
    private int facultadCodigo;
    private String nombre;
    private String ubicacion;
    private String telefono;
    private String idDecano;

//    public Facultad(int facultadCodigo, String nombre, String ubicacion, String telefono, String idDecano) {
//        this.facultadCodigo = facultadCodigo;
//        this.nombre = nombre;
//        this.ubicacion = ubicacion;
//        this.telefono = telefono;
//        this.idDecano = idDecano;
//    }
//
//    public Facultad(String nombre, String ubicacion, String telefono, String idDecano) {
//        this.nombre = nombre;
//        this.ubicacion = ubicacion;
//        this.telefono = telefono;
//        this.idDecano = idDecano;
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
//    public String getNombre() {
//        return nombre;
//    }
//
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
//
//    public String getUbicacion() {
//        return ubicacion;
//    }
//
//    public void setUbicacion(String ubicacion) {
//        this.ubicacion = ubicacion;
//    }
//
//    public String getTelefono() {
//        return telefono;
//    }
//
//    public void setTelefono(String telefono) {
//        this.telefono = telefono;
//    }
//
//    public String getIdDecano() {
//        return idDecano;
//    }
//
//    public void setIdDecano(String idDecano) {
//        this.idDecano = idDecano;
//    }
    
}
