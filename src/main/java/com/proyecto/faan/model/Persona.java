package com.proyecto.faan.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "personas")
public class Persona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPersona")
    private Integer idPersona;

    @Column(name = "identificacion")
    @NotEmpty(message = "El campo no debe estar vacio")
    @Size(min = 10, max = 10, message = "El campo debe tener exactamente 10 caracteres")
    private String identificacion;

    @Column(name = "nombre1")
    @NotEmpty(message = "El campo no debe estar vacio")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "El campo debe contener solo letras")
    private String nombre1;

    @Column(name = "nombre2")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "El campo debe contener solo letras")
    @NotEmpty(message = "El campo no debe estar vacio")
    private String nombre2;

    @Column(name = "apellido1")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "El campo debe contener solo letras")
    @NotEmpty(message = "El campo no debe estar vacio")
    private String apellido1;

    @Column(name = "apellido2")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "El campo debe contener solo letras")
    @NotEmpty(message = "El campo no debe estar vacio")
    private String apellido2;

    @Column(name = "fechaNacimiento")
    private LocalDate fechaNacimiento;

    @Column(name = "direccion")
    @NotEmpty(message = "El campo no debe estar vacio")
    private String direccion;

    @Column(name = "correo")
    @NotEmpty(message = "El campo no debe estar vacio")
    @Email(message = "El campo debe tener un formato de correo electrónico válido")
    private String correo;

    @Column(name = "telefono")
    @Pattern(regexp = "^[0-9]+$", message = "El campo debe contener solo números")
    @NotEmpty(message = "El campo no debe estar vacio")
    private String telefono;

    @Column(name = "celular")
    @Pattern(regexp = "^[0-9]+$", message = "El campo debe contener solo números")
    @NotEmpty(message = "El campo no debe estar vacio")
    private String celular;

    @Column(name = "genero")
    @NotEmpty(message = "El campo no debe estar vacio")
    private String genero;

    // REFERENCE
    @JsonIgnore
    @OneToMany(mappedBy = "persona")
    private List<Usuario> usuario;

    @JsonIgnore
    @OneToMany(mappedBy = "persona")
    private List<EncabezadoAdopcion> encabezadoAdopcions;


}
