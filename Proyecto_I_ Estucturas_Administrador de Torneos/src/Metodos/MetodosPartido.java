/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import Entidades.*;

/**
 *
 * @author Admi
 */
public class MetodosPartido {
    public Partido inicio; //Inicio hace referancia a la lista de partidos
    public Gol primero; //primero hace referencia a la lista de goles
    
    public void insertarPartidoInicio(Partido nuevo){
        //Si se encuantra vacia la lista se agrega el primer nodo
        if(inicio == null){
            inicio = nuevo;
        }
        //Agrega el nodo al inicio
        nuevo.siguiente = inicio;
        inicio = nuevo;
    }
    
    
    
    public Partido buscarPartido(String local, String visita){
        //Verificar si esta vacia
        if(inicio == null){
            return null;
        }
        //Buscar el partido
        Partido aux = inicio;
        while(aux != null){
            if(aux.local.nombre.equals(local) && aux.visitante.nombre.equals(visita) ){
                return aux;
            }
            aux = aux.siguiente;
        }
        //No encontrado
        return null;
    }
    
    public void generarGoles(Partido partido){
        int cantGoles = (int) (Math.random() * 5) + 1; //Numero random que define la cantidad de goles
        
        for(int i = 0; i < cantGoles; i++){
            int randomEquipo = (int) (Math.random() * 2) + 1; //Random para definir el equipo anotador
            int randomDelantero = (int) (Math.random() * 2) + 1; //Random para definir el delantero anotador

            if(randomEquipo == 1){ //El numero 1 representa el equipo local
                Gol nuevoGol = new Gol(partido.local, partido.local.getDelantero(partido.local, randomDelantero), partido.visitante.getPortero(partido.visitante));
                partido.insertarGolInicio(nuevoGol);
            }else{ //Si es numero 2 el equipo es visitante
                Gol nuevoGol = new Gol(partido.visitante, partido.visitante.getDelantero(partido.visitante, randomDelantero), partido.local.getPortero(partido.local));
                partido.insertarGolInicio(nuevoGol);
            }
        }
    }

    
    
}
