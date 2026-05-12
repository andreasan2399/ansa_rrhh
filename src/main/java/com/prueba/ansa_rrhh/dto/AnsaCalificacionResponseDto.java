package com.prueba.ansa_rrhh.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
public class AnsaCalificacionResponseDto {
    BigDecimal promedio;
    String observacion;

    public AnsaCalificacionResponseDto(BigDecimal promedio, String observacion) {
        this.promedio = promedio;
        this.observacion = observacion;
    }
}
