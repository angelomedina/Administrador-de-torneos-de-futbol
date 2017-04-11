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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class Metodos_Entrenador_Venta {
    
    
    
    public String ponerEnVenta(String nombreJugador)
    {
        String nombreEquipo=Interfaz_Login.userEntrenador.jLabel4.getText();
        
        
        if (Interfaz_Login.metE.inicio==Interfaz_Login.metE.inicio.sig && Interfaz_Login.metE.inicio.nombre.equals(nombreEquipo) )
        {
          //Tabla para Equipos
          if(Interfaz_Login.metE.inicio.sigSub1 != null)
          {
              
            Enlace_Jugador_Equipo  sub=Interfaz_Login.metE.inicio.sigSub1;
            while(sub != null) 
            { 
            
                if(Interfaz_Login.metE.inicio.sigSub1.sigJugador.getNombre().equals(nombreJugador))
                {
                    Interfaz_Login.metE.inicio.sigSub1.sigJugador.setEstado("En Venta");
                    return "En Venta";
                }
                sub=sub.sig;
            }
          }
        }
        else
        {
            Equipos temp = Interfaz_Login.metE.inicio;
            Equipos aux = Interfaz_Login.metE.inicio;
            
            while(aux.sig != temp)
            {
               //Tabla para Equipos
                if(aux.sigSub1 != null && aux.nombre.equals(nombreEquipo))
                {
                    Enlace_Jugador_Equipo  sub=aux.sigSub1;
                    while(sub != null) 
                    { 
                        if(sub.sigJugador.getNombre().equals(nombreJugador))
                        {
                            sub.sigJugador.setEstado("En Venta");
                            return "En Venta";
                        }
                        sub=sub.sig;
                    }
                }
                aux=aux.sig;
            }
            if(aux.sigSub1 != null && aux.nombre.equals(nombreEquipo))
            {
                   Enlace_Jugador_Equipo  sub=aux.sigSub1;
                    while(sub != null) 
                    { 
                      if(sub.sigJugador.getNombre().equals(nombreJugador))
                        {
                            sub.sigJugador.setEstado("En Venta");
                            return "En Venta";
                        }
                        sub=sub.sig;
                    }
            }
        }
        return "No se encontro el jugador";
    }
   
    
  
    public String comprarVenta(String nombreJugador)
    {
       
    
        //variables de respaldo
        Jugadores jugador=returnJugador(nombreJugador);
        
        if(jugador != null )
        {
                if(jugador.getEstado().equals("En Venta"))
                {
                    //esta es la informacion para equipo y jugador en venta
                    Equipos EquipoAnterior=returnEquipo(nombreJugador);
                    String  equipoVenta=returnEquipo(nombreJugador).getNombre();
                    int     valorJugadorVenta=(int) returnJugador(nombreJugador).getValor();
                    String  posicionJugador=returnJugador(nombreJugador).getPosicion();

                    //esta es la informacion para equipo en compra

                    String equipoCompra=Interfaz_Login.userEntrenador.jLabel4.getText();
                    Equipos EquipoNuevo=Interfaz_Login.metE.buscarEquipo(equipoCompra);
                    int    dineroEquipoCompra=Integer.parseInt(Interfaz_Login.traspaso.jLabel4.getText());
                    //

                    // 1. Verifico si tengo el dinero suficiente para comprar el jugador
                    // 2. Verifico si tengo espacios y posiciones disponibles para comprar el jugador
                    // 3. Elimino del equipo anterior
                    // 4. Sumo el precio del jugador al equipo anterior
                    // 5. Resto el precio del jugador  a mi equipo
                    // 6.Enlazo a mi equipo
                    // 7.Cambio de estado el jugador

                    if(valorJugadorVenta < dineroEquipoCompra)   // paso 1
                    {
                        Equipos equipo=Interfaz_Login.metE.buscarEquipo(equipoCompra);
                        int  cantidadPirtero=equipo.getPortero();
                        int  cantidadDefensa=equipo.getDefensas();
                        int  cantidadMedio=equipo.getMedioCampo();
                        int  cantidadDelantero=equipo.sumaDelantero;
                        int  suma=cantidadPirtero+cantidadDefensa+cantidadMedio+cantidadDelantero;

                        if( suma < 11 )                        // paso 2
                        {
                            String elimina=Interfaz_Login.metJE.eliminarEnlaceJE(nombreJugador,EquipoAnterior);

                            if(elimina.equals("Eliminado"))   // paso 3
                            {
                                EquipoAnterior.setDinero(EquipoAnterior.dinero+valorJugadorVenta); //paso 4

                                EquipoNuevo.setDinero(EquipoNuevo.dinero-valorJugadorVenta);     //paso 5

                                String enlace= Interfaz_Login.metJE.enlazarEquipoJugadorTraspaso(equipoCompra, nombreJugador,EquipoAnterior); // paso 6

                                if(enlace.equals("Enlazados"))
                                {
                                    jugador.setEstado("No disponible"); //paso 7

                                    return "Su compra se a efectuado correctamente";
                                }


                            }
                            else
                            {
                                return "no se logro eliminar";
                            }

                        }
                        else
                        {
                            return "No tiene espacio suficiente en su equipo";
                        } 
                    }
                    else
                    {
                    return "No su equipo no posee el suficiente dinero para comprar este jugador";
                    }
                }
                else
                {
                return "Solo se pueden comprar jugadores en venta";
                }
        }
        return "Verfique que el jugador ingresado ";

    }
    
    
    public Equipos returnEquipo(String nombreJugador)
    {
   
        if (Interfaz_Login.metE.inicio==Interfaz_Login.metE.inicio.sig)
        {
          //Tabla para Equipos
          if(Interfaz_Login.metE.inicio.sigSub1 != null)
          {
              
            Enlace_Jugador_Equipo  sub=Interfaz_Login.metE.inicio.sigSub1;
            while(sub != null) 
            { 
            if(sub.sigJugador.getNombre().equals(nombreJugador))
            {
                return Interfaz_Login.metE.inicio;
            }
            sub=sub.sig;
            
            }
          }
        }
        else
        {
            Equipos temp = Interfaz_Login.metE.inicio;
            Equipos aux = Interfaz_Login.metE.inicio;
            
            while(aux.sig != temp)
            {
               //Tabla para Equipos
                if(aux.sigSub1 != null)
                {
                    Enlace_Jugador_Equipo  sub=aux.sigSub1;
                    while(sub != null) 
                    { 
                        if(sub.sigJugador.getNombre().equals(nombreJugador))
                        {
                            return aux;
                        }
                    sub=sub.sig;
                    }
                }
                aux=aux.sig;
            }
            if(aux.sigSub1 != null)
            {
                Enlace_Jugador_Equipo  sub=aux.sigSub1;
                    while(sub != null) 
                    { 
                        if(sub.sigJugador.getNombre().equals(nombreJugador))
                        {
                            return aux;
                        } 
                    sub=sub.sig;
                    }
            }
        }
        return null;
        
    }
    
    
    public Jugadores returnJugador(String nombreJugador)
    {
   
        if (Interfaz_Login.metE.inicio==Interfaz_Login.metE.inicio.sig)
        {
          //Tabla para Equipos
          if(Interfaz_Login.metE.inicio.sigSub1 != null)
          {
              
            Enlace_Jugador_Equipo  sub=Interfaz_Login.metE.inicio.sigSub1;
            while(sub != null) 
            { 
            if(sub.sigJugador.getNombre().equals(nombreJugador))
            {
                return sub.sigJugador;
            }
            sub=sub.sig;
            
            }
          }
        }
        else
        {
            Equipos temp = Interfaz_Login.metE.inicio;
            Equipos aux = Interfaz_Login.metE.inicio;
            
            while(aux.sig != temp)
            {
               //Tabla para Equipos
                if(aux.sigSub1 != null)
                {
                    Enlace_Jugador_Equipo  sub=aux.sigSub1;
                    while(sub != null) 
                    { 
                        if(sub.sigJugador.getNombre().equals(nombreJugador))
                        {
                            return sub.sigJugador;
                        }
                    sub=sub.sig;
                    }
                }
                aux=aux.sig;
            }
            if(aux.sigSub1 != null)
            {
                Enlace_Jugador_Equipo  sub=aux.sigSub1;
                    while(sub != null) 
                    { 
                        if(sub.sigJugador.getNombre().equals(nombreJugador))
                        {
                            return sub.sigJugador;
                        } 
                    sub=sub.sig;
                    }
            }
        }
        return null;
        
    }
    
   
}
