
package com.mycompany.ordenamientosmagistral;

import java.util.Random;

/**
 *
 * @author angel
 */
public class OrdenamientosMagistral {
    // imprimir y rellenar
    public static void ImprimirArray(int[] arreglo, int posicion) {
        if (posicion != arreglo.length) {
            System.out.print(" " + arreglo[posicion] + " ");
            ImprimirArray(arreglo, posicion + 1);
        }
    }
    public static void llenadoArray(int[] arreglo){
        // Crear una instancia de la clase Random
        Random rand = new Random();
        for (int i = 0; i < arreglo.length; i++) {
            int numeroAleatorio = rand.nextInt(1101);
            arreglo[i] = numeroAleatorio;
        }
    }
    // BubbleSort
    public static void bubbleSort(int[] listado) {
        int aux;
        boolean cambios = false;
        while (true) {
            cambios = false;
            for (int i = 1; i < listado.length; i++) {
                if (listado[i] < listado[i - 1]) {
                    aux = listado[i];
                    listado[i] = listado[i - 1];
                    listado[i - 1] = aux;
                    cambios = true;
                }
            }
            if (cambios == false) {
                break;
            }
        }
    }

    //InsertionSort
    public static void insertionSort(int[] listado) {
        int aux;
        int cont1;
        int cont2;
        for (cont1 = 1; cont1 < listado.length; cont1++) {
            aux = listado[cont1];
            for (cont2 = (cont1 - 1); cont2 >= 0 && listado[cont2] > aux; cont2--) {
                listado[cont2 + 1] = listado[cont2];
                listado[cont2] = aux;
            }
        }
    }

    //QuickSort
    public static void quickSort(int[] array) {
        array = quicksort1(array);
    }
    public static int[] quicksort1(int numeros[]) {
        return quicksort2(numeros, 0, numeros.length - 1);
    }
    public static int[] quicksort2(int numeros[], int izq, int der) {
        if (izq >= der) {
            return numeros;
        }
        int i = izq, d = der;
        if (izq != der) {
            int pivote;
            int aux;
            pivote = izq;
            while (izq != der) {
                while (numeros[der] >= numeros[pivote] && izq < der) {
                    der--;
                }
                while (numeros[izq] < numeros[pivote] && izq < der) {
                    izq++;
                }
                if (der != izq) {
                    aux = numeros[der];
                    numeros[der] = numeros[izq];
                    numeros[izq] = aux;
                }
            }
            if (izq == der) {
                quicksort2(numeros, i, izq - 1);
                quicksort2(numeros, izq + 1, d);
            }
        } else {
            return numeros;
        }
        return numeros;
    }
    
    public static void main(String[] args) {
        int[] arreglo100 = new int[100];
        llenadoArray(arreglo100);
        int[] arreglo500 = new int[500];
        llenadoArray(arreglo500);
        int[] arreglo1000 = new int[1000];
        llenadoArray(arreglo1000);
        
        System.out.println("Arreglo de 100 elementos");
        ImprimirArray(arreglo100, 0);
        System.out.println();
        System.out.println("Arreglo de 500 elementos");
        ImprimirArray(arreglo500, 0);
        System.out.println();
        System.out.println("Arreglo de 1000 elementos");
        ImprimirArray(arreglo1000, 0);
        System.out.println();
        
        /*bubbleSort(arreglo100);
        bubbleSort(arreglo500);
        bubbleSort(arreglo1000);*/
        /*insertionSort(arreglo100);
        insertionSort(arreglo500);
        insertionSort(arreglo1000);*/
        quickSort(arreglo100);
        quickSort(arreglo500);
        quickSort(arreglo1000);
        
        System.out.println("Arreglo de 100 elementos ORDENADO");
        ImprimirArray(arreglo100, 0);
        System.out.println();
        System.out.println("Arreglo de 100 elementos ORDENADO");
        ImprimirArray(arreglo500, 0);
        System.out.println();
        System.out.println("Arreglo de 100 elementos ORDENADO");
        ImprimirArray(arreglo1000, 0);
        System.out.println();
    }
}
