/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.faan.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 *
 * @author LaptopSA
 */
@Setter
@Getter
@Entity
@Table(name = "TipoAlergias")
public class TipoAlergias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTipoAlergia")
    private Integer idTipoAlergia;

    @Column(name = "nombreAlergia")
    @NotEmpty(message = "El campo no debe estar vacio")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "El campo debe contener solo letras")
    private String nombreAlergia;

    @Column(name = "estado")
    private Integer estado;

    @JsonIgnore
    @OneToMany(mappedBy = "tipoAlergias")
    private List<Alergias> alergias;

}
