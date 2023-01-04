package com.rest.demo.models;

public class Personas {
    private String nombre;
    private Integer id;
    public Personas() {}
    public Personas(String name, Integer id) {
        this.nombre = name;
        this.id = id;
    }
    public String getName() {return this.nombre;}
    public void setName(String nombre) {this.nombre = nombre;}
    public Integer getId() {return this.id;}
    public void setId(Integer id){this.id = id;}
}
