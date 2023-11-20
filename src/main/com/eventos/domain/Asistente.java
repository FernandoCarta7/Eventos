package com.eventos.domain;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
@Entity
@Table(name = "asistente")
public class Asistente {
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
