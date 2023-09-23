
package mavenproject.ejercicio_java01_202209714;

import java.util.Scanner;

/**
 * @author Angel Enrique ALvaardo Ruiz - 202209714 - realización individual 31/08/2023
 */

public class Ejercicio_java01_202209714 {   
    
    // método main
    public static void main(String[] args) {
        String option = "";
        do {
            System.out.println(" + + + + + Menú principal + + + + + ");
            System.out.println(" 1. triangulo isosceles");
            System.out.println(" 2. matriz");
            System.out.println(" 3. factorial de un número");
            System.out.println(" 4. salir del programa");
            System.out.println(" + + + + + + + + + + + + + + + + + + ");
            option = obtenerString("Ingrese el número de opción que desea");
            switch (option) {
                case "1":
                    triangle();
                    break;
                case "2":
                    matrix();
                    break;
                case "3":
                    factorial();
                    break;
                case "4":
                    System.out.println("Ha salido del programa");
                    System.out.println();
                    break;
                default:
                    System.out.println("Ingrese una de las cuatro opciones válidas, 1; 2; 3 o 4");
                    System.out.println();
            }
        } while (!option.equals("4"));
    }
    
    /*
    * el método solicitar string solamente imprime un texto que pasamos por medio de la función
    * la función realiza una instancia de la clase Scanner, imprime la solicitud y luego
    * retorna lo que ingresamos como un String.
    */
    public static void solicitarString (String texto){
        System.out.println(texto);
    }
    public static String obtenerString (String texto){
        Scanner sc = new Scanner(System.in);
        solicitarString(texto);
        return sc.nextLine();
    }
    
    /*
    * esta función trabaja con una cadena de texto y nos devuelve el primer caracter de la misma.
    */ 
    public static char obtenerChar(String cadena){
        String aux;
        aux = obtenerString(cadena);
        return aux.toCharArray()[0];
    }
    
    // ejercicio del triangulo
    public static void triangle(){
        String option = "";
        while (!option.equals("2")) {
            System.out.println(" + + + + + triangulo isosceles + + + + + ");
            System.out.println(" 1. Ingresar el alto del triangulo");
            System.out.println(" 2. Regresar al menú principal");
            System.out.println(" + + + + + + + + + + + + + + + + + + ");
            option = obtenerString("Ingrese el número de opción que desea");
            switch (option) {
                case "1":
                    // aquí obtenemos el entero que nos indica el número de asteriscos de la última fila del triangulo
                    char simbolo = '*'; int ancho = 0;
                    while (true) {                        
                        try {
                            simbolo = obtenerChar("Ingrese el caracter con el que desea formar su triangulo");
                            ancho = Integer.parseInt(obtenerString("Ingrese el ancho de la última fila del triángulo"));
                            System.out.println();
                        } catch (Exception e) {
                            System.out.println("Ingrese un número entero");
                            System.out.println();
                        }
                        if(ancho>0){
                            break;
                        }
                    }
                    // aquí trabajamos el triangulo
                    int asteriscos = 1; int espacios = ancho - 1;
                    for (int fila = 0; fila < ancho; fila++) {
                        for (int columnaEspacios = 0; columnaEspacios < espacios; columnaEspacios++) {
                            System.out.print(" ");
                        }
                        for (int columnaAsteriscos = 0; columnaAsteriscos < asteriscos; columnaAsteriscos++) {
                            System.out.print(simbolo+" ");
                        }
                        System.out.println();
                        asteriscos++; espacios--;
                    }
                    System.out.println();
                    break;
                case "2":
                    System.out.println();
                    break;
                default:
                    System.out.println("Ingrese una de las cuatro opciones válidas, 1 o 2");
                    System.out.println();
            }
        }
    }
    
