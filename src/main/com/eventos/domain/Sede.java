package com.eventos.domain;
import javax.persistence.*;
import lombok.Data;
/**
 *
 * @author Fernando Carta
 */
@Data
@Entity
@Table(name = "sede")
public class Sede {

    @Id
    private int sedeCodigo;
    private String nombre;
    private int codCiudad;

    public Sede() {
    }

    public Sede(int sedeCodigo, String nombre, int codCiudad) {
        this.sedeCodigo = sedeCodigo;
        this.nombre = nombre;
        this.codCiudad = codCiudad;
    }

    public Sede(String nombre, int codCiudad) {
        this.nombre = nombre;
        this.codCiudad = codCiudad;
    }

    public int getSedeCodigo() {
        return sedeCodigo;
    }

    public void setSedeCodigo(int sedeCodigo) {
        this.sedeCodigo = sedeCodigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodCiudad() {
        return codCiudad;
    }

    public void setCodCiudad(int codCiudad) {
        this.codCiudad = codCiudad;
    }
}
