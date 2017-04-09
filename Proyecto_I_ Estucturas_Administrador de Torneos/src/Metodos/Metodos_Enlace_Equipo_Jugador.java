/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import Entidades.Enlace_Jugador_Equipo;
import Entidades.Equipos;
import Entidades.Jugadores;
import Graficos.Interfaz_Login;

/**
 *
 * @author Usuario
 */
public class Metodos_Enlace_Equipo_Jugador {
    
    public String enlazarEquipoJugador(String nombreEquipo,String nombreJugador)
    {
        Equipos equipo=Interfaz_Login.enlaces.VerificaEquipo(nombreEquipo);
        Jugadores jugador=Interfaz_Login.metJ.buscarSimple(nombreJugador);
        
        if(equipo != null && jugador != null)
        {
          Enlace_Jugador_Equipo sub=new Enlace_Jugador_Equipo();   
          sub.sigJugador=jugador;
          
          if(equipo.sigSub1 == null)
          {
              equipo.sigSub1=sub;
              return "Enlazados";
          }
          sub.sig=equipo.sigSub1;
          equipo.sigSub1=sub;
          return "Enlazados";
          
        }
        return "Error Equipo o Jugadores se encuantran vacios";
    }
    
    
}
