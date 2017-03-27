/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Admi
 */
public class Torneos {
    // torneo es una lista doble 
    
    public String nombre; 
    public Torneos sig,ant;  
    
    public Torneos(String nombre)
    {
        this.nombre=nombre;
        sig=ant=null;
    }
    
}
