/*
 Escribir un programa que pida una frase y la muestre toda en mayúsculas 
y después toda en minúsculas. 
Nota: investigar la función toUpperCase() y toLowerCase() en Java.

 */
package Guia2;

import java.util.Scanner;

/**
 *
 * @author mlsal
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase");
        frase=leer.next();
        System.out.println Uppercase(frase);// TODO code application logic here
    }
}
