package com.proyecto.faan.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "razasAnimales")
public class RazaAnimal implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idRazaAnimal")
    private Integer idRazaAnimal;

    @Column(name = "nombreRaza", unique = true)
    @NotEmpty(message = "El campo no debe estar vacio")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "El campo debe contener solo letras")
    private String nombreRaza;

    @Column(name = "estadoRaza")
    @NotEmpty(message = "El campo no debe estar vacio")
    private String estadoRaza;

    @ManyToOne
    @JoinColumn(name="idTipoAnimal",referencedColumnName ="idTipoAnimal")
    private TipoAnimal tipoAnimal;

    @JsonIgnore
    @OneToMany (mappedBy = "razaAnimal")
    private List<Animal> animals;
}
