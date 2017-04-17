/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mian;

import Entidades.*;
import Graficos.*;
import Metodos.*;
import javax.swing.UIManager;


/**
 *
 * @author Usuario
 */
public class Main {
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
    try 
    {
		UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");//nimbus

    } 
    catch (Exception e)
    {
		e.printStackTrace();
    }  

    //QUEMA DE DATOS
    //Datos para entrenador
    String Enuevo1=Interfaz_Login.metEn.InsertarInicio("Pinto",20); // honduras
    String Enuevo2=Interfaz_Login.metEn.InsertarInicio("Andrey",21); // brasil
    String Enuevo3=Interfaz_Login.metEn.InsertarInicio("Oscar",22);  // costa rica
    String Enuevo4=Interfaz_Login.metEn.InsertarInicio("Bob",23); // portugal
    String Enuevo5=Interfaz_Login.metEn.InsertarInicio("Rammstein",24);// Italia
    String Enuevo6=Interfaz_Login.metEn.InsertarInicio("Skiller",25);//Inglatera
    String Enuevo7=Interfaz_Login.metEn.InsertarInicio("Red",26);//Urugay
    String Enuevo8=Interfaz_Login.metEn.InsertarInicio("Luis",27);//Croacia
    String Enuevo9=Interfaz_Login.metEn.InsertarInicio("M.Herrera",28);// mexico
    String Enuevo10=Interfaz_Login.metEn.InsertarInicio("Didier",29);//Francia
    String Enuevo11=Interfaz_Login.metEn.InsertarInicio("Bosque",30);//Nigeria
    String Enuevo12=Interfaz_Login.metEn.InsertarInicio("Alberto",31);//España
    String Enuevo13=Interfaz_Login.metEn.InsertarInicio("Fabio",32);//Grecia
    String Enuevo14=Interfaz_Login.metEn.InsertarInicio("Alejandro",33);//Peru
    String Enuevo15=Interfaz_Login.metEn.InsertarInicio("Joachim",34);// alemania
    String Enuevo16=Interfaz_Login.metEn.InsertarInicio("Roy",35);    // estados unidos
    //Datos para jugadores
    //Costa Rica
    String Jnuevo1=Interfaz_Login.metJ.InsertarInicio("KeylorCR"   , 0,1,1,1,1,"Portero");
    String Jnuevo2=Interfaz_Login.metJ.InsertarInicio("GamboaCR"   , 1,1,1,1,1,"Defensa");
    String Jnuevo3=Interfaz_Login.metJ.InsertarInicio("AcostaCR"   , 2,1,1,1,1,"Defensa");
    String Jnuevo4=Interfaz_Login.metJ.InsertarInicio("GonzalezCR", 3,1,1,1,1,"Defensa");
    String Jnuevo5=Interfaz_Login.metJ.InsertarInicio("UmañaCR"    , 4,1,1,1,1,"Defensa");
    String Jnuevo6=Interfaz_Login.metJ.InsertarInicio("CuberoCR"   , 5,1,1,1,1,"Medio Campo");
    String Jnuevo7=Interfaz_Login.metJ.InsertarInicio("BorgesCR"   , 6,1,1,1,1,"Medio Campo");
    String Jnuevo8=Interfaz_Login.metJ.InsertarInicio("TejedaCR"   , 7,1,1,1,1,"Medio Campo");
    String Jnuevo9=Interfaz_Login.metJ.InsertarInicio("BolañosCR"   , 8,1,1,1,1,"Medio Campo");
    String Jnuevo10=Interfaz_Login.metJ.InsertarInicio("CampbellCR" , 9,1,1,1,1,"Delantero");
    String Jnuevo11=Interfaz_Login.metJ.InsertarInicio("RuizCR"   , 10,1,1,1,1,"Delantero");
    //Juagadores Libres
 
    String Jnuevo12=Interfaz_Login.metJ.InsertarFinal("Chicharito"   , 11,1,1,1,1,"Delantero");
    String Jnuevo13=Interfaz_Login.metJ.InsertarInicio("Ochoa"   , 12,1,1,1,1,"Portero");
    String Jnuevo14=Interfaz_Login.metJ.InsertarInicio("Luyun"   , 13,1,1,1,1,"Delantero");
    String Jnuevo15=Interfaz_Login.metJ.InsertarInicio("Aguilar"   , 14,1,1,1,1,"Medio Campo");
    String Jnuevo16=Interfaz_Login.metJ.InsertarInicio("Moreno"   , 15,1,1,1,1,"Medio Campo");
    String Jnuevo17=Interfaz_Login.metJ.InsertarInicio("Marquez"   , 16,1,1,1,1,"Medio Campo");
    String Jnuevo18=Interfaz_Login.metJ.InsertarInicio("Reyes"   , 17,1,1,1,1,"Medio Campo");
    String Jnuevo19=Interfaz_Login.metJ.InsertarInicio("Salcido"   , 18,1,1,1,1,"Defensa");
    String Jnuevo20=Interfaz_Login.metJ.InsertarInicio("Guardado"   , 19,1,1,1,1,"Defensa");
    String Jnuevo21=Interfaz_Login.metJ.InsertarInicio("Rodriguez"   ,20,1,1,1,1,"Defensa");
    String Jnuevo22=Interfaz_Login.metJ.InsertarInicio("Ponce"   , 21,1,1,1,1,"Defensa"); 
    String Jnuevo23=Interfaz_Login.metJ.InsertarInicio("Fabian"   ,22,1,1,1,1,"Delantero");

