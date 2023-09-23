
import java.util.Scanner;

/**
 * Segundo Examen Parcial IPC1 - 21/09/2023
 * 
 * @author Angel Enrique Alvarado Ruiz - 202209714
 */

public class Parcial2_IPC1 {
    public static String input(String texto) {
        Scanner sc = new Scanner(System.in);
        System.out.println(texto);
        return sc.nextLine();
    }

    public static float Multiplicacion(float multiplicando, float multiplicador) {
        // CASO BASE 1: cuando alguno de los números es 0
        if (multiplicando == 0 || multiplicador == 0) {
            return 0;
        }
        // CASO BASE 2: cuando alguno de los números es 1
        if (multiplicando == 1 || multiplicador == 1) {
            if (multiplicando > multiplicador) {
                return multiplicando;
            } else {
                return multiplicador;
            }
        }
        // CASO BASE 3: cuando alguno de los números es -1
        if (multiplicando == -1 || multiplicador == -1) {
            if (multiplicando == -1) {
                return (-multiplicador);
            } else {
                return (-multiplicando);
            }
        }
        // CASO RECURSIVO: cuando tanto "a" como "b" no cumplen los casos base
        if (multiplicando > 0 && multiplicador > 0) {
            /*
             * no importa si trabajamos con el "b" o el "a" en este ejercicio
             * decidí trabajar reduciendo el último número "b" por comodidad
             */
            return multiplicando + Multiplicacion(multiplicando, multiplicador - 1);
        } else {
            /*
             * recordemos que si ya tenemos 4 * (-2) es igual a -(4+4), por ello aquí como
             * solo estamos agregando
             * ese símbolo de menos
             */
            if (multiplicador < 0) {
                return -Multiplicacion(multiplicando, -multiplicador);
            } else {
                return -Multiplicacion(-multiplicando, multiplicador);
            }
        }
    }
}

// ejercicio palindromo
/*
 * public static Boolean verificar(String cadenaIngreso){
 * cadenaIngreso = normalizar(cadenaIngreso);
 * int lateralIzquierdo = 0;
 * int lateralDerecho = cadenaIngreso.length()-1;
 * String palindromo = verificarCadena(cadenaIngreso, lateralIzquierdo,
 * lateralDerecho);
 * if(palindromo.equalsIgnoreCase("Palindromo")){
 * return true;
 * } else {
 * return false;
 * }
 * }
 * public static String verificarCadena(String cadena, int izquierda, int
 * derecha){
 * String resultante;
 * if(derecha<izquierda){
 * resultante = "Palindromo";
 * System.out.println("Es un Palindromo");
 * }else{
 * char actIzq = cadena.charAt(izquierda);
 * char actDer = cadena.charAt(derecha);
 * if(actIzq != actDer){
 * resultante = "no es Palindromo";
 * System.out.println("No es un Palindromo");
 * }else{
 * resultante = verificarCadena(cadena, izquierda+1, derecha-1);
 * }
 * }
 * return resultante;
 * }
 * public static String normalizar(String ingresoCadena){
 * String resultante = "";
 * for(int posicion = 0; posicion < ingresoCadena.length(); posicion++){
 * char actual = ingresoCadena.charAt(posicion);
 * if(actual != ' ' && actual != ','){
 * resultante += actual;
 * }
 * }
 * return resultante;
 * }
 */

// ejercicio multiplicación
/*
 * 
 * 
 * /*
 * public static void IngresoValores(float valor, float[][] array, int fila,int
 * columna){
 * for ( int i=0 ; i < array.length ; i++) {
 * array[fila][columna] = valor;
 * }
 * }
 * public static void main(String[] args) {
 * //trabajaodores
 * String[] nombres = null;
 * // total kms
 * float[] totales = null;
 * // kms por semana de los trabajadores
 * float[][] kms = null;
 * String option;
 * do {
 * System.out.
 * println(" + + + Ejercicio 13 - sistema de kilometraje empleados + + + ");
 * System.out.println(" 1. crear datos");
 * System.out.println(" 2. Ingresar datos del trabajador");
 * System.out.
 * println(" 3. Sumar total de kms y msotrar kms totales por empleado");
 * System.out.println(" 4. Salir del programa");
 * option = input("Ingrese el número de al opción a la que desea ingresar");
 * switch (option) {
 * case "1":
 * try {
 * // solicitamos el número de trabajadores
 * int size = Integer.parseInt(
 * input("Ingrese el número de trabajadores que desea trabajar "));
 * nombres = new String[size];
 * // las columnas serán los días de la semana y las filas serán los empleados
 * kms = new float[size][7];
 * totales = new float[size];
 * for (int i = 0; i < nombres.length; i++) {
 * nombres[i] = input("Ingrese el nombre del trabajador "+(i+1));
 * }
 * } catch (Exception e) {
 * System.out.
 * println("Ingrese únicamente números enteros positivos para los tamaños");
 * }
 * break;
 * case "2":
 * try {
 * String nombre = input("ingrese el nombre del trabajador");
 * int lunes = Integer.parseInt(
 * input("Ingrese el número de km que debe recorrer el trabajador el lunes"));
 * int martes = Integer.parseInt(
 * input("Ingrese el número de km que debe recorrer el trabajador el martes"));
 * int miercoles = Integer.parseInt(
 * input("Ingrese el número de km que debe recorrer el trabajador el miercoles")
 * );
 * int jueves = Integer.parseInt(
 * input("Ingrese el número de km que debe recorrer el trabajador el jueves"));
 * int viernes = Integer.parseInt(
 * input("Ingrese el número de km que debe recorrer el trabajador el viernes"));
 * int sabado = Integer.parseInt(
 * input("Ingrese el número de km que debe recorrer el trabajador el sabado"));
 * int domingo = Integer.parseInt(
 * input("Ingrese el número de km que debe recorrer el trabajador el domingo"));
 * if( lunes > 0 && martes > 0 && miercoles > 0 && jueves > 0 && viernes > 0 &&
 * sabado > 0 && domingo > 0){
 * for (int i = 0; i < nombres.length; i++) {
 * if(nombre.equalsIgnoreCase(nombres[i])){
 * nombres[i] = input("Ingrese el nombre del trabajador "+(i+1));
 * IngresoValores(lunes, kms, i, 0);
 * IngresoValores(martes, kms, i, 1);
 * IngresoValores(miercoles, kms, i, 2);
 * IngresoValores(jueves, kms, i, 3);
 * IngresoValores(viernes, kms, i, 4);
 * IngresoValores(sabado, kms, i, 5);
 * IngresoValores(domingo, kms, i, 6);
 * break;
 * }
 * }
 * } else {
 * System.out.println("Ingrese únicamente números mayores a 0");
 * }
 * } catch (Exception e) {
 * System.out.println("Ingrese únicamente valores para los km por día");
 * }
 * break;
 * case "3":
 * for (int i = 0; i < nombres.length; i++) {
 * totales[i] =
 * (kms[i][0]+kms[i][1]+kms[i][2]+kms[i][3]+kms[i][4]+kms[i][5]+kms[i][6]);
 * }
 * for (int i = 0; i < nombres.length; i++) {
 * System.out.println("El empleado "+nombres[0]+" tiene que recorrer "+totales[i
 * ]+"km totales en la semana");
 * }
 * break;
 * default:
 * System.out.println("Ingrese únicamente alguna de las opciones mostradas.");
 * }
 * } while (!option.equals("4"));
 * }
 * 
 */