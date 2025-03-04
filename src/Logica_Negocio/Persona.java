/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class Persona {
    public String id, nombre, apellido;
    public ArrayList <Producto> listaporductos;

    public Persona() {
    }

    public Persona(String id, String nombre, String apellido, ArrayList<Producto> listaporductos) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.listaporductos = listaporductos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ArrayList<Producto> getListaporductos() {
        return listaporductos;
    }

    public void setListaporductos(ArrayList<Producto> listaporductos) {
        this.listaporductos = listaporductos;
    }
    
    
}
