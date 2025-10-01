/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Modelo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Jonatan
 */
public class EstudianteTest {
    
     @Test
    public void testCalcularDefinitiva() {
        
        Estudiante est = new Estudiante(21001, "Ana", 4.0, 3.0);
        
        //  metodo de aprobar
        est.calcularDefinitiva();
        
        //  verificacion de resultados
        double esperado = (4.0 * 0.55) + (3.0 * 0.45); // 3.55
        assertEquals(esperado, est.getDefinitiva(), 0.01); 
    }
    
    @Test
    public void testAprobacion() {
        Estudiante est = new Estudiante(21002, "Pedro", 2.0, 3.0);
        est.calcularDefinitiva();
        
        // Si la definitiva es < 3.5 NO aprueba
        assertTrue(est.getDefinitiva() < 3.5, "El estudiante no aprobar");
    }
}
