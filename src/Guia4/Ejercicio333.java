/*
 *  Crea una aplicación que a través de una función nos convierta una cantidad 
de euros introducida por teclado a otra moneda, estas pueden ser a dólares, 
yenes o libras. La función tendrá como parámetros, la cantidad de euros y la 
moneda a convertir que será una cadena, este no devolverá ningún valor y 
mostrará un mensaje indicando el cambio (void).
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
public class Ejercicio333 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros");
        double euros = leer.nextDouble();
        System.out.println("A que moneda lo quiere convertir?");
        int option = leer.nextInt();
        switch (option){
            case 1:
                libras(euros);
                break;
            case 2:
                dolares(euros);
                break;
            case 3:
                yenes(euros);
                break;
            default :
                System.out.println("La opcion elegida es incorrecta");
                
            
        }
        
    }
    public static void libras(double euros){
        double libras = euros * 0.86;
        System.out.println("La cantidad es igual a "+ libras);
    }
    
    public static void dolares(double euros){
        double dolares = euros * 1.28;
        System.out.println("La cantidad es igual a "+ dolares);
    }
    public static void yenes(double euros){
        double libras = euros * 129.8;
        System.out.println("La cantidad es igual a "+ yenes);
    }
}
