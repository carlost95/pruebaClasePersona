package com.undec.corralon.services;

import com.undec.corralon.entities.ClienteEntity;
import com.undec.corralon.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    ClientRepository clientRepository;

    public List<ClienteEntity> listAll(){
        return clientRepository.findAll();
    }

}
