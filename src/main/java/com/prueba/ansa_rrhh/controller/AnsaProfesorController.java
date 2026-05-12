package com.prueba.ansa_rrhh.controller;

import com.prueba.ansa_rrhh.dto.AnsaAlumnoDto;
import com.prueba.ansa_rrhh.dto.AnsaProfesorDto;
import com.prueba.ansa_rrhh.service.AnsaAlumnoService;
import com.prueba.ansa_rrhh.service.AnsaProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AnsaProfesorController {
    @Autowired
    AnsaProfesorService ansaProfesorService;

    @PostMapping("/saveProfesor")
    public ResponseEntity<AnsaProfesorDto> saveProfesor(AnsaProfesorDto request){
        return ResponseEntity.ok(ansaProfesorService.saveProfesor(request));
    }
}
