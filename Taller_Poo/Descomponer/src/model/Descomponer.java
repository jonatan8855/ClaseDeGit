/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;
import javax.swing.JOptionPane;
/**
 *
 * @author Jonatan
 */
public class Descomponer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero; 
       
        numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        
        
        int n=0;
        
            if (numero < 100 ||  numero > 999) { 
                JOptionPane.showMessageDialog(null, "Debe ingresar un número de 3 dígitos.");
            } else {
                int unidad = numero % 10;
                int decena = (numero / 10) % 10;
                int centena = numero / 100; 
                
                
             if (centena == unidad) {
                JOptionPane.showMessageDialog(null, "El numero " + numero + " si es capicua.");
            } else {
                JOptionPane.showMessageDialog(null, "El numero " + numero + " nO es capicua.");
            }
                
            }
        
    }
    
}
