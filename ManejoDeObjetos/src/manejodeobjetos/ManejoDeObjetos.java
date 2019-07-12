/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejodeobjetos;
import institución.Asignatura;
import institución.Docente;

/**
 *
 * @author INSPIRON
 */
public class ManejoDeObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Crear objeto docente
        
        Docente d = new Docente();
        d.establecerNombre("Rodrigo Estrada");
        d.establecerAniosExperiencia(10);
        d.estableceredad(30);
        
        Docente d2 = new Docente();
        d2.establecerNombre("Jhon Calle");
        d2.establecerAniosExperiencia(5);
        d2.estableceredad(31);
        
        Asignatura a1 = new Asignatura();
        a1.establecerNombre ("Programación");
        a1.establecerHorario ("Viernes: 08:-11");
        a1.establecerCreditos (4);
        a1.establecerDocente (d); 
        
        Asignatura a2 = new Asignatura();
        a2.establecerNombre("Base de Datos");
        a2.establecerHorario("Jueves: 10-13");
        a2.establecerCreditos(3);
        a2.establecerDocente(d2);
        
        Asignatura [] lista = new Asignatura [2];
        lista[0] = a1;
        lista[1] = a2;
        
        for (int i = 0; i < lista.length; i ++){
            System.out.printf ("Asignatura: %s\nDocente: \n\tNombre: %s"
                    + "\n\tEdad: %d\n",
                    lista [i].obtenerNombre (),
                    lista [i].obtenerDocente().obtenerNombre(),
                    lista [i].obtenerDocente().obteneredad());
        }
        for (int i = 0; i < lista.length; i ++){
            Asignatura a = lista[i];
  
            System.out.printf ("Asignatura: %s\nDocente: \n\tNombre: %s"
                    + "\n\tEdad: %d\n",
                    a.obtenerNombre(),
                    a.obtenerDocente().obtenerNombre(),
                    a.obtenerDocente().obteneredad());
    }
    }
}
