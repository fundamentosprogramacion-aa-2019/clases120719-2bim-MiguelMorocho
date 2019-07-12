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
public class Paralelo {
    private String nombre;
    private Asignatura [] lista;
    
  
    public void establecerNombre (String n){
        nombre = n;
    }
    public void establecerAsignatura(Asignatura [] n){
        lista = n;
    }
    public String obtenerNombre(){
        return nombre;
    }
    public Asignatura [] obtenerAsignatura(){
        return lista;
    }   
}
