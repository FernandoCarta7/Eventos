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
@Table(name = "programa")
public class Programa implements Serializable{
    @Id
    private int programaCodigo;
    private String nombre;
    private int areaCodigo;

//    public Programa() {
//    }
//
//    public Programa(int programaCodigo, String nombre, int areaCodigo) {
//        this.programaCodigo = programaCodigo;
//        this.nombre = nombre;
//        this.areaCodigo = areaCodigo;
//    }
//     public Programa( String nombre, int areaCodigo) {
//        this.nombre = nombre;
//        this.areaCodigo = areaCodigo;
//    }
//
//    public int getProgramaCodigo() {
//        return programaCodigo;
//    }
//
//    public void setProgramaCodigo(int programaCodigo) {
//        this.programaCodigo = programaCodigo;
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
//    public int getAreaCodigo() {
//        return areaCodigo;
//    }
//
//    public void setAreaCodigo(int areaCodigo) {
//        this.areaCodigo = areaCodigo;
//    }
}
