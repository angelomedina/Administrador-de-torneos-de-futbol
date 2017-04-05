/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import Entidades.Entrenadores;
import java.util.ArrayList;

/**
 *
 * @author Admi
 */
public class MetodosLogin {
    
    private String _nombreUsuarioAdmi="Fifa";
    private String _contraseñaAdmi="123";
    
    public ArrayList<Entrenadores> entrenadores = new ArrayList<>();

    public MetodosLogin() {
    }

    public MetodosLogin(String _nombreUsuarioAdmi, String _contraseñaAdmi) {
        this._nombreUsuarioAdmi = _nombreUsuarioAdmi;
        this._contraseñaAdmi = _contraseñaAdmi;
    }
    
    public String iniciarSecion(String nombreUsuario, String password){
        if(nombreUsuario.equals(this._nombreUsuarioAdmi) && password.equals(this._contraseñaAdmi))
        {
            return "Correcto";   
        }
        else
        {
            return "Incorrecto";
        }
           
    }
    
    public void usuarioEntrenador(Entrenadores entrenador)
    {  
        entrenadores.add(entrenador);
    }
    
}
