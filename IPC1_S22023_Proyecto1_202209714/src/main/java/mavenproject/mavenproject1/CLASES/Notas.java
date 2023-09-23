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
public class Notas implements Serializable, Comparable<Notas>{
    public int estudiante;
    public float nota;
    
    public Notas(int alumno, float nota){
        this.estudiante = alumno;
        this.nota = nota;
    }
    
    @Override
    public int compareTo(Notas lanota) {
        // Comparar los objetos por su valor
        return Float.compare(this.nota, lanota.nota);
    }
}
