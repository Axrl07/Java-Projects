
package mavenproject.clase_19sep;

import java.util.Scanner;

public class Clase_19SEP {

    public static String Input(String txt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(txt);
        return sc.nextLine();
    }

    public static void ImprimirArray(String tipoArray, float[] arregloF, int[] arregloI, int posicion) {
        if (tipoArray.equalsIgnoreCase("float")) {
            if (posicion != arregloF.length) {
                System.out.print(" " + arregloF[posicion] + " ");
                ImprimirArray(tipoArray, arregloF, null, posicion + 1);
            }
        } else {
            if (posicion != arregloI.length) {
                System.out.print(" " + arregloI[posicion] + " ");
                ImprimirArray(tipoArray, null, arregloI, posicion + 1);
            }
        }
    }

    public static void main(String[] args) {
        String option;
        do {
            System.out.println(" + + + Menú principal + + + ");
            System.out.println(" 1. ejercicio 1");
            System.out.println(" 2. ejercicio 2");
            System.out.println(" 3. ejercicio 3");
            System.out.println(" 4. ejercicio 4 y 5");
            System.out.println(" 5. Salir del programa");
            option = Input("Ingrese el número de la opción a la que desea ingresar");
            switch (option) {
                case "1":
                    ejercicio1();
                    break;
                case "2":
                    ejercicio2();
                    break;
                case "3":
                    ejercicio3();
                    break;
                case "4":
                    ejercicio4();
                    break;
                case "5":
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Ingrese únicamente alguna de las opciones mostradas.");
            }
        } while (!option.equals("5"));
    }

    public static void ejercicio1() {
        float[] numerosFloat = new float[10];
        String option;
        do {
            System.out.println(" + + + Ejercicio 1 + + + ");
            System.out.println(" 1. crear y rellenar arreglo");
            System.out.println(" 2. mostrar arreglo");
            System.out.println(" 3. salir del ejercicio 1");
            option = Input("Ingrese el número de al opción a la que desea ingresar");
            switch (option) {
                case "1":
                    for (int i = 0; i < numerosFloat.length; i++) {
                        try {
                            numerosFloat[i] = Float.parseFloat(Input("Ingrese el valor numerico que desea asignar a la posición " + (i + 1)));
                        } catch (Exception e) {
                            System.out.println("Ingrese únicamente números");
                            break;
                        }
                    }
                    break;
                case "2":
                    ImprimirArray("float", numerosFloat, null, 0);
                    System.out.println();
                    break;
                case "3":
                    System.out.println("Saliendo del ejercicio 1");
                    break;
                default:
                    System.out.println("Ingrese únicamente alguna de las opciones mostradas.");
            }
        } while (!option.equals("3"));
    }

    public static void ejercicio2() {
        int[] numeros = new int[100];
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
            if (suma < 5050) {
                suma += (i + 1);
            }
        }
        float media = suma / 100f;
        ImprimirArray("int", null, numeros, 0);
        System.out.println();
        System.out.println("la suma total de todos los elementos del arreglo es: " + suma);
        System.out.println("la media es de: " + media);
    }

    public static void ejercicio3() {
        String palabra = Input("Ingrese una palabra");
        char[] letras = palabra.toCharArray();
        for (int i = 0; i < letras.length; i++) {
            System.out.print(" " + letras[i] + " ");
        }
        System.out.println();
    }

    public static void ejercicio4() {
        String[] alumnos = new String[10];
        float[] notas = new float[10];
        String[] estado = {"suspenso", "bien", "notable", "sobresaliente"};
        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i] = Input("Ingrese el nombre del alumno no." + (i + 1));
            try {
                float nota = Float.parseFloat(Input("Ingrese la nota del estudiante no." + (i + 1)));
                if (nota >= 0 && nota <= 10) {
                    notas[i] = nota;
                } else {
                    System.out.println("Ingrese valores entre 1 y 10");
                    break;
                }
            } catch (Exception e) {
                System.out.println("Ingrese únicamente números en las notas");
                break;
            }
        }
        if (alumnos[9] != null) {
            for (int i = 0; i < alumnos.length; i++) {
                if (notas[i] >= 0 && notas[i] <= 4.99) {
                    System.out.println("El alumno " + alumnos[i] + " tuvo una nota " + notas[i] + " del tipo " + estado[0]);
                } else if (notas[i] >= 5 && notas[i] <= 6.99) {
                    System.out.println("El alumno " + alumnos[i] + " tuvo una nota " + notas[i] + " del tipo " + estado[1]);
                } else if (notas[i] >= 7 && notas[i] <= 8.99) {
                    System.out.println("El alumno " + alumnos[i] + " tuvo una nota " + notas[i] + " del tipo " + estado[2]);
                } else {
                    System.out.println("El alumno " + alumnos[i] + " tuvo una nota " + notas[i] + " del tipo " + estado[3]);
                }
            }
        }
    }
}
