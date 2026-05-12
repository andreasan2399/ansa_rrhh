package com.prueba.ansa_rrhh.repository;

import com.prueba.ansa_rrhh.entity.AnsaProfesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnsaProfesorRepository extends JpaRepository<AnsaProfesor, Integer> {
}