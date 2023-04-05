/*
 * Realizar un algoritmo que llene un vector con los 100 primeros números 
enteros y los muestre por pantalla en orden descendente.

 */
package Guia5;

/**
 *
 * @author mlsal
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arreglo = new int[100];
        
        for(int i = 0; i < 100; i++){
            arreglo[i] = i+1;
            
        }
        
        for(int i=99; i < 0; i--){
            System.out.println(arreglo[i]);
        }
    }
    
}
