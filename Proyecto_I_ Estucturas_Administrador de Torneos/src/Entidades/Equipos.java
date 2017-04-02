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
    public ImageIcon imagenCasa;
    public ImageIcon imagenVisita;
    
    public Equipos sig,ant; 
    public Enlace_Torneo_Euipos sigSub; // es para vincular este equipo al torneo
    
    public Equipos(String nombre,int codigo,ImageIcon ImagenCasa,ImageIcon ImagenVisita)
    {
        this.nombre=nombre;
        this.codigo=codigo;
        this.imagenCasa=ImagenCasa;
        this.imagenVisita=ImagenVisita;
        sig=ant=null;
    }
    
    
    
}
