/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;
import Entidades.*;
import Graficos.Interfaz_Login;
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
        Interfaz_Login.metL.usuarioEntrenador(nuevo);//lo agrego a la lista de usuarios Entrenadores
        
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
         Interfaz_Login.metL.usuarioEntrenador(nuevo);//lo agrego a la lista de usuarios Entrenadores
         
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
   
    
    
    public Entrenadores Buscar(String nombre)
    {
        if (inicio==null)
        {
            return null;
        }
        
        Entrenadores  aux=inicio;
        Entrenadores   temp=fin;
        
        while ( aux != temp)
        {
          if (aux.getNombre().equals(nombre) )
          {
            return aux;      
          }
          aux=aux.sig;
        }
        if(temp.getNombre().equals(nombre))
        {
            return temp;
        }
        else
        {
        return null;    
        }
    }
    
    
    
   
   // metodos 
   public void comprar(){};
   
   public void vender (){};
   
   public void observar(){};
   
   
   
   
    
    
    
   
    
    
}
