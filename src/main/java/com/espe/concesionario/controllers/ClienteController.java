package com.espe.concesionario.controllers;

import com.espe.concesionario.models.ClienteModel;
import com.espe.concesionario.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    ClienteService clienteService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping()
    public ArrayList<ClienteModel> obtenerClientes(){
        return clienteService.obtenerClientes();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/{id}")
    public ClienteModel clientePorId(@PathVariable long id){
         return clienteService.clientePorId(id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping()
    public ClienteModel guardarCliente(@RequestBody ClienteModel cliente) {
        return clienteService.guardarCliente(cliente);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/{id}")
    public ClienteModel actualizarCliente(@PathVariable long id, @RequestBody ClienteModel cliente){

         return clienteService.actualizarCliente(id, cliente);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/{id}")
    public void eliminarCliente(@PathVariable long id){
        clienteService.eliminarCliente(id);
    }

}
