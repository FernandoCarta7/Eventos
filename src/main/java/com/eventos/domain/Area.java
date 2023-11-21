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
public class Area implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long area_codigo;
    private String nombre;
    private int facultad_codigo;
    private String id_coordinador;

    
}
