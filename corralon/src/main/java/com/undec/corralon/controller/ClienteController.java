package com.undec.corralon.controller;

import com.undec.corralon.entities.ClientesEntity;
import com.undec.corralon.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/todos")
    public List<ClientesEntity> listAll(){
        return clienteService.findAll();
    }

    @GetMapping(value = "/habilitados")
    public List<ClientesEntity> listAllHabilitados(){
        return clienteService.listar();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ClientesEntity> listClientById(@PathVariable(value = "id") Integer id){
        ClientesEntity clientesEntity = clienteService.listarId(id);
        if(clientesEntity == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(clientesEntity);
    }

    @PostMapping
    public ClientesEntity agregar(@Valid @RequestBody ClientesEntity clientesEntity){
        return clienteService.add(clientesEntity);
    }

    @PutMapping(path = {"/{id}"})
    public ClientesEntity editar(@RequestBody ClientesEntity clientesEntity,@PathVariable("id") int id){
        clientesEntity.setId(id);
        return clienteService.edit(clientesEntity);
    }

    @DeleteMapping(path = {"/{id}"})
    public ClientesEntity delete(@PathVariable("id") int  id){
        return clienteService.delete(id);
    }
}
