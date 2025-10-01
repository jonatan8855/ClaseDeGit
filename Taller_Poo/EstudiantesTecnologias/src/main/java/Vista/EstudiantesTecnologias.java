/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Vista;
import javax.swing.JOptionPane;
import Model.Estudiante;
import Model.Desarrollo;
import Model.Matematicas;
import Model.ListaEstudiantes;
/**
 *
 * @author Jonatan
 */
public class EstudiantesTecnologias {

    static Estudiante[] estudiantes;

    public static void main(String[] args) {
        int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "Menú\n" +
                "1. Agregar Estudiantes\n" +
                "2. Listar Estudiantes\n" +
                "3. Ordenar por Nota Definitiva\n" +
                "4. Salir\n\n" +
                "Elija una opción:"
            ));

            switch (opcion) {
                case 1:
                    agregarEstudiantes();
                    break;
                case 2:
                    listarEstudiantes();
                    break;
                case 3:
                    ordenarPorDefinitiva();
                    listarEstudiantes();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida");
            }
        } while (opcion != 4);
    }

    public static void agregarEstudiantes() {
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cuantos estudiantes va a ingresar?"));
        estudiantes = new Estudiante[cantidad];

        for (int i = 0; i < estudiantes.length; i++) {
            int codigo = Integer.parseInt(JOptionPane.showInputDialog("codigo del estudiante " + (i + 1) + " (mayor a 21000):"));
            String nombre = JOptionPane.showInputDialog("nombre:");
            double notaDesarrollo = Double.parseDouble(JOptionPane.showInputDialog("Nota de Desarrollo:"));
            double notaMate = Double.parseDouble(JOptionPane.showInputDialog("Nota de Matematicas:"));

            estudiantes[i] = new Estudiante(codigo, nombre, notaDesarrollo, notaMate);
            estudiantes[i].calcularDefinitiva();
        }

        JOptionPane.showMessageDialog(null, "Se ingresaron " + cantidad + "  de estudiantes");
    }

    public static void listarEstudiantes() {
        if (estudiantes == null) {
            JOptionPane.showMessageDialog(null, "debe agregar estudiantes primero.");
            return;
        }

        String lista = "";
        for (int i = 0; i < estudiantes.length; i++) {
            lista += "\n--- Estudiante " + (i + 1) + " ---\n";
            lista += estudiantes[i].mostrarDatos() + "\n";
        }
        JOptionPane.showMessageDialog(null, lista);
    }

    public static void ordenarPorDefinitiva() {
        if (estudiantes == null) {
            JOptionPane.showMessageDialog(null, "Debe agregar estudiantes primero.");
            return;
        }

        for (int i = 0; i < estudiantes.length - 1; i++) {
            for (int j = 0; j < estudiantes.length - 1 - i; j++) {
                if (estudiantes[j].getDefinitiva() > estudiantes[j + 1].getDefinitiva()) {
                    Estudiante temp = estudiantes[j];
                    estudiantes[j] = estudiantes[j + 1];
                    estudiantes[j + 1] = temp;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Lista ordenada por nota definitiva (ascendente).");
    }
}
