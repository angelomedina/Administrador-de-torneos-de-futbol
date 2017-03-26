/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import Entidades.Estadio;

/**
 *
 * @author Admi
 */
public class MetodosEstadio {
    
    public Estadio estadio;
   

    public MetodosEstadio(Estadio estadio) {
        this.estadio = estadio;
    }
    
    public int llenarEstadio(){
        //Niveles en los que el estadio es llenado
        int bajo = (int) (estadio.capacidadMaxima * 0.25); //25%
        int medio = (int) (estadio.capacidadMaxima * 0.50); //50%
        int alto = (int) (estadio.capacidadMaxima * 0.75); //75%
        int aleatorio = (int) (Math.random() * 4) + 1; //Numero random (Decide a que nivel se llena el estadio)
        
        if (aleatorio == 1){
            estadio.publicoAsistido = bajo;
            return estadio.publicoAsistido;
        } else if (aleatorio == 2){
            estadio.publicoAsistido = medio;
            return estadio.publicoAsistido;
        } else if (aleatorio == 3){
            estadio.publicoAsistido = alto;
            return estadio.publicoAsistido;
        } else {
            return estadio.capacidadMaxima; //El estadio se llena al maximo
        }
    }
    
    public double generarGanancias(int valorEntrada){ //Parametro: El costo de la entrada por persona
        //Se generan las ganancia obtenidas por el partido
        return estadio.publicoAsistido * valorEntrada;
        
    }
    
}
