/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mian;

import Entidades.*;
import Graficos.*;
import Metodos.*;


/**
 *
 * @author Usuario
 */
public class Main {
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
        

    //QUEMA DE DATOS
    //Datos para entrenador
    String Enuevo1=Interfaz_Login.metEn.InsertarInicio("Pinto",20);
    String Enuevo2=Interfaz_Login.metEn.InsertarInicio("Andrey",21);
    String Enuevo3=Interfaz_Login.metEn.InsertarInicio("Oscar",22);
    String Enuevo4=Interfaz_Login.metEn.InsertarInicio("Bob",23);
    String Enuevo5=Interfaz_Login.metEn.InsertarInicio("Rammstein",24);
    String Enuevo6=Interfaz_Login.metEn.InsertarInicio("Skiller",25);
    String Enuevo7=Interfaz_Login.metEn.InsertarInicio("Red",26);
    String Enuevo8=Interfaz_Login.metEn.InsertarInicio("Luis",27);
    String Enuevo9=Interfaz_Login.metEn.InsertarInicio("M.Herrera",28);
    String Enuevo10=Interfaz_Login.metEn.InsertarInicio("Didier",29);
    String Enuevo11=Interfaz_Login.metEn.InsertarInicio("Bosque",30);
    String Enuevo12=Interfaz_Login.metEn.InsertarInicio("Alberto",31);
    String Enuevo13=Interfaz_Login.metEn.InsertarInicio("Fabio",32);
    String Enuevo14=Interfaz_Login.metEn.InsertarInicio("Alejandro",33);
    String Enuevo15=Interfaz_Login.metEn.InsertarInicio("Joachim",34);
    String Enuevo16=Interfaz_Login.metEn.InsertarInicio("Roy",35);
    //Datos para jugadores
    String Jnuevo1=Interfaz_Login.metJ.InsertarInicio("Keylor"   , 0,10,10,10,10,"Portero");
    String Jnuevo2=Interfaz_Login.metJ.InsertarInicio("Gamboa"   , 1,5,9,2,9,"Defensa");
    String Jnuevo3=Interfaz_Login.metJ.InsertarInicio("Acosta"   , 2,8,3,8,1,"Defensa");
    String Jnuevo4=Interfaz_Login.metJ.InsertarInicio("Gonzalez", 3,7,3,4,1,"Defensa");
    String Jnuevo5=Interfaz_Login.metJ.InsertarInicio("Umaña"    , 4,5,3,8,7,"Defensa");
    String Jnuevo6=Interfaz_Login.metJ.InsertarInicio("Cubero"   , 5,8,6,8,1,"Medio Campo");
    String Jnuevo7=Interfaz_Login.metJ.InsertarInicio("Borges"   , 6,8,10,8,9,"Medio Campo");
    String Jnuevo8=Interfaz_Login.metJ.InsertarInicio("Tejeda"   , 7,2,1,8,9,"Medio Campo");
    String Jnuevo9=Interfaz_Login.metJ.InsertarInicio("Bolaños"   , 8,4,1,2,9,"Medio Campo");
    String Jnuevo10=Interfaz_Login.metJ.InsertarInicio("Campbell" , 9,2,9,4,9,"Delantero");
    String Jnuevo11=Interfaz_Login.metJ.InsertarInicio("B.Ruiz"   , 10,10,10,8,9,"Delantero");
    String Jnuevo12=Interfaz_Login.metJ.InsertarFinal("Chicharito"   , 11,11,10,8,9,"Medio Campo");
    String Jnuevo13=Interfaz_Login.metJ.InsertarInicio("Ochoa"   , 12,10,10,8,9,"Medio Campo");
    //Datos para equipos
    String EQnuevo1=Interfaz_Login.metE.InsertarInicio("Costa Rica", 0);
    String EQnuevo2=Interfaz_Login.metE.InsertarInicio("Estados Unidos", 1);
    String EQnuevo3=Interfaz_Login.metE.InsertarInicio("Honduras", 2);
    String EQnuevo4=Interfaz_Login.metE.InsertarInicio("Mexico", 3);
    String EQnuevo5=Interfaz_Login.metE.InsertarInicio("Portugal", 4);
    String EQnuevo6=Interfaz_Login.metE.InsertarInicio("Brasil", 5);
    String EQnuevo7=Interfaz_Login.metE.InsertarInicio("Italia", 6);
    String EQnuevo8=Interfaz_Login.metE.InsertarInicio("Inglatera", 7);
    String EQnuevo9=Interfaz_Login.metE.InsertarInicio("Urugay", 8);
    String EQnuevo10=Interfaz_Login.metE.InsertarInicio("Croacia", 9);
    String EQnuevo11=Interfaz_Login.metE.InsertarInicio("Francia", 10);
    String EQnuevo12=Interfaz_Login.metE.InsertarInicio("Nigeria", 11);
    String EQnuevo13=Interfaz_Login.metE.InsertarInicio("España", 12);
    String EQnuevo14=Interfaz_Login.metE.InsertarInicio("Grecia", 13);
    String EQnuevo15=Interfaz_Login.metE.InsertarInicio("Peru", 14);
    String EQnuevo16=Interfaz_Login.metE.InsertarInicio("Alemania", 15);
    
