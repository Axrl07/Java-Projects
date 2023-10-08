package com.mycompany.practica1;
import java.util.Scanner;               // solamente lee lo que ingresemos por teclado
import java.text.DateFormat;            // da formato a la hora y fecha
import java.text.SimpleDateFormat;      // simplifica la libreria anterior
import java.util.Calendar;              // Puede leer el calendario para saber la hora y fecha actual

public class Practica1 {
    
    //Para solicitar e ingresar un String
    public static void solicitarString (String texto){
        System.out.println(texto);
    } // estemétodo solamente imprime y auxilia a la función obtenerString
    public static String obtenerString (String texto){
        Scanner sc = new Scanner(System.in);
        solicitarString(texto);
        return sc.nextLine();
    } // este solicita algo por medio de un texto y devuelve lo ingresado como un String
    // me dice si existe un elemento en la posicion algo,indexColumna de un array
    public static boolean existe (String algo, String[][] array, int indexColumna){
        boolean existe = false; // asumo que No existe en array
        for ( int i=0 ; i < array.length ; i++) {
            if (array[i][indexColumna] != null && array[i][indexColumna].equalsIgnoreCase(algo)) {
                existe = true;
                /*si se cumple que lo que yo ingrese a esta funcion es diferente de null
                y es igual a lo que hay en el elemento de la matriz en la posición i,INDEX
                entonces existe en el array*/
                return existe;
            }
        }
        return existe;
    }  
    //ordenamiento de matrices de filas * 2 columnas
    public static void burbuja (String[][] array, String ASCoDES,int indexC){
        for (int i = 0; i < array.length-1 ; i++){
            for (int j = i+1; j < array.length ; j++){
                if(array[j][indexC] != null){
                    String[][] filaAux = new String[1][2];
                    int numActual = Integer.parseInt(array[i][indexC]);
                    int numSiguiente = Integer.parseInt(array[j][indexC]);
                    if(ASCoDES.equalsIgnoreCase("des")){
                        if(numActual < numSiguiente){
                            //almacenando valores de j que barren el array
                            filaAux[0][0] = array[j][0]; // marca o modelo
                            filaAux[0][1] = array[j][1]; // contador
                            //almacenando en valores j los valores del pivote
                            array[j][0] = array[i][0];
                            array[j][1] = array[i][1];
                            // almacenando en pivote los valores de j
                            array[i][0] = filaAux[0][0];
                            array[i][1] = filaAux[0][1];
                        }
                    } else {
                        if(numActual > numSiguiente){
                            //almacenando valores de j que barren el array
                            filaAux[0][0] = array[j][0]; // marca o modelo
                            filaAux[0][1] = array[j][1]; // contador
                            //almacenando en valores j los valores del pivote
                            array[j][0] = array[i][0];
                            array[j][1] = array[i][1];
                            // almacenando en pivote los valores de j
                            array[i][0] = filaAux[0][0];
                            array[i][1] = filaAux[0][1];
                        }
                    }
                }
            }
        }
    }
    
    
    // main
    public static void main(String[] args) {
        String opcion = "";
        while(!opcion.equals("3")){
            System.out.println(" + + + + + Menú Principal + + + + + ");
            System.out.println("(1) Administrador");
            System.out.println("(2) Cliente");
            System.out.println("(3) Salir del programa");
            opcion = obtenerString(" --- Ingrese el número de la opción a la que desea --- ");
            switch (opcion) {
                case "1":
                    loginAdmin();
                    break;
                case "2":
                    loginCliente();
                    break;
                case "3":
                    System.out.println("Ha salido del programa");
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
            }
        }
    }
    // Administrador
    public static void loginAdmin(){
        String ingresoUser = "";
        String ingresoPwd = "";
        System.out.println();
        while (true) {            
            ingresoUser = obtenerString(" --- Ingrese su usuario (tome en cuenta las mayúsculas) --- ");
            if(ingresoUser.equals(user)){
                ingresoPwd = obtenerString(" --- ingrese su contraseña (tome en cuenta las mayúsculas) --- ");
                if (ingresoPwd.equals(pwd)){
                    menuAdmin();
                    break;
                } else {
                    System.out.println(" --- su contraseña es incorrecta, por favor inténtelo nuevamente --- ");
                    break;
                }
            } else {
                System.out.println(" --- "+ingresoUser+" no es un nombre de usuario valido, por favor inténtelo nuevamente ---");
                break;
            }
        }
    }
    public static void menuAdmin(){
        String opcion = "";
        while(!opcion.equals("5")){
            System.out.println();
            System.out.println(" + + + + + Menú Administrador + + + + + ");
            System.out.println("(1) editar información de un vehiculo o agregar");
            System.out.println("(2) Agregar un descuento");
            System.out.println("(3) Mostrar usuarios");
            System.out.println("(4) mostrar Reportes de Modelo y Marca");
            System.out.println("(5) Regresar al menú principal");
            opcion = obtenerString(" --- Ingrese el número de la opción a la que desea ingresar --- ");
            switch (opcion) {
                case "1":
                    modificarVehiculo();
                    break;
                case "2":
                    agregarDescuento();
                    break;
                case "3":
                    //Muestra usuarios
                    System.out.println();
                    for (int i = 0; i < clientes.length; i++) {
                        if(clientes[i][0]!=null){
                            System.out.println("El Nit "+clientes[i][0]+" corresponde al usuario "+clientes[i][1]+" "+clientes[i][2]);
                        }
                    }
                    break;
                case "4":
                    //Muestra reporte de marca
                    System.out.println();
                    burbuja (reporteMarca, "des",1);
                    System.out.println("Marca"+"\t"+"Veces que se ha rentado:");
                    int totalContadoresMarca = 0, totalContadoresModelo = 0;
                    for (int k = 0; k < reporteMarca.length ; k++) {
                        if( (reporteMarca[k][0]!=null) && (reporteMarca[k][1]!=null) ){
                            System.out.println(reporteMarca[k][0]+"\t"+reporteMarca[k][1]);
                            int contadorSuma1 = Integer.parseInt(reporteMarca[k][1]);
                            totalContadoresMarca += contadorSuma1;
                        }
                    }
                    System.out.println("El total de vehiculos rentados fue: "+totalContadoresMarca);
                    System.out.println();
                    //Muestra reporte de modelo
                    burbuja (reporteModelo,"des",1);
                    System.out.println("Modelo"+"\t"+"Veces que se ha rentado:");
                    for (int k = 0; k < reporteModelo.length ; k++) {
                        if( (reporteModelo[k][0]!=null) && (reporteModelo[k][1]!=null) ){
                            System.out.println(reporteModelo[k][0]+"\t"+reporteModelo[k][1]);
                            int contadorSuma2 = Integer.parseInt(reporteModelo[k][1]);
                            totalContadoresModelo += contadorSuma2;
                        }
                    }
                    System.out.println("El total de vehiculos rentados fue: "+totalContadoresModelo);
                    break;
                case "5":
                    System.out.println(" +++++ Ha salido del menú Admin +++++ ");
                    break;
                default:
                    System.out.println(" --- Ingrese una opción válida --- ");
            }
        }
    }
    // Cliente
    public static void loginCliente(){
        String opcion = "";
        while(!opcion.equals("3")){
            System.out.println(" + + + + + Menú CLiente + + + + + ");
            System.out.println("(1) Registrarse");
            System.out.println("(2) Iniciar sesión");
            System.out.println("(3) Regresar al menú principal");
            opcion = obtenerString(" --- Ingrese el número de la opción a la que desea ingresar --- ");
            switch (opcion) {
                case "1":
                    while (true) {                        
                        String nit = obtenerString(" --- Ingrese su NIT (13 digitos) --- ");
                        if ((nit.length() == 13) && (!nit.equals("")) ) {
                            if (existe(nit,clientes,0) == false){
                                String nombre = obtenerString(" --- Ingrese sus nombres --- ");
                                String apellido = obtenerString(" --- Ingrese sus apellidos --- ");
                                if( !nombre.equals("") && !apellido.equals("") ){
                                    if (iCliente < clientes.length) {
                                        clientes[iCliente][0] = nit;
                                        clientes[iCliente][1] = nombre;
                                        clientes[iCliente][2] = apellido;
                                        iCliente++;
                                        break;
                                    } else {
                                        System.out.println(" --- la base de datos ha llegado a su limite :c --- ");
                                        break;
                                    }
                                }else{
                                    System.out.println(" --- Ingrese nombre y apellido validos, luego presione ENTER --- ");
                                    break;
                                }
                            } else {
                                System.out.println(" --- El Nit ingresado ya existe en sistema, puede iniciar sesión con el mismo --- ");
                                break; // regresar al menu loginclientes
                            }
                        } else {
                            System.out.println(" --- El Nit ingresado no cumple con tener 13 digitos --- ");
                            break;      //regresar al menu logincliente
                        }
                    }
                    break;
                case "2":
                    while (true) {                        
                        String ingresoNit = obtenerString(" --- Ingrese su NIT (13 digitos) --- ");
                        if (existe(ingresoNit, clientes,0) == true) {
                            nitFactura = ingresoNit;  //Guardamos el nit para imprimir en factura
                            for(int i=0; i < clientes.length ; i++){
                                if((clientes[i][0] != null) && (clientes[i][0].equals(nitFactura)) ){
                                    //Guardamos el nombre completo para imprimir en factura
                                    clienteFactura = clientes[i][1].concat(" ").concat(clientes[i][2]);
                                }
                            }
                            menuCliente();
                            break;
                        } else {
                            System.out.println(" --- El Nit ingresado No existe en sistema, puede intentar nuevamente o crear un nuevo usuario --- ");
                            break;      //break del while para regresar al menú cliente
                        }
                    }
                    break;
                case "3":
                    System.out.println(" --- Regresando al menú principal --- ");
                    break;
                default:
                    System.out.println(" --- Ingrese una opción válida --- ");
            }
        }
    }
    public static void menuCliente(){
        String opcion = "";
        while(!opcion.equals("2")){
            System.out.println();
            System.out.println(" +++++ Menú Renta de vehículos +++++ ");
            System.out.println("(1) Realizar Orden de Renta de vehículos");
            System.out.println("(2) Cerrar Sesión");
            opcion = obtenerString(" --- Ingrese el número de la opción a la que desea ingresar --- ");
            switch (opcion) {
                case "1":
                    //ordenar la matriz de descuentos
                    burbuja(descuentos,"asc",0);
                    rentasMenu();
                    System.out.println();
                    imprimirFactura();
                    //limpiar ordenActual matriz y contadores de facturación.
                    limpiardatos();
                    System.out.println();
                    break;
                case "2":
                    System.out.println(" --- Regresando al menú CLiente --- ");
                    break;
                default:
                    System.out.println(" --- Ingrese una opción válida --- ");
            }
        }
    }
    public static void rentasMenu(){
        String opcion = "";
        while(!opcion.equals("5")){
            System.out.println();
            System.out.println(" +++++ Menú Renta de vehículos +++++ ");
            System.out.println("(1) Listado de vehículos disponibles");
            System.out.println("(2) Descuentos segun dias de arrendamiento");
            System.out.println("(3) Mostrar la lista de vehículos rentados en la orden actual.");
            System.out.println("(4) Reserva de un vehículo para la orden actual");
            System.out.println("(5) Finalizar renta de vehículos / factura");
            opcion = obtenerString(" --- Ingrese el número de la opción a la que desea ingresar --- ");
            switch (opcion) {
                case "1":
                    //muestra vehiculos disponibles
                    System.out.println();
                    System.out.println(" + + + + + Lista de Vehículos disponibles para la renta + + + + + ");
                    System.out.println("placa"+"\t"+"modelo"+"\t"+"marca"+"\t"+ "linea"+"\t"+"c/u");
                    for (int i = 0; i < vehiculos.length; i++) {
                        if(vehiculos[i][0]!=null){
                            System.out.println(vehiculos[i][0]+"\t"+vehiculos[i][1]+"\t"+vehiculos[i][2]+"\t"+vehiculos[i][3]+"\t"+"Q"+vehiculos[i][4]);
                        }
                    }
                    break;
                case "2":
                    // Muestra descuentos
                    System.out.println();
                    System.out.println(" + + + + + Descuentos + + + + + ");
                    for (int i = 0; i < descuentos.length; i++) {
                        if(descuentos[i][0]!=null){
                            System.out.println("El descuento del "+descuentos[i][1]+"% aplica para un mínimo de "+descuentos[i][0]+" días.");
                        }
                    }
                    break;
                case "3":
                    System.out.println();
                    // muestra orden actual
                    System.out.println(" + + + + + Orden Actual + + + + + ");
                    //float precioUnitarioActual = 0f;
                    System.out.println("placa"+"\t"+"modelo"+"\t"+"marca"+"\t"+ "linea"+"\t"+"c/u"+"\t"+"v/c"+"\t"+"Días arrendado");
                    for (int i = 0; i < ordenActual.length; i++) {
                        if(ordenActual[i][0]!=null){
                            //precioUnitarioActual = Float.parseFloat(ordenActual[i][4]);
                            System.out.println(ordenActual[i][0]+"\t"+ordenActual[i][1]+"\t"+ordenActual[i][2]+"\t"+ordenActual[i][3]+"\t"+"Q"+ordenActual[i][4]+"\t"+ordenActual[i][5]+"\t"+ordenActual[i][6]);
                        }
                    }
                    System.out.println();
                    System.out.println("La placa del vehículo rentado anteriormente es:"+"\t"+placaActual);
                    System.out.println("El descuento porcentual es:"+"\t"+descuentoPorcentualActual+"%");
                    System.out.println("El descuento equivalente es a:"+"\t"+"Q"+descuentoActual);
                    System.out.println("El subtotal para este vehículo es:"+"\t"+"Q"+subTotalActual);
                    System.out.println("El total para este vehículo es:"+"\t"+"Q"+totalActual);
                    System.out.println();
                    System.out.println("Subtotal de rentas:"+"\t"+"Q"+subTotalFinal);
                    System.out.println("total de rentas:"+"\t"+"Q"+totalFinal);
                    break;
                case "4":
                    rentar();
                    break;
                case "5":
                    System.out.println(" --- La renta fue finalizada de forma exitosa --- ");
                    break;
                default:
                    System.out.println(" --- Ingrese una opción válida --- ");
            }
        }

    }
    
    
    //admin ----------------------------------------------------------------------------
    
