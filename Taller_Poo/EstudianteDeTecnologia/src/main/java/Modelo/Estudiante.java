/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Jonatan
 */
public class Estudiante {
    
    private int codigo;
    private String nombre;
    private Desarrollo desarrollo;
    private Matematicas matematicas;
    private double definitiva;

    public Estudiante(int codigo, String nombre, double notaDesarrollo, double notaMate) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.desarrollo = new Desarrollo(notaDesarrollo);
        this.matematicas = new Matematicas(notaMate);
    }

    public void calcularDefinitiva() {
        definitiva = (desarrollo.getNota() * 0.55) + (matematicas.getNota() * 0.45);
    }

    public double getDefinitiva() {
        return definitiva;
    }

    public String mostrarDatos() {
        return "Código: " + codigo +
               "\nNombre: " + nombre +
               "\nNota Desarrollo: " + desarrollo.getNota() +
               "\nNota Matemáticas: " + matematicas.getNota() +
               "\nDefinitiva: " + definitiva +
               "\nAprobación: " + (definitiva >= 3.5 ? "SI APRUEBA" : "NO APRUEBA");
    }
    
}
