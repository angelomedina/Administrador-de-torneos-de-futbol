/*-
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;
import Entidades.*;
import Graficos.Interfaz_MenuPrincipal;

/**
 *
 * @author Usuario
 */
public class Metodos_Enlace_Torneo_Equipo {
    Torneos inicioT;
    Equipos inicioE;   
    public String insertarInicioEnlaceTorneoEquipo(String nombreTorneo,String nombreEquipo,Equipos equipo,Torneos torneo)
    {
        //Torneos Torneo=VerificaTorneo(nombreTorneo);
        //Equipos Equipo=VerificaEquipo(nombreEquipo);
        Torneos Torneo=torneo;
        Equipos Equipo=equipo;
        
        if(Torneo != null)
        {
            if(Equipo != null)
            {
                Enlace_Torneo_Euipos sub=new Enlace_Torneo_Euipos();
                sub.sigTorneo=Torneo;// este sub va vinculado con e torneo
                
                if(Equipo.sigSub ==null )
                {
                    Equipo.sigSub=sub;
                    return "Enlados";
                }
                sub.sig=Equipo.sigSub;
                Equipo.sigSub=sub;
                return "Enlazados";
                
                
                
                
            }
            return "No se enontro el Equipo";
        }
        return "No se encontro el Torneo";
        
        
        
        
    }
    
}
