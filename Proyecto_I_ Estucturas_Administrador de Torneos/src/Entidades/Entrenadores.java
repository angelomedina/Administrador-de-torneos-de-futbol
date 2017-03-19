/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Usuario
 */
public class Entrenadores {
                                                                            
    public Entrenadores sig,ant; // esto es lista circular // los hice publicos para poder acceder desde otros paketes
    
    // atributos 
    private String  _nombre;
    private int     _id;
    
    //constructor 
    public Entrenadores(){};
    
    public Entrenadores(String nombre,int id)
    {
        this._nombre=nombre;
        this._id=id;
        sig=ant=null;
    }

    // setter y getters                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }
   
    
    
}
