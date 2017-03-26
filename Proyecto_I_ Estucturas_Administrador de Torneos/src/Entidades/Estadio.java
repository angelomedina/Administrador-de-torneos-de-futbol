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
    
}
