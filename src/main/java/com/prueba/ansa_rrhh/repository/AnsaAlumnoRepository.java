package com.prueba.ansa_rrhh.repository;

import com.prueba.ansa_rrhh.entity.AnsaAlumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnsaAlumnoRepository extends JpaRepository<AnsaAlumno, Integer> {
}