
package mavenproject.mavenproject1.CLASES;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AppState implements Serializable{
    
    public static String rutaUsuariosSerializados = "./DatosSerializados/appState.bin";
    
    public static void serializar() {
        File file = new File(rutaUsuariosSerializados);
        
        // Creamos la carpeta donde iran los archivos serializados, si no existia
        if (!file.exists()) {
            file.getParentFile().mkdir();
        }
        
        // Se crea el archvio donde se va serializar
        try {
            file.createNewFile();
        } catch(IOException ex) {
            System.out.println("No se pudo crear el archvio de serialización.");
        }
        
        // Se escriben los datos de serializados en sobre el archivo
        try {
            FileOutputStream fos = new FileOutputStream(rutaUsuariosSerializados);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(Profesor.listadoProfesores);
            oos.writeObject(Estudiante.listadoEstudiantes);
            oos.writeObject(Asignatura.listadoAsignaturas);
        } catch (FileNotFoundException ex) {
            System.out.println("No se encotro el archivo para serializar");
        } catch (IOException ex) {
            System.out.println("Ocurrio un error al intentar escribir sobre el archivo.");
        }
    }
    
    public static void deserializar() {
        try {
            File file = new File(rutaUsuariosSerializados);
            if (!file.exists()) {
                return;
            }
            FileInputStream fis = new FileInputStream(rutaUsuariosSerializados);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Profesor.listadoProfesores = (ArrayList<Profesor>) ois.readObject();
            Estudiante.listadoEstudiantes = (ArrayList<Estudiante>) ois.readObject();
            Asignatura.listadoAsignaturas = (ArrayList<Asignatura>) ois.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AppState.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AppState.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AppState.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
