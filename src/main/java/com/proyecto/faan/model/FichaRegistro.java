package com.proyecto.faan.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "fichasRegistro")
public class FichaRegistro implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idFichaRegistro")
    private Integer idFichaRegistro;

    @NotEmpty(message = "El campo no debe estar vacio")
    @Column(name = "descripcionFichaRegistro")
    private String descripcionFichaRegistro;

    @JsonIgnore
    @OneToMany(mappedBy = "fichaRegistro")
    private List<Animal> animals;


    @ManyToOne
    @JoinColumn(name="idSituacionIngreso",referencedColumnName ="idSituacionIngreso")
    private SituacionIngreso situacionIngreso;
}
