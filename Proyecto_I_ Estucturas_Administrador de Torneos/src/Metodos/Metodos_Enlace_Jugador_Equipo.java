/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import Entidades.Enlace_Entrenador_Equipos;
import Entidades.Enlace_Jugador_Equipo;
import Entidades.Enlace_Torneo_Equipos;
import Entidades.Equipos;
import Entidades.Jugadores;
import Entidades.Torneos;
import Graficos.Interfaz_Login;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class Metodos_Enlace_Jugador_Equipo {
   
     //public Enlace_Jugador_Equipo inicio;
    
    public String enlazarEquipoJugadorLibre(String nombreEquipo,String nombreJugador)
    {
        Equipos equipo=Interfaz_Login.enlaces.VerificaEquipo(nombreEquipo);
        Jugadores jugador=Interfaz_Login.metJ.buscarSimple(nombreJugador);
        
        int dineroEquipo=equipo.dinero;
     
        
        if(equipo != null && jugador != null)
        {
            if(jugador.getPosicion().equals("Portero"))
            {
                if(equipo.portero < 1)
                {
                   
                   
                                    Enlace_Jugador_Equipo sub=new Enlace_Jugador_Equipo();   
                                    sub.sigJugador=jugador;

                                    if(equipo.sigSub1 == null)
                                    {

                                      if (sub.sigJugador.getValor() < dineroEquipo)
                                      {  

                                          if(sub.sigJugador.getEstado().equals("Disponibe"))
                                          {
                                          //
                                          equipo.dinero=(int) (equipo.dinero-sub.sigJugador.getValor()); // aqui descuento el deinero del equipo
                                          Interfaz_Login.enlaceJE.jLabel6.setText(Integer.toString(equipo.dinero));
                                          //
                                          equipo.sigSub1=sub;
                                          //
                                          equipo.setCant(equipo.suma++);// sumo la cantidad de jugadores al equipo maximo 11
                                          //System.out.println(equipo.cant);
                                          //
                                          //cambio el estado del jugador
                                          sub.sigJugador.setEstado("No disponible");
                                          //
                                          equipo.setPortero(equipo.sumaPortero++); // sumo la cantidad de porteros
                                          //
                                           //
                                          Interfaz_Login.traspaso.jLabel4.setText(Integer.toString(equipo.dinero));// actualizo el dinero
                                          //
                                          return "Enlazados";  
                                          }
                                          else
                                          {
                                              return "El jugador no se encuentra disponible";
                                          }
                                      }
                                      else
                                      {
                                          return "No tiene suficiente deinero para compara este jugador";
                                      }

                                    }
                                    if(equipo.cant <= 11 ) 
                                    {

                                      if (sub.sigJugador.getValor() < dineroEquipo)
                                      {   
                                          if(sub.sigJugador.getEstado().equals("Disponibe"))
                                          {
                                          //
                                          equipo.dinero=(int) (equipo.dinero-sub.sigJugador.getValor()); // aqui descuento el deinero del equipo
                                          Interfaz_Login.enlaceJE.jLabel6.setText(Integer.toString(equipo.dinero));
                                          //  
                                          sub.sig=equipo.sigSub1;
                                          equipo.sigSub1=sub;
                                          //
                                          equipo.setCant(equipo.suma++);// sumo la cantidad de jugadores al equipo maximo 11
                                          //System.out.println(equipo.cant);
                                          //
                                          //cambio el estado del jugador
                                          sub.sigJugador.setEstado("No disponible");
                                          //
                                          equipo.setPortero(equipo.sumaPortero++); // sumo la cantidad de porteros
                                          //
                                           //
                                          Interfaz_Login.traspaso.jLabel4.setText(Integer.toString(equipo.dinero));// actualizo el dinero
                                          //
                                           return "Enlazados";
                                          }
                                          else
                                          {
                                              return "El jugador no se encuentra disponible";
                                          }
                                      }
                                      else
                                      {
                                          return "No tiene suficiente deinero para compara este jugador";
                                      }
                                    }     
                                    else
                                    {
                                        return "El equipo ya tiene los 11 jugadores";
                                    }

                }
                else
                {
                    return "solo se puede comprar 1 portero";
                }
            }
            
            if(jugador.getPosicion().equals("Defensa"))
            {
                if(equipo.defensas < 4)
                {
                   
                   
                                    Enlace_Jugador_Equipo sub=new Enlace_Jugador_Equipo();   
                                    sub.sigJugador=jugador;

                                    if(equipo.sigSub1 == null)
                                    {

                                      if (sub.sigJugador.getValor() < dineroEquipo)
                                      {  

                                          if(sub.sigJugador.getEstado().equals("Disponibe"))
                                          {
                                          //
                                          equipo.dinero=(int) (equipo.dinero-sub.sigJugador.getValor()); // aqui descuento el deinero del equipo
                                          Interfaz_Login.enlaceJE.jLabel6.setText(Integer.toString(equipo.dinero));
                                          //
                                          equipo.sigSub1=sub;
                                          //
                                          equipo.setCant(equipo.suma++);// sumo la cantidad de jugadores al equipo maximo 11
                                          //System.out.println(equipo.cant);
                                          //
                                          //cambio el estado del jugador
                                          sub.sigJugador.setEstado("No disponible");
                                          //
                                          equipo.setDefensas(equipo.sumaDefensa++);//sumo la cantidad de defensas 
                                          //
                                           //
                                          Interfaz_Login.traspaso.jLabel4.setText(Integer.toString(equipo.dinero));// actualizo el dinero
                                          //
                                          return "Enlazados";  
                                          }
                                          else
                                          {
                                              return "El jugador no se encuentra disponible";
                                          }
                                      }
                                      else
                                      {
                                          return "No tiene suficiente deinero para compara este jugador";
                                      }

                                    }
                                    if(equipo.cant <= 11  ) 
                                    {

                                      if (sub.sigJugador.getValor() < dineroEquipo)
                                      {   
                                          if(sub.sigJugador.getEstado().equals("Disponibe"))
                                          {
                                          //
                                          equipo.dinero=(int) (equipo.dinero-sub.sigJugador.getValor()); // aqui descuento el deinero del equipo
                                          Interfaz_Login.enlaceJE.jLabel6.setText(Integer.toString(equipo.dinero));
                                          //  
                                          sub.sig=equipo.sigSub1;
                                          equipo.sigSub1=sub;
                                          //
                                          equipo.setCant(equipo.suma++);// sumo la cantidad de jugadores al equipo maximo 11
                                          //System.out.println(equipo.cant);
                                          //
                                          //cambio el estado del jugador
                                          sub.sigJugador.setEstado("No disponible");
                                          //
                                          equipo.setDefensas(equipo.sumaDefensa++);//sumo la cantidad de defensas 
                                          //
                                           //
                                          Interfaz_Login.traspaso.jLabel4.setText(Integer.toString(equipo.dinero));// actualizo el dinero
                                          //
                                           return "Enlazados";
                                          }
                                          else
                                          {
                                              return "El jugador no se encuentra disponible";
                                          }
                                      }
                                      else
                                      {
                                          return "No tiene suficiente deinero para compara este jugador";
                                      }
                                    }     
                                    else
                                    {
                                        return "El equipo ya tiene los 11 jugadores";
                                    }
                   
                   
                }
                else
                {
                    return "solo se puede comprar 4 defensas";
                }
            }
            
            if(jugador.getPosicion().equals("Medio Campo"))
            {
                if(equipo.medioCampo < 4)
                {

                   
                                    Enlace_Jugador_Equipo sub=new Enlace_Jugador_Equipo();   
                                    sub.sigJugador=jugador;

                                    if(equipo.sigSub1 == null)
                                    {

                                      if (sub.sigJugador.getValor() < dineroEquipo)
                                      {  

                                          if(sub.sigJugador.getEstado().equals("Disponibe"))
                                          {
                                          //
                                          equipo.dinero=(int) (equipo.dinero-sub.sigJugador.getValor()); // aqui descuento el deinero del equipo
                                          Interfaz_Login.enlaceJE.jLabel6.setText(Integer.toString(equipo.dinero));
                                          //
                                          equipo.sigSub1=sub;
                                          //
                                          equipo.setCant(equipo.suma++);// sumo la cantidad de jugadores al equipo maximo 11
                                          //System.out.println(equipo.cant);
                                          //
                                          //cambio el estado del jugador
                                          sub.sigJugador.setEstado("No disponible");
                                          //
                                          
                                          equipo.setMedioCampo(equipo.sumamedioCampo++);// sumo la cantidad de medio campo
                                          //
                                           //
                                          Interfaz_Login.traspaso.jLabel4.setText(Integer.toString(equipo.dinero));// actualizo el dinero
                                          //
                                          return "Enlazados";  
                                          }
                                          else
                                          {
                                              return "El jugador no se encuentra disponible";
                                          }
                                      }
                                      else
                                      {
                                          return "No tiene suficiente deinero para compara este jugador";
                                      }

                                    }
                                    if(equipo.cant <= 11  ) 
                                    {

                                      if (sub.sigJugador.getValor() < dineroEquipo)
                                      {   
                                          if(sub.sigJugador.getEstado().equals("Disponibe"))
                                          {
                                          //
                                          equipo.dinero=(int) (equipo.dinero-sub.sigJugador.getValor()); // aqui descuento el deinero del equipo
                                          Interfaz_Login.enlaceJE.jLabel6.setText(Integer.toString(equipo.dinero));
                                          //  
                                          sub.sig=equipo.sigSub1;
                                          equipo.sigSub1=sub;
                                          //
                                          equipo.setCant(equipo.suma++);// sumo la cantidad de jugadores al equipo maximo 11
                                          //System.out.println(equipo.cant);
                                          //
                                          //cambio el estado del jugador
                                          sub.sigJugador.setEstado("No disponible");
                                          //
                                          
                                          equipo.setMedioCampo(equipo.sumamedioCampo++);// sumo la cantidad de medio campo
                                          
                                          //
                                           //
                                          Interfaz_Login.traspaso.jLabel4.setText(Integer.toString(equipo.dinero));// actualizo el dinero
                                          //
                                           return "Enlazados";
                                          }
                                          else
                                          {
                                              return "El jugador no se encuentra disponible";
                                          }
                                      }
                                      else
                                      {
                                          return "No tiene suficiente deinero para compara este jugador";
                                      }
                                    }     
                                    else
                                    {
                                        return "El equipo ya tiene los 11 jugadores";
                                    }
                }
                else
                {
                    return "solo se puede comprar 4 Medios Campos";
                }
            }
            
            if(jugador.getPosicion().equals("Delantero"))
            {
                if(equipo.delantero < 2)
                {

                                    
                                    Enlace_Jugador_Equipo sub=new Enlace_Jugador_Equipo();   
                                    sub.sigJugador=jugador;

                                    if(equipo.sigSub1 == null)
                                    {

                                      if (sub.sigJugador.getValor() < dineroEquipo)
                                      {  

                                          if(sub.sigJugador.getEstado().equals("Disponibe"))
                                          {
                                          //
                                          equipo.dinero=(int) (equipo.dinero-sub.sigJugador.getValor()); // aqui descuento el deinero del equipo
                                          Interfaz_Login.enlaceJE.jLabel6.setText(Integer.toString(equipo.dinero));
                                          //
                                          equipo.sigSub1=sub;
                                          //
                                          equipo.setCant(equipo.suma++);// sumo la cantidad de jugadores al equipo maximo 11
                                          //System.out.println(equipo.cant);
                                          //
                                          //cambio el estado del jugador
                                          sub.sigJugador.setEstado("No disponible");
                                          //
                                          equipo.setDelantero(equipo.sumaDelantero++); //sumo la cantidad de delanteros
                                          //
                                           //
                                          Interfaz_Login.traspaso.jLabel4.setText(Integer.toString(equipo.dinero));// actualizo el dinero
                                          //
                                          return "Enlazados";  
                                          }
                                          else
                                          {
                                              return "El jugador no se encuentra disponible";
                                          }
                                      }
                                      else
                                      {
                                          return "No tiene suficiente deinero para compara este jugador";
                                      }

                                    }
                                    if(equipo.cant <= 11 ) 
                                    {

                                      if (sub.sigJugador.getValor() < dineroEquipo)
                                      {   
                                          if(sub.sigJugador.getEstado().equals("Disponibe"))
                                          {
                                          //
                                          equipo.dinero=(int) (equipo.dinero-sub.sigJugador.getValor()); // aqui descuento el deinero del equipo
                                          Interfaz_Login.enlaceJE.jLabel6.setText(Integer.toString(equipo.dinero));
                                          //  
                                          sub.sig=equipo.sigSub1;
                                          equipo.sigSub1=sub;
                                          //
                                          equipo.setCant(equipo.suma++);// sumo la cantidad de jugadores al equipo maximo 11
                                          //System.out.println(equipo.cant);
                                          //
                                          //cambio el estado del jugador
                                          sub.sigJugador.setEstado("No disponible");
                                          //
                                          equipo.setDelantero(equipo.sumaDelantero++); //sumo la cantidad de delanteros
                                          //
                                           //
                                          Interfaz_Login.traspaso.jLabel4.setText(Integer.toString(equipo.dinero));// actualizo el dinero
                                          //
                                           return "Enlazados";
                                          }
                                          else
                                          {
                                              return "El jugador no se encuentra disponible";
                                          }
                                      }
                                      else
                                      {
                                          return "No tiene suficiente deinero para compara este jugador";
                                      }
                                    }     
                                    else
                                    {
                                        return "El equipo ya tiene los 11 jugadores";
                                    }
                }
                else
                {
                    return "solo se puede comprar 2 delanteros";
                }
            }
            
        }
        return "Error Equipo o Jugadores se encuantran vacios";
    }
    
    
    public String enlazarEquipoJugadorTraspaso(String nombreEquipo,String nombreJugador, Equipos equipoAnterior)
    {
        Equipos equipo=Interfaz_Login.enlaces.VerificaEquipo(nombreEquipo);
        Jugadores jugador=Interfaz_Login.metJ.buscarSimple(nombreJugador);
        
        int dineroEquipo=equipo.dinero;
     
        
        if(equipo != null && jugador != null)
        {
            if(jugador.getPosicion().equals("Portero"))
            {
                if(equipo.portero < 1)
                {
                   
                   
                                    Enlace_Jugador_Equipo sub=new Enlace_Jugador_Equipo();   
                                    sub.sigJugador=jugador;

                                    if(equipo.sigSub1 == null)
                                    {

                                      if (sub.sigJugador.getValor() < dineroEquipo)
                                      {  

                                          if(sub.sigJugador.getEstado().equals("En Venta"))
                                          {
                                          //
                                          equipo.dinero=(int) (equipo.dinero-sub.sigJugador.getValor()); // aqui descuento el deinero del equipo
                                          Interfaz_Login.enlaceJE.jLabel6.setText(Integer.toString(equipo.dinero));
                                          //
                                          equipo.sigSub1=sub;
                                          //
                                          equipo.setCant(equipo.suma++);// sumo la cantidad de jugadores al equipo maximo 11
                                          //System.out.println(equipo.cant);
                                          //
                                          //cambio el estado del jugador
                                          sub.sigJugador.setEstado("No disponible");
                                          //
                                          equipo.setPortero(equipo.sumaPortero++); // sumo la cantidad de porteros
                                          //
                                          //le debo restar una poscicion al equipo anterior
                                          equipoAnterior.setPortero(equipo.sumaPortero-2);
                                          //
                                          Interfaz_Login.traspaso.jLabel4.setText(Integer.toString(equipo.dinero));// actualizo el dinero
                                          //
                                          return "Enlazados";  
                                          }
                                          else
                                          {
                                              return "El jugador no se encuentra disponible";
                                          }
                                      }
                                      else
                                      {
                                          return "No tiene suficiente deinero para compara este jugador";
                                      }

                                    }
                                    if(equipo.cant <= 11 ) 
                                    {

                                      if (sub.sigJugador.getValor() < dineroEquipo)
                                      {   
                                          if(sub.sigJugador.getEstado().equals("En Venta"))
                                          {
                                          //
                                          equipo.dinero=(int) (equipo.dinero-sub.sigJugador.getValor()); // aqui descuento el deinero del equipo
                                          Interfaz_Login.enlaceJE.jLabel6.setText(Integer.toString(equipo.dinero));
                                          //  
                                          sub.sig=equipo.sigSub1;
                                          equipo.sigSub1=sub;
                                          //
                                          equipo.setCant(equipo.suma++);// sumo la cantidad de jugadores al equipo maximo 11
                                          //System.out.println(equipo.cant);
                                          //
                                          //cambio el estado del jugador
                                          sub.sigJugador.setEstado("No disponible");
                                          //
                                          equipo.setPortero(equipo.sumaPortero++); // sumo la cantidad de porteros
                                          //
                                          //le debo restar una poscicion al equipo anterior
                                          equipoAnterior.setPortero(equipo.sumaPortero-2);
                                          //
                                          Interfaz_Login.traspaso.jLabel4.setText(Integer.toString(equipo.dinero));// actualizo el dinero
                                          //
                                           return "Enlazados";
                                          }
                                          else
                                          {
                                              return "El jugador no se encuentra disponible";
                                          }
                                      }
                                      else
                                      {
                                          return "No tiene suficiente deinero para compara este jugador";
                                      }
                                    }     
                                    else
                                    {
                                        return "El equipo ya tiene los 11 jugadores";
                                    }

                }
                else
                {
                    return "solo se puede comprar 1 portero";
                }
            }
            
            if(jugador.getPosicion().equals("Defensa"))
            {
                if(equipo.defensas < 4)
                {
                   
                   
                                    Enlace_Jugador_Equipo sub=new Enlace_Jugador_Equipo();   
                                    sub.sigJugador=jugador;

                                    if(equipo.sigSub1 == null)
                                    {

                                      if (sub.sigJugador.getValor() < dineroEquipo)
                                      {  

                                          if(sub.sigJugador.getEstado().equals("En Venta"))
                                          {
                                          //
                                          equipo.dinero=(int) (equipo.dinero-sub.sigJugador.getValor()); // aqui descuento el deinero del equipo
                                          Interfaz_Login.enlaceJE.jLabel6.setText(Integer.toString(equipo.dinero));
                                          //
                                          equipo.sigSub1=sub;
                                          //
                                          equipo.setCant(equipo.suma++);// sumo la cantidad de jugadores al equipo maximo 11
                                          //System.out.println(equipo.cant);
                                          //
                                          //cambio el estado del jugador
                                          sub.sigJugador.setEstado("No disponible");
                                          //
                                          equipo.setDefensas(equipo.sumaDefensa++);//sumo la cantidad de defensas 
                                          //
                                          //le debo restar una poscicion al equipo anterior
                                          equipoAnterior.setDefensas(equipo.sumaDefensa--);
                                          //
                                          //
                                          Interfaz_Login.traspaso.jLabel4.setText(Integer.toString(equipo.dinero));// actualizo el dinero
                                          //
                                          //
                                          return "Enlazados";  
                                          }
                                          else
                                          {
                                              return "El jugador no se encuentra disponible";
                                          }
                                      }
                                      else
                                      {
                                          return "No tiene suficiente deinero para compara este jugador";
                                      }

                                    }
                                    if(equipo.cant <= 11 ) 
                                    {

                                      if (sub.sigJugador.getValor() < dineroEquipo)
                                      {   
                                          if(sub.sigJugador.getEstado().equals("En Venta"))
                                          {
                                          //
                                          equipo.dinero=(int) (equipo.dinero-sub.sigJugador.getValor()); // aqui descuento el deinero del equipo
                                          Interfaz_Login.enlaceJE.jLabel6.setText(Integer.toString(equipo.dinero));
                                          //  
                                          sub.sig=equipo.sigSub1;
                                          equipo.sigSub1=sub;
                                          //
                                          equipo.setCant(equipo.suma++);// sumo la cantidad de jugadores al equipo maximo 11
                                          //System.out.println(equipo.cant);
                                          //
                                          //cambio el estado del jugador
                                          sub.sigJugador.setEstado("No disponible");
                                          //
                                          equipo.setDefensas(equipo.sumaDefensa++);//sumo la cantidad de defensas 
                                          //
                                          //le debo restar una poscicion al equipo anterior
                                          equipoAnterior.setDefensas(equipo.sumaDefensa--);
                                          //
                                          //
                                          Interfaz_Login.traspaso.jLabel4.setText(Integer.toString(equipo.dinero));// actualizo el dinero
                                          //
                                           return "Enlazados";
                                          }
                                          else
                                          {
                                              return "El jugador no se encuentra disponible";
                                          }
                                      }
                                      else
                                      {
                                          return "No tiene suficiente deinero para compara este jugador";
                                      }
                                    }     
                                    else
                                    {
                                        return "El equipo ya tiene los 11 jugadores";
                                    }
                   
                   
                }
                else
                {
                    return "solo se puede comprar 4 defensas";
                }
            }
            
            if(jugador.getPosicion().equals("Medio Campo"))
            {
                if(equipo.medioCampo < 4)
                {

                   
                                    Enlace_Jugador_Equipo sub=new Enlace_Jugador_Equipo();   
                                    sub.sigJugador=jugador;

                                    if(equipo.sigSub1 == null)
                                    {

                                      if (sub.sigJugador.getValor() < dineroEquipo)
                                      {  

                                          if(sub.sigJugador.getEstado().equals("En Venta"))
                                          {
                                          //
                                          equipo.dinero=(int) (equipo.dinero-sub.sigJugador.getValor()); // aqui descuento el deinero del equipo
                                          Interfaz_Login.enlaceJE.jLabel6.setText(Integer.toString(equipo.dinero));
                                          //
                                          equipo.sigSub1=sub;
                                          //
                                          equipo.setCant(equipo.suma++);// sumo la cantidad de jugadores al equipo maximo 11
                                          //System.out.println(equipo.cant);
                                          //
                                          //cambio el estado del jugador
                                          sub.sigJugador.setEstado("No disponible");
                                          //
                                          
                                          equipo.setMedioCampo(equipo.sumamedioCampo++);// sumo la cantidad de medio campo
                                          //
                                          //le debo restar una poscicion al equipo anterior
                                          equipoAnterior.setMedioCampo(equipo.sumamedioCampo--);
                                          //
                                          //
                                          Interfaz_Login.traspaso.jLabel4.setText(Integer.toString(equipo.dinero));// actualizo el dinero
                                          //
                                          return "Enlazados";  
                                          }
                                          else
                                          {
                                              return "El jugador no se encuentra disponible";
                                          }
                                      }
                                      else
                                      {
                                          return "No tiene suficiente deinero para compara este jugador";
                                      }

                                    }
                                    if(equipo.cant <= 11 ) 
                                    {

                                      if (sub.sigJugador.getValor() < dineroEquipo)
                                      {   
                                          if(sub.sigJugador.getEstado().equals("En Venta"))
                                          {
                                          //
                                          equipo.dinero=(int) (equipo.dinero-sub.sigJugador.getValor()); // aqui descuento el deinero del equipo
                                          Interfaz_Login.enlaceJE.jLabel6.setText(Integer.toString(equipo.dinero));
                                          //  
                                          sub.sig=equipo.sigSub1;
                                          equipo.sigSub1=sub;
                                          //
                                          equipo.setCant(equipo.suma++);// sumo la cantidad de jugadores al equipo maximo 11
                                          //System.out.println(equipo.cant);
                                          //
                                          //cambio el estado del jugador
                                          sub.sigJugador.setEstado("No disponible");
                                          //
                                          
                                          equipo.setMedioCampo(equipo.sumamedioCampo++);// sumo la cantidad de medio campo
                                          
                                          //
                                          //le debo restar una poscicion al equipo anterior
                                          equipoAnterior.setMedioCampo(equipo.sumamedioCampo--);
                                          //
                                          //
                                          Interfaz_Login.traspaso.jLabel4.setText(Integer.toString(equipo.dinero));// actualizo el dinero
                                          //
                                           return "Enlazados";
                                          }
                                          else
                                          {
                                              return "El jugador no se encuentra disponible";
                                          }
                                      }
                                      else
                                      {
                                          return "No tiene suficiente deinero para compara este jugador";
                                      }
                                    }     
                                    else
                                    {
                                        return "El equipo ya tiene los 11 jugadores";
                                    }
                }
                else
                {
                    return "solo se puede comprar 4 Medios Campos";
                }
            }
            
            if(jugador.getPosicion().equals("Delantero"))
            {
                if(equipo.delantero < 2)
                {

                                    
                                    Enlace_Jugador_Equipo sub=new Enlace_Jugador_Equipo();   
                                    sub.sigJugador=jugador;

                                    if(equipo.sigSub1 == null)
                                    {

                                      if (sub.sigJugador.getValor() < dineroEquipo)
                                      {  

                                          if(sub.sigJugador.getEstado().equals("En Venta"))
                                          {
                                          //
                                          equipo.dinero=(int) (equipo.dinero-sub.sigJugador.getValor()); // aqui descuento el deinero del equipo
                                          Interfaz_Login.enlaceJE.jLabel6.setText(Integer.toString(equipo.dinero));
                                          //
                                          equipo.sigSub1=sub;
                                          //
                                          equipo.setCant(equipo.suma++);// sumo la cantidad de jugadores al equipo maximo 11
                                          //System.out.println(equipo.cant);
                                          //
                                          //cambio el estado del jugador
                                          sub.sigJugador.setEstado("No disponible");
                                          //
                                          equipo.setDelantero(equipo.sumaDelantero++); //sumo la cantidad de delanteros
                                          //
                                          //le debo restar una poscicion al equipo anterior
                                          equipoAnterior.setDelantero(equipo.delantero--);
                                          //
                                          //
                                          Interfaz_Login.traspaso.jLabel4.setText(Integer.toString(equipo.dinero));// actualizo el dinero
                                          //
                                          return "Enlazados";  
                                          }
                                          else
                                          {
                                              return "El jugador no se encuentra disponible";
                                          }
                                      }
                                      else
                                      {
                                          return "No tiene suficiente deinero para compara este jugador";
                                      }

                                    }
                                    if(equipo.cant <= 11 ) 
                                    {

                                      if (sub.sigJugador.getValor() < dineroEquipo)
                                      {   
                                          if(sub.sigJugador.getEstado().equals("En Venta"))
                                          {
                                          //
                                          equipo.dinero=(int) (equipo.dinero-sub.sigJugador.getValor()); // aqui descuento el deinero del equipo
                                          Interfaz_Login.enlaceJE.jLabel6.setText(Integer.toString(equipo.dinero));
                                          //  
                                          sub.sig=equipo.sigSub1;
                                          equipo.sigSub1=sub;
                                          //
                                          equipo.setCant(equipo.suma++);// sumo la cantidad de jugadores al equipo maximo 11
                                          //System.out.println(equipo.cant);
                                          //
                                          //cambio el estado del jugador
                                          sub.sigJugador.setEstado("No disponible");
                                          //
                                          equipo.setDelantero(equipo.sumaDelantero++); //sumo la cantidad de delanteros
                                          //
                                          //le debo restar una poscicion al equipo anterior
                                          equipoAnterior.setDelantero(equipo.delantero--);
                                          //
                                          //
                                          Interfaz_Login.traspaso.jLabel4.setText(Integer.toString(equipo.dinero));// actualizo el dinero
                                          //
                                           return "Enlazados";
                                          }
                                          else
                                          {
                                              return "El jugador no se encuentra disponible";
                                          }
                                      }
                                      else
                                      {
                                          return "No tiene suficiente deinero para compara este jugador";
                                      }
                                    }     
                                    else
                                    {
                                        return "El equipo ya tiene los 11 jugadores";
                                    }
                }
                else
                {
                    return "solo se puede comprar 2 delanteros";
                }
            }
            
        }
        return "Error Equipo o Jugadores se encuantran vacios";
    }
    
    
    
    public String eliminarEnlaceJE(String nombreJugador,Equipos equipo)
    {
        
        Enlace_Jugador_Equipo aux= equipo.sigSub1;
        Enlace_Jugador_Equipo ant= equipo.sigSub1;
        
        if(aux == null)
        {
            return "Vacio";
        }
        
        if(aux.sig == null)
        {
            if(aux.sigJugador.getNombre().equals(nombreJugador))
            {
               aux.sigJugador=null;
               equipo.sigSub1=null;
               return "Eliminado";

            }
        }

        while (aux != null )
        {
            if(aux.sigJugador.getNombre().equals(nombreJugador))
            {
                ant.sig=aux.sig;
                
                return "Eliminado";
                
            }
            ant=aux;
            aux=aux.sig;
        }
        return "No se logro Eliminar";
       
    }
    
    
    public String despedirJugador(String nombreJugador,String  nombreEquipo)
    {
           boolean verifica=verificaEquipoEnTorneo(nombreEquipo);
           
           if(verifica == false)
           {
               Equipos equipo=Interfaz_Login.metVenta.returnEquipo(nombreJugador);
               Jugadores jugador=Interfaz_Login.metVenta.returnJugador(nombreJugador);
               
               
               String  eliminaJugador=eliminarEnlaceJE(nombreJugador, equipo);
               if(eliminaJugador.equals("Eliminado"))
               {
                   if(jugador.getPosicion().equals("Portero"))
                   {
                        equipo.setPortero(equipo.sumaPortero-2);
                        jugador.setEstado("Disponibe");
                        return "El Jugador se a despedido";
                   }
                   
                   if(jugador.getPosicion().equals("Defensa"))
                   {
                        equipo.setDefensas(equipo.sumaDefensa--);
                        jugador.setEstado("Disponibe");
                        return "El Jugador se a despedido";
                   }
                   
                   if(jugador.getPosicion().equals("Medio Campo"))
                   {
                        equipo.setMedioCampo(equipo.sumamedioCampo--);
                        jugador.setEstado("Disponibe");
                        return "El Jugador se a despedido";
                   }
                   if(jugador.getPosicion().equals("Delantero"))
                   {
                        equipo.setDelantero(equipo.sumaDelantero--);
                        jugador.setEstado("Disponibe");
                        return "El Jugador se a despedido";
                   }
               }
               else
               {
                  return "No se logro despedir"; 
               }
           }
           return  "no se puede eliminar porque el equipo esta en un torneo";
       
    }
    
    
    public boolean verificaEquipoEnTorneo(String nombreEquipo)  
    {
  
        if (Interfaz_Login.metE.inicio==null)
        {
            return false;
        }
        
        else
        {          
            Torneos torneo = Interfaz_Login.metT.inicio;    // entro a los Torneo
            while(  torneo != null)
            { 
              Equipos equipo = Interfaz_Login.metE.inicio;
              if(equipo==null)
              {
                return false;
              }
              else
              {
 
                while(equipo != Interfaz_Login.metE.fin)
                {
                    Enlace_Torneo_Equipos  enlace =equipo.sigSub;
                    while(enlace != null)
                    {
                        if(enlace.sigTorneo==torneo)
                        {
                            if(equipo.getNombre().equals(nombreEquipo))
                            {
                                return true;
                            }
 
                        }
                        enlace=enlace.sig; // avanzo con los enlces

                    }
                    equipo=equipo.sig;
                }
                if(Interfaz_Login.metE.fin.sigSub.sigTorneo==torneo)
                {
                        if(equipo.getNombre().equals(nombreEquipo))
                        {
                            return true;
                        }
                }
                
              }
              torneo=torneo.sig;
            }
            return false;
            
        }
    }
 
    
}
