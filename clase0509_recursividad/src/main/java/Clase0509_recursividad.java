
import java.util.Scanner;


public class Clase0509_recursividad {
    
    public static String SolicitarScanner(String texto){
        Scanner sc = new Scanner(System.in);
        System.out.println(texto);
        return sc.nextLine();        
    }
    
    public static void menuArreglos(){
        String opcion = "";
        int[] listaNumeros = {1,2,3,4,5,6,7,8,9,10};
        while(!opcion.equalsIgnoreCase("0")){
            System.out.println(" + + + + + arreglos + + + + + ");
            System.out.println(" (1) mostrar arreglo");
            System.out.println(" (2) obtener el indice de un elemento");
            System.out.println(" (0) salir del menu arreglos");
            opcion = SolicitarScanner("Ingrese el número de la opción a la que desea ingresar");
            switch (opcion) {
                case "1":
                    mostrarArreglo(listaNumeros, 0);
                    System.out.println();
                    break;
                case "2":
                    mostrarArreglo(listaNumeros, 0);
                    System.out.println();                    
                    int elementoBuscado = Integer.parseInt(SolicitarScanner("Ingrese un elemento del arreglo para obtener su indice"));                    
                    System.out.println("El indice del elemento "+elementoBuscado+" es "+posicionElementoBuscado(listaNumeros, elementoBuscado,0));
                    System.out.println();
                    break;
                case "0":
                    System.out.println("Regresamos al menú principal");
                    System.out.println();
                default:
                    System.out.println("Ingrese una de las opciones o nombres que hay en el menú");
            }
        }
    }    
    
    public static int sumaRecursiva(int numeroIngreso){        
        int resultado = numeroIngreso;        
        if(numeroIngreso == 1){
            return 1;
        } else {
            resultado += sumaRecursiva(numeroIngreso - 1);
        }        
        return resultado;
    }
    
    public static int factorial(int numeroIngreso){
        if(numeroIngreso == 0){
            return 1;
        } else if(numeroIngreso > 1){
            return numeroIngreso * factorial(numeroIngreso-1);            
        } else {
            return numeroIngreso;
        }
    }
    
    public static void mostrarArreglo(int[] arreglo, int index){
        if(index != arreglo.length){           
            System.out.print(arreglo[index]+" ");
            mostrarArreglo(arreglo, index+1);
        }
    }
    
    public static int posicionElementoBuscado(int[] arreglo, int elementoBuscado, int index){
        if(arreglo[index]==elementoBuscado){
            return index;
        } else{
            return posicionElementoBuscado(arreglo,elementoBuscado,index+1);
        }
    }
    
    public static int potencias(int numeroIngreso, int exponente){
        if(exponente == 0){
            return 1;
        } else {
            return numeroIngreso * potencias(numeroIngreso, exponente-1);
        }
    }
    
    public static boolean par(int numeroIngreso){
        if(numeroIngreso==0){
            return true;
        } else {
            return impar(numeroIngreso-1);
        }
    }
    public static boolean impar(int numeroIngreso){
        if(numeroIngreso==0){
            return false;
        } else {
            return par(numeroIngreso-1);
        }
    }
        
    public static void main(String[] args) {        
        try {
            String opcion = "";
            int[] listaNumeros = {1,2,3,4,5,6,7,8,9,10};
            while(!opcion.equalsIgnoreCase("0")){
                System.out.println(" + + + + + Principal + + + + + ");
                System.out.println(" (1) suma");
                System.out.println(" (2) factorial");
                System.out.println(" (3) Arreglos");
                System.out.println(" (4) Potencias");
                System.out.println(" (5) Numero par e impar");
                System.out.println(" (0) salir del programa");
                opcion = SolicitarScanner("Ingrese el número de la opción a la que desea ingresar");
                switch (opcion) {
                    case "1":
                        String var = SolicitarScanner("Ingrese un número para sumarlo hasta la unidad");                    
                        int numero = Integer.parseInt(var);
                        System.out.println(sumaRecursiva(numero));    
                        System.out.println();                
                        break;
                    case "2":
                        String var1 = SolicitarScanner("Ingrese un número para calcular su factorial");                    
                        int numero1 = Integer.parseInt(var1);
                        System.out.println(factorial(numero1));
                        System.out.println();
                        break;
                    case "3":
                        menuArreglos();
                        break;
                    case "4":
                        String base = SolicitarScanner("Ingrese la base");
                        String exponente = SolicitarScanner("Ingrese el exponente");
                        int resultadoPotencia = potencias(Integer.parseInt(base),Integer.parseInt(exponente));
                        System.out.println("El resultado de la operación "+base+"^("+exponente+") es igual a "+resultadoPotencia);
                        break;
                    case "5":
                        String parImpar = SolicitarScanner("Ingrese un número para saber si es par o impar");
                        boolean impar = impar(Integer.parseInt(parImpar));
                        if(impar == true){
                            System.out.println("EL número "+parImpar+" es impar");
                        } else {
                            System.out.println("EL número "+parImpar+" es par");
                        }
                        break;
                    case "0":
                        System.out.println("Saliendo del programa");
                        break;
                    default:
                        System.out.println("Ingrese una de las opciones o nombres que hay en el menú");
                        System.out.println();
                }
            }
        } catch (Exception e) {
            System.out.println("Ingrese un número entero");
        }
    }
}
