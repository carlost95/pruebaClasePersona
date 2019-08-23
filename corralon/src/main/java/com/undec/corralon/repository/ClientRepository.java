package com.undec.corralon.repository;

import com.undec.corralon.entities.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ClientRepository extends JpaRepository<ClienteEntity, Integer> {
    @Override
    List<ClienteEntity> findAll();

}
