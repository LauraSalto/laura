/*
 * Realizar la multiplicaciónm de un vector por una matriz
Dado un vector 1xN y una matriz NxM, el resultado del producto es 1xM
Ej. vector 1x2 * matriz 2x3 = producto 1x3


 */
package Guia5;

import java.util.Scanner;

/**
 *
 * @author mlsal
 */
public class EjMultiplicaciondeMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaración y creación de un vector
        //tipo[] nombreVector = new tipo[Tamaño];
        
        //declarar un arreglo de una dimensión
        int[] vector;
        //crear en memoria (construir/dimensionar) con el valor por defector 
        //(cero para los enteros)
        vector = new int[2];
        //los dos pasos en uan línea
        int[] producto = new int[3];
        
        //Declaración y creación de una matriz
        //tipo[][] nombreMatriz = new tipo[Filas][Columnas]
        
        //declaración e inicialización con valorea predeterminados
        int[][] matriz = {{4, 8, 6}, {2, 1, 7}};
        
        //Declaración y creación de arreglos genéricos
        //tipo[][]...[] nombreArreglo = new tipo[cardinalidad1][cardinalidad2]...[cardinalidadN];
        System.out.println("Ingrese los valores del vector de tamaño "+vector.length+":");
        Scanner leer = new Scanner(System.in);
        //int=0, porque los subíndices de los arreglos en Java inician en cero
        for (int i = 0; i < vector.length; i++){
            System.out.println("v["+i+"]=");
            //acceder al valor i del vector
            vector[i] = leer.nextInt();
        }
        //Multiplica vector por matriz
        int sum;
        //...para cada columna de la matriz...
        for (int j = 0; j < matriz[0].length; j++){
            sum = 0;
            //...recorro el vector y multiplico
            for (int i = 0; i < vector.length; i++) {
                sum += vector[i] * matriz[i][j];
            }
            producto[j] = sum;
        }
        String aux = "";
        //Mostrar vector
        System.out.println("* Vector:");
        //bucle for mejorado (enhanced)
        //for (tipo elemento : arreglo)
        for (int elemento: vector) {
            aux = aux + " " + elemento;
        }
        System.out.println(aux);
        
        //Mostrar matriz
        System.out.println("\n* Matriz:");
        //para cada fila de la matriz
        for (int[] fila : matriz) {
            aux = "";
            //para cada elemento de la fila
            for (int elemento: fila) {
                aux += " " + elemento;
            }
            System.out.println(aux);
        }
        //Mostrar resultado
        aux = "";
        System.out.println("\n* Vector x Matriz");
        for (int elemento: producto) {
            aux += " " + elemento;
        }
        System.out.println(aux);
    }
    
    
    
}
