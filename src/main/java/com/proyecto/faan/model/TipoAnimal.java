package com.proyecto.faan.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "tiposAnimales")
public class TipoAnimal implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTipoAnimal")
    private Integer idTipoAnimal;

    @NotBlank(message = "El campo no debe estar vacio")
    @Column(name = "nombreTipo", unique = true)
    @Pattern(regexp = "^[a-zA-Z]+$", message = "El campo debe contener solo letras")
    private String nombreTipo;

    @Column(name = "descripcionAnimal")
    @NotBlank(message = "El campo no debe estar vacio")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "El campo debe contener solo letras")
    private String descripcionAnimal;

    @Column(name = "estadoTipo")
    @NotBlank(message = "El campo no debe estar vacio")
    private String estadoTipo;

    @JsonIgnore
    @OneToMany (mappedBy = "tipoAnimal")
    private List<RazaAnimal> razaAnimals;
}
