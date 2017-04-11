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
    public int    dinero= 3000000;
    
    public int cant; // cantidad de jugadores
    public int suma;
    
    
    //atributos condicionales:4 defensas, 4 medio campo, 2 delanteros y 1 portero.
    public int defensas;
    public int sumaDefensa=1;
    
    public int medioCampo;
    public int sumamedioCampo=1;
    
    public int delantero;
    public int sumaDelantero=1;
    
    public int portero;
    public int sumaPortero=1;

    
    
    
    public int getDefensas() {
        return defensas;
    }

    public void setDefensas(int defensas) {
        this.defensas = defensas;
    }

    public int getMedioCampo() {
        return medioCampo;
    }

    public void setMedioCampo(int medioCampo) {
        this.medioCampo = medioCampo;
    }

    public int getDelantero() {
        return delantero;
    }

    public void setDelantero(int delatero) {
        this.delantero = delatero;
    }

    public int getPortero() {
        return portero;
    }

    public void setPortero(int portero) {
        this.portero = portero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }
    
    
    
    

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }
    
    
    
    
    public Equipos sig,ant; 
    public Enlace_Torneo_Equipos sigSub; // es para vincular este equipo al torneo
    public Enlace_Jugador_Equipo sigSub1;
    
    public Equipos(String nombre,int codigo)
    {
        this.nombre=nombre;
        this.codigo=codigo;
        sig=ant=null;
        //
        
        
    }

    public String getNombreEntrenador() {
        return nombreEntrenador;
    }

    public void setNombreEntrenador(String nombreEntrenador) {
        this.nombreEntrenador = nombreEntrenador;
    }
    
    
    
    
}
