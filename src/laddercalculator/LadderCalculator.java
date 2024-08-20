/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laddercalculator;

/**
 *
 * @author Usuario
 */
import java.lang.Math;

public class LadderCalculator {
    
      // Método para calcular la longitud de la escalera 

    public static double calculateLadderLength(double height, double angleInDegrees) { 
        double angleInRadians = Math.toRadians(angleInDegrees); // Convertir el ángulo de grados a radianes
        return height / Math.cos(angleInRadians); // Aplicar la fórmula trigonométrica
    } 

        public static void main(String[] args) {      
                 
        double x = 5; // Ejemplo de altura de la escalera 
        double alpha = 60; // Ejemplo de ángulo en grados 
        
        double y = calculateLadderLength(x, alpha); // Calcular la longitud de la escalera 
        
       System.out.println("La longitud de la escalera es: " + y); // Imprimir el resultado 
    }    
}

