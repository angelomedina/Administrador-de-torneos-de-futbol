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
import Graficos.Interfaz_Login;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Metodos_Enlace_Entrenador_Equipo {
   
    
    public String insertarEnlaceEntrenadorEquipo(String nombreEntrendor,String nombreEquipo)
    {
        Equipos veri1=Interfaz_Login.enlaces.VerificaEquipo(nombreEquipo);
        Entrenadores veri2=Interfaz_Login.metEn.Buscar(nombreEntrendor);
        boolean veri3=verificaEntrendorDEquipo(nombreEntrendor);
        
        if (veri3 == false)
        {
            
            Entrenadores Entrenador =veri2;
            Equipos   Equipo=veri1;

            if(Entrenador != null)
            {
                if(Equipo != null)
                {
                    Enlace_Entrenador_Equipos sub=new Enlace_Entrenador_Equipos();
                    sub.sigEquipo=Equipo;// este sub va vinculado con e torneo

                    if(Entrenador.sigSub==null )
                    {
                        Entrenador.sigSub=sub;
                        Equipo.setNombreEntrenador(nombreEntrendor);
                        //System.out.println(Equipo.nombreEntrenador);
                        return "Enlazados";
                    }
                    sub.sig=Entrenador.sigSub;
                    Entrenador.sigSub=sub;
                    Equipo.setNombreEntrenador(nombreEntrendor);
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
        else
        {
           return  "Solo puede haber un entrenador por equipo";
        }
    }
    
    public Entrenadores buscarEntrenador(String nombre)
    {
        if (Interfaz_Login.metEn.inicio==null) // pregunta si esta vacio
        {
            return null;
        }
        Entrenadores  aux = Interfaz_Login.metEn.inicio;
        
        while(aux !=Interfaz_Login.metEn.fin)
        {
            if (aux.getNombre().equals(nombre))// equals es solo para comparar string
            {
                return aux;           
            }
            aux =aux.sig;
        }
        if(Interfaz_Login.metEn.fin.getNombre().equals(nombre))
        {
            return Interfaz_Login.metEn.fin;
        }
        else
        {
        return null; 
        }
    }
    
    public boolean verificaEntrendorDEquipo(String nombre)
    {
        if (Interfaz_Login.metE.inicio==null)
        {
            return false;
        }
        if (Interfaz_Login.metE.inicio.nombreEntrenador != null)
        {
            if(Interfaz_Login.metE.inicio.nombreEntrenador.equals(nombre))
            {
                return true;
            }
        }
        
        Equipos  temp=Interfaz_Login.metE.inicio;
        
        while ( temp != Interfaz_Login.metE.fin)
        {
          if (temp.nombreEntrenador != null)  
          {
            if(Interfaz_Login.metE.inicio.nombreEntrenador.equals(nombre))
            {
                return true;
            }     
          }
          temp=temp.sig;
        }
        if(Interfaz_Login.metE.fin.nombreEntrenador != null)
        {
            if(Interfaz_Login.metE.fin.nombreEntrenador.equals(nombre))
            {
                return true;

            }
            return false;
        }
        return false;    
    }
    
    
}
