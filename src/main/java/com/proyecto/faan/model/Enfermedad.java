package com.proyecto.faan.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@Entity(name = "enfermedades")
public class Enfermedad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEnfermedad")
    private Integer idEnfermedad;

    @Column(name = "fechaEnfermedad")
    @NotNull(message = "El campo no debe ser nulo")
    private LocalDate fechaEnfermedad;

    @Column(name = "observaciones")
    @NotBlank(message = "El campo no debe estar vacio")
    private String observaciones;

    @Column(name = "estadoEnfermedad")
    @NotBlank(message = "El campo no debe estar vacio")
    private String estadoEnfermedad;

    // RELATIONSHIP
    @ManyToOne
    @JoinColumn(name="idTipoEnfermedad",referencedColumnName ="idTipoEnfermedad")
    private TipoEnfermedad tipoEnfermedad;

    @ManyToOne
    @JoinColumn(name="idFichaMedica",referencedColumnName ="idFichaMedica")
    private FichaMedica fichaMedica;
}
