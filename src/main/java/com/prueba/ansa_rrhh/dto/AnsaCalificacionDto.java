package com.prueba.ansa_rrhh.dto;

import com.prueba.ansa_rrhh.entity.AnsaCalificacion;
import lombok.Value;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * DTO for {@link AnsaCalificacion}
 */
@Value
public class AnsaCalificacionDto implements Serializable {
    Integer idProfesor;
    Integer idAlumno;
    List<BigDecimal> notas;
    String materia;
}