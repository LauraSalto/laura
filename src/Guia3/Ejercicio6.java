/*
 Implementar un programa que le pida dos números enteros al usuario y 
determine si ambos o alguno de ellos es mayor a 25.

 */
package Guia3;


import java.util.Scanner;

/**
 *
 * @author mlsal
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int numero1 = leer.nextInt();
        System.out.println("Ingrese otro numero");
        int numero2 = leer.nextInt();
        if (numero1 >= 25 && numero2 >= 25) {
            System.out.println("los números ingresados son mayores o iguales a 25");
        } else if (numero1 < 25 && numero2 < 25){

        System.out.println("ambos números son menores a 25");

        }
    else if (numero1 > 25 && numero2 <= 25){
        System.out.println("el primer numero es mayor a 25 pero el segundo no");
    }else{

   
    System.out.println ("El segundo es mayor, pero el primero no");
    }
    }
}


