/*
 *Crea un procedimiento EsMultiplo que reciba los dos números pasados por el 
usuario, validando que el primer número múltiplo del segundo e imprima si el 
primer número es múltiplo del segundo, sino informe que no lo son.

 */
package Guia4;

import java.util.Scanner;

/**
 *
 * @author mlsal
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crea un procedimiento EsMultiplo que reciba los dos números pasados 
        por el usuario, validando que el primer número múltiplo del segundo e 
        imprima si el primer número es múltiplo del segundo, sino informe que no lo son*/
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 números");
        int num1 = leer.nextInt(), num2 = leer.nextInt();
        EsMultiplo(num1, num2);
    }
    public static void EsMultiplo(int n1, int n2) {

        if(n1 % n2 == 0){
            System.out.println("El número " + n1 + " es múltiplo de " + n2);
        }else{
            System.out.println("El número " + n1 + " no es múltiplo de " + n2);
        }
    