package com.espe.concesionario.controllers;

import com.espe.concesionario.models.AutomovilModel;
import com.espe.concesionario.models.ClienteModel;
import com.espe.concesionario.services.AutomovilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/automovil")
public class AutomovilController {
    @Autowired
    AutomovilService automovilService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping()
    public ArrayList<AutomovilModel> obtenerAutomoviles(){
        return automovilService.obtenerAutomoviles();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/{id}")
    public AutomovilModel automovilPorId(@PathVariable long id){
        return automovilService.automovilPorId(id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping()
    public AutomovilModel guardarAutomovil(@RequestBody AutomovilModel automovil){
        return automovilService.guardarAutomovil(automovil);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/{id}")
    public AutomovilModel actualizarAutomovil(@PathVariable long id, @RequestBody AutomovilModel automovil){
        return automovilService.actualizarAutomovil(id, automovil);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/{id}")
    public void eliminarAutomovil(@PathVariable long id){
        automovilService.eliminarAutomovil(id);
    }

}
