
package mavenproject.mavenproject1.CLASES;

import java.io.Serializable;

public class Usuario implements Serializable{
    //atributos de las instancias usuario
    public int codigo;
    public String clave;
    public String nombre;
    public String apellido;
    public char genero;
    public String correo;
    
    //construye usuarios
    public Usuario(int cod, String pwd, String nom, String ape, char gen, String mail){
        this.codigo = cod;
        this.clave = pwd;
        this.nombre = nom;
        this.apellido = ape;
        this.genero = gen;
        this.correo = mail;
    }
}
