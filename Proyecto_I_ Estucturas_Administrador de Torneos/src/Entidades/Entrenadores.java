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
                                                                            
    Entrenadores sig,ant; // esto es lista circular 
    
    // atributos 
    private String  _nombre;
    private int     _id;
    private char    _tipo;
    
    //constructor 
    public Entrenadores(){};
    
    public Entrenadores(String nombre,int id, char tipo)
    {
        this._nombre=nombre;
        this._id=id;
        this._tipo=tipo;
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
   
    public char getTipo() {
        return _tipo;
    }

    public void setTipo(char _tipo) {
        this._tipo = _tipo;
    }
    
    
}
