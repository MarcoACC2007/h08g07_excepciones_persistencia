package a;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EJ1_6 {

    public static void cargar(){
        System.out.println("Ejemplo 1.6");

        try{
            System.out.println("Abriendo el archivo");
            File archivo = new File("archivo.txt"); //Queremos buscar un archivo txt.
            Scanner scanner = new Scanner(archivo); //Escaneamos el archivo para ver si existe.
            System.out.println("Archivo encontrado");

            scanner.close(); //Cerramos el archivo escaneado.
        }
        catch (FileNotFoundException ex){
            System.out.println("Archivo no encontrado"); //Mensaje para dejar mas claro que el archivo no ha sido encontrado.
            ex.printStackTrace();
        }

        finally{
            System.out.println("Ejecución del bloque finally (Haya excepcción o no)");
        }

        System.out.println("El código sigue ejecutandose después del bloque try-catch-finally");
        System.out.println("Fin ejemplo 1.6");
    }
}
