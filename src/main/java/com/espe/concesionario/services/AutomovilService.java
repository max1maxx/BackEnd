package com.espe.concesionario.services;

import com.espe.concesionario.models.AutomovilModel;
import com.espe.concesionario.repositories.AutomovilRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AutomovilService {
    @Autowired
    AutomovilRepo automovilRepo;

    public ArrayList<AutomovilModel> obtenerAutomoviles(){

        return automovilRepo.listarAutomoviles();
    }

    public AutomovilModel guardarAutomovil(AutomovilModel automovil){

        return automovilRepo.createAutomovil(automovil);
    }

    public AutomovilModel automovilPorId(long id){
        return automovilRepo.obtenerAutomovilPorId(id);
    }

    public AutomovilModel actualizarAutomovil(long id, AutomovilModel automovil){
        return automovilRepo.actualizarAutomovil(id, automovil);
    }

    public void eliminarAutomovil(long id){
        automovilRepo.eliminarAutomovil(id);
    }

}
