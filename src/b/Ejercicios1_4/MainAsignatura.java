package b.Ejercicios1_4;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainAsignatura {
    // Método para guardar un objeto en un archivo JSON
    public static <T> void guardarObjetoEnArchivo(String rutaArchivo, T objeto) {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(rutaArchivo)) {
            gson.toJson(objeto, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // Método para cargar un objeto desde un archivo JSON
    public static <T> T cargarObjetoDesdeArchivo(String rutaArchivo, Class<T> clase) {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(rutaArchivo)) {
            return gson.fromJson(reader, clase);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i<args.length;i++)
            sb.append("Argumento " + i + ": " + args[i] + "\n");
        System.out.println("Argumentos: \n" + sb);

        //Asignatura
        Estudiante[] listaEstudiantes = {
                new Estudiante("Mario", 19),
                new Estudiante("Luigi", 18)
        };

        Asignatura asignatura = new Asignatura("Metodología de la programación", listaEstudiantes);
        String rutaArchivoAsignatura = "asignatura.json";
        guardarObjetoEnArchivo(rutaArchivoAsignatura, asignatura);
        Asignatura asignaturaCargado = cargarObjetoDesdeArchivo(rutaArchivoAsignatura, Asignatura.class);
        if (asignaturaCargado != null) {
            System.out.println("Asignatura cargada: " + asignaturaCargado.getName());
            System.out.println("Alumnos matriculados: ");
            for (Estudiante e : asignaturaCargado.getAlumnos()) {
                System.out.println(" - " + e.getName() + " (" + e.getEdad() + ")");
            }

        }
    }
}

/* Respecto a las preguntas:
1) ¿Qué estructura tiene el fichero resultante?
2) ¿Puedo modificar los alumnos en el fichero resultante, y obtener unos nuevos objetos cargando el fichero de vuelta?

1. EL fichero tiene una estructura anidada, en la que los subobjetos (Los estudiantes) se encuentran dentro del objeto Asignatura.
2. Es posible hacer lo que se pregunta, pero se debe de eliminar la siguiente linea para que funcione:
        - guardarObjetoEnArchivo(rutaArchivoAsignatura, asignatura);
Esto se debe a que esto actualiza los datos del json con el constructor que tenemos en el main.
 */
