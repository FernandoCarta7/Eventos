package com.eventos.domain;

import java.io.Serializable;

import javax.persistence.*;
import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
@Entity
@Table(name = "asistente")
public class Asistente implements Serializable{
    @Id
    private String identificador;
    private String nombreUsuario;
    private String nombreCompleto;
    private String relacionPoli;
    private String email;
    private String ciudad;
    private boolean empleadoPoli;
    private boolean conferencista;
}
