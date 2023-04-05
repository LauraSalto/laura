/*
 * Escriba un programa que valide si una nota está entre 0 y 10, 
sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
package Guia3;

import java.util.Scanner;

/**
 *
 * @author mlsal
 */
public class EjercicioTeoría4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int nota;
        
        System.out.println("Ingrese una nota");
        
        nota = leer.nextInt();
        
        while(nota<=0 || nota>=10){
        
        System.out.println("Ingrese otra nota");
        nota = leer.nextInt();
        }
    }
    
}
