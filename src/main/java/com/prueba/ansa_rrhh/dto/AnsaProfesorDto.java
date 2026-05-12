package com.prueba.ansa_rrhh.dto;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.prueba.ansa_rrhh.entity.AnsaProfesor}
 */
@Value
public class AnsaProfesorDto implements Serializable {
    String nombreProfesor;
}