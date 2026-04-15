package a;

import java.io.FileNotFoundException;

public class EJ1_4 { //Haremos un ejemplo de cada (Excepcion checked, unchecked y error)

    public static void cargar (){

        System.out.println("Ejemplo 1.4");

        //Excepción unchecked;
        try{
            System.out.println("Forzamos ArithmeticException");
            int a = 10/0;
        }
        catch (ArithmeticException ex){
            System.out.println("Fallo a la hora de ejecutar el programa (RuntimeException)");
        }

        //Excepción checked;
        try{
            System.out.println("Forzamos FileNotFoundException");
            java.io.FileReader fr = new java.io.FileReader("archivo_que_no_existe.txt");
        }
        catch (FileNotFoundException ex){
            System.out.println("No se ha encontrado el archivo");
        }

        //Error;
        try {
            System.out.println("Provocando StackOverflowError (subclase de VirtualMachineError) (un bucle)");
            provocarStackOverflow();
        } catch (VirtualMachineError ex) {
            System.out.println("Capturado VirtualMachineError: " + ex);
        }

        System.out.println("Fin Ejemplo 1.4");
    }

    // Método recursivo para provocar un StackOverflowError
    public static void provocarStackOverflow() {
        provocarStackOverflow();
    }
}
