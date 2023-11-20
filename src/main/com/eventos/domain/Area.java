package com.eventos.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
 * @author Fernando Carta
 */
@Data
@Entity
@Table(name = "area")
public class Area {

    @Id
    private Long area_codigo;
    private String nombre;
    private int facultad_codigo;
    private String id_coordinador;

//    public Area(int area_codigo, String nombre, int facultad_codigo, String id_coordinador) {
//        
//        this.nombre = nombre;
//        this.facultad_codigo = facultad_codigo;
//        this.id_coordinador = id_coordinador;
//    }
//
//    public Area(String nombre, int facultad_codigo, String id_coordinador) {
//        this.nombre = nombre;
//        this.facultad_codigo = facultad_codigo;
//        this.id_coordinador = id_coordinador;
//    }
//
//    
//
//    public int getArea_codigo() {
//        return area_codigo;
//    }
//
//    public void setArea_codigo(int area_codigo) {
//        this.area_codigo = area_codigo;
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
//    public int getFacultad_codigo() {
//        return facultad_codigo;
//    }
//
//    public void setFacultad_codigo(int facultad_codigo) {
//        this.facultad_codigo = facultad_codigo;
//    }
//
//    public String getId_coordinador() {
//        return id_coordinador;
//    }
//
//    public void setId_coordinador(String id_coordinador) {
//        this.id_coordinador = id_coordinador;
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("Area{");
//        sb.append("area_codigo=").append(area_codigo);
//        sb.append(", nombre=").append(nombre);
//        sb.append(", facultad_codigo=").append(facultad_codigo);
//        sb.append(", id_coordinador=").append(id_coordinador);
//        sb.append('}');
//        return sb.toString();
//    }
    
}
