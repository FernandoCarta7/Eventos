package com.eventos.domain;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "departamento")
public class Departamento {
    @Id
    private int cod_dpto;
    private int cod_pais;
    private String nombre;

//    public Departamento() {
//    }
//
//    public Departamento(int cod_dpto, int cod_pais, String nombre) {
//        this.cod_dpto = cod_dpto;
//        this.cod_pais = cod_pais;
//        this.nombre = nombre;
//    }
//
//    public Departamento(int cod_pais, String nombre) {
//        this.cod_pais = cod_pais;
//        this.nombre = nombre;
//    }
//
//    
//    
//    public int getCod_dpto() {
//        return cod_dpto;
//    }
//
//    public void setCod_dpto(int cod_dpto) {
//        this.cod_dpto = cod_dpto;
//    }
//
//    public int getCod_pais() {
//        return cod_pais;
//    }
//
//    public void setCod_pais(int cod_pais) {
//        this.cod_pais = cod_pais;
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
}
