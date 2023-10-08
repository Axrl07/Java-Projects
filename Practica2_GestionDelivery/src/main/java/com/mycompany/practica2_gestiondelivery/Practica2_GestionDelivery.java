package com.mycompany.practica2_gestiondelivery;

import com.mycompany.practica2_gestiondelivery.interfaces.AdminFrame;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Practica2_GestionDelivery {

    public static String fechaHora() {
        DateFormat formatoFecha = new SimpleDateFormat("EEE, MMM d, yyyy");
        DateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
        String fecha = formatoFecha.format(Calendar.getInstance().getTime());
        String hrs = formatoHora.format(Calendar.getInstance().getTime());
        String fechaHora = fecha.concat("-" + hrs);
        return fechaHora;
    }

    public static void main(String[] args) {

        // agregando productos y vehiculos quemados
        if (Vehiculo.listadoVehiculos.isEmpty()) {
            Vehiculo.listadoVehiculos.add(new Vehiculo("Motocicleta 1"));
            Vehiculo.listadoVehiculos.add(new Vehiculo("Motocicleta 2"));
            Vehiculo.listadoVehiculos.add(new Vehiculo("Motocicleta 3"));
        }
        if (Producto.listadoProductos.isEmpty()) {
            Producto.AddProductoListado(new Producto("Gaseosa", 12.50f), Producto.listadoProductos);
            Producto.AddProductoListado(new Producto("Papas Fritas", 16f), Producto.listadoProductos);
            Producto.AddProductoListado(new Producto("Hamburguesa", 35.10f), Producto.listadoProductos);
            Producto.AddProductoListado(new Producto("Ensalada", 26.20f), Producto.listadoProductos);
        }
        if (Velocidad.listadoVelocidades.isEmpty()) {
            for (int i = 0; i < 10; i++) {
                int distancia = 10 - i;
                int velocidad = 4 * (i + 1);
                Velocidad.listadoVelocidades.add(new Velocidad(distancia, velocidad));
            }
        }

        //ejecutando Frame principal
        AdminFrame acceder = new AdminFrame();
    }
}
