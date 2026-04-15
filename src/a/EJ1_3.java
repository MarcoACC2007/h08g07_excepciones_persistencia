package a;

public class EJ1_3 { //Reutilizamos el ejemplo 1.2Error pero aplicado a lo que se pide en 1.3.

    public static void cargar() {
        System.out.println("Ejemplo 1.3");

        try {
            System.out.println("Entrando en Main");
            metodoA(); //Ejecutamos el metodo A
        }
        catch (ArithmeticException ex) {
            System.out.println("Error al ejecutar el programa");
            ex.printStackTrace();
        }

        finally {
            System.out.println("Saliendo de Main");
            System.out.println("Fin Ejemplo 1.3");
        }
    }

    public static void metodoA() throws ArithmeticException {
        System.out.println("Entrando en A");
        metodoB(); //Ejecutamos el metodo B
        System.out.println("Saliendo de A");
    }

    public static void metodoB() throws ArithmeticException {
        System.out.println("Entrando en B");
        metodoC(); //Ejecutamos el metodo C
        System.out.println("Saliendo de B");
    }

    public static void metodoC() throws ArithmeticException {
        System.out.println("Entrando en C");
        metodoD(); //Ejecutamos el metodo C
        System.out.println("Saliendo de C");
    }

    public static void metodoD() throws ArithmeticException {
        System.out.println("Entrando en D");
        System.out.println(1/0); //Saltará ArithmeticException
        System.out.println("Saliendo de D");
    }
}
