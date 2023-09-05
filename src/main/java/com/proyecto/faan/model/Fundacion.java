package com.proyecto.faan.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity(name = "fundaciones")
public class Fundacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idFudacion")
    private Integer idFudacion;

    @Column(name = "ruc")
    @NotEmpty(message = "El campo no debe estar vacio")
    private String ruc;

    @Column(name = "nombreFundacion")
    @NotEmpty(message = "El campo no debe estar vacio")
    private String nombreFundacion;

    @Column(name = "eslogan")
    @NotEmpty(message = "El campo no debe estar vacio")
    private String eslogan;

    @Column(name = "objetivo")
    @NotEmpty(message = "El campo no debe estar vacio")
    private String objetivo;

    @Column(name = "correo")
    @NotEmpty(message = "El campo no debe estar vacio")
    @Email(message = "El campo debe tener un formato de correo electrónico válido")
    private String correo;

    @Column(name = "direccion")
    @NotEmpty(message = "El campo no debe estar vacio")
    private String direccion;

    @Column(name = "paginaWeb")
    @NotEmpty(message = "El campo no debe estar vacio")
    private String paginaWeb;

    @Column(name = "horarios")
    @NotEmpty(message = "El campo no debe estar vacio")
    private String horarios;

    @Column(name = "acronimo")
    @NotEmpty(message = "El campo no debe estar vacio")
    private String acronimo;

    @Column(name = "logoFundacion")
    @NotEmpty(message = "El campo no debe estar vacio")
    private String logoFundacion;

    // REFERENCE
    @JsonIgnore
    @OneToMany(mappedBy = "fundacion")
    private List<Animal> animals;

}
