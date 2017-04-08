/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import javax.swing.ImageIcon;

/**
 *
 * @author Usuario
 */
public class Equipos {
    // esto es una lista circular doble
    public String nombre;
    public int    codigo; 
    public String nombreEntrenador;
    
    
    
    
    public Equipos sig,ant; 
    public Enlace_Torneo_Equipos sigSub; // es para vincular este equipo al torneo
    public Enlace_Jugador_Equipo sigSub1;
    
    public Equipos(String nombre,int codigo)
    {
        this.nombre=nombre;
        this.codigo=codigo;
        sig=ant=null;
    }

    public String getNombreEntrenador() {
        return nombreEntrenador;
    }

    public void setNombreEntrenador(String nombreEntrenador) {
        this.nombreEntrenador = nombreEntrenador;
    }
    
    
    
    
}
