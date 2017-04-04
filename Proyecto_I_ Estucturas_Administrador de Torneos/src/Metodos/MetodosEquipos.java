/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;
import  Entidades.*;
import javax.swing.ImageIcon;
/**
 *
 * @author UsuarioetodosEquipos
 */
public class MetodosEquipos {
    // esto es una lista doble circular
    
    public Equipos inicio;
    public Equipos fin;
    
    public String InsertarInicio(String nombre,int codigo,ImageIcon ImagenCasa,ImageIcon ImagenVisita)
    {
        Equipos nuevo=new Equipos(nombre,codigo, ImagenCasa,ImagenVisita);
        
        if(inicio==null)
        {             
          inicio=fin=nuevo;  
          inicio.sig=inicio;
          inicio.ant=inicio;
          return "Insertado";          
        }
        inicio.ant=nuevo;
        nuevo.sig=inicio;
        nuevo.ant=fin;
        fin.sig=nuevo;
        inicio=nuevo;
        return "Insertado";
    }
    
    public String InsertarFinal(String nombre,int codigo,ImageIcon ImagenCasa,ImageIcon ImagenVisita)
    {
        Equipos nuevo=new Equipos(nombre,codigo,ImagenCasa,ImagenVisita);
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
    
     public boolean verificaCodigo(int codigo)
    {
        if (inicio==null)
        {
            return false;
        }
        if (inicio.codigo==codigo)
        {
            return true;
        }
        
        Equipos aux=inicio;
        Equipos  ant=inicio;
        Equipos  temp=inicio;
        while ( temp != aux.sig)
        {
          if (aux.codigo==codigo)  
          {
            return true;      
          }
          ant=aux;
          aux=aux.sig;
        }
        return false;    
    }
    
}
