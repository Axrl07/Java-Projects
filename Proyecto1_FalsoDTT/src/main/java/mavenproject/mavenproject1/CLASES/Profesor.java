
package mavenproject.mavenproject1.CLASES;

import java.io.Serializable;
import java.util.ArrayList;

public class Profesor extends Usuario implements Serializable{
    //listado de profesr GLOBAL
    public static ArrayList<Profesor> listadoProfesores = new ArrayList<>();
    
    public Profesor(int cod, String pwd, String nom, String ape, char gen, String mail){
        super(cod, pwd, nom, ape, gen, mail);
    }
}
