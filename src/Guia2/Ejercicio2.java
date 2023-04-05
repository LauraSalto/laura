/*
 * Escribir un programa que pida tu nombre, lo guarde en una variable 
y lo muestre por pantalla.

 */
package Guia2;


import java.util.Scanner;

/**
 *
 * @author mlsal
 */
public class Ejercicio2 {
           
    public static void main(String[] args) {
 //se crea una variable Scanner que se utiliza para leer los datos del usuario
    Scanner leer = new Scanner(System.in);
 // Se crea una variable String que se utiliza para leer los datos del ususario
    String nombre;
 //Muestra un mensaje por pantalla
    System.out.println("Ingresa tu nombre");
    nombre=leer.next();
    System.out.println("Su nombre es " + nombre );
    }
}
