/*
 * Realizar un programa que pida dos números enteros positivos por teclado 
y muestre por pantalla el siguiente menú:El usuario deberá elegir una opción 
y el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
El programa deberá ejecutarse hasta que se elija la opción 5. 
Tener en cuenta que, si el usuario selecciona la opción 5, 
en vez de salir del programa directamente, se debe mostrar el siguiente mensaje 
de confirmación: ¿Está seguro que desea salir del programa (S/N)? 
Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario 
se vuelve a mostrar el menú.


 */
package Guia3;

import java.util.Scanner;

/**
 *
 * @author mlsal
 */
public class Ejercicio66 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros positivos");
        int num1=leer.nextInt(), num2=leer.nextInt(), opcion;
        
        do{
        
        System.out.println(" MENU \n 1-SUMAR \n 2-RESTAR \n3-MULTIPLICAR \n 4-DIVIDIR \n 5-SALIr \N");
        int opcion = leer.nextLine();
        
        switch (opcion){
            case 1: 
                System.out.println("la suma de los dos numeros es: "+(num1+num2));
            case 2:
                System.out.println("la resta de los dos numeros es:"+(num1-num2));
            case 3:
                System.out.println("el producto de los dos numeros es:"+(num1*num2));
            case 4:
                System.out.println("el cociente de los dos numeros es:"+(num1/num2));
            case 5:
                System.out.println("esta seguro que quiere salir? (S/N");
                String resp = leer.next();
                
                if (resp.equalsIgnoreCase("S")){
                    System.out.println("Gracias por usar la calculadora");
                    break;
                }else{
                    opcion=(7);
                }
        }while(opcion!=5)  
    }
    
}
