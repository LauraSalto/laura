/*
 *Crear un programa que pida una frase y si esa frase es igual a “eureka” 
el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de 
Incorrecto. Nota: investigar la función equals() en Java.

 */
package Guia3;

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
        
        System.out.println("Ingrese una frase");
        
        String frase = leer.nextLine();
        
        if ("eureka".equals(frase)){
            System.out.println("Correcto!");
        } else {
            System.out.println("incorrecto");
        }
                   
    }
    
}
