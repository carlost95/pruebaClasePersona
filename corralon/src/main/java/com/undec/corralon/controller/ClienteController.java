package com.undec.corralon.controller;

import com.undec.corralon.entities.ClienteEntity;
import com.undec.corralon.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @GetMapping("/clientes")
    public List<ClienteEntity> allClients(){
        return clienteService.listAll();
    }
}
