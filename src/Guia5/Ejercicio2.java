/*
 *Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios 
y le pida al usuario un número a buscar en el vector. El programa mostrará dónde 
se encuentra el numero y si se encuentra repetido

 */
package Guia5;

import java.util.Scanner;

/**
 *
 * @author mlsal
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int tamaño = leer.nextInt();
        int[] arreglo = new int[tamaño];
        
        for (int i = 0; i < tamaño; i++) {
            arreglo[i] = (int) (Math.random()*10)+1;
              
        }
        //lo agregue para ver que se imprimia
        System.out.println("el vector es " + arreglo);
        
        System.out.println("Que número queres buscar?");
        int numeroBuscado = leer.nextInt();
        int contador = 0;
        
        for(int i = 0; i < tamaño; i++){
            if (arreglo[i] == numeroBuscado){
                System.out.println("El número está en la posición" +i);
                contador++;
            }
        }
        if (contador >= 2){
            System.out.println("El número se repite" + contador + "veces");
            
        }
        if (contador == 0 ){
            System.out.println("El número no se encontró");
        }
    }
    
}
