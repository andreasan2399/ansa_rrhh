package com.prueba.ansa_rrhh.repository;

import com.prueba.ansa_rrhh.entity.AnsaCalificacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnsaCalificacionRepository extends JpaRepository<AnsaCalificacion, Integer> {
    List<AnsaCalificacion> findAnsaCalificacionsByIdAlumnoIdAndMateria(Integer idAlumno, String materia);
}