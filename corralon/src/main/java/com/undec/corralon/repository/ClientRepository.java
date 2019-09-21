package com.undec.corralon.repository;

import com.undec.corralon.entities.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface ClientRepository extends JpaRepository<Clientes, Integer> {

    @Query("SELECT c FROM Clientes c WHERE c.habilitacion = 1")
    List<Clientes> findAllByHabilitacionExists();

    List<Clientes> findAll();

    List<Clientes> findAllByApellidoContaining(String str);

    Clientes findFirstByNombre(String nombre);
}
