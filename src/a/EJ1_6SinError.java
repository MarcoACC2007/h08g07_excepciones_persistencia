package a;

public class EJ1_6SinError {

    public static void cargar(){
        System.out.println("Ejemplo 1.6 (Sin Error)");

        try{
            System.out.print("5 + 3 = " );
            System.out.println(5 + 3);
        }
        catch (ArithmeticException ex){
            System.out.println("Error en la operación"); //Mensaje para dejar mas claro que la operación no tiene solución.
            ex.printStackTrace();
        }

        finally{
            System.out.println("Ejecución del bloque finally (Haya excepcción o no)");
        }

        System.out.println("El código sigue ejecutandose después del bloque try-catch-finally");
        System.out.println("Fin ejemplo 1.6 (Sin Error)");
    }
}
