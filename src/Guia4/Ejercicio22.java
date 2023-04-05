/*
 *Diseñe una función que pida el nombre y la edad de N personas e imprima los 
datos de las personas ingresadas por teclado e indique si son mayores o menores 
de edad. Después de cada persona, el programa debe preguntarle al usuario si 
quiere seguir mostrando personas y frenar cuando el usuario ingrese 
la palabra “No”.

 */
package Guia4;

import java.util.Scanner;

/**
 *
 * @author mlsal
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        adulto();
    }

    public static void adulto() {
        Scanner leer = new Scanner(System.in);

        String confirma;
        do {
            System.out.println("Ingrese el nombre y la edad de la persona");
            String nombre = leer.nextLine();
            int edad = leer.nextInt();
         
            if (edad >= 18) {
                System.out.println(nombre + " es mayor de edad");
            } else {
                System.out.println(nombre + " es menor de edad");
            }

            System.out.println("desea agregar otra persona?");
            confirma=leer.next();
            
            confirma = leer.nextLine();

        } while (confirma.equalsIgnoreCase("si"));
    }

}
