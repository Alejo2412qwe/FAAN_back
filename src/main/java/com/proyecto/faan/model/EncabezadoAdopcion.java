package com.proyecto.faan.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.util.List;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "EncabezadoAdopcion")
public class EncabezadoAdopcion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEncabezadoAdopcion")
    private Integer idEncabezadoAdopcion;

    @Column(name = "fechaAdopcion")
    @NotNull(message = "El campo no debe ser nulo")
    private LocalDate fechaAdopcion;

    @NotBlank(message = "El campo no debe estar vacio")
    @Column(name = "observacion")
    private String observacion;

    @ManyToOne
    @JoinColumn(name="idPersona",referencedColumnName ="idPersona")
    private Persona persona;

    @JsonIgnore
    @OneToMany(mappedBy = "encabezadoAdopcion", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<DetalleAdopcion> listaDetalle;
}
