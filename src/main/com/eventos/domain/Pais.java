package com.eventos.domain;

import javax.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "pais")
public class Pais {
    @Id
    private int codPais;
    private String nombre;

//    public Pais() {
//    }
//
//    public Pais(String nombre) {
//        this.nombre = nombre;
//    }
//
//    public Pais(int codPais, String nombre) {
//        this.codPais = codPais;
//        this.nombre = nombre;
//    }
//
//    public int getCodPais() {
//        return codPais;
//    }
//
//    public void setCodPais(int codPais) {
//        this.codPais = codPais;
//    }
//
//    public String getNombre() {
//        return nombre;
//    }
//
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
}
