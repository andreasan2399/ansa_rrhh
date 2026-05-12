package com.prueba.ansa_rrhh.service;

import com.prueba.ansa_rrhh.dto.AnsaCalificacionDto;
import com.prueba.ansa_rrhh.dto.AnsaCalificacionResponseDto;
import com.prueba.ansa_rrhh.dto.AnsaProfesorDto;
import com.prueba.ansa_rrhh.entity.AnsaCalificacion;
import com.prueba.ansa_rrhh.entity.AnsaProfesor;
import com.prueba.ansa_rrhh.mapper.AnsaCalificacionMapper;
import com.prueba.ansa_rrhh.mapper.AnsaProfesorMapper;
import com.prueba.ansa_rrhh.repository.AnsaCalificacionRepository;
import com.prueba.ansa_rrhh.repository.AnsaProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class AnsaCalificacionService {
    @Autowired
    AnsaCalificacionRepository ansaCalificacionRepository;
    @Autowired
    private AnsaCalificacionMapper ansaCalificacionMapper;

    //el profesor debe poder ingresar tres notas por materia por alumno
    public AnsaCalificacionDto saveCalificacion(AnsaCalificacionDto dto) {
        AnsaCalificacion calificacion = ansaCalificacionMapper.toEntity(dto);
        ansaCalificacionRepository.save(calificacion);
        return dto;
    }

    /*
    El sistema debe permitir, mediante una consulta, obtener el promedio por alumno y por
materia, junto con su respectiva observación basada en dicho promedio, siguiendo los
siguientes lineamientos:
○ Cálculo de Promedio: Por alumno, se debe calcular el promedio de las tres notas de
cada materia.
○ Observación: Se debe mostrar un campo de "Observación" basado en el promedio
final, siguiendo los siguientes criterios:
■ 0.00 - 5.00: Regular
■ 5.01 - 7.99: Bueno
■ 8.00 - 10.00: Muy Bueno
     */

    public AnsaCalificacionResponseDto getPromedio(AnsaCalificacionDto dto) {
        List<AnsaCalificacion> calificaciones = ansaCalificacionRepository.findAnsaCalificacionsByIdAlumnoIdAndMateria(dto.getIdAlumno(), dto.getMateria());
        BigDecimal sumaCalificaciones = calificaciones.stream().map(AnsaCalificacion::getNota).reduce(BigDecimal.ZERO, BigDecimal::add);//suma
        BigDecimal promedio = sumaCalificaciones.divide(new BigDecimal(3));
        String observacion = "";
        if (promedio.doubleValue() >= 0.0 && promedio.doubleValue() <= 5.00) {
            observacion = "Regular";
        } else if (promedio.doubleValue() >= 5.1 && promedio.doubleValue() <= 7.99) {
            observacion = "Bueno";
        } else if (promedio.doubleValue() >= 8.0 && promedio.doubleValue() <= 10.00) {
            observacion = "Muy Bueno";
        }
        return new AnsaCalificacionResponseDto(promedio, observacion);
    }
}
