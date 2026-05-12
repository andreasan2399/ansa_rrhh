package com.prueba.ansa_rrhh.service;

import com.prueba.ansa_rrhh.dto.AnsaAlumnoDto;
import com.prueba.ansa_rrhh.entity.AnsaAlumno;
import com.prueba.ansa_rrhh.mapper.AnsaAlumnoMapper;
import com.prueba.ansa_rrhh.repository.AnsaAlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnsaAlumnoService {
    @Autowired
    AnsaAlumnoRepository ansaAlumnoRepository;
    @Autowired
    private AnsaAlumnoMapper ansaAlumnoMapper;

    public AnsaAlumnoDto saveAlumno(AnsaAlumnoDto dto){
        AnsaAlumno alumno = ansaAlumnoMapper.toEntity(dto);
        ansaAlumnoRepository.save(alumno);
        return dto;
    }
}
