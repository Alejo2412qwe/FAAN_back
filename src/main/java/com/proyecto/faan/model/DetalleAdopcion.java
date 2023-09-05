/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.faan.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author LaptopSA
 */
@Setter
@Getter
@Entity
@Table(name = "DetalleAdopcion")
public class DetalleAdopcion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAdopcion")
    private Integer idAdopcion;

    @NotBlank(message = "El campo no debe estar vacio")
    @Column(name = "observacion")
    private String observacion;

    @NotBlank(message = "El campo no debe estar vacio")
    @Column(name = "documento")
    private String documento;

    @ManyToOne
    @JoinColumn(name = "idEncabezadoAdopcion", referencedColumnName = "idEncabezadoAdopcion")
    private EncabezadoAdopcion encabezadoAdopcion;

    @ManyToOne
    @JoinColumn(name = "idAnimal", referencedColumnName = "idAnimal")
    private Animal animal;
}
