/*
 *Escriba un programa en el cual se ingrese un valor límite positivo, 
y a continuación solicite números al usuario hasta que la suma de 
los números introducidos supere el límite inicial.

 */
package Guia3;

import java.util.Scanner;

/**
 *
 * @author mlsal
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int limite, num1, aux, suma = 0;
        System.out.println("Ingrese un numero limite");
        limite = leer.nextInt();
        
        
       
        do{
            System.out.println("Ingrese un numero");
            num1=leer.nextInt();
            suma += num1;
            System.out.println("La suma de los numeros es:" +suma);
            
        } while (suma<=limite);
        System.out.println("Se supero el limite");
        }
        
    }
    

