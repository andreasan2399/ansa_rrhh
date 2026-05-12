package com.prueba.ansa_rrhh.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "ansa_alumno")
public class AnsaAlumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_alumno", nullable = false)
    private Integer id;

    @Column(name = "nombre", nullable = false, length = Integer.MAX_VALUE)
    private String nombre;

    @Column(name = "direccion", nullable = false, length = Integer.MAX_VALUE)
    private String direccion;

    @Column(name = "edad", nullable = false)
    private Integer edad;

    @OneToMany(mappedBy = "idAlumno")
    private Set<AnsaCalificacion> ansaCalificacions = new LinkedHashSet<>();


}