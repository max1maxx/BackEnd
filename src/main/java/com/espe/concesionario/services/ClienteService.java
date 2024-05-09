package com.espe.concesionario.services;

import com.espe.concesionario.models.ClienteModel;
import com.espe.concesionario.repositories.ClienteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ClienteService {
    @Autowired
    ClienteRepo clienteRepo;

    public ArrayList<ClienteModel> obtenerClientes(){
        return  (ArrayList<ClienteModel>) clienteRepo.listarClientes();
    }
    public ClienteModel guardarCliente(ClienteModel cliente){
        return clienteRepo.crearCliente(cliente);
    }
    public ClienteModel actualizarCliente(long id, ClienteModel clienteModel){
        return clienteRepo.actualizarCliente(id, clienteModel);
    }
    public ClienteModel clientePorId(long id){
        return clienteRepo.obtenerClientePorId(id);
    }
    public void eliminarCliente(long id){
        clienteRepo.eliminarCliente(id);
    }

}
