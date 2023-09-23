
package mavenproject.mavenproject1.CLASES;

import java.io.Serializable;
import java.util.ArrayList;

public class Estudiante extends Usuario implements Serializable{    
    //listado de estudiantes GLOBAL
    public static ArrayList<Estudiante> listadoEstudiantes = new ArrayList<>();
    
    public Estudiante(int cod, String pwd, String nom, String ape, char gen, String mail){        
        super(cod, pwd, nom, ape, gen, mail);
    }
}
