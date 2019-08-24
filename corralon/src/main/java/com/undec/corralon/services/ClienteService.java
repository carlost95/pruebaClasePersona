package com.undec.corralon.services;

import com.undec.corralon.entities.ClientesEntity;
import com.undec.corralon.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    ClientRepository clientRepository;

    public List<ClientesEntity> findAll(){
        return clientRepository.findAll();
    }

    public List<ClientesEntity> listar() {
        return clientRepository.findAllByHabilitacionExists();
    }

    public ClientesEntity listarId(int id) {
        return clientRepository.getOne(id);
    }
    public ClientesEntity add(ClientesEntity clientesEntity) {
        return clientRepository.save(clientesEntity);
    }

    public ClientesEntity edit(ClientesEntity clientesEntity) {
        return clientRepository.save(clientesEntity);
    }

    public ClientesEntity delete(int id) {
        ClientesEntity clientesEntity=clientRepository.getOne(id);
        Byte desabilitado =0;
        if(clientesEntity.getHabilitacion()==1){
            clientesEntity.setHabilitacion(desabilitado);
        }
        return clientesEntity;
    }

}
