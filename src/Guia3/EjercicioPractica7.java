

import java.util.Scanner;

public class Ejercicio7 {
/*Consigna
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben
llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de
largo, el primer carácter tiene que ser X y el último tiene que ser una O.
    
Las secuencias leídas que respeten el formato se consideran correctas, la
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
secuencia distinta de FDE, que no respete el formato se considera incorrecta.
    
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar
cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       String cadena = "";
       int contcorrecto = 0;
       int contincorrecto = 0;
       
       do {
           System.out.println("Ingrese una cadena");
           cadena = leer.nextLine();
           
       int longitud = cadena.length();
       String primera = cadena.substring(0,1);
       String ultima = cadena.substring(longitud-1, longitud);
       
       if (longitud == 5  && (primera.equalsIgnoreCase("x")) && (ultima.equalsIgnoreCase("o"))) {
           contcorrecto++;
           System.out.println("correcta = " + contcorrecto);
       } else {
           contincorrecto++;
           System.out.println("incorrecta = " + contincorrecto);   
       }
       
       }while(!(cadena.equals("&&&&&")));
       
       System.out.println("La cantidad de cadenas correctas es " + contcorrecto);
       System.out.println("La cantidad de cadenas incorrectas es " + contincorrecto);
     
    }
    
}