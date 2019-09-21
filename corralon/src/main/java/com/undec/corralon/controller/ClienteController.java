package com.undec.corralon.controller;

import com.undec.corralon.DTO.ClienteDTORequest;
import com.undec.corralon.entities.Clientes;
import com.undec.corralon.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
@CrossOrigin (origins ="http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

//
    @GetMapping
    public List<Clientes> listAll(){
        return clienteService.findAll();
    }
//
//    @GetMapping(value = "/habilitados")
//    public List<ClientesEntity> listAllHabilitados(){
//        return clienteService.listar();
//    }
//
//    @GetMapping(value = "/{id}")
//    public ResponseEntity<ClientesEntity> listClientById(@PathVariable(value = "id") Integer id){
//        ClientesEntity clientesEntity = clienteService.listarId(id);
//        if(clientesEntity == null)
//            return ResponseEntity.notFound().build();
//        return ResponseEntity.ok(clientesEntity);
//    }
//
    @PostMapping
    public String agregar(@RequestBody ClienteDTORequest clienteDTORequest){
        clienteService.save(clienteDTORequest);
        return  "Saved";

    }
//
//    @PutMapping(path = {"/{id}"})
//    public ClientesEntity editar(@RequestBody ClientesEntity clientesEntity,@PathVariable("id") int id){
//        clientesEntity.setId(id);
//        return clienteService.edit(clientesEntity);
//    }
//
//    @DeleteMapping(path = {"/{id}"})
//    public ClientesEntity delete(@PathVariable("id") int  id){
//        return clienteService.delete(id);
//    }

    @GetMapping("/apellido/{cadena}")
    public List<Clientes> cadenaApellido(@PathVariable("cadena") String cad){
        return clienteService.apellidoCadena(cad);
    }
    @GetMapping ("/nombre/{nombre}")
    public  Clientes devuelveNombre(@PathVariable("nombre") String nombre){
        return clienteService.devuelveClientePorNombre(nombre);
    }
}
