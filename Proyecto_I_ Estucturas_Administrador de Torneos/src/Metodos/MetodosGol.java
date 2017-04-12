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
public class MetodosGol {
    public Gol inicio;
    
    public void insertarInicio(Gol nuevo){
        if(inicio == null){
            inicio = nuevo;
        }
        
        nuevo.siguiente = inicio;
    }
}
