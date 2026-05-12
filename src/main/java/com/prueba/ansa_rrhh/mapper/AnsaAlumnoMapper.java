package com.prueba.ansa_rrhh.mapper;

import com.prueba.ansa_rrhh.dto.AnsaAlumnoDto;
import com.prueba.ansa_rrhh.entity.AnsaAlumno;
import com.prueba.ansa_rrhh.mapper.principal.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AnsaAlumnoMapper extends EntityMapper<AnsaAlumnoDto, AnsaAlumno> {

}
