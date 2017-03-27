/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;
import Entidades.*;

/**
 *
 * @author Usuario
 */
public class MetodosTorneo {
    
    public Torneos inicio;
    
     // insertar el nodo doble enlazado al inicio.
    public String insertarInicio(String nombre)
    {
        boolean verifica=verificaNombre(nombre);
        if (verifica==false)
        {
            Torneos nuevo=new Torneos(nombre);// Estoy crendo un puntero
            if(inicio==null)
            {
                inicio=nuevo;
                return "Insertado";
            }       
            inicio.ant=nuevo; // cambia la posicion de memoria
            nuevo.sig=inicio;
            inicio=nuevo;
            return "Insertado";
        }
        else
        {
            return "El nombre digitado no se encuentra disponible";
        }
        
        
    }
    // insertar el nodo doble al final.
    public String insertarFinal(String nombre)
    {
        boolean verifica=verificaNombre(nombre);
        if(verifica==false)
        {    
            Torneos nuevo=new Torneos(nombre); // creo el nodo

            if(inicio==null)         // verifico que si esta vacio se agrega solamente
            {
                inicio=nuevo;
                return "Insertado";

            }
            Torneos aux =inicio; //creo una variable auxiliar y la coloco al inicio.
            while(aux.sig!=null)
            {
                aux=aux.sig;
            }
            aux.sig=nuevo;
            nuevo.ant=aux;
            return "Insertado";
        }
        else
        {
          return "El nombre digitado no se encuentra disponible";  
        }
    }
    
    
    public boolean verificaNombre(String nombre)
    {
        if (inicio==null)
        {
            return false;
        }      
        Torneos aux=inicio; // esto coloca al aux al inicion del nodo
        
        while(aux!=null) // pregunto si el aux es diferente de null osea el ultimo
        {
            if(aux.nombre.equals(nombre))
            {
                return true;
            }
            // si no es igual lo recorro
            aux=aux.sig;
        }
        return false;
    }
    
}
