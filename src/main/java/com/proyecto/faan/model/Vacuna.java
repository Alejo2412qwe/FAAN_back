package com.proyecto.faan.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@Entity(name = "vacunas")
public class Vacuna {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idVacuna")
    private Integer idVacuna;

    @Column(name = "fechaVacuna")
    private LocalDate fechaVacuna;

    @Column(name = "observaciones")
    @NotBlank(message = "El campo no debe estar vacio")
    private String observaciones;

    @Column(name = "estadoVacuna")
    @NotBlank(message = "El campo no debe estar vacio")
    private String estadoVacuna;

    // RELATIONSHIP
    @ManyToOne
    @JoinColumn(name="idTipoVacuna",referencedColumnName ="idTipoVacuna")
    private TipoVacuna tipoVacuna;

    @ManyToOne
    @JoinColumn(name="idFichaMedica",referencedColumnName ="idFichaMedica")
    private FichaMedica fichaMedica;
}
