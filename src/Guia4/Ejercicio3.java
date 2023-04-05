/*
 * Crea una aplicación que a través de una función nos convierta una cantidad 
de euros introducida por teclado a otra moneda, estas pueden ser a dólares, 
yenes o libras. La función tendrá como parámetros, la cantidad de euros y 
la moneda a convertir que será una cadena, este no devolverá ningún valor 
y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */
package Guia4;

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
        
        System.out.println("Ingrese la cantidad de euros");
        int euro= leer.nextInt();
        System.out.println("Indique el tipo de moneda a convertir:");
        System.out.println("1-dolares");
        System.out.println("2-yenes");
        System.out.println("3-libras");
        int eleccion=leer.nextInt();
        
        conversion(euros, eleccion);
        
        switch(eleccion){
            case 1:
                System.out.println(euros*1.28+"dolares");
            case 2:
                System.out.println("");
        }
        String cambio = sc.next();
        
    }
    
}
