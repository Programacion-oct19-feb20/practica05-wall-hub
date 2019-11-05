/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author UTPL
 * Un padre de familia ha pagado 3 cuotas de navidad de sus hijos la cuota 1 fue
 * de $15 dólares, la cuota 2 de $10 dólares, y la cuota 3 de $16 dólares. 
 * Generar un programa en lenguaje java que permita ingresar por teclado el 
 * valor de las cuotas luego presentar el promedio de dólares pagados entre las
 * cuotas, además presentar un mensaje en pantalla (true o false) dependiendo
 * del promedio, si el promedio es >= 11 deberia salir true (11 => true), si el 
 * promedio es < 11 deberia salir false (< 11 => false)
 * 
 */
public class Ejercicio1 {
    
     public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in); 
         int cuota1;
         int cuota2;
         int cuota3;
        
         
         System.out.println("Ingrese el valor de la cuota 1");
         cuota1 = entrada.nextInt();
         System.out.println("Ingrese el valor de la cuota 2");
         cuota2 = entrada.nextInt();
         System.out.println("Ingrese el valor de la cuota 3");
         cuota3 = entrada.nextInt();
         
         int promedio = cuota1 + cuota2 + cuota3; // Suma de toda las cuotas.
         
         
         System.out.printf("El promedio de dólares pagados entre las cuotas es:"
                 + "\n%d >= 11 %s\n", promedio, 11 <= promedio);
        
    }    
}
