package com.eventos.domain;

import java.io.Serializable;

import javax.persistence.*;
import lombok.Data;

/**
 * @author Fernando Carta
 */
@Data
@Entity
@Table(name = "ciudad")
public class Ciudad implements Serializable{

    @Id
    private Long cod_ciudad;
    private String nombre;
    private int cod_dpto;
    private int cod_pais;

}
