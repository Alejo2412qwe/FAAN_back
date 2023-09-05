package com.proyecto.faan.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "fichasMedicas")
public class FichaMedica implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idFichaMedica")
    private Integer idFichaMedica;

    @Column(name = "descripcionFichaMedica")
    @NotBlank(message = "El campo no debe estar vacio")
    private String descripcionFichaMedica;

    // REFERENCE
    
    @JsonIgnore
    @OneToMany(mappedBy = "fichaMedica")
    private List<Animal> animals;

    @JsonIgnore
    @OneToMany(mappedBy = "fichaMedica")
    private List<Vacuna> vacunas;

    @JsonIgnore
    @OneToMany(mappedBy = "fichaMedica")
    private List<Tratamiento> tratamientos;

    @JsonIgnore
    @OneToMany(mappedBy = "fichaMedica")
    private List<Enfermedad> enfermedads;

    @JsonIgnore
    @OneToMany(mappedBy = "fichaMedica")
    private List<ExamenFisico> examenFisicos;

    @JsonIgnore
    @OneToMany(mappedBy = "fichaMedica")
    private List<Alergias> alergias;
}
