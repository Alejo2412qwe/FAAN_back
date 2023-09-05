package com.proyecto.faan.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "roles")
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idRol")
    private Integer idRol;

    @Column(name = "nombreRol")
    @NotEmpty(message = "El campo no debe estar vacio")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "El campo debe contener solo letras")
    private String nombreRol;

    @Column(name = "estadoRolActivo")
    private Boolean estadoRolActivo;

    // REFERENCE
   /* @JsonIgnore
    @OneToMany(mappedBy = "rol")
    private List<Usuario> usuario;*/


}
