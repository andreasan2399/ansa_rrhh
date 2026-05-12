package com.prueba.ansa_rrhh.dto;

import com.prueba.ansa_rrhh.entity.AnsaAlumno;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link AnsaAlumno}
 */
@Value
public class AnsaAlumnoDto implements Serializable {
    String nombre;
    String direccion;
    Integer edad;
}