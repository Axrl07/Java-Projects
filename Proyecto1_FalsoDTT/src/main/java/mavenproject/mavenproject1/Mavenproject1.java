package mavenproject.mavenproject1;
import mavenproject.mavenproject1.INTERFACES.LoginVentana;
import mavenproject.mavenproject1.CLASES.*;
import static mavenproject.mavenproject1.CLASES.AppState.deserializar;
import static mavenproject.mavenproject1.CLASES.Asignatura.listadoAsignaturas;
import static mavenproject.mavenproject1.CLASES.Estudiante.listadoEstudiantes;
import static mavenproject.mavenproject1.CLASES.Profesor.listadoProfesores;

public class Mavenproject1 {
    public static void main(String[] args) {
        deserializar();
        agregarDatos();
        LoginVentana accederLogin = new LoginVentana();
    }
    
    public static void agregarDatos(){
        if(listadoProfesores.isEmpty()){
            Profesor pruebaProfesor =
                    new Profesor(789, "A123", "Angel", "Alvarado", 'm', "angel@gmail.com");
            listadoProfesores.add(pruebaProfesor);
            if(listadoAsignaturas.isEmpty()){
                Asignatura prueba1 =
                        new Asignatura(100, "prueba1", 100, pruebaProfesor.codigo);
                listadoAsignaturas.add(prueba1);
                Asignatura prueba2 =
                        new Asignatura(101, "prueba2", 100, pruebaProfesor.codigo);
                listadoAsignaturas.add(prueba2);
                Asignatura prueba3 =
                        new Asignatura(102, "prueba3", 100, pruebaProfesor.codigo);
                listadoAsignaturas.add(prueba3);
                Asignatura prueba4 =
                        new Asignatura(103, "prueba4", 100, pruebaProfesor.codigo);
                listadoAsignaturas.add(prueba4);
                Asignatura prueba5 =
                        new Asignatura(104, "prueba5", 100, pruebaProfesor.codigo);
                listadoAsignaturas.add(prueba5);
                Asignatura prueba6 =
                        new Asignatura(105, "prueba6", 100, pruebaProfesor.codigo);
                listadoAsignaturas.add(prueba6);
                Asignatura prueba7 =
                        new Asignatura(106, "prueba7", 100, pruebaProfesor.codigo);
                listadoAsignaturas.add(prueba7);
                Asignatura prueba8 =
                        new Asignatura(107, "prueba8", 100, pruebaProfesor.codigo);
                listadoAsignaturas.add(prueba8);
                Asignatura prueba9 =
                        new Asignatura(108, "prueba9", 100, pruebaProfesor.codigo);
                listadoAsignaturas.add(prueba9);
            }
        }
        if(listadoEstudiantes.isEmpty()){
            Estudiante pruebaEstudiante =
                    new Estudiante(456, "R123", "Rebeca", "Torres", 'f', "rebeca@hotmail.com");            
            listadoEstudiantes.add(pruebaEstudiante);
        }
    }
}
