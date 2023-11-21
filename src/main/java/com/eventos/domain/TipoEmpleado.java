package com.eventos.domain;

import java.io.Serializable;

import javax.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name = "tipo_empleado")
public class TipoEmpleado implements Serializable{
    @Id
    private String tipoEmpleado;

//    public String getTipoEmpleado() {
//        return tipoEmpleado;
//    }
//
//    public TipoEmpleado(String tipoEmpleado) {
//        this.tipoEmpleado = tipoEmpleado;
//    }
//
//    public void setTipoEmpleado(String tipoEmpleado) {
//        this.tipoEmpleado = tipoEmpleado;
//    }
}
