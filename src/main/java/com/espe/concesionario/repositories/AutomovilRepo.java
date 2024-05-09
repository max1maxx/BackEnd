package com.espe.concesionario.repositories;

import com.espe.concesionario.models.AutomovilModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AutomovilRepo {
    List<AutomovilModel> automoviles = new ArrayList<AutomovilModel>();

    public AutomovilModel createAutomovil(AutomovilModel automovilModel){
        try{
            automovilModel.setId_automovil((long) (automoviles.size()+1));
            automoviles.add(automovilModel);
        }catch(Exception e){
            System.out.println(e);
        }
        return automovilModel;
    }

    public ArrayList<AutomovilModel> listarAutomoviles(){
        try{
            for(AutomovilModel automovilModel: automoviles){
                System.out.println(automovilModel);
            }
        }catch(Exception e){
            System.out.println(e);
        }

        return (ArrayList<AutomovilModel>) automoviles;
    }

    public AutomovilModel obtenerAutomovilPorId(long id){
        AutomovilModel aux =null;
        try{
            for(AutomovilModel automovilModel: automoviles){
                if(automovilModel.getId_automovil() == id){
                    aux=automovilModel;
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return aux;
    }

    public AutomovilModel actualizarAutomovil(long id, AutomovilModel body){
        AutomovilModel aux = obtenerAutomovilPorId(id);
        try{
            if(aux!=null){
                if(body.getMatricula()!=null){
                    aux.setMatricula(body.getMatricula());
                }
                if(body.getMarca()!=null){
                    aux.setMarca(body.getMarca());
                }
                if(body.getModelo()!=null){
                    aux.setModelo(body.getModelo());
                }
                if(body.getColor()!=null){
                    aux.setColor(body.getColor());
                }
                if(body.getPrecio()!=null){
                    aux.setPrecio(body.getPrecio());
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return aux;
    }

    public void eliminarAutomovil(long id){
        try{
            AutomovilModel aux = obtenerAutomovilPorId(id);
            automoviles.remove(aux);
        }catch (Exception e){
            System.out.println(e);
        }
    }

}
