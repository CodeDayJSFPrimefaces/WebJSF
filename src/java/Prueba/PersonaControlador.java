/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author ELIO
 */
@ManagedBean(name = "personaBean")
@ViewScoped
public class PersonaControlador {
    
    private String nombre="";
    
    private List<Persona> personas;
    
    private Persona persona;
    /**
     * Creates a new instance of PersonaControlador
     */
    public PersonaControlador()
    {
        personas = new ArrayList<Persona>();
        personas.add(new Persona("Percy","Gomez"));
        personas.add(new Persona("Luis","Lazo"));
        personas.add(new Persona("Jack","Tihu"));
    }
    
    public void ejecutar(){
        nombre+= nombre+" :D";
    }
    
    public void eliminar(String nombre)
    {
        personas.remove(0);
    }
    
    public void mostrar(){
        System.out.println(""+persona.toString());
    }

   
    
    /** GETTERS AND SETTERS **/
    
     public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    
    
}
