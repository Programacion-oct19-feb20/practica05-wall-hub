/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author reroes
 */
public class OperadoresAritmeticos {

    public static void main(String[] args) {
        int valorA = 10;
        int valorB = 2;

        System.out.printf("Suma: %d + %d = %d\n", valorA, valorB,
                valorA + valorB);
        System.out.printf("Resta: %d - %d = %d\n", valorA, valorB,
                valorA - valorB);
        System.out.printf("Multiplicación: %d * %d = %d\n", valorA, valorB,
                valorA * valorB);
        System.out.printf("División: %d / %d = %d\n", valorA, valorB,
                valorA / valorB);
        System.out.printf("Módulo o Resto: %d %% %d = %d\n", valorA, valorB,
                valorA % valorB);
    }

}
