package com.rest.demo.controllers;

import com.rest.demo.models.Personas;
import com.rest.demo.services.ServicePersonas;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import org.springframework.stereotype.Component;

import java.net.URI;
import java.util.List;

@Component
@Path("/")
public class PersonaController {
    private final ServicePersonas sPersonas;

    public PersonaController(ServicePersonas sPersonas) {
        this.sPersonas = sPersonas;
        this.sPersonas.setPersonas(new Personas("edwar",14296150));
        this.sPersonas.setPersonas(new Personas("euri",15531903));
    }

    @GET
    @Path("/personas")
    @Produces("application/json")
    public List<Personas> listar(){
        return this.sPersonas.getPersonas();
    }

    @GET
    @Path("/personas/{name}")
    @Produces("application/json")
    public Personas listaUno(@PathParam("name") String nom){
        return this.sPersonas.getPorName(nom);
    }

    @POST
    @Produces("application/json")
    @Consumes("application/json")
    public Response introducirPersona(Personas persona){
        sPersonas.setPersonas(persona);
        return Response.created(
                URI.create("/personas"+sPersonas.getPersonas())
        ).build();
    }
}
