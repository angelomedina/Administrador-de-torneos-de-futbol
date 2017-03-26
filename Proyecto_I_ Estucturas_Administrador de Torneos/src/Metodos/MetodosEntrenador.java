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
public class MetodosEntrenador  extends Entrenadores {
   public Entrenadores  inicio,fin;   // esto es para recorrer la lista circular 
  
   
   //19/03/2017
   //metodos generales 
    public String InsertarInicio(String nombre,int id)
    {
        Entrenadores nuevo=new Entrenadores(nombre,id); // se crea el objeto entrenador
        
        if (inicio==null)
        {
            inicio=fin=nuevo;
            fin.sig=inicio;
            return "Agregado";
        }
        nuevo.sig=inicio;
        inicio=nuevo;
        fin.sig=inicio;

        return "Agregado";
    }
   
    public String InsertarFinal(String nombre,int id)
    {
         Entrenadores nuevo=new Entrenadores(nombre,id); // se crea el objeto entrenador
         
        if (inicio==null)
        {
            fin=nuevo;
            inicio=fin;
            fin.sig=inicio;
            return "Agregado";
        }
        fin.sig=nuevo;
        nuevo.sig=inicio;
        fin=nuevo;
        return "Agregado";
    }
    
    public boolean buscarEntrenador(String nombre ,int id)
    {
        Entrenadores temp = inicio;
        Entrenadores  aux = inicio;
        if (inicio==null)
         {
             return false;
         }
        if (inicio.getNombre().equals(nombre) && inicio.getId()==id)
        {
          return true;
        }
        else
        {
            while(aux.sig != temp)
            {
                if (aux.getNombre().equals(nombre) && aux.getId()==id)
                {
                    return true;
                }    
                aux=aux.sig;
            }
            if (aux.getNombre().equals(nombre) && aux.getId()==id)
            {
                    return true;
            }
            return false;   
        }  
    }
   
    public boolean verificaID(int id) 
    {
        Entrenadores temp  = inicio;
        Entrenadores aux  =  inicio;
        
        if(inicio != null)
        {
            if (temp==temp.sig)
            {
                if ( temp.getId()==id)   
               {
                   return true;
               }
               temp=temp.sig;
            }  
             
            while (temp != aux.sig )
            {
             if (temp.getId()==id)   
             {
                 return true;
             }
             temp=temp.sig;
            }
        }
        return false;
    }
   
   
   // metodos 
   public void comprar(){};
   
   public void vender (){};
   
   public void observar(){};
   
   
   
   
    
    
    
   
    
    
}
