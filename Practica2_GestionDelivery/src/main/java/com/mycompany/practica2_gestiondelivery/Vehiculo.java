package com.mycompany.practica2_gestiondelivery;

import java.io.Serializable;
import java.util.ArrayList;

public class Vehiculo implements Serializable {

    private String nombre;
    private int distancia;
    private float monto;
    private String horaCreacion;
    private String horaEntrega;

    //constructor vehiculo
    public Vehiculo(String nombre) {
        this.nombre = nombre;
    }

    public Vehiculo(String nombre, int distancia, float monto, String creacion) {
        this.nombre = nombre;
        this.distancia = distancia;
        this.monto = monto;
        this.horaCreacion = creacion;
    }

    //getter
    public String getNombre() {
        return this.nombre;
    }

    public int getDistanca() {
        return this.distancia;
    }

    public float getMonto() {
        return this.monto;
    }

    public String getHoraCreacion() {
        return this.horaCreacion;
    }

    public String getHoraEntrega() {
        return this.horaEntrega;
    }

    //setter
    public void setNombre(String newNombre) {
        this.nombre = newNombre;
    }

    public void setDistancia(int newDistancia) {
        this.distancia = newDistancia;
    }

    public void setMonto(float newMonto) {
        this.monto = newMonto;
    }

    public void setHoraCreacion(String newHoraCreacion) {
        this.horaCreacion = newHoraCreacion;
    }

    public void setHoraEntrega(String newHoraEntrega) {
        this.horaEntrega = newHoraEntrega;
    }

    //listado (ambos se serializan)
    public static ArrayList<Vehiculo> listadoVehiculos = new ArrayList<>();
    public static ArrayList<Vehiculo> viajesTemporales = new ArrayList<>();
    public static ArrayList<Vehiculo> historialViajes = new ArrayList<>();

    //devuelve el Vehiculo
    public static Vehiculo getVehiculo(String nombreVehiculoBuscado, ArrayList<Vehiculo> listadoInteres) {
        for (Vehiculo v : listadoInteres) {
            if (nombreVehiculoBuscado.equalsIgnoreCase(v.getNombre())) {
                return v;
            }
        }
        return null;
    }

    //agregar un vehiculo
    public static void AddVehiculo(Vehiculo vehiculo, ArrayList<Vehiculo> listadoInteres) {
        listadoInteres.add(vehiculo);
    }
}
