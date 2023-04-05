/*
 Realizar un algoritmo que calcule la suma de todos los elementos de un vector 
de tamaño N, con los valores ingresados por el usuario.

 */
package Guia5;

import java.util.Scanner;

/**
 *
 * @author mlsal
 */
public class Ejercicio1extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int tamaño = leer.nextInt();
        int[] arreglo = new int[tamaño];
        
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Ingrese el numero de la posicion"+i);
            int num = leer.nextInt();
            
            int sum = num[i]
            
            for (int i = 0; i < tamaño; i++) {
                System.out.println("la suma de los números es"+suma[i]);
        }
            
        
        
            
        }
        
    }
    
}
