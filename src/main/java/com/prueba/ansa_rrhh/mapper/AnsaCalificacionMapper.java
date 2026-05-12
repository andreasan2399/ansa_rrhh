package com.prueba.ansa_rrhh.mapper;

import com.prueba.ansa_rrhh.dto.AnsaCalificacionDto;
import com.prueba.ansa_rrhh.dto.AnsaProfesorDto;
import com.prueba.ansa_rrhh.entity.AnsaCalificacion;
import com.prueba.ansa_rrhh.entity.AnsaProfesor;
import com.prueba.ansa_rrhh.mapper.principal.EntityMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AnsaCalificacionMapper extends EntityMapper<AnsaCalificacionDto, AnsaCalificacion> {

    @Mapping(source = "idAlumno", target = "idAlumno.id")
    AnsaCalificacion toEntity(AnsaCalificacionDto dto);
    List<AnsaCalificacion> toEntity(List<AnsaCalificacionDto> dto);

    @Mapping(source = "idAlumno.id", target = "idAlumno")
    AnsaCalificacionDto toDto(AnsaCalificacion dto);
}
