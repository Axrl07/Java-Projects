package com.mycompany.practica2_gestiondelivery;

import java.util.ArrayList;

public class Velocidad {

    private int distancia;
    private int velocidad;

    // constructor
    public Velocidad(int distancia, int velocidad) {
        this.distancia = distancia;
        this.velocidad = velocidad;
    }

    //getters
    public int getDistancia() {
        return this.distancia;
    }

    public int getVelocidad() {
        return this.velocidad;
    }

    //setters
    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public static ArrayList<Velocidad> listadoVelocidades = new ArrayList();

    public static int BuscarVelocidad(int distancia) {
        for (Velocidad vel : listadoVelocidades) {
            if (distancia == vel.getDistancia()) {
                return vel.getVelocidad();
            }
        }
        return 0;
    }
}
