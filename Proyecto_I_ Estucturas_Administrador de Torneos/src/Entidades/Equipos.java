/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Usuario
 */
public class Equipos {
    // esto es una lista circular doble
    private String nombre;
    private int    codigo; 
    
    Equipos sig,ant;  
    
    public Equipos(String nombre,int codigo)
    {
        this.nombre=nombre;
        this.codigo=codigo;
        sig=ant=null;
    }
    
}
