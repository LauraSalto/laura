/*
 *Escriba un programa que pida una frase o palabra y valide si la primera 
letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá 
de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, 
se deberá imprimir “INCORRECTO”. Nota: investigar la función Substring y 
equals() de Java.

 */
package Guia3;

import java.util.Scanner;

/**
 *
 * @author mlsal
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase=leer.nextLine();
        if (frase.substring(0,1).equalsIgnoreCase("a")){
            System.out.println("CORRECTO");
            
        }else{
            System.out.println("incorrecto");
        }
        
        
    }
    
}