    // varibles e información
    public static String user = "admin_202209714";
    public static String pwd = "202209714";
    
    // matrices y contadores
    public static int iVehiculo = 0;     // contador para ingresar nueva info y no sobreescribir
    public static String[][] vehiculos = new String[100][5];    // vehiculos
    /*  |   c0     c1      c2     c3     c4      |
        |   placa  modelo  marca  linea  costo   |  */
    
    public static int iDescuento = 0;     
    public static String[][] descuentos = new String[100][2];   // descuentos
    /*  |   c0    c1          |
        |   dias  descuento  |  */
    
    public static int ireporteModelo = 0;
    public static String[][] reporteModelo = new String[100][2]; //reporte Modelo
    /* |   c0       c1        |
       |   modelo   contador  |  */
    
    public static int ireporteMarca = 0;
    public static String[][] reporteMarca = new String[100][2]; //reporte marca
    /* |   c0      c1        |
       |   marca   contador  | */
    
    //funcionalidades
    public static void agregarVehiculo(){
        while (true) {                        
            String placa = obtenerString(" --- Ingrese la placa del vehiculo (7 caracteres alfanumericos) --- ");
            if (placa.length() == 7) {
                if (existe(placa, vehiculos,0) == false) {
                    String modelo = obtenerString("Ingrese el modelo del vehículo");
                    if(modelo.length() == 4){
                        String linea = obtenerString("Ingrese la linea del vehículo");
                        String marca = obtenerString("Ingrese la marca del vehículo");
                        String costo = obtenerString("Ingrese el precio (sin su divisa)");
                        if (iVehiculo < vehiculos.length) {
                            vehiculos[iVehiculo][0] = placa;
                            vehiculos[iVehiculo][1] = modelo;
                            vehiculos[iVehiculo][2] = marca;
                            vehiculos[iVehiculo][3] = linea;
                            vehiculos[iVehiculo][4] = costo;
                            iVehiculo++;
                            break;
                        } else {
                            System.out.println("hemos llenado el inventario de vehiculos para la renta");
                            break;
                        }
                    } else {
                        System.out.println(" --- El modelo Ingresado no cumple con tener 4 caracteres --- ");
                        break;
                    }
                } else {
                    System.out.println(" --- La placa ingresada ya existe en sistema, intentelo nuevamente --- ");
                    break;      //para regresar al menu admin
                }
            } else {
                System.out.println(" --- La placa ingresada no cumple con tener 7 caracteres --- ");
                break;          //para regresar al menu admin
            }
        }
    }
    public static void modificarVehiculo(){
        String opcion = "";
        while(!opcion.equals("4")){
            System.out.println();
            System.out.println(" +++++ Menú para editar vehiculos +++++ ");
            System.out.println("(1) agregar un vehiculo al sistema");
            System.out.println("(2) mostrar vehiculos en sistema");
            System.out.println("(3) Modificar un vehiculo en sistema");
            System.out.println("(4) Regresar al menú inicial");
            opcion = obtenerString(" --- Ingrese el número de la opción a la que desea ingresar --- ");
            switch (opcion) {
                case "1":
                    agregarVehiculo();
                    break;
                case "2":
                    System.out.println();
                    System.out.println(" + + + + + Lista de Vehículos en sistema + + + + + ");
                    System.out.println("placa"+"\t"+"modelo"+"\t"+"marca"+"\t"+ "linea"+"\t"+"c/u");
                    for (int i = 0; i < vehiculos.length; i++) {
                        if(vehiculos[i][0]!=null){
                            System.out.println(vehiculos[i][0]+"\t"+vehiculos[i][1]+"\t"+vehiculos[i][2]+"\t"+vehiculos[i][3]+"\t"+"Q"+vehiculos[i][4]);
                        }
                    }
                    break;
                case "3":
                    String placa = obtenerString("ingrese la placa del vehiculo que desea modificar");
                    if(existe(placa, vehiculos, 0)==true && !placa.equals("")){
                        String nuevoModelo = obtenerString("Ingrese un nuevo Modelo");
                        if( !nuevoModelo.equals("") && nuevoModelo.length()==4 ){
                            String nuevoMarca = obtenerString("Ingrese un nuevo Marca");
                            String nuevoLinea = obtenerString("Ingrese un nuevo Linea");
                            String nuevoCosto = obtenerString("Ingrese un nuevo Costo (sin divisa)");
                            if(!nuevoMarca.equals("") && !nuevoLinea.equals("") && !nuevoCosto.equals("")){
                                for (int i = 0; i < vehiculos.length; i++) {
                                    if( placa.equalsIgnoreCase(vehiculos[i][0]) ){
                                        vehiculos[i][1] = null;
                                        vehiculos[i][2] = null;
                                        vehiculos[i][3] = null;
                                        vehiculos[i][4] = null;
                                        vehiculos[i][1] = nuevoModelo;
                                        vehiculos[i][2] = nuevoMarca;
                                        vehiculos[i][3] = nuevoLinea;
                                        vehiculos[i][4] = nuevoCosto;
                                        break;
                                    }
                                }
                            } else {
                                System.out.println("Ingrese valores validos yluego presione enter");
                            }
                        } else {
                            System.out.println("Ingrese un modelo nuevo con 4 caracteres");
                        }
                    } else {
                        System.out.println("vehiculo no se puede editar porque no existe, ingreselo por medio de la opción 1");
                    }
                    break;
                case "4":
                    System.out.println(" --- Salimos de la interfaz de editar vehiculos");
                    break;
                default:
                    System.out.println(" --- Ingrese una opción válida --- ");
            }
        }
    }
    public static void agregarDescuento(){
        while (true) {            
            String descuentoString = obtenerString(" --- Ingrese el valor del descuento --- ");
            String diasRentado = obtenerString(" --- Ingrese el número de días al que aplica el descuento --- ");
            if ( (descuentoString!="") && (diasRentado!="") ){
                if ((existe(diasRentado,descuentos,0) == false) && (existe(descuentoString,descuentos,1) == false)) {
                    int valorDescuento = Integer.parseInt(descuentoString);
                    int valorDias = Integer.parseInt(diasRentado);
                    if((valorDescuento > 0 && valorDescuento < 100) && (valorDias > 0)){
                        if (iDescuento < descuentos.length) {
                            descuentos[iDescuento][0] = diasRentado;
                            descuentos[iDescuento][1] = descuentoString;
                            iDescuento++;
                            break;
                        }
                    } else {
                        System.out.print(" --- Ingrese un número mínimo de días mayor a cero o ");
                        System.out.println("ingrese un valor de descuento entre cero y cien --- ");
                        break;      //regresar al menu admin
                    }
                } else {
                    System.out.print(" --- El número de días mínimos ya existe en sistema o ");
                    System.out.println("el valor del descuento ya existen en sistema, intentelo nuevamente --- ");
                    break;      //regresar al menu admin
                }
            } else {
                System.out.print(" --- Ingrese un número de días minimos o ");
                System.out.println("ngrese el valor del descuento y luego presione ENTER --- ");
                break;      //regresar al menu admin
            }
        }
    }
    public static void contadores(String placa){
        for(int i = 0; i < ordenActual.length; i++) {
            if(ordenActual[i][0]!=null) {
                if(ordenActual[i][0].equals(placa)) {
                    if( (ordenActual[i][5]==null)||ordenActual[i][5].equals("")){
                        ordenActual[i][5] = "0";
                    }
                    int cantidadActualPlaca = Integer.parseInt(ordenActual[i][5]);
                    int contadores = cantidadActualPlaca + 1;
                    ordenActual[i][5] = Integer.toString(contadores);
                    String modelo = ordenActual[i][1]; // llamando modelo
                    String marca = ordenActual[i][2];  // llamando marca
                    if(existe(modelo, reporteModelo, 0) == true){
                        for(int j = 0; j < reporteModelo.length; j++) {
                            if(reporteModelo[j][0]!=null) {
                                if(reporteModelo[j][0].equals(modelo)) {
                                    int cantidadActualModelo = Integer.parseInt(reporteModelo[j][1]);
                                    int contadoresModelo = cantidadActualModelo + 1;
                                    reporteModelo[j][1] = Integer.toString(contadoresModelo);
                                }
                            }
                        }
                    } else {
                        reporteModelo[ireporteModelo][0] = modelo;
                        reporteModelo[ireporteModelo][1] = "1";
                        ireporteModelo++;
                    }
                    if (existe(marca, reporteMarca, 0) == true) {
                        for(int k = 0; k < reporteMarca.length; k++) {
                            if(reporteMarca[k][0]!=null) {
                                if(reporteMarca[k][0].equals(marca)) {
                                    int cantidadActualMarca = Integer.parseInt(reporteMarca[k][1]);
                                    int contadoresMarca = cantidadActualMarca + 1;
                                    reporteMarca[k][1] = Integer.toString(contadoresMarca);
                                }
                            }
                        }
                    } else {
                        reporteMarca[ireporteMarca][0] = marca;
                        reporteMarca[ireporteMarca][1] = "1";
                        ireporteMarca++;
                    }   
                }
            }
        }
    }
    
    
    //clientes ----------------------------------------------------------------------------
    
