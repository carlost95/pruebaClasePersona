package com.undec.corralon.repository;

import com.undec.corralon.entities.Distritos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DistritoRepository extends JpaRepository <Distritos, Integer> {
    Distritos getByNombre(String nombre);
}
