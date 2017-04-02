/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;
import Entidades.*;

/**
 *
 * @author Usuario
 */
public class Metodos_Enlace_Torneo_Equipo {
    Torneos inicioT;
    Equipos inicioE;
   
    public Torneos VerificaTorneo(String nombreTorneo)
    {
        if(inicioT == null )
        {
            return null;
        }
        Torneos aux=inicioT;
        while(aux != null)
        {
            if(aux.nombre.equals(nombreTorneo))
            {
               return aux;
            }
            aux=aux.sig;
        }
        return null;
    }
    
    public Equipos VerificaEquipo(String nombreEquipo)
    {
        if(inicioE == null)
        {
            return null;
        }
        
        if(inicioE.nombre.equals(nombreEquipo))
        {
            return inicioE;
        }
        
        Equipos temp=inicioE;
        Equipos aux =inicioE;
        while(aux.sig != temp)
        {
            if(aux.nombre.equals(nombreEquipo))
            {
                return aux;
            }
            aux=aux.sig;
        }
        return null;
    }
    
    public String insertarInicioEnlaceTorneoEquipo(String nombreTorneo,String nombreEquipo)
    {
        Torneos Torneo=VerificaTorneo(nombreTorneo);
        Equipos Equipo=VerificaEquipo(nombreEquipo);
        
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
