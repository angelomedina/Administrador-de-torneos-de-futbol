/*-
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;
import Entidades.*;
import Graficos.Interfaz_Login;
import Graficos.Interfaz_MenuPrincipal;

/**
 *
 * @author Usuario
 */
public class Metodos_Enlace_Torneo_Equipo {
   
    public String insertarInicioEnlaceTorneoEquipo(String nombreTorneo,String nombreEquipo)
    {

        Torneos veri1=Interfaz_Login.enlaces.VerificaTorneo(nombreTorneo);
        Equipos veri2=Interfaz_Login.enlaces.VerificaEquipo(nombreEquipo);
        
        Torneos Torneo=veri1;
        Equipos Equipo=veri2;
        
        if(Torneo != null)
        {
            if(Equipo != null)
            {
                Enlace_Torneo_Equipos sub=new Enlace_Torneo_Equipos();
                sub.sigTorneo=Torneo;// este sub va vinculado con e torneo
                
                if(Equipo.sigSub ==null )
                {
                    Equipo.sigSub=sub;
                    return "Enlazados";
                }
                sub.sig=Equipo.sigSub;
                Equipo.sigSub=sub;
                return "Enlazados";           
            }
            else
            {
            return "No se enontro el Equipo";
            }
        }
        else
        {
        return "No se encontro el Torneo";
        }
        
        
        
    }
    
}
