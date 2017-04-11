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
public class Jugadores {
    // viernes 23 demarzo del 2017
    
    // la clase jugadores es una lista simple
    public Jugadores sig;
    
    private String _nombre;
    private long    _cedula;
    private long   _valor;
    private String _posicion;

    
    
    private String estado="Disponibe";
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    // atributos por defecto
   
   
   //•	Tendrán posiciones de juego: Defensa, medio campo, etc
   //•	No se pueden eliminar jugadores del sistema, mientras este pertenezca a un equipo.

    public Jugadores(String _nombre, long _cedula,int _valor,String _posicion) {
        this._nombre = _nombre;
        this._cedula = _cedula;
        this._valor  = _valor;
        this._posicion=_posicion;
    }

    public long getValor() {
        return _valor;
    }

    public String getPosicion() {
        return _posicion;
    }

    public void setPosicion(String _posicion) {
        this._posicion = _posicion;
    }

    public void setValor(long _valor) {
        this._valor = _valor;
    }
    
    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    public long getCedula() {
        return _cedula;
    }

    public void setCedula(int _cedula) {
        this._cedula = _cedula;
    }
    
    
    
    
    
    
    
    
}
