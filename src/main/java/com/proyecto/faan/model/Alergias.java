/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.faan.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author LaptopSA
 */
@Setter
@Getter
@Entity
@Table(name = "Alergias")
public class Alergias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAlergias")
    private Integer idAlergias;

    @Column(name = "fechaDeteccion")
    @NotNull(message = "El campo no debe ser nulo")
    private LocalDate fechaDeteccion;

    @NotBlank(message = "El campo no debe estar vacio")
    @Column(name = "observacion")
    private String observacion;

    // RELATIONSHIP
    @ManyToOne
    @JoinColumn(name = "idTipoAlergia", referencedColumnName = "idTipoAlergia")
    private TipoAlergias tipoAlergias;

    @ManyToOne
    @JoinColumn(name="idFichaMedica",referencedColumnName ="idFichaMedica")
    private FichaMedica fichaMedica;

}
