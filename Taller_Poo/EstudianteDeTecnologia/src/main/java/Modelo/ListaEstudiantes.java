/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Jonatan
 */
public class ListaEstudiantes {
    
     Estudiante[] estudiantes;

    // Constructor recibe el   desde el main
    public ListaEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    // Ordenar estudiantes  
    public void ordenar() {
        for (int i = 0; i < estudiantes.length - 1; i++) {
            for (int j = 0; j < estudiantes.length - 1 - i; j++) {
                if (estudiantes[j].getDefinitiva() > estudiantes[j + 1].getDefinitiva()) {
                    Estudiante temp = estudiantes[j];
                    estudiantes[j] = estudiantes[j + 1];
                    estudiantes[j + 1] = temp;
                }
            }
        }
    }

    // Mostrar estudiantes
    public String mostrar() {
        String lista = "";
        for (int i = 0; i < estudiantes.length; i++) {
            lista += "\n--- Estudiante " + (i + 1) + " ---\n";
            lista += estudiantes[i].mostrarDatos() + "\n";
        }
        return lista;
    }
    
}