    //Datos para torneo
    String Tnuevo1=Interfaz_Login.metT.insertarInicio("Mundial 2014");
    //Datos de enlace equipo/torneo
    String ENnuevo1=Interfaz_Login.metET.insertarInicioEnlaceTorneoEquipo("Mundial 2014","Costa Rica");
    String ENnuevo2=Interfaz_Login.metET.insertarInicioEnlaceTorneoEquipo("Mundial 2014","Estados Unidos");
    String ENnuevo3=Interfaz_Login.metET.insertarInicioEnlaceTorneoEquipo("Mundial 2014","Honduras");
    String ENnuevo4=Interfaz_Login.metET.insertarInicioEnlaceTorneoEquipo("Mundial 2014","Mexico");
    //Datos de enlace  equipo/entrenador
    String ENLnuevo1=Interfaz_Login.metEnE.insertarEnlaceEntrenadorEquipo("Oscar","Costa Rica");
    String ENLnuevo2=Interfaz_Login.metEnE.insertarEnlaceEntrenadorEquipo("Pinto","Honduras");
    String ENLnuevo3=Interfaz_Login.metEnE.insertarEnlaceEntrenadorEquipo("M.Herrera","Mexico");
    String ENLnuevo4=Interfaz_Login.metEnE.insertarEnlaceEntrenadorEquipo("Roy","Estados Unidos");
    //Datos de enlace jugadores/equipo
    String JEnuevo1=Interfaz_Login.metJE.enlazarEquipoJugador("Costa Rica","Keylor");
    String JEnuevo2=Interfaz_Login.metJE.enlazarEquipoJugador("Costa Rica","Campbell");
    String JEnuevo3=Interfaz_Login.metJE.enlazarEquipoJugador("Costa Rica","Gamboa");
    String JEnuevo4=Interfaz_Login.metJE.enlazarEquipoJugador("Costa Rica","Acosta");
    String JEnuevo5=Interfaz_Login.metJE.enlazarEquipoJugador("Costa Rica","B.Ruiz");
    String JEnuevo6=Interfaz_Login.metJE.enlazarEquipoJugador("Costa Rica","Bolaños");
    String JEnuevo7=Interfaz_Login.metJE.enlazarEquipoJugador("Costa Rica","Tejeda");
    String JEnuevo8=Interfaz_Login.metJE.enlazarEquipoJugador("Costa Rica","Umaña");
    String JEnuevo9=Interfaz_Login.metJE.enlazarEquipoJugador("Costa Rica","Cubero");
    String JEnuevo10=Interfaz_Login.metJE.enlazarEquipoJugador("Costa Rica","Gonzalez");
    String JEnuevo11=Interfaz_Login.metJE.enlazarEquipoJugador("Costa Rica","Borges");
    
        new Interfaz_Login(new MetodosLogin()).setVisible(true);
    }
    
}