    //Estados Unidos
    String Jnuevo24=Interfaz_Login.metJ.InsertarInicio("KeylorEU"   , 23,1,1,1,1,"Portero");
    String Jnuevo25=Interfaz_Login.metJ.InsertarInicio("GamboaEU"   , 24,1,1,1,1,"Defensa");
    String Jnuevo26=Interfaz_Login.metJ.InsertarInicio("AcostaEU"   , 25,1,1,1,1,"Defensa");
    String Jnuevo27=Interfaz_Login.metJ.InsertarInicio("GonzalezEU", 26,1,1,1,1,"Defensa");
    String Jnuevo28=Interfaz_Login.metJ.InsertarInicio("UmañaEU"    , 27,1,1,1,1,"Defensa");
    String Jnuevo29=Interfaz_Login.metJ.InsertarInicio("CuberoEU"   , 28,1,1,1,1,"Medio Campo");
    String Jnuevo30=Interfaz_Login.metJ.InsertarInicio("BorgesEU"   , 29,1,1,1,1,"Medio Campo");
    String Jnuevo31=Interfaz_Login.metJ.InsertarInicio("TejedaEU"   , 30,1,1,1,1,"Medio Campo");
    String Jnuevo32=Interfaz_Login.metJ.InsertarInicio("BolañosEU"   , 31,1,1,1,1,"Medio Campo");
    String Jnuevo33=Interfaz_Login.metJ.InsertarInicio("CampbellEU" , 32,1,1,1,1,"Delantero");
    String Jnuevo34=Interfaz_Login.metJ.InsertarInicio("RuizEU"   , 33,1,1,1,1,"Delantero");
     //Estados Mexico
    String Jnuevo35=Interfaz_Login.metJ.InsertarInicio("KeylorMX"   ,34,1,1,1,1,"Portero");
    String Jnuevo36=Interfaz_Login.metJ.InsertarInicio("GamboaMX"   ,35,1,1,1,1,"Defensa");
    String Jnuevo37=Interfaz_Login.metJ.InsertarInicio("AcostaMX"   ,36,1,1,1,1,"Defensa");
    String Jnuevo38=Interfaz_Login.metJ.InsertarInicio("GonzalezMX",37,1,1,1,1,"Defensa");
    String Jnuevo39=Interfaz_Login.metJ.InsertarInicio("UmañaMX"    , 38,1,1,1,1,"Defensa");
    String Jnuevo40=Interfaz_Login.metJ.InsertarInicio("CuberoMX"   , 39,1,1,1,1,"Medio Campo");
    String Jnuevo41=Interfaz_Login.metJ.InsertarInicio("BorgesMX"   , 40,1,1,1,1,"Medio Campo");
    String Jnuevo42=Interfaz_Login.metJ.InsertarInicio("TejedaMX"   ,41,1,1,1,1,"Medio Campo");
    String Jnuevo43=Interfaz_Login.metJ.InsertarInicio("BolañosMX"   , 42,1,1,1,1,"Medio Campo");
    String Jnuevo44=Interfaz_Login.metJ.InsertarInicio("CampbellMX" , 43,1,1,1,1,"Delantero");
    String Jnuevo45=Interfaz_Login.metJ.InsertarInicio("RuizMX"   , 44,1,1,1,1,"Delantero");
     //Estados Honduras
    String Jnuevo46=Interfaz_Login.metJ.InsertarInicio("KeylorHO"   ,45,1,1,1,1,"Portero");
    String Jnuevo47=Interfaz_Login.metJ.InsertarInicio("GamboaHO"   ,46,1,1,1,1,"Defensa");
    String Jnuevo48=Interfaz_Login.metJ.InsertarInicio("AcostaHO"   ,47,1,1,1,1,"Defensa");
    String Jnuevo49=Interfaz_Login.metJ.InsertarInicio("GonzalezHO",48,1,1,1,1,"Defensa");
    String Jnuevo50=Interfaz_Login.metJ.InsertarInicio("UmañaHO"    , 49,1,1,1,1,"Defensa");
    String Jnuevo51=Interfaz_Login.metJ.InsertarInicio("CuberoHO"   , 50,1,1,1,1,"Medio Campo");
    String Jnuevo52=Interfaz_Login.metJ.InsertarInicio("BorgesHO"   , 51,1,1,1,1,"Medio Campo");
    String Jnuevo53=Interfaz_Login.metJ.InsertarInicio("TejedaHO"   ,52,1,1,1,1,"Medio Campo");
    String Jnuevo54=Interfaz_Login.metJ.InsertarInicio("BolañosHO"   , 53,1,1,1,1,"Medio Campo");
    String Jnuevo55=Interfaz_Login.metJ.InsertarInicio("CampbellHO" , 54,1,1,1,1,"Delantero");
    String Jnuevo56=Interfaz_Login.metJ.InsertarInicio("RuizHO"   , 55,1,1,1,1,"Delantero");
    //Estados Portugal
    String Jnuevo57=Interfaz_Login.metJ.InsertarInicio("KeylorPO"   ,56,1,1,1,1,"Portero");
    String Jnuevo58=Interfaz_Login.metJ.InsertarInicio("GamboaPO"   ,57,1,1,1,1,"Defensa");
    String Jnuevo59=Interfaz_Login.metJ.InsertarInicio("AcostaPO"   ,58,1,1,1,1,"Defensa");
    String Jnuevo60=Interfaz_Login.metJ.InsertarInicio("GonzalezPO",59,1,1,1,1,"Defensa");
    String Jnuevo61=Interfaz_Login.metJ.InsertarInicio("UmañaPO"    , 60,1,1,1,1,"Defensa");
    String Jnuevo62=Interfaz_Login.metJ.InsertarInicio("CuberoPO"   , 61,1,1,1,1,"Medio Campo");
    String Jnuevo63=Interfaz_Login.metJ.InsertarInicio("BorgesPO"   , 62,1,1,1,1,"Medio Campo");
    String Jnuevo64=Interfaz_Login.metJ.InsertarInicio("TejedaPO"   ,63,1,1,1,1,"Medio Campo");
    String Jnuevo65=Interfaz_Login.metJ.InsertarInicio("BolañosPO"   , 64,1,1,1,1,"Medio Campo");
    String Jnuevo66=Interfaz_Login.metJ.InsertarInicio("CampbellPO" , 65,1,1,1,1,"Delantero");
    String Jnuevo67=Interfaz_Login.metJ.InsertarInicio("RuizPO"   , 66,1,1,1,1,"Delantero");
    //Estados PBrasil
    String Jnuevo68=Interfaz_Login.metJ.InsertarInicio("KeylorBR"   ,67,1,1,1,1,"Portero");
    String Jnuevo69=Interfaz_Login.metJ.InsertarInicio("GamboaBR"   ,68,1,1,1,1,"Defensa");
    String Jnuevo70=Interfaz_Login.metJ.InsertarInicio("AcostaBR"   ,69,1,1,1,1,"Defensa");
    String Jnuevo71=Interfaz_Login.metJ.InsertarInicio("GonzalezBR",70,1,1,1,1,"Defensa");
    String Jnuevo72=Interfaz_Login.metJ.InsertarInicio("UmañaBR"    , 71,1,1,1,1,"Defensa");
    String Jnuevo73=Interfaz_Login.metJ.InsertarInicio("CuberoBR"   , 72,1,1,1,1,"Medio Campo");
    String Jnuevo74=Interfaz_Login.metJ.InsertarInicio("BorgesBR"   , 73,1,1,1,1,"Medio Campo");
    String Jnuevo75=Interfaz_Login.metJ.InsertarInicio("TejedaBR"   ,74,1,1,1,1,"Medio Campo");
    String Jnuevo76=Interfaz_Login.metJ.InsertarInicio("BolañosBR"   , 75,1,1,1,1,"Medio Campo");
    String Jnuevo77=Interfaz_Login.metJ.InsertarInicio("CampbellBR" , 76,1,1,1,1,"Delantero");
    String Jnuevo78=Interfaz_Login.metJ.InsertarInicio("RuizBR"   , 77,1,1,1,1,"Delantero");
      //Estados Italia
    String Jnuevo79=Interfaz_Login.metJ.InsertarInicio("KeylorIT"   ,78,1,1,1,1,"Portero");
    String Jnuevo80=Interfaz_Login.metJ.InsertarInicio("GamboaIT"   ,79,1,1,1,1,"Defensa");
    String Jnuevo81=Interfaz_Login.metJ.InsertarInicio("AcostaIT"   ,80,1,1,1,1,"Defensa");
    String Jnuevo82=Interfaz_Login.metJ.InsertarInicio("GonzalezIT",81,1,1,1,1,"Defensa");
    String Jnuevo83=Interfaz_Login.metJ.InsertarInicio("UmañaIT"    , 82,1,1,1,1,"Defensa");
    String Jnuevo84=Interfaz_Login.metJ.InsertarInicio("CuberoIT"   , 83,1,1,1,1,"Medio Campo");
    String Jnuevo85=Interfaz_Login.metJ.InsertarInicio("BorgesIT"   , 84,1,1,1,1,"Medio Campo");
    String Jnuevo86=Interfaz_Login.metJ.InsertarInicio("TejedaIT"   ,85,1,1,1,1,"Medio Campo");
    String Jnuevo87=Interfaz_Login.metJ.InsertarInicio("BolañosIT"   , 86,1,1,1,1,"Medio Campo");
    String Jnuevo88=Interfaz_Login.metJ.InsertarInicio("CampbellIT" , 87,1,1,1,1,"Delantero");
    String Jnuevo89=Interfaz_Login.metJ.InsertarInicio("RuizIT"   , 88,1,1,1,1,"Delantero");
     //Estados Inglaterra
    String Jnuevo91=Interfaz_Login.metJ.InsertarInicio("KeylorIG"   ,89,1,1,1,1,"Portero");
    String Jnuevo92=Interfaz_Login.metJ.InsertarInicio("GamboaIG"   ,90,1,1,1,1,"Defensa");
    String Jnuevo93=Interfaz_Login.metJ.InsertarInicio("AcostaIG"   ,91,1,1,1,1,"Defensa");
    String Jnuevo94=Interfaz_Login.metJ.InsertarInicio("GonzalezIG",92,1,1,1,1,"Defensa");
    String Jnuevo95=Interfaz_Login.metJ.InsertarInicio("UmañaIG"    , 93,1,1,1,1,"Defensa");
    String Jnuevo96=Interfaz_Login.metJ.InsertarInicio("CuberoIG"   , 94,1,1,1,1,"Medio Campo");
    String Jnuevo97=Interfaz_Login.metJ.InsertarInicio("BorgesIG"   , 95,1,1,1,1,"Medio Campo");
    String Jnuevo98=Interfaz_Login.metJ.InsertarInicio("TejedaIG"   ,96,1,1,1,1,"Medio Campo");
    String Jnuevo99=Interfaz_Login.metJ.InsertarInicio("BolañosIG"   , 97,1,1,1,1,"Medio Campo");
    String Jnuevo100=Interfaz_Login.metJ.InsertarInicio("CampbellIG" , 98,1,1,1,1,"Delantero");
    String Jnuevo101=Interfaz_Login.metJ.InsertarInicio("RuizIG"   , 99,1,1,1,1,"Delantero");
    //Estados uruguay
    String Jnuevo102=Interfaz_Login.metJ.InsertarInicio("KeylorUR"   ,100,1,1,1,1,"Portero");
    String Jnuevo103=Interfaz_Login.metJ.InsertarInicio("GamboaUR"   ,101,1,1,1,1,"Defensa");
    String Jnuevo104=Interfaz_Login.metJ.InsertarInicio("AcostaUR"   ,102,1,1,1,1,"Defensa");
    String Jnuevo105=Interfaz_Login.metJ.InsertarInicio("GonzalezUR",103,1,1,1,1,"Defensa");
    String Jnuevo106=Interfaz_Login.metJ.InsertarInicio("UmañaUR"    , 104,1,1,1,1,"Defensa");
    String Jnuevo107=Interfaz_Login.metJ.InsertarInicio("CuberoUR"   , 105,1,1,1,1,"Medio Campo");
    String Jnuevo108=Interfaz_Login.metJ.InsertarInicio("BorgesUR"   , 106,1,1,1,1,"Medio Campo");
    String Jnuevo109=Interfaz_Login.metJ.InsertarInicio("TejedaUR"   ,107,1,1,1,1,"Medio Campo");
    String Jnuevo110=Interfaz_Login.metJ.InsertarInicio("BolañosUR"   , 108,1,1,1,1,"Medio Campo");
    String Jnuevo111=Interfaz_Login.metJ.InsertarInicio("CampbellUR" , 109,1,1,1,1,"Delantero");
    String Jnuevo112=Interfaz_Login.metJ.InsertarInicio("RuizUR"   , 110,1,1,1,1,"Delantero");
       //Estados Croacia
    String Jnuevo113=Interfaz_Login.metJ.InsertarInicio("KeylorCO"   ,111,1,1,1,1,"Portero");
    String Jnuevo114=Interfaz_Login.metJ.InsertarInicio("GamboaCO"   ,112,1,1,1,1,"Defensa");
    String Jnuevo115=Interfaz_Login.metJ.InsertarInicio("AcostaCO"   ,113,1,1,1,1,"Defensa");
    String Jnuevo116=Interfaz_Login.metJ.InsertarInicio("GonzalezCO",114,1,1,1,1,"Defensa");
    String Jnuevo117=Interfaz_Login.metJ.InsertarInicio("UmañaCO"    , 115,1,1,1,1,"Defensa");
    String Jnuevo118=Interfaz_Login.metJ.InsertarInicio("CuberoCO"   , 116,1,1,1,1,"Medio Campo");
    String Jnuevo119=Interfaz_Login.metJ.InsertarInicio("BorgesCO"   , 117,1,1,1,1,"Medio Campo");
    String Jnuevo120=Interfaz_Login.metJ.InsertarInicio("TejedaCO"   ,118,1,1,1,1,"Medio Campo");
    String Jnuevo121=Interfaz_Login.metJ.InsertarInicio("BolañosCO"   , 119,1,1,1,1,"Medio Campo");
    String Jnuevo122=Interfaz_Login.metJ.InsertarInicio("CampbellCO" , 120,1,1,1,1,"Delantero");
    String Jnuevo123=Interfaz_Login.metJ.InsertarInicio("RuizCO"   , 121,1,1,1,1,"Delantero");
         //Estados fRANCIA
    String Jnuevo124=Interfaz_Login.metJ.InsertarInicio("KeylorFR"   ,122,1,1,1,1,"Portero");
    String Jnuevo125=Interfaz_Login.metJ.InsertarInicio("GamboaFR"   ,123,1,1,1,1,"Defensa");
    String Jnuevo126=Interfaz_Login.metJ.InsertarInicio("AcostaFR"   ,124,1,1,1,1,"Defensa");
    String Jnuevo127=Interfaz_Login.metJ.InsertarInicio("GonzalezFR",125,1,1,1,1,"Defensa");
    String Jnuevo128=Interfaz_Login.metJ.InsertarInicio("UmañaFR"    , 126,1,1,1,1,"Defensa");
    String Jnuevo129=Interfaz_Login.metJ.InsertarInicio("CuberoFR"   , 127,1,1,1,1,"Medio Campo");
    String Jnuevo130=Interfaz_Login.metJ.InsertarInicio("BorgesFR"   , 128,1,1,1,1,"Medio Campo");
    String Jnuevo131=Interfaz_Login.metJ.InsertarInicio("TejedaFR"   ,129,1,1,1,1,"Medio Campo");
    String Jnuevo133=Interfaz_Login.metJ.InsertarInicio("BolañosFR"   , 130,1,1,1,1,"Medio Campo");
    String Jnuevo134=Interfaz_Login.metJ.InsertarInicio("CampbellFR" , 131,1,1,1,1,"Delantero");
    String Jnuevo135=Interfaz_Login.metJ.InsertarInicio("RuizFR"   , 132,1,1,1,1,"Delantero");
         //Estados Nigeria
    String Jnuevo136=Interfaz_Login.metJ.InsertarInicio("KeylorNG"   ,134,1,1,1,1,"Portero");
    String Jnuevo137=Interfaz_Login.metJ.InsertarInicio("GamboaNG"   ,135,1,1,1,1,"Defensa");
    String Jnuevo138=Interfaz_Login.metJ.InsertarInicio("AcostaNG"   ,136,1,1,1,1,"Defensa");
    String Jnuevo139=Interfaz_Login.metJ.InsertarInicio("GonzalezNG",137,1,1,1,1,"Defensa");
    String Jnuevo140=Interfaz_Login.metJ.InsertarInicio("UmañaNG"    , 138,1,1,1,1,"Defensa");
    String Jnuevo141=Interfaz_Login.metJ.InsertarInicio("CuberoNG"   , 139,1,1,1,1,"Medio Campo");
    String Jnuevo142=Interfaz_Login.metJ.InsertarInicio("BorgesNG"   , 140,1,1,1,1,"Medio Campo");
    String Jnuevo143=Interfaz_Login.metJ.InsertarInicio("TejedaNG"   ,141,1,1,1,1,"Medio Campo");
    String Jnuevo144=Interfaz_Login.metJ.InsertarInicio("BolañosNG"   , 142,1,1,1,1,"Medio Campo");
    String Jnuevo145=Interfaz_Login.metJ.InsertarInicio("CampbellNG" , 143,1,1,1,1,"Delantero");
    String Jnuevo146=Interfaz_Login.metJ.InsertarInicio("RuizNG"   , 144,1,1,1,1,"Delantero");
             //Estados España
    String Jnuevo147=Interfaz_Login.metJ.InsertarInicio("KeylorES"   ,145,1,1,1,1,"Portero");
    String Jnuevo148=Interfaz_Login.metJ.InsertarInicio("GamboaES"   ,146,1,1,1,1,"Defensa");
    String Jnuevo149=Interfaz_Login.metJ.InsertarInicio("AcostaES"   ,147,1,1,1,1,"Defensa");
    String Jnuevo150=Interfaz_Login.metJ.InsertarInicio("GonzalezES",148,1,1,1,1,"Defensa");
    String Jnuevo151=Interfaz_Login.metJ.InsertarInicio("UmañaES"    , 149,1,1,1,1,"Defensa");
    String Jnuevo152=Interfaz_Login.metJ.InsertarInicio("CuberoES"   , 150,1,1,1,1,"Medio Campo");
    String Jnuevo153=Interfaz_Login.metJ.InsertarInicio("BorgesES"   , 151,1,1,1,1,"Medio Campo");
    String Jnuevo154=Interfaz_Login.metJ.InsertarInicio("TejedaES"   ,152,1,1,1,1,"Medio Campo");
    String Jnuevo155=Interfaz_Login.metJ.InsertarInicio("BolañosES"   , 153,1,1,1,1,"Medio Campo");
    String Jnuevo156=Interfaz_Login.metJ.InsertarInicio("CampbellES" , 154,1,1,1,1,"Delantero");
    String Jnuevo157=Interfaz_Login.metJ.InsertarInicio("RuizES"   , 155,1,1,1,1,"Delantero");
               //Estados Grecia
    String Jnuevo158=Interfaz_Login.metJ.InsertarInicio("KeylorGR"   ,156,1,1,1,1,"Portero");
    String Jnuevo159=Interfaz_Login.metJ.InsertarInicio("GamboaGR"   ,157,1,1,1,1,"Defensa");
    String Jnuevo160=Interfaz_Login.metJ.InsertarInicio("AcostaGR"   ,158,1,1,1,1,"Defensa");
    String Jnuevo161=Interfaz_Login.metJ.InsertarInicio("GonzalezGR",159,1,1,1,1,"Defensa");
    String Jnuevo162=Interfaz_Login.metJ.InsertarInicio("UmañaGR"    , 160,1,1,1,1,"Defensa");
    String Jnuevo163=Interfaz_Login.metJ.InsertarInicio("CuberoGR"   , 161,1,1,1,1,"Medio Campo");
    String Jnuevo164=Interfaz_Login.metJ.InsertarInicio("BorgesGR"   , 162,1,1,1,1,"Medio Campo");
    String Jnuevo165=Interfaz_Login.metJ.InsertarInicio("TejedaGR"   ,163,1,1,1,1,"Medio Campo");
    String Jnuevo166=Interfaz_Login.metJ.InsertarInicio("BolañosGR"   , 164,1,1,1,1,"Medio Campo");
    String Jnuevo167=Interfaz_Login.metJ.InsertarInicio("CampbellGR" , 165,1,1,1,1,"Delantero");
    String Jnuevo168=Interfaz_Login.metJ.InsertarInicio("RuizGR"   , 166,1,1,1,1,"Delantero");
                //Estados Peru
    String Jnuevo169=Interfaz_Login.metJ.InsertarInicio("KeylorPR"   ,167,1,1,1,1,"Portero");
    String Jnuevo170=Interfaz_Login.metJ.InsertarInicio("GamboaPR"   ,168,1,1,1,1,"Defensa");
    String Jnuevo171=Interfaz_Login.metJ.InsertarInicio("AcostaPR"   ,169,1,1,1,1,"Defensa");
    String Jnuevo172=Interfaz_Login.metJ.InsertarInicio("GonzalezPR",170,1,1,1,1,"Defensa");
    String Jnuevo173=Interfaz_Login.metJ.InsertarInicio("UmañaPR"    , 171,1,1,1,1,"Defensa");
    String Jnuevo174=Interfaz_Login.metJ.InsertarInicio("CuberoPR"   , 172,1,1,1,1,"Medio Campo");
    String Jnuevo175=Interfaz_Login.metJ.InsertarInicio("BorgesPR"   , 173,1,1,1,1,"Medio Campo");
    String Jnuevo176=Interfaz_Login.metJ.InsertarInicio("TejedaPR"   ,174,1,1,1,1,"Medio Campo");
    String Jnuevo177=Interfaz_Login.metJ.InsertarInicio("BolañosPR"   , 175,1,1,1,1,"Medio Campo");
    String Jnuevo178=Interfaz_Login.metJ.InsertarInicio("CampbellPR" , 176,1,1,1,1,"Delantero");
    String Jnuevo179=Interfaz_Login.metJ.InsertarInicio("RuizPR"   , 177,1,1,1,1,"Delantero");
               //Estados Alemania
    String Jnuevo180=Interfaz_Login.metJ.InsertarInicio("KeylorAL"   ,178,1,1,1,1,"Portero");
    String Jnuevo181=Interfaz_Login.metJ.InsertarInicio("GamboaAL"   ,179,1,1,1,1,"Defensa");
    String Jnuevo182=Interfaz_Login.metJ.InsertarInicio("AcostaAL"   ,180,1,1,1,1,"Defensa");
    String Jnuevo183=Interfaz_Login.metJ.InsertarInicio("GonzalezAL",181,1,1,1,1,"Defensa");
    String Jnuevo184=Interfaz_Login.metJ.InsertarInicio("UmañaAL"    , 182,1,1,1,1,"Defensa");
    String Jnuevo185=Interfaz_Login.metJ.InsertarInicio("CuberoAL"   , 183,1,1,1,1,"Medio Campo");
    String Jnuevo186=Interfaz_Login.metJ.InsertarInicio("BorgesAL"   , 184,1,1,1,1,"Medio Campo");
    String Jnuevo187=Interfaz_Login.metJ.InsertarInicio("TejedaAL"   ,185,1,1,1,1,"Medio Campo");
    String Jnuevo188=Interfaz_Login.metJ.InsertarInicio("BolañosAL"   , 186,1,1,1,1,"Medio Campo");
    String Jnuevo189=Interfaz_Login.metJ.InsertarInicio("CampbellAL" , 187,1,1,1,1,"Delantero");
    String Jnuevo190=Interfaz_Login.metJ.InsertarInicio("RuizAL"   , 188,1,1,1,1,"Delantero");
    //Datos para equipos
    String EQnuevo1=Interfaz_Login.metE.InsertarInicio("Costa Rica", 0); //listo
    String EQnuevo2=Interfaz_Login.metE.InsertarInicio("Estados Unidos", 1); // listo
    String EQnuevo3=Interfaz_Login.metE.InsertarInicio("Honduras", 2);//listo
    String EQnuevo4=Interfaz_Login.metE.InsertarInicio("Mexico", 3);//listo
    String EQnuevo5=Interfaz_Login.metE.InsertarInicio("Portugal", 4);//listo
    String EQnuevo6=Interfaz_Login.metE.InsertarInicio("Brasil", 5);// listo
    String EQnuevo7=Interfaz_Login.metE.InsertarInicio("Italia", 6);//listo
    String EQnuevo8=Interfaz_Login.metE.InsertarInicio("Inglatera", 7);// listo
    String EQnuevo9=Interfaz_Login.metE.InsertarInicio("Urugay", 8);//listo
    String EQnuevo10=Interfaz_Login.metE.InsertarInicio("Croacia", 9);//LISTO
    String EQnuevo11=Interfaz_Login.metE.InsertarInicio("Francia", 10);// listo
    String EQnuevo12=Interfaz_Login.metE.InsertarInicio("Nigeria", 11);// listo
    String EQnuevo13=Interfaz_Login.metE.InsertarInicio("España", 12);//listo
    String EQnuevo14=Interfaz_Login.metE.InsertarInicio("Grecia", 13);//listo
    String EQnuevo15=Interfaz_Login.metE.InsertarInicio("Peru", 14);//listo
    String EQnuevo16=Interfaz_Login.metE.InsertarInicio("Alemania", 15);
    
