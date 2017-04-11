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
public class Metodos_Enlace_Jugador_Equipo {
    
    
    public String enlazarEquipoJugador(String nombreEquipo,String nombreJugador)
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
                                    if(equipo.cant <= 9  ) 
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
                                    if(equipo.cant <= 9  ) 
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
                                    if(equipo.cant <= 9  ) 
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
                                    if(equipo.cant <= 9  ) 
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
    
    
}
