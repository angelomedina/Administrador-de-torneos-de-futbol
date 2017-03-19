/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;
import Entidades.Entrenadores;
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
        
        if(inicio==null)
        {
                      
          inicio=fin=nuevo;  
          inicio.sig=inicio;
          inicio.ant=inicio;
          return "Insertado al Inicio";          
        }
        
        inicio.ant=nuevo;
        nuevo.sig=inicio;
        nuevo.ant=fin;
        fin.sig=nuevo;
        inicio=nuevo;
        return "Insertado al inicio";
    }
   
    public String InsertarFinal(String nombre,int id)
    {
         Entrenadores nuevo=new Entrenadores(nombre,id); // se crea el objeto entrenador
        
        if(inicio==null)
        {
          fin=inicio=nuevo;
          inicio.sig=inicio;
          inicio.ant=inicio;
          return "Insertado al Final";          
        }
        
        fin.sig=nuevo;
        nuevo.ant=fin;
        nuevo.sig=inicio;
        inicio.ant=nuevo;
        fin=nuevo;
        return "Insertado al Final";
    }
    
    public boolean buscar(String nombre ,int id)
    {
        Entrenadores temp  = inicio;
        Entrenadores aux  =  inicio;
        
        if(inicio != null)
        {
            if (temp==temp.sig)
            {
                if (temp.getNombre().equals(nombre) && temp.getId()==id)   
               {
                   return true;
               }
               temp=temp.sig;
            }  
             
            while (temp != aux.sig )
            {
             if (temp.getNombre().equals(nombre) && temp.getId()==id)   
             {
                 return true;
             }
             temp=temp.sig;
            }
        }
        return false;
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
