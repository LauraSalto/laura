/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesdeapoyo;

/**
 *
 * @author mlsal
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1=0;
        int num2=2;
        sumar(num1, num2);
                
    }
    public static int sumar(int num1, int num2){
        int suma = num1 + num2;
        System.out.println("La suma de los numeros es "+suma);
        return num1 + num2;
        
    }
}
