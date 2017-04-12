/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Metodos.MetodosGol;

/**
 *
 * @author Admi
 */
public class Partido {
    //Variables de dinero
    public int preioEntrada; //Costo individual de la entrada al partido
    public double ganaciasNetas;
    //Variable de puntero (lista)
    public Partido siguiente; //Lista partidos
    //Variable de puntero(Equipos)
    public Equipos local; //Equipo local
    public Equipos visitante; //Equipo visitante
    //Variables de puntero(Equipos perdedor y ganador)
    public Equipos ganador;
    public Equipos perdedor;
    //Variables
    public Estadio estadio; //Estadio del juego
    public Gol anotacionInicial; //Sublista de goles

    public Partido(Equipos local, Equipos visitante, Estadio estadio, Gol anotacionInicial) {
        this.siguiente = null;
        this.local = local;
        this.visitante = visitante;
        this.estadio = estadio;
        this.anotacionInicial = anotacionInicial;
    }

    public Partido getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Partido siguiente) {
        this.siguiente = siguiente;
    }

    public Equipos getLocal() {
        return local;
    }

    public void setLocal(Equipos local) {
        this.local = local;
    }

    public Equipos getVisitante() {
        return visitante;
    }

    public void setVisitante(Equipos visitante) {
        this.visitante = visitante;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }
    
    public void insertarGolInicio(Gol nuevo){
        //Si está vacio se agrega el primer gol
        if(anotacionInicial == null){
            anotacionInicial = nuevo;
        }
        //Si hay goles se agrega el nuevo al inicio
        nuevo.siguiente = anotacionInicial;
        anotacionInicial = nuevo;
    }
    
    public void generarPublico(){
        this.estadio.llenarEstadio();
    }
    
    public double obtenerGanacias(){
        this.ganaciasNetas = this.estadio.generarGanancias(this.preioEntrada);
        return this.ganaciasNetas;
    }
    
    public void otorgarGanancias(){
        //Ganancias totales
        double ganancias = this.estadio.generarGanancias(this.preioEntrada);
        //El equipo ganador recibe el 20% de la ganancias
        this.ganador.dinero += (ganancias*0.20); 
        //el equipo perdedor recibe un 5% de ganancias
        this.perdedor.dinero += (ganancias*0.5);
    }
    
    public void definirGanador(){
        int golesLocal = 0;
        int golesVisitante = 0;
        
        Gol aux = this.anotacionInicial;
        
        //Se realiza un recorrido por la sublista de goles
        while(aux != null){
           //Pregunta si el gol fue anotado por el equipo local
           if (aux.equipoAnotador.nombre.equals(this.local.nombre)){ 
               golesLocal +=1;
               aux = aux.siguiente;
           //Si no, fue anotado por el equipo visitante    
           } else {
               golesVisitante += 1;
               aux = aux.siguiente;
           }
       }
       //Pregunta si la mayoria de goles son el local y se define como ganador
       if(golesLocal > golesVisitante){
           this.ganador = this.local;
           this.perdedor = this.visitante;
       //Pregunta si la mayoria de goles son el visitante y se define como ganador    
       } else if (golesLocal < golesVisitante){
           this.ganador = this.visitante;
           this.perdedor = this.local;
       //Si ambos equipos tienen la misma cantidad de goles se realiza un random
       }else{
           //Numero random que define el ganador       
           int randomGanador = (int) (Math.random() * 2) + 1;    
           //Se define el ganador
           if(randomGanador == 1){ //Si el numero generado es 1, gana el equipo local
               this.ganador = this.local;
               this.perdedor = this.visitante;
           } else {  //Si no, gana el equipo visitante
               this.ganador = this.visitante;
               this.perdedor = this.local;
           }
       }
        
    }    
}
