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
public class Gol {
    public Gol siguiente; //Puntero al siguiente gol
    public Equipos equipoAnotador; //Puntero al equipo anotador
    public Jugadores anotador;  //Puntero al jugador anotador
    public Jugadores portero;  //Puntero al portero abatido

    public Gol(Equipos equipoAnotador, Jugadores anotador, Jugadores portero) {
        this.siguiente = null;
        this.equipoAnotador = equipoAnotador;
        this.anotador = anotador;
        this.portero = portero;
    }
    
    
}
