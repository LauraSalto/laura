package Guia2;

import java.util.Scanner;

/*
 * Escribir un programa que pida dos números enteros por teclado 
y calcule la suma de los dos. 
El programa deberá después mostrar el resultado de la suma

 */

/**
 *
 * @author mlsal
 */
public class Ejercicio1 {
  public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);

        System.out.println("Ingrese el nro 1");
        int numero1 = leer.nextInt();
        System.out.println("Ingrese el nro 2");
        int numero2 = leer.nextInt();

        int res = numero1+numero2;

        System.out.println("La suma es de " +  res );
    }  
}
 