/*
 *Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se mantienen sin cambios.
a
e
i
o
u
@
#
$
%
*

Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación correspondiente. Utilice la estructura “según” para la transformación. 
Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

 */
package clasesdeapoyo;

import java.util.Scanner;

/**
 *
 * @author mlsal
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        String palabra;
        do {
            System.out.println("Ingrese una secuencia de caracteres que termine en punto");
            palabra=leer.next();
        }while (!palabra.endsWith("."));
        palabra=codificador(palabra);
        System.out.println("La palabra modificada es "+palabra);
    }
    public static String codificador(String palabra){
        String auxiliar="";
        //palabra
        
        for (int i = 0; i < palabra.length(); i++) {
            switch(palabra.substring(i, i+1)){
                case "a": 
                case "A":
                    //esta es la forma completa
                    auxiliar=auxiliar.concat("@");
                    //auxiliar= auxiliar+"@"
                    //esta es la forma usando mas
                    //auxiliar+="@"
                    break;
                case "e":
                case "E":
                    auxiliar=auxiliar.concat("#");
                    break;
                case "i":
                case "I":
                    auxiliar=auxiliar.concat("$");
                    break;
                case "o":
                case "O":
                    auxiliar=auxiliar.concat("%");
                    break;
                case "u":
                case "U":
                    auxiliar=auxiliar.concat("*");
                    break;
                default:
                    auxiliar=auxiliar.concat(palabra.substring(i, i+1));
            }
            
        }
        return auxiliar;
    }
    
}
