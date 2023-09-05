package com.proyecto.faan.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "situacionesIngreso")
public class SituacionIngreso implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSituacionIngreso")
    private Integer idSituacionIngreso;

    @Column(name = "nombreSituacionIngreso")
    @NotBlank(message = "El campo no debe estar vacio")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "El campo debe contener solo letras")
    private String nombreSituacionIngreso;

    @Column(name = "estadoSituacionIngreso")
    @NotBlank(message = "El campo no debe estar vacio")
    private String estadoSituacionIngreso;

    @JsonIgnore
    @OneToMany (mappedBy = "situacionIngreso")
    private List<FichaRegistro> fichaRegistros;
}
