/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import javax.swing.ImageIcon;

/**
 *
 * @author Admi
 */
public class Estadio {
    public String nombre;
    public int capacidadMaxima;
    public int publicoAsistido; //Cantidad de personas que llegaron al estadio
    public String Ubicacion;
    public ImageIcon fotoEstadio;

    public Estadio(String nombre, int capacidadMaxima, int publicoAsistido, String Ubicacion, ImageIcon fotoEstadio) {
        this.nombre = nombre;
        this.capacidadMaxima = capacidadMaxima;
        this.publicoAsistido = publicoAsistido;
        this.Ubicacion = Ubicacion;
        this.fotoEstadio = fotoEstadio;
    }
    
    public int llenarEstadio(){
        //Niveles en los que el estadio es llenado
        int bajo = (int) (this.capacidadMaxima * 0.25); //25%
        int medio = (int) (this.capacidadMaxima * 0.50); //50%
        int alto = (int) (this.capacidadMaxima * 0.75); //75%
        int aleatorio = (int) (Math.random() * 4) + 1; //Numero random (Decide a que nivel se llena el estadio)
        
        if (aleatorio == 1){
            this.publicoAsistido = bajo;
            return this.publicoAsistido;
        } else if (aleatorio == 2){
            this.publicoAsistido = medio;
            return this.publicoAsistido;
        } else if (aleatorio == 3){
            this.publicoAsistido = alto;
            return this.publicoAsistido;
        } else {
            this.publicoAsistido = this.capacidadMaxima;
            return this.capacidadMaxima; //El estadio se llena al maximo
        }
    }
    
    public double generarGanancias(int valorEntrada){ //Parametro: El costo de la entrada por persona
        //Se generan las ganancia obtenidas por el partido
        return this.publicoAsistido * valorEntrada;
        
    }
     
}
