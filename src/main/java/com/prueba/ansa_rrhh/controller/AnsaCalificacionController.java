package com.prueba.ansa_rrhh.controller;

import com.prueba.ansa_rrhh.dto.AnsaCalificacionDto;
import com.prueba.ansa_rrhh.dto.AnsaCalificacionResponseDto;
import com.prueba.ansa_rrhh.dto.AnsaProfesorDto;
import com.prueba.ansa_rrhh.service.AnsaCalificacionService;
import com.prueba.ansa_rrhh.service.AnsaProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AnsaCalificacionController {
    @Autowired
    AnsaCalificacionService ansaCalificacionService;

    @PostMapping("/saveCalificacion")
    public ResponseEntity<AnsaCalificacionDto> saveCalificacion(AnsaCalificacionDto request){
        return ResponseEntity.ok(ansaCalificacionService.saveCalificacion(request));
    }

    @PostMapping("/getPromedio")
    public ResponseEntity<AnsaCalificacionResponseDto> getPromedio(AnsaCalificacionDto request){
        return ResponseEntity.ok(ansaCalificacionService.getPromedio(request));
    }
}
