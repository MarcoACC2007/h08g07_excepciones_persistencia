package b.EjercicioAlumno;

import com.google.gson.Gson;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;

public class MainAlumno {
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

        if (args.length < 2) { //Si los argumentos son menos de dos palabras (Falta operacion o fichero), se detiene el programa.
            return;
        }


        String operacion = args[0]; //La primera palabra escrita será el comando de la operación.
        String fichero = args [1]; // La segunda palabra escrita será el comando del fichero en el que guardamos/cargamos datos.

        if (operacion.equals("init")){ //Si operacion = init, entonces creamos un nuevo alumno y lo guardamos.
            Alumno alumno = new Alumno("Pablo", 20, 2);
            guardarObjetoEnArchivo(fichero, alumno);
            System.out.println("Datos del alumno guardados.");
        }

        else if (operacion.equals("show")){ //Si operacion = show muestra los datos del alumno cargado,
            Alumno alumno = cargarObjetoDesdeArchivo(fichero, Alumno.class);
            if (alumno != null){
                System.out.println("Datos del Alumno");
                System.out.println("Nombre: " + alumno.getNombre());
                System.out.println("Edad: " + alumno.getEdad());
                System.out.println("Curso: " + alumno.getCurso());
            }
        }

        else{
            System.out.println("Operación no aceptada");
        }

        }
    }