    // ejercicio de la matriz
    public static void matrix(){
        String option = "";
        while (!option.equals("2")) {
            System.out.println(" + + + + + + + + Matriz + + + + + + + + ");
            System.out.println(" 1. Ingresar el alto y ancho de la matriz");
            System.out.println(" 2. Regresar al menú principal");
            System.out.println(" + + + + + + + + + + + + + + + + + + + +");
            option = obtenerString("Ingrese el número de opción que desea");
            switch (option) {
                case "1":
                    // solicitud, obtención y verificación de datos y sus tipos
                    int columnas = 0; int filas = 0; char simbolo = '*';
                    while (true) {                        
                        try {
                            simbolo = obtenerChar("Ingrese el caracter con el que desea rellenar la matriz");
                            filas = Integer.parseInt(obtenerString("Ingrese el número de filas de la matriz"));
                            columnas = Integer.parseInt(obtenerString("Ingrese el número de columnas de la matriz"));
                            System.out.println();
                        } catch (Exception e) {
                            System.out.println();
                        }
                        if(columnas>0 && filas>0){
                            break;
                        } else {                            
                            System.out.println(" - - -Ingrese números enteros mayores a cero para las filas y columnas - - -");
                            System.out.println();
                        }
                    }
                    /*
                    * aquí comenzamos a trabajar con los valores ingresados luego de ser verificados
                    * creamos variables y utilizamos ciclos for porque al no concer el tamaño exacto de la matriz
                    * se debe trabajar con las variables que almacenarán los valores.
                    */ 
                    char[][] matriz = new char[filas][columnas]; int auxIndex = 0; int auxPrint = 0;
                    System.out.println("La matriz rellena con el caracter \""+simbolo+"\", \ncon "+filas+" filas y "+columnas+" columnas resultante es:\n");                    
                    for (int indexF = 0; indexF < filas ; indexF++) {
                        for (int indexC = 0; indexC < columnas; indexC++) {
                            matriz[indexF][indexC] = simbolo;
                            auxIndex += indexC;
                            System.out.print(" "+matriz[indexF][indexC]+" ");
                        }
                        if( auxIndex >= columnas){
                            for (int n = 1; n < filas-1; n++) {
                                if(auxIndex >= columnas*n){
                                    System.out.println();
                                    auxPrint += 1; indexF -= 1;
                                    break;
                                }
                            }
                        }
                        if(auxPrint == filas){
                            System.out.println();
                            break;
                        }
                    }
                    break;
                case "2":
                    System.out.println();
                    break;
                default:
                    System.out.println("Ingrese una de las cuatro opciones válidas, 1 o 2\n");
            }
        }
    }
    
    // ejercicio del factorial    
    public static void factorial(){
        String option = "";
        while (!option.equals("2")) {
            System.out.println(" + + + + + triangulo isosceles + + + + + ");
            System.out.println(" 1. Obtener el factorial de un número");
            System.out.println(" 2. Regresar al menú principal");
            System.out.println(" + + + + + + + + + + + + + + + + + + ");
            option = obtenerString("Ingrese el número de opción que desea");
            switch (option) {
                case "1":
                    int numero;
                    while (true) {                        
                        try {
                            numero = Integer.parseInt(obtenerString("Ingrese el número al que le desea calcular su factorial"));
                            System.out.println();
                            if(numero>0){
                                break;
                            } else {                            
                                System.out.println(" - - - Ingrese números enteros mayores a cero - - -");
                                System.out.println();
                            }
                        } catch (Exception e) {
                            System.out.println(" - - - Ingrese un número entero");
                        }
                        
                    }
                    int resultado = factorial(numero);
                    if(resultado == 0){
                        System.out.println("El factorial del número: "+numero+" es: "+resultado+" por definición.\n");
                    } else if(resultado>=1){
                        System.out.println("El factorial del número: "+numero+" es: "+resultado+"\n");
                        System.out.print(numero+"! = "+numero);
                        for (int i = numero-1; i > 0; i--) {
                            System.out.print(" * "+i);
                        }
                    } else {
                        System.out.println("El número: "+numero+" no tiene un factorial, pues es negativo.");
                        System.out.println("\n");
                    }
                    System.out.println();
                    break;
                case "2":
                    System.out.println();
                    break;
                default:
                    System.out.println("Ingrese una de las cuatro opciones válidas, 1 o 2");
                    System.out.println();
            }
        }
    }
    
    // función recursiva
    public static int factorial(int numero){
        if (numero == 0){
            //por definición el factorial de 0 es 1 y de 1 es 1
            return 1;
        } else if(numero>1){
            // llevamos a cabo la recursividad
            return numero * factorial(numero - 1);
        } else {
            //retornamos el número, en caso de que se ingrese un negativo
            return numero;
        }
    }
}
