/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.infomaterias;
import Modelo.GrupoClas;
import Modelo.Materia;

/**
 *
 * @author Jonatan
 */
public class InfoMaterias {

    
    public static void main(String[] args) {
       
        Materia materia = new Materia("MAT01", "Matemáticas", 3);

        
        GrupoClas g1 = new GrupoClas(1, "Carlos", 4.2, 20, 15);
        GrupoClas g2 = new GrupoClas(2, "Ana", 3.5, 18, 13);
        GrupoClas g3 = new GrupoClas(3, "Luis", 1.9, 25, 12);

     
        materia.agregarGrupo(g1);
        materia.agregarGrupo(g2);
        materia.agregarGrupo(g3);

       
        System.out.println("=== Reporte de las materia ===");
        System.out.println(materia);

      
        System.out.println("Grupo 1 perdió: " + g1.porcentajeQuePerdio() + "%");

         
        System.out.println("\n=== busqueda de grupos ===");
        System.out.println("Grupo 2 -> " + materia.buscarGrupo(2));
        System.out.println("Grupo 99 -> " + materia.buscarGrupo(99));

 
        System.out.println("\n Mayor promedio: " + materia.mayorPromedioDeGrupo());

       
        materia.modificarProfesor(3, "Juan");
        System.out.println("\n Después de cambiar profesor:");
        System.out.println(materia.buscarGrupo(3));
    }
}
