/*
 Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, 
a medida que el usuario las va ingresando, construya una “sopa de letras para niños” 
de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal 
en una fila que será seleccionada de manera aleatoria. Una vez concluida la 
ubicación de las palabras, rellene los espacios no utilizados con un número 
aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las 
siguientes funciones de Java substring(), Length() y Math.random().

 */
package Guia5;

import java.util.Scanner;

/**
 *
 * @author mlsal
 */
public class Ejercicio6extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String[][]sopaLetras=new String[20][20];
        
        int[]posiciones=new int[5];
        int r=0;
        
        llenarMatriz(sopaLetras);
        iniciarVector(posiciones);
        
        do{
            int filas = (int) (Math.random()*19);
            int i=0;
            System.out.println("Ingrese una palabra de 3 a 5 letras");
            String frase=leer.next();
            
            for (int i = 0; i < frase.length(); i++) {
                sopaLetras[filas][i]=frase.toUpperCase().substring(i, i+1);
                i++;
            }
            r++;
            
        }while (r<5);
        
        for (int i=0; i < 20; i++) {
            for (int j = 0; j < 20; j++){
                System.out.println("["+sopaLetras[i][j]+"]");
            }
            System.out.println("");
        }
        System.out.println("");
        
  
    }
    
}
do{
            for(int i = 0; i < 4 ; i++){
                for (int j = (i+1) ; j < 5; j++) {
                    if(ubicacion[i] == ubicacion[j]){
                        ubicacion[i] = (int)(Math.random()*20);
                    } else{
                        cambiar = false;
                    }
                }
            }
        } while (cambiar == true);

 for (int i = 0; i < 5; i++) {
            array[i] = (int) (Math.random() * 19);
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    i--;
                }
            }
        }