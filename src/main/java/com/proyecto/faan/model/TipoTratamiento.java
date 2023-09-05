package com.proyecto.faan.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity(name = "tiposTratamientos")
public class TipoTratamiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTipoTratamiento")
    private Integer idTipoTratamiento;

    @Column(name = "nombreTratamiento")
    @NotBlank(message = "El campo no debe estar vacio")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "El campo debe contener solo letras")
    private String nombreTratamiento;

    @Column(name = "estado")
    private Boolean estado;

    // REFERENCE
    @JsonIgnore
    @OneToMany(mappedBy = "tipoTratamiento")
    private List<Tratamiento> tratamientos;
}
