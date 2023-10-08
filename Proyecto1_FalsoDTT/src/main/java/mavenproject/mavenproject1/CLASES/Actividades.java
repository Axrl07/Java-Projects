/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mavenproject.mavenproject1.CLASES;

import java.io.Serializable;

/**
 *
 * @author angel
 */
public class Actividades implements Serializable{
    public String nombre;
    public String descripcion;
    public int ponderacion;
    
    public Actividades(String name, String description, int points){
        this.nombre = name;
        this.descripcion = description;
        this.ponderacion = points;
    }
}
