package com.prueba.ansa_rrhh.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "ansa_calificacion")
public class AnsaCalificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_calificacion", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_profesor")
    private AnsaProfesor idProfesor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_alumno")
    private AnsaAlumno idAlumno;

    @Column(name = "nota", nullable = false, precision = 15, scale = 2)
    private BigDecimal nota;

    @Column(name = "materia", nullable = false, length = Integer.MAX_VALUE)
    private String materia;


}