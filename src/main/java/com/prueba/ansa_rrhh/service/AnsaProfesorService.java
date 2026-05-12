package com.prueba.ansa_rrhh.service;

import com.prueba.ansa_rrhh.dto.AnsaAlumnoDto;
import com.prueba.ansa_rrhh.dto.AnsaProfesorDto;
import com.prueba.ansa_rrhh.entity.AnsaAlumno;
import com.prueba.ansa_rrhh.entity.AnsaProfesor;
import com.prueba.ansa_rrhh.mapper.AnsaAlumnoMapper;
import com.prueba.ansa_rrhh.mapper.AnsaProfesorMapper;
import com.prueba.ansa_rrhh.repository.AnsaAlumnoRepository;
import com.prueba.ansa_rrhh.repository.AnsaProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnsaProfesorService {
    @Autowired
    AnsaProfesorRepository ansaProfesorRepository;
    @Autowired
    private AnsaProfesorMapper ansaProfesorMapper;

    public AnsaProfesorDto saveProfesor(AnsaProfesorDto dto){
        AnsaProfesor profesor = ansaProfesorMapper.toEntity(dto);
        ansaProfesorRepository.save(profesor);
        return dto;
    }
}
