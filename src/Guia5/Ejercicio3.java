/*
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1 
dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).

 */
package Guia5;

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
        System.out.println("Ingrese el tamaño del vector");
        int tamaño = leer.nextInt();
        int[] arreglo = new int[tamaño];
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
        
        for (int i=0; i<tamaño; i++){
            arreglo[i] = (int)(Math.random()*99998)+1;
            
        }
        
        for(int i=0; i<tamaño; i++){
            String num = Integer.toString(arreglo[i]);
            if (num.length()==1){
                cont1++;
             
            }
            if (num.length()==2){
                cont2++;
                
            }
           if (num.length()==3){
                cont3++;
        }
           if (num.length()==4){
                cont4++;
      
    }
           if (num.length()==5){
                cont2++;
           }
           if (num.length()==2){
                cont5++;
           }
           
        }
        System.out.println("Numeros con 1 digito= " +cont1);
        System.out.println("Numeros con 1 digito= " +cont2);
        System.out.println("Numeros con 1 digito= " +cont3);
        System.out.println("Numeros con 1 digito= " +cont4);
        System.out.println("Numeros con 1 digito= " +cont5);
    }
   
           
    
}
