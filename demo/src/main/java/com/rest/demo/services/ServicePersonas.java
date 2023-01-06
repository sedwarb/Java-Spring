package com.rest.demo.services;

import com.rest.demo.models.Personas;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServicePersonas {
    private List<Personas> personas = new ArrayList();

    public List<Personas> getPersonas() {return personas;}

    public void setPersonas(Personas persona) {
        personas.add(persona);
    }

    public Personas getPorName(String name){
        for(Personas persona : personas){
            if(persona.getName().equalsIgnoreCase(name))return persona;
        }
        return null;
    }
    public Personas getPorId(Integer id){
        for(Personas persona : personas){
            if(persona.getId().equals(id))return persona;
        }
        return null;
    }
}
