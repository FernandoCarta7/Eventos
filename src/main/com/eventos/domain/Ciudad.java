package com.eventos.domain;

import javax.persistence.*;
import lombok.Data;

/**
 * @author Fernando Carta
 */
@Data
@Entity
@Table(name = "ciudad")
public class Ciudad {

    @Id
    private Long cod_ciudad;
    private String nombre;
    private int cod_dpto;
    private int cod_pais;

//    public Ciudad(int cod_ciudad, String nombre, int cod_dpto, int cod_pais) {
//        this.cod_ciudad = cod_ciudad;
//        this.nombre = nombre;
//        this.cod_dpto = cod_dpto;
//        this.cod_pais = cod_pais;
//    }
//
//    public Ciudad(String nombre, int cod_dpto, int cod_pais) {
//        this.nombre = nombre;
//        this.cod_dpto = cod_dpto;
//        this.cod_pais = cod_pais;
//    }
//
//    public Ciudad() {
//    }
//
//    public int getCod_ciudad() {
//        return cod_ciudad;
//    }
//
//    public void setCod_ciudad(int cod_ciudad) {
//        this.cod_ciudad = cod_ciudad;
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
}
