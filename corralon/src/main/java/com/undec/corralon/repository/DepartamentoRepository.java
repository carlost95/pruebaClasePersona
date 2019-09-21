package com.undec.corralon.repository;

import com.undec.corralon.entities.Departamentos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoRepository extends JpaRepository<Departamentos, Integer> {
}
