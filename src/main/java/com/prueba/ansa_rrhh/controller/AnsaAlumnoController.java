package com.prueba.ansa_rrhh.controller;

import com.prueba.ansa_rrhh.dto.AnsaAlumnoDto;
import com.prueba.ansa_rrhh.service.AnsaAlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AnsaAlumnoController {
    @Autowired
    AnsaAlumnoService ansaAlumnoService;

    @PostMapping("/saveAlumno")
    public ResponseEntity<AnsaAlumnoDto> saveAlumno(AnsaAlumnoDto request){
        return ResponseEntity.ok(ansaAlumnoService.saveAlumno(request));
    }
}
