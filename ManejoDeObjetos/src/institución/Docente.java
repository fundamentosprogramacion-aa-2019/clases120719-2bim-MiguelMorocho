/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package institución;

/**
 *
 * @author INSPIRON
 */
public class Docente {
     private String nombre;
     private int aniosExperiencia;
     private int edad;
   
    public void establecerNombre(String n){
        nombre = n;
    }    
    public void establecerAniosExperiencia (int ex){
        aniosExperiencia = ex;
    }
    public void estableceredad (int ex){
        edad = ex;
    }
    public String obtenerNombre(){
        return nombre;
    }
    public int obtenerAniosExperiencia(){
        return aniosExperiencia;
    }
    public int obteneredad (){
        return edad; 
 
     }
}
