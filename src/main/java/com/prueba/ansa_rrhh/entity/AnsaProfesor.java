package com.prueba.ansa_rrhh.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ansa_profesor")
public class AnsaProfesor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_profesor", nullable = false)
    private Integer id;

    @Column(name = "nombre_profesor", nullable = false, length = Integer.MAX_VALUE)
    private String nombreProfesor;


}