    //Datos para torneo
    String Tnuevo1=Interfaz_Login.metT.insertarInicio("Mundial 2014");
    //Datos de enlace equipo/torneo
    String ENnuevo1=Interfaz_Login.metET.insertarInicioEnlaceTorneoEquipo("Mundial 2014","Costa Rica");
    String ENnuevo2=Interfaz_Login.metET.insertarInicioEnlaceTorneoEquipo("Mundial 2014","Estados Unidos");
    String ENnuevo3=Interfaz_Login.metET.insertarInicioEnlaceTorneoEquipo("Mundial 2014","Honduras");
    String ENnuevo4=Interfaz_Login.metET.insertarInicioEnlaceTorneoEquipo("Mundial 2014","Mexico");
    String ENnuevo5=Interfaz_Login.metET.insertarInicioEnlaceTorneoEquipo("Mundial 2014","Portugal");
    String ENnuevo6=Interfaz_Login.metET.insertarInicioEnlaceTorneoEquipo("Mundial 2014","Brasil");
    String ENnuevo7=Interfaz_Login.metET.insertarInicioEnlaceTorneoEquipo("Mundial 2014","Italia");
    String ENnuevo8=Interfaz_Login.metET.insertarInicioEnlaceTorneoEquipo("Mundial 2014","Inglatera");
    String ENnuevo9=Interfaz_Login.metET.insertarInicioEnlaceTorneoEquipo("Mundial 2014","Urugay");
    String ENnuevo10=Interfaz_Login.metET.insertarInicioEnlaceTorneoEquipo("Mundial 2014","Croacia");
    String ENnuevo11=Interfaz_Login.metET.insertarInicioEnlaceTorneoEquipo("Mundial 2014","Francia");
    String ENnuevo12=Interfaz_Login.metET.insertarInicioEnlaceTorneoEquipo("Mundial 2014","Nigeria");
    String ENnuevo13=Interfaz_Login.metET.insertarInicioEnlaceTorneoEquipo("Mundial 2014","España");
    String ENnuevo14=Interfaz_Login.metET.insertarInicioEnlaceTorneoEquipo("Mundial 2014","Grecia");
    String ENnuevo15=Interfaz_Login.metET.insertarInicioEnlaceTorneoEquipo("Mundial 2014","Peru");
    String ENnuevo16=Interfaz_Login.metET.insertarInicioEnlaceTorneoEquipo("Mundial 2014","Alemania");
    //Datos de enlace  equipo/entrenador
    String ENLnuevo1=Interfaz_Login.metEnE.insertarEnlaceEntrenadorEquipo("Oscar","Costa Rica");
    String ENLnuevo2=Interfaz_Login.metEnE.insertarEnlaceEntrenadorEquipo("Pinto","Honduras");
    String ENLnuevo3=Interfaz_Login.metEnE.insertarEnlaceEntrenadorEquipo("M.Herrera","Mexico");
    String ENLnuevo4=Interfaz_Login.metEnE.insertarEnlaceEntrenadorEquipo("Roy","Estados Unidos");
    String ENLnuevo5=Interfaz_Login.metEnE.insertarEnlaceEntrenadorEquipo("Bob","Portugal");
    String ENLnuevo6=Interfaz_Login.metEnE.insertarEnlaceEntrenadorEquipo("Andrey","Brasil");
    String ENLnuevo7=Interfaz_Login.metEnE.insertarEnlaceEntrenadorEquipo("Rammstein","Italia");
    String ENLnuevo8=Interfaz_Login.metEnE.insertarEnlaceEntrenadorEquipo("Skiller","Inglatera");
    String ENLnuevo9=Interfaz_Login.metEnE.insertarEnlaceEntrenadorEquipo("Red","Urugay");
    String ENLnuevo10=Interfaz_Login.metEnE.insertarEnlaceEntrenadorEquipo("Luis","Croacia");
    String ENLnuevo11=Interfaz_Login.metEnE.insertarEnlaceEntrenadorEquipo("Didier","Francia");
    String ENLnuevo12=Interfaz_Login.metEnE.insertarEnlaceEntrenadorEquipo("Bosque","Nigeria");
    String ENLnuevo13=Interfaz_Login.metEnE.insertarEnlaceEntrenadorEquipo("Alberto","España");
    String ENLnuevo14=Interfaz_Login.metEnE.insertarEnlaceEntrenadorEquipo("Fabio","Grecia");
    String ENLnuevo15=Interfaz_Login.metEnE.insertarEnlaceEntrenadorEquipo("Alejandro","Peru");
    String ENLnuevo16=Interfaz_Login.metEnE.insertarEnlaceEntrenadorEquipo("Joachim","Alemania");
    //Datos de enlace jugadores/equipo
    String JEnuevo1=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Costa Rica","KeylorCR");
    String JEnuevo2=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Costa Rica","CampbellCR");
    String JEnuevo3=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Costa Rica","GamboaCR");
    String JEnuevo4=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Costa Rica","AcostaCR");
    String JEnuevo5=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Costa Rica","RuizCR");
    String JEnuevo6=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Costa Rica","BolañosCR");
    String JEnuevo7=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Costa Rica","TejedaCR");
    String JEnuevo8=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Costa Rica","UmañaCR");
    String JEnuevo9=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Costa Rica","CuberoCR");
    String JEnuevo10=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Costa Rica","GonzalezCR");
    String JEnuevo11=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Costa Rica","BorgesCR");
    //Datos de enlace jugadores/equipo
    String JEnuevo12=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Estados Unidos","KeylorEU");
    String JEnuevo13=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Estados Unidos","CampbellEU");
    String JEnuevo14=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Estados Unidos","GamboaEU");
    String JEnuevo15=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Estados Unidos","AcostaEU");
    String JEnuevo16=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Estados Unidos","RuizEU");
    String JEnuevo17=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Estados Unidos","BolañosEU");
    String JEnuevo18=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Estados Unidos","TejedaEU");
    String JEnuevo19=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Estados Unidos","UmañaEU");
    String JEnuevo20=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Estados Unidos","CuberoEU");
    String JEnuevo21=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Estados Unidos","GonzalezEU");
    String JEnuevo22=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Estados Unidos","BorgesEU");
     //Datos de enlace jugadores/equipo
    String JEnuevo23=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Mexico","KeylorMX");
    String JEnuevo24=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Mexico","CampbellMX");
    String JEnuevo25=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Mexico","GamboaMX");
    String JEnuevo26=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Mexico","AcostaMX");
    String JEnuevo27=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Mexico","RuizMX");
    String JEnuevo28=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Mexico","BolañosMX");
    String JEnuevo29=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Mexico","TejedaMX");
    String JEnuevo30=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Mexico","UmañaMX");
    String JEnuevo31=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Mexico","CuberoMX");
    String JEnuevo32=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Mexico","GonzalezMX");
    String JEnuevo33=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Mexico","BorgesMX");
     //Datos de enlace jugadores/equipo
    String JEnuevo34=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Honduras","KeylorHO");
    String JEnuevo35=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Honduras","CampbellHO");
    String JEnuevo36=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Honduras","GamboaHO");
    String JEnuevo37=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Honduras","AcostaHO");
    String JEnuevo38=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Honduras","RuizHO");
    String JEnuevo39=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Honduras","BolañosHO");
    String JEnuevo40=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Honduras","TejedaHO");
    String JEnuevo41=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Honduras","UmañaHO");
    String JEnuevo42=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Honduras","CuberoHO");
    String JEnuevo43=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Honduras","GonzalezHO");
    String JEnuevo44=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Honduras","BorgesHO");
     //Datos de enlace jugadores/equipo
    String JEnuevo45=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Portugal","KeylorPO");
    String JEnuevo46=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Portugal","CampbellPO");
    String JEnuevo47=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Portugal","GamboaPO");
    String JEnuevo48=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Portugal","AcostaPO");
    String JEnuevo49=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Portugal","RuizPO");
    String JEnuevo50=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Portugal","BolañosPO");
    String JEnuevo51=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Portugal","TejedaPO");
    String JEnuevo52=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Portugal","UmañaPO");
    String JEnuevo53=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Portugal","CuberoPO");
    String JEnuevo54=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Portugal","GonzalezPO");
    String JEnuevo55=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Portugal","BorgesPO");
     //Datos de enlace jugadores/equipo
    String JEnuevo56=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Brasil","KeylorBR");
    String JEnuevo57=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Brasil","CampbellBR");
    String JEnuevo58=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Brasil","GamboaBR");
    String JEnuevo59=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Brasil","AcostaBR");
    String JEnuevo60=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Brasil","RuizBR");
    String JEnuevo61=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Brasil","BolañosBR");
    String JEnuevo62=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Brasil","TejedaBR");
    String JEnuevo63=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Brasil","UmañaBR");
    String JEnuevo64=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Brasil","CuberoBR");
    String JEnuevo65=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Brasil","GonzalezBR");
    String JEnuevo66=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Brasil","BorgesBR");
         //Datos de enlace jugadores/equipo
    String JEnuevo67=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Italia","KeylorIT");
    String JEnuevo68=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Italia","CampbellIT");
    String JEnuevo69=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Italia","GamboaIT");
    String JEnuevo70=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Italia","AcostaIT");
    String JEnuevo71=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Italia","RuizIT");
    String JEnuevo72=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Italia","BolañosIT");
    String JEnuevo73=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Italia","TejedaIT");
    String JEnuevo74=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Italia","UmañaIT");
    String JEnuevo75=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Italia","CuberoIT");
    String JEnuevo76=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Italia","GonzalezIT");
    String JEnuevo77=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Italia","BorgesIT");
          //Datos de enlace jugadores/equipo
    String JEnuevo78=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Inglatera","KeylorIG");
    String JEnuevo79=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Inglatera","CampbellIG");
    String JEnuevo80=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Inglatera","GamboaIG");
    String JEnuevo81=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Inglatera","AcostaIG");
    String JEnuevo82=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Inglatera","RuizIG");
    String JEnuevo83=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Inglatera","BolañosIG");
    String JEnuevo84=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Inglatera","TejedaIG");
    String JEnuevo85=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Inglatera","UmañaIG");
    String JEnuevo86=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Inglatera","CuberoIG");
    String JEnuevo87=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Inglatera","GonzalezIG");
    String JEnuevo88=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Inglatera","BorgesIG");
           //Datos de enlace jugadores/equipo
    String JEnuevo89=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Urugay","KeylorUR");
    String JEnuevo90=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Urugay","CampbellUR");
    String JEnuevo91=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Urugay","GamboaUR");
    String JEnuevo92=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Urugay","AcostaUR");
    String JEnuevo93=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Urugay","RuizUR");
    String JEnuevo94=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Urugay","BolañosUR");
    String JEnuevo95=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Urugay","TejedaUR");
    String JEnuevo96=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Urugay","UmañaUR");
    String JEnuevo97=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Urugay","CuberoUR");
    String JEnuevo98=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Urugay","GonzalezUR");
    String JEnuevo99=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Urugay","BorgesUR");
               //Datos de enlace jugadores/equipo
    String JEnuevo100=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Croacia","KeylorCO");
    String JEnuevo101=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Croacia","CampbellCO");
    String JEnuevo102=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Croacia","GamboaCO");
    String JEnuevo103=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Croacia","AcostaCO");
    String JEnuevo104=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Croacia","RuizCO");
    String JEnuevo105=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Croacia","BolañosCO");
    String JEnuevo106=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Croacia","TejedaCO");
    String JEnuevo107=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Croacia","UmañaCO");
    String JEnuevo108=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Croacia","CuberoCO");
    String JEnuevo109=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Croacia","GonzalezCO");
    String JEnuevo110=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Croacia","BorgesCO");
                   //Datos de enlace jugadores/equipo
    String JEnuevo111=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Francia","KeylorFR");
    String JEnuevo112=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Francia","CampbellFR");
    String JEnuevo113=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Francia","GamboaFR");
    String JEnuevo114=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Francia","AcostaFR");
    String JEnuevo115=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Francia","RuizFR");
    String JEnuevo116=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Francia","BolañosFR");
    String JEnuevo117=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Francia","TejedaFR");
    String JEnuevo118=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Francia","UmañaFR");
    String JEnuevo119=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Francia","CuberoFR");
    String JEnuevo120=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Francia","GonzalezFR");
    String JEnuevo121=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Francia","BorgesFR");
                    //Datos de enlace jugadores/equipo
    String JEnuevo122=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Nigeria","KeylorNG");
    String JEnuevo123=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Nigeria","CampbellNG");
    String JEnuevo124=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Nigeria","GamboaNG");
    String JEnuevo125=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Nigeria","AcostaNG");
    String JEnuevo126=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Nigeria","RuizNG");
    String JEnuevo127=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Nigeria","BolañosNG");
    String JEnuevo128=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Nigeria","TejedaNG");
    String JEnuevo129=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Nigeria","UmañaNG");
    String JEnuevo130=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Nigeria","CuberoNG");
    String JEnuevo131=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Nigeria","GonzalezNG");
    String JEnuevo132=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Nigeria","BorgesNG");
                    //Datos de enlace jugadores/equipo
    String JEnuevo133=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("España","KeylorES");
    String JEnuevo134=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("España","CampbellES");
    String JEnuevo135=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("España","GamboaES");
    String JEnuevo136=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("España","AcostaES");
    String JEnuevo137=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("España","RuizES");
    String JEnuevo138=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("España","BolañosES");
    String JEnuevo139=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("España","TejedaES");
    String JEnuevo140=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("España","UmañaES");
    String JEnuevo141=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("España","CuberoES");
    String JEnuevo142=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("España","GonzalezES");
    String JEnuevo143=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("España","BorgesES");
                    //Datos de enlace jugadores/equipo
    String JEnuevo144=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Grecia","KeylorGR");
    String JEnuevo145=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Grecia","CampbellGR");
    String JEnuevo146=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Grecia","GamboaGR");
    String JEnuevo147=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Grecia","AcostaGR");
    String JEnuevo148=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Grecia","RuizGR");
    String JEnuevo149=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Grecia","BolañosGR");
    String JEnuevo150=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Grecia","TejedaGR");
    String JEnuevo151=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Grecia","UmañaGR");
    String JEnuevo152=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Grecia","CuberoGR");
    String JEnuevo153=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Grecia","GonzalezGR");
    String JEnuevo154=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Grecia","BorgesGR");
                        //Datos de enlace jugadores/equipo
    String JEnuevo156=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Peru","KeylorPR");
    String JEnuevo157=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Peru","CampbellPR");
    String JEnuevo158=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Peru","GamboaPR");
    String JEnuevo159=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Peru","AcostaPR");
    String JEnuevo160=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Peru","RuizPR");
    String JEnuevo161=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Peru","BolañosPR");
    String JEnuevo162=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Peru","TejedaPR");
    String JEnuevo163=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Peru","UmañaPR");
    String JEnuevo164=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Peru","CuberoPR");
    String JEnuevo165=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Peru","GonzalezPR");
    String JEnuevo166=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Peru","BorgePR");
                           //Datos de enlace jugadores/equipo
    String JEnuevo167=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Alemania","KeylorAL");
    String JEnuevo168=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Alemania","CampbellAL");
    String JEnuevo169=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Alemania","GamboaAL");
    String JEnuevo170=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Alemania","AcostaAL");
    String JEnuevo171=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Alemania","RuizAL");
    String JEnuevo172=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Alemania","BolañosAL");
    String JEnuevo173=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Alemania","TejedaAL");
    String JEnuevo174=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Alemania","UmañaAL");
    String JEnuevo175=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Alemania","CuberoAL");
    String JEnuevo176=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Alemania","GonzalezAL");
    String JEnuevo177=Interfaz_Login.metJE.enlazarEquipoJugadorLibre("Alemania","BorgeAL");
    
        new Interfaz_Login(new MetodosLogin()).setVisible(true);
    }
    
}
