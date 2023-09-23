
package mavenproject.mavenproject1.CLASES;

import java.io.Serializable;
import java.util.ArrayList;

public class Asignatura implements Serializable, Comparable<Asignatura>{    
    //listado de asginatura GLOBAL
    public static ArrayList<Asignatura> listadoAsignaturas = new ArrayList<>();
    
    
    public ArrayList<Notas> integrantes = new ArrayList<>();
    
    public ArrayList<Actividades> actividadesAsignatura = new ArrayList<>();
    public int codigo;
    public String nombre;
    public int creditos;
    public int profesor;

    
    public Asignatura(int ingresoCodigo,String ingresoNombre, int ingresoCreditos, int ingresoCodigoProfesor){
        this.codigo = ingresoCodigo;
        this.nombre = ingresoNombre;
        this.creditos = ingresoCreditos;
        this.profesor = ingresoCodigoProfesor;
    }
    
    public static void asignarActividad(int codigoMateria,int ponderacion, String nombre, String descripcion){
        for (Asignatura curso : listadoAsignaturas) {
            if(codigoMateria==curso.codigo){
                Actividades actividad = new Actividades(nombre, descripcion, ponderacion);
                curso.actividadesAsignatura.add(actividad);
            }
        }
    }
    
    @Override
    public int compareTo(Asignatura curso) {
        // Comparar los objetos por su valor
        return Integer.compare(this.integrantes.size(), curso.integrantes.size());
    }
    @Override
    public String toString() {
        return Integer.toString(integrantes.size());
    }
    
}