    // matrices
    public static int iCliente = 0;      // contador para ingresar nueva info y no sobreescribir
    public static String[][] clientes = new String[100][3]; // clientes
    /*  |   c0    c1       c2         |
        |   Nit   Nombres  Apellidos  |  */
    

    
    // Variables que se borran para que se almacene nueva información al momento de comprar ----------------
    
    public static int iElemento = 0;      // contador para ingresar e imprimir factura
    public static String[][] ordenActual = new String[100][7];    // FACTURA
    /*  |   c0     c1      c2     c3     c4     c5          c6               |
        |   placa  modelo  marca  linea  costo  Contadores  veces comprado   |  */
    
    public static int descuentoPorcentualFinal= 0;
    public static float descuentoFinal = 0f;
    public static float subTotalFinal = 0f;
    public static float totalFinal = 0f;
    public static float subTotalActual = 0f;        //total del vehiculo actual (precio unitario)
    public static float totalActual = 0f;           //total del vehiculo actual con descuento
    public static float descuentoActual = 0f;
    public static int descuentoPorcentualActual = 0;
    public static String nitFactura = "";           //para imprimir factura
    public static String clienteFactura = "";       //para imprimir nomvbre completo del cliente
    public static String placaActual = "";
    
    
    // fin variables que tengo que refrescar ----------------------------------------------------------------
    
    
    
