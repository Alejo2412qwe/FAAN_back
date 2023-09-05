/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.faan.model;

import jakarta.persistence.*;

import java.time.LocalDate;

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
@Table(name = "ExamenFisico")
public class ExamenFisico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idExamenFisico")
    private Integer idExamenFisico;

    @Column(name = "fechaRevisionFisisca")
    @NotNull(message = "El campo no debe ser nulo")
    private LocalDate fechaRevisionFisisca;

    @Column(name = "peso")
    @NotEmpty(message = "El campo no debe estar vacio")
    private Double peso;

    @NotEmpty(message = "El campo no debe estar vacio")
    @Column(name = "frecuenciaCardiaca")
    private Double frecuenciaCardiaca;

    @NotEmpty(message = "El campo no debe estar vacio")
    @Column(name = "mucosa")
    private String mucosa;

    @NotEmpty(message = "El campo no debe estar vacio")
    @Column(name = "ojosrojos")
    private String ojosrojos;

    @NotEmpty(message = "El campo no debe estar vacio")
    @Column(name = "piel")
    private String piel;

    @NotEmpty(message = "El campo no debe estar vacio")
    @Column(name = "sistemaUrinario")
    private String sistemaUrinario;

    @NotEmpty(message = "El campo no debe estar vacio")
    @Column(name = "sistemaDigestivo")
    private String sistemaDigestivo;

    @NotEmpty(message = "El campo no debe estar vacio")
    @Column(name = "abdomen")
    private String abdomen;

    // RELATIONSHIP
    @ManyToOne
    @JoinColumn(name="idFichaMedica",referencedColumnName ="idFichaMedica")
    private FichaMedica fichaMedica;

}
