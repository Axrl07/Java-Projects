
package mavenproject.javaejercicios_0709;

import java.util.Scanner;

public class JavaEjercicios_0709 {

    public static void main(String[] args) {
            try {
                System.out.println("Ingrese el número número");
                Scanner sc = new Scanner(System.in);
                String auxNum = sc.nextLine();
                String invertido = invertirNum(auxNum,auxNum.length()-1);
                System.out.println("El número invertido de: "+auxNum+" es: "+invertido);
            } catch (Exception e){
                System.out.println("Ingrese solo números");
            }
        }
        public static String invertirNum(String texto,int longitud){
            if(longitud > 0){
                return texto.charAt(longitud) + (invertirNum(texto, longitud-1));
            } else {
                return texto.charAt(longitud)+"";
            }
        }
    
    public static void Imprimir1_N(int ingresoN){
        if(ingresoN > 0){
            System.out.print(ingresoN+" ");
            Imprimir1_N(ingresoN-1);
        }
    }
    public static int digitosNum(int ingresoNum){
       int contador = 0;
       if(ingresoNum < 10 && ingresoNum > -1){
           contador = 1;
       }else if(ingresoNum > 9){
           ingresoNum /= 10;
           contador = 1 + digitosNum(ingresoNum);
       } else {
           System.out.println("Ingresó un valor negativo");
           return 0;
       }
       return contador;
    }    
    public static String Binario(int ingresoNum){
        if(ingresoNum < 2){
           return Integer.toString(ingresoNum);
        } else {
           return Binario(ingresoNum/2) + Integer.toString(ingresoNum%2);
        }
    }
}


/* Imprimir desde N hasta 1 números
    public static void main(String[] args) {        
        try {
           System.out.println("Ingrese el número N");
           Scanner sc = new Scanner(System.in);
           String auxN = sc.nextLine();
           int N = Integer.parseInt(auxN);
           if (N > 0) {
               System.out.println("Impresiones en sistema desde "+N+" hasta 1");
               Imprimir1_N(N);
           } else if(N == 1){
               System.out.println("1");
           } else {
               System.out.println("Ingrese un número mayor a cero");
           }
        } catch (Exception e) {
           System.out.println("Ingrese solo números");
        }
    }
    public static void Imprimir1_N(int ingresoN){
            if(ingresoN > 0){
               System.out.print(ingresoN+" ");
               Imprimir1_N(ingresoN-1);
        }
    }
*/

/* contador de digitos
    public static void main(String[] args) {
        try {
            System.out.println("Ingrese el número número");
            Scanner sc = new Scanner(System.in);
            String auxNum = sc.nextLine();
            int num = Integer.parseInt(auxNum);
            int varPrint = digitosNum(num);
            System.out.println("El número de digitos es: "+varPrint);
        } catch (Exception e){
            System.out.println("Ingrese solo números");
        }
    }
    public static int digitosNum(int ingresoNum){
       int contador = 0;
       if(ingresoNum < 10){
           contador = 1;
       }else{
           ingresoNum = ingresoNum/10;
           contador = 1 + digitosNum(ingresoNum);
       }
       return contador;
    }
*/
/* invertir numero (String)
    public static void main(String[] args) {
        try {
            System.out.println("Ingrese el número número");
            Scanner sc = new Scanner(System.in);
            String auxNum = sc.nextLine();
            String invertido = invertirNum(auxNum,auxNum.length()-1);
            System.out.println("El número invertido de: "+auxNum+" es: "+invertido);
        } catch (Exception e){
            System.out.println("Ingrese solo números");
        }
    }
    public static String invertirNum(String texto,int longitud){
        if(longitud > 0){
            return texto.charAt(longitud) + (invertirNum(texto, longitud-1));
        } else {
            return texto.charAt(longitud)+"";
        }
    }
*/
/* convertir de número en base 10 a base 2
    public static void main(String[] args) {
        try {
            System.out.println("Ingrese el número que desea convertir a binario");
            Scanner sc = new Scanner(System.in);
            String auxNum = sc.nextLine();
            int NumBase10 = Integer.parseInt(auxNum);
            String NumBase2 = Binario(NumBase10);
            System.out.println("El número "+NumBase10+" en binario es: "+NumBase2);
        } catch (Exception e){
            System.out.println("Ingrese solo números");
        }
    }
    public static String Binario(int ingresoNum){
        if(ingresoNum < 2){
           return Integer.toString(ingresoNum);
        } else {
           return Binario(ingresoNum/2) + Integer.toString(ingresoNum%2);
        }
    }
*/