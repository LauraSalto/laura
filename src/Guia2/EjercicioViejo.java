/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2;

import java.util.Scanner;

/**
 *
 * @author mlsal
 */
public class EjercicioViejo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingresar cuantos litros cargo y cuantos km recorrio");
        Scanner leer = new Scanner(System.in);
        
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        System.out.println("El consumo del automovil es " + num2/num1 + "km por litro");
// TODO code application logic here
    }
    
}
