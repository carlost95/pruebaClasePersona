package com.undec.corralon.services;

import com.undec.corralon.DTO.ClienteDTORequest;
import com.undec.corralon.entities.Clientes;
import com.undec.corralon.entities.Direcciones;
import com.undec.corralon.entities.Distritos;
import com.undec.corralon.repository.ClientRepository;
import com.undec.corralon.repository.DireccionRepository;
import com.undec.corralon.repository.DistritoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ClienteService {
    @Autowired
    ClientRepository clientRepository;
    @Autowired
    DireccionRepository direccionRepository;

    @Autowired
    DistritoRepository distritoRepository;

    public List<Clientes> findAll(){
        return clientRepository.findAll();
    }

    public List<Clientes> listar() {
        return clientRepository.findAllByHabilitacionExists();
    }

    public Clientes listarId(int id) {
        return clientRepository.getOne(id);
    }

    public Clientes add(Clientes clientesEntity) {
        return clientRepository.save(clientesEntity);
    }

    public void save(ClienteDTORequest clienteDTORequest){
        Clientes cliente = new Clientes();
        Direcciones direcciones = new Direcciones();
        Distritos distritos = new Distritos();

        cliente.setNombre(clienteDTORequest.getNombre());
        cliente.setApellido(clienteDTORequest.getApellido());
        cliente.setDni(clienteDTORequest.getDni());
        cliente.setHabilitacion((byte) 1);
        cliente.setFechaactualizacion(LocalDate.now());
        cliente.setFechaalta(LocalDate.now());
        clientRepository.save(cliente);

        String distri = clienteDTORequest.getDistrito();

        if(distri.equals(distritoRepository.getByNombre(distri).getNombre()))
            distritos = distritoRepository.getByNombre(distri);
        else
            distritos.setNombre(distri);

        distritoRepository.save(distritos);

        direcciones.setCalle(clienteDTORequest.getCalle());
        direcciones.setBarrio(clienteDTORequest.getBarrio());
        direcciones.setNumerocalle(clienteDTORequest.getNumCalle());
        direcciones.setFechaactualizacion(LocalDate.now());
        direcciones.setFechaalta(LocalDate.now());
        direcciones.setClientesByFkclientesid(cliente);
        direcciones.setDistritosByFkdistritosid(distritos);
        direccionRepository.save(direcciones);




    }
    public Clientes edit(Clientes clientesEntity) {
        return clientRepository.save(clientesEntity);
    }

    public Clientes delete(int id) {
        Clientes clientesEntity=clientRepository.getOne(id);
        Byte desabilitado =0;
        if(clientesEntity.getHabilitacion()==1){
            clientesEntity.setHabilitacion(desabilitado);
        }
        return clientesEntity;
    }

    public List<Clientes> apellidoCadena(String cadena){
        return clientRepository.findAllByApellidoContaining(cadena);
    }
    public Clientes devuelveClientePorNombre(String nombre){
        return clientRepository.findFirstByNombre(nombre);
    }

}
