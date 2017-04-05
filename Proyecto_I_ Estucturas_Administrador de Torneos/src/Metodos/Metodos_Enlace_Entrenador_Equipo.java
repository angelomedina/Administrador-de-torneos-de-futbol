/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import Entidades.Enlace_Entrenador_Equipos;
import Entidades.Enlace_Torneo_Equipos;
import Entidades.Entrenadores;
import Entidades.Equipos;
import Entidades.Torneos;

/**
 *
 * @author Usuario
 */
public class Metodos_Enlace_Entrenador_Equipo {
   
    
    public String insertarEnlaceEntrenadorTorneo(String nombreEntrendor,String nombreEquipo,Equipos equipo,Entrenadores entrenador)
    {
        Entrenadores Entrenador =entrenador;
        Equipos   Equipo=equipo;
        
        if(Entrenador != null)
        {
            if(Equipo != null)
            {
                Enlace_Entrenador_Equipos sub=new Enlace_Entrenador_Equipos();
                sub.sigEquipo=Equipo;// este sub va vinculado con e torneo
                
                if(Entrenador.sigSub==null )
                {
                    Entrenador.sigSub=sub;
                    return "Enlazados";
                }
                sub.sig=Entrenador.sigSub;
                Entrenador.sigSub=sub;
                return "Enlazados";
            }
            else
            {
                return "la lista Equipos este vacia";
            }
            
        }
        else
        {
            return "la lista Entrenador este vacia";
        }
        
    }
    
}
