/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;
import java.io.*;
/**
 *
 * @author Usuario
 */
public class Gestion_de_Imagenes {
    FileInputStream entrada;
    FileOutputStream salida;
    File archivo;
    
    public Gestion_de_Imagenes(){
        
    }

    /*Abrir una imagen*/
    public byte[] AbrirAImagen(File archivo){
        byte[] bytesImg = new byte[1024*100];
        try {
            entrada = new FileInputStream(archivo);
            entrada.read(bytesImg);
        } catch (Exception e) {
        }
        return bytesImg;
    }
    
}
