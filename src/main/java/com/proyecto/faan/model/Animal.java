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
@Table(name = "animales")
public class Animal implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAnimal")
    private Integer idAnimal;

    @NotEmpty(message = "El campo no debe estar vacio")
    @Column(name = "placaAnimal", unique = true)
    private String placaAnimal;

    @NotEmpty(message = "El campo no debe estar vacio")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "El campo debe contener solo letras")
    @Column(name = "nombreAnimal", length = 255)
    private String nombreAnimal;

    @NotEmpty(message = "El campo no debe estar vacio")
    @Column(name = "fotoAnimal")
    private String fotoAnimal;

    @NotEmpty(message = "El campo no debe estar vacio")
    @Column(name = "edadAnimal")
    private Integer edadAnimal;

    @NotEmpty(message = "El campo no debe estar vacio")
    @Column(name = "estadoAnimal")
    private String estadoAnimal;


    // RELATIONSHIP
    @ManyToOne
    @JoinColumn(name = "idRazaAnimal", referencedColumnName = "idRazaAnimal")
    private RazaAnimal razaAnimal;

    @ManyToOne
    @JoinColumn(name = "idFichaRegistro", referencedColumnName = "idFichaRegistro")
    private FichaRegistro fichaRegistro;

    @ManyToOne
    @JoinColumn(name = "idFichaMedica", referencedColumnName = "idFichaMedica")
    private FichaMedica fichaMedica;

    @ManyToOne
    @JoinColumn(name = "idFudacion", referencedColumnName = "idFudacion")
    private Fundacion fundacion;


    // REFERENCE
    @JsonIgnore
    @OneToMany(mappedBy = "animal")
    private List<DetalleAdopcion> detalleAdopcion;
    
}
