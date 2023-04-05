/*
 * Crea una aplicación que le pida dos números al usuario y este pueda elegir 
entre sumar, restar, multiplicar y dividir. 
La aplicación debe tener una función para cada operación matemática y deben 
devolver sus resultados para imprimirlos en el main. 

 */
package Guia4;

import java.util.Scanner;

/**
 *
 * @author mlsal
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        int num1 = leer.nextInt(), num2 = leer.nextInt();
        System.out.println("Que operación desea realizar?");
        
        System.out.println("1:sumar\n2:restar\n3:dividir\n4:multiplicar\n");
        
        int eleccion = leer.nextInt();
        
        switch (eleccion) {
            case 1:
                System.out.println("La suma de los numeros es:"+sumar(num1, num2));
                break;
            case 2:
                System.out.println("La resta de los numeros es:"+resta(num1, num2));
                break;
            case 3:
                System.out.println("La multiplicacion de los numeros es:"+multiplicacion(num1, num2));
            case 4:
                System.out.println("La division de los numeros es:"+division(num1, num2));
        }
    }
    public static int sumar(int n1, int n2) {
        return n1 + n2; 
    }
    public static int resta(int n1, int n2) {
        return n1 - n2; 
    }
    public static int multiplicacion(int n1, int n2) {
        return n1 * n2; 
    }   
    public static int division(int n1, int n2) {
        return n1 / n2; 
    }
}