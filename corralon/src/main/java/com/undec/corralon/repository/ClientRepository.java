package com.undec.corralon.repository;

import com.undec.corralon.entities.ClientesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface ClientRepository extends JpaRepository<ClientesEntity, Integer> {
    @Query("SELECT c FROM ClientesEntity  c WHERE c.habilitacion = 1")
    List<ClientesEntity> findAllByHabilitacionExists();
}
