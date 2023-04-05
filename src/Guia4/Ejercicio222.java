/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia4;

import java.util.Scanner;

/**
 *
 * @author mlsal
 */
public class Ejercicio222 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese un segundo numero");
        int num2 = leer.nextInt();
        
        System.out.println("Que opcion queres? 1. suma 2. resta 3.multiplicacion 4. division");
        int option = leer.nextInt();
        
        Switch (option){
            case 1:
                resultado = suma(num1,num2);
            System.out.println(resultado);
            
            case 2:
                resultado = resta(num1,num2)
            System.out.println(resultado);
        
    }
    }
    public static int suma(int num1, int num2);

    private static void Switch(int option) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        int resultado = num1 + num2;
        return resultado;
        
    public static int resta (int num1, num2);
    
}
