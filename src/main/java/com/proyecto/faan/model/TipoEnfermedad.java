package com.proyecto.faan.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity(name = "tiposEnfermedades")
public class TipoEnfermedad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTipoEnfermedad")
    private Integer idTipoEnfermedad;

    @Column(name = "nombreEnfermedad")
    @NotEmpty(message = "El campo no debe estar vacio")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "El campo debe contener solo letras")
    private String nombreEnfermedad;

    @Column(name = "estado")
    private Boolean estado;

    // REFERENCE
    @JsonIgnore
    @OneToMany(mappedBy = "tipoEnfermedad")
    private List<Enfermedad> enfermedad;
}