    //funcionalidades de clientes
    
    public static void rentar(){
        while (true) {            
            String placaVehiculo = obtenerString(" --- Ingrese la placa del vehículo --- ");
            if (existe(placaVehiculo,vehiculos,0) == true) {
                String diasString = obtenerString(" --- Ingrese el mínimo de días que rentará el vehículo --- ");
                if(!diasString.equals("")){
                    int numDias = Integer.parseInt(diasString);
                    if (numDias > 0) {
                        String marcaVehiculo = "";
                        String lineaVehiculo = "";
                        String costoUnitarioVehiculo = "";
                        String modeloVehiculo = "";
                        placaActual = placaVehiculo;
                        for (int w = 0; w < vehiculos.length; w++) {
                            if(placaVehiculo.equals(vehiculos[w][0])){
                                modeloVehiculo = vehiculos[w][1];
                                marcaVehiculo = vehiculos[w][2];
                                lineaVehiculo = vehiculos[w][3];
                                costoUnitarioVehiculo = vehiculos[w][4];
                            }
                        }
                        for (int i = 0; i < descuentos.length ; i++) {
                            if(descuentos[i][0]!=null){ //este se agrego para que no crashee si no hay descuentos
                                int minDiasInicial = Integer.parseInt(descuentos[i][0]);
                                if(descuentos[i][0] != null && (descuentos[i+1][0] != null)){
                                    int minDiasFinal = Integer.parseInt(descuentos[i+1][0]);
                                    if((minDiasInicial < numDias) && (numDias <= minDiasFinal)){
                                        if(existe(placaVehiculo, ordenActual,0) == false){
                                            ordenActual[iElemento][0] = placaVehiculo;
                                            ordenActual[iElemento][1] = modeloVehiculo;
                                            ordenActual[iElemento][2] = marcaVehiculo;
                                            ordenActual[iElemento][3] = lineaVehiculo;
                                            ordenActual[iElemento][4] = costoUnitarioVehiculo;
                                            ordenActual[iElemento][6] = diasString;
                                            contadores(placaVehiculo);
                                            trabajarFacturacion("no",i,costoUnitarioVehiculo,numDias);
                                            iElemento++;
                                            break;
                                        } else {
                                            for(int j = 0; j < ordenActual.length; j++) {
                                                if(ordenActual[j][0]!=null) {
                                                    if(ordenActual[j][0].equals(placaVehiculo)) {
                                                        int auxDiasExistentes = Integer.parseInt(ordenActual[j][6]);
                                                        int auxDiasTotales = auxDiasExistentes + numDias;
                                                        String diasTotalesString = Integer.toString(auxDiasTotales);
                                                        ordenActual[j][6] = diasTotalesString;
                                                        contadores(placaVehiculo);
                                                        trabajarFacturacion("no",i,costoUnitarioVehiculo,numDias);
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                    } else if (numDias <= minDiasInicial){
                                        if(existe(placaVehiculo, ordenActual,0) == false){
                                            ordenActual[iElemento][0] = placaVehiculo;
                                            ordenActual[iElemento][1] = modeloVehiculo;
                                            ordenActual[iElemento][2] = marcaVehiculo;
                                            ordenActual[iElemento][3] = lineaVehiculo;
                                            ordenActual[iElemento][4] = costoUnitarioVehiculo;
                                            ordenActual[iElemento][6] = diasString;
                                            contadores(placaVehiculo);
                                            trabajarFacturacion("si",i,costoUnitarioVehiculo,numDias);
                                            iElemento++;
                                            break;
                                        } else {
                                            for(int j = 0; j < ordenActual.length; j++) {
                                                if(ordenActual[j][0]!=null) {
                                                    if(ordenActual[j][0].equals(placaVehiculo)) {
                                                        int auxDiasExistentes = Integer.parseInt(ordenActual[j][6]);
                                                        int auxDiasTotales = auxDiasExistentes + numDias;
                                                        String diasTotalesString = Integer.toString(auxDiasTotales);
                                                        ordenActual[j][6] = diasTotalesString;
                                                        contadores(placaVehiculo);
                                                        trabajarFacturacion("si",i,costoUnitarioVehiculo,numDias);//tocamos aqui
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                    } else {

                                    }
                                } else {
                                    if(existe(placaVehiculo, ordenActual,0) == false){
                                        ordenActual[iElemento][0] = placaVehiculo;
                                        ordenActual[iElemento][1] = modeloVehiculo;
                                        ordenActual[iElemento][2] = marcaVehiculo;
                                        ordenActual[iElemento][3] = lineaVehiculo;
                                        ordenActual[iElemento][4] = costoUnitarioVehiculo;
                                        ordenActual[iElemento][6] = diasString;
                                        contadores(placaVehiculo);
                                        trabajarFacturacion("no",i,costoUnitarioVehiculo,numDias);
                                        iElemento++;
                                        //comentario
                                        System.out.println("entramos al minimo de dias descuento con "+i);
                                        break;
                                    } else {
                                        for(int j = 0; j < ordenActual.length; j++) {
                                            if(ordenActual[j][0]!=null) {
                                                if(placaVehiculo.equals(ordenActual[j][0])) {
                                                    int auxDiasExistentes = Integer.parseInt(ordenActual[j][6]);
                                                    int auxDiasTotales = auxDiasExistentes + numDias;
                                                    String diasTotalesString = Integer.toString(auxDiasTotales);
                                                    ordenActual[j][6] = diasTotalesString;
                                                    contadores(placaVehiculo);
                                                    trabajarFacturacion("no",i,costoUnitarioVehiculo,numDias);
                                                    //comentario
                                                    System.out.println("entramos al minimo de dias descuento con "+i);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    }
                                }
                            } else {
                                if(existe(placaVehiculo, ordenActual,0) == false){
                                    ordenActual[iElemento][0] = placaVehiculo;
                                    ordenActual[iElemento][1] = modeloVehiculo;
                                    ordenActual[iElemento][2] = marcaVehiculo;
                                    ordenActual[iElemento][3] = lineaVehiculo;
                                    ordenActual[iElemento][4] = costoUnitarioVehiculo;
                                    ordenActual[iElemento][6] = diasString;
                                    contadores(placaVehiculo);
                                    trabajarFacturacion("no",0,costoUnitarioVehiculo,numDias);
                                    iElemento++;
                                    break;
                                } else {
                                    for(int j = 0; j < ordenActual.length; j++) {
                                        if(ordenActual[j][0]!=null) {
                                            if(ordenActual[j][0].equals(placaVehiculo)) {
                                                int auxDiasExistentes = Integer.parseInt(ordenActual[j][6]);
                                                int auxDiasTotales = auxDiasExistentes + numDias;
                                                String diasTotalesString = Integer.toString(auxDiasTotales);
                                                ordenActual[j][6] = diasTotalesString;
                                                contadores(placaVehiculo);
                                                trabajarFacturacion("no",0,costoUnitarioVehiculo,numDias);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                }
                            }
                        }
                        break;
                    } else {
                        System.out.println(" --- Intentelo nuevamente con un número de días mayor cero --- ");
                        break;
                    }
                } else {
                    System.out.println(" --- Ingrese un número de días válido y luego presione ENTER --- ");
                    break;
                }
            } else {
                System.out.println(" --- Inténtelo nuevamente, no es una placa que coincida con la de los vehiculos existentes para la renta --- ");
                break;
            }
        }
    }
    public static void trabajarFacturacion (String descuentoMenor,int indexF, String costo, int dias){
        //si no hay descuendos 
        if(descuentoMenor.equals("si")){
            subTotalFinal += (Float.parseFloat(costo))*dias;
            subTotalActual = (Float.parseFloat(costo))*dias;
            descuentoPorcentualActual = 0;
            descuentoActual = 0;
            totalActual = subTotalActual;
            totalFinal += subTotalActual;
        } else {
            if(descuentos[indexF][1]==null){
                descuentoPorcentualActual = 0;
            } else {
                descuentoPorcentualActual = Integer.parseInt(descuentos[indexF][1]);
            }
            float descuentoFloat = (float) descuentoPorcentualActual;
            subTotalFinal += (Float.parseFloat(costo))*dias;
            subTotalActual = (Float.parseFloat(costo))*dias;
            descuentoActual = subTotalActual*0.01f*descuentoFloat;
            totalActual = (subTotalActual - descuentoActual);
            totalFinal += (subTotalActual - descuentoActual);
        }
        
    }
    public static void imprimirFactura(){
        // para la hora y fecha actual
        DateFormat formatoFecha = new SimpleDateFormat("EEE, MMM d, yyyy");
        DateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
        String fecha = formatoFecha.format(Calendar.getInstance().getTime());
        String hrs = formatoHora.format(Calendar.getInstance().getTime());
        // para sacar total, subtotal y descuento monetario y porcentual (Finales)
        descuentoFinal = subTotalFinal - totalFinal;
        float auxiliar = 100 - (descuentoFinal*100)/subTotalFinal;
        //descuentoPorcentualFinal sin redondear y redondeado
        descuentoPorcentualFinal = Math.round(auxiliar);
        // FACTURA
        System.out.println("----------------------- Factura -------------------------");
        System.out.println("Nombre de la empresa:"+"\t"+"ByteCar");
        System.out.println("Nombre del cliente:"+"\t"+clienteFactura);
        System.out.println("NIT del cliente:"+"\t"+nitFactura);
        System.out.println("Fecha de emisión:"+"\t"+fecha+" a las "+hrs+" hrs.");
        System.out.println("Lista de compras:");
        System.out.println("placa"+"\t"+"modelo"+"\t"+"marca"+"\t"+ "linea"+"\t"+"c/u"+"\t"+"v/c"+"\t"+"Días arrendado");
        for (int i = 0; i < ordenActual.length; i++) {
            if(ordenActual[i][0]!=null){
                System.out.println(ordenActual[i][0]+"\t"+ordenActual[i][1]+"\t"+ordenActual[i][2]+"\t"+ordenActual[i][3]+"\t"+"Q"+ordenActual[i][4]+"\t"+ordenActual[i][5]+"\t"+ordenActual[i][6]);
            }
        }
        if(auxiliar==100){
            System.out.println();
            System.out.println("Subtotal de rentas: Q"+subTotalFinal);
            System.out.println("No se aplicaron descuentos");
            System.out.println("El total de rentas es: Q"+totalFinal);          // y este el total final xd
        }
        System.out.println();
        System.out.println("Subtotal de rentas: Q"+subTotalFinal);
        System.out.println("El descuento porcentual aproximado aplicado es: "+descuentoPorcentualFinal+"%");
        System.out.println("El descuento porcentual REAL aplicado es: "+auxiliar+"%"); //eso se peuede quitar solo, pero explica porqué varían los porcentajes manualmente.
        System.out.println("El descuento equivalente es: Q"+totalFinal);    // por alguna razón este es el descuento
        System.out.println("total de rentas: Q"+descuentoFinal);            // y este el total final xd
        
    }
    
    //Este metodo limpia los datos del cliente y es necesario para poder almacenar nueva info.
    public static void limpiardatos(){
        totalFinal = 0f;
        subTotalFinal = 0f;
        descuentoFinal = 0f;
        descuentoPorcentualFinal = 0;
        totalActual = 0f;
        subTotalActual = 0f;
        descuentoActual = 0f;
        descuentoPorcentualActual = 0;
        nitFactura = "";
        clienteFactura = "";
        iElemento = 0;    
        placaActual = "";
        for (int i = 0; i < ordenActual.length; i++) {
            ordenActual[i][0] = null;
            ordenActual[i][1] = null;
            ordenActual[i][2] = null;
            ordenActual[i][3] = null;
            ordenActual[i][4] = null;
            ordenActual[i][5] = null;
        }
    }
    
}
