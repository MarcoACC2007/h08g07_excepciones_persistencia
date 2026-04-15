package a;

public class EJ1_5 { //Reutilizamos el ejemplo 1.3 pero acortandolo y utilizando varios catch, explicados en el apartado 1.5.

    public static void cargar() {
        System.out.println("Ejemplo 1.5");

        try {
            System.out.println("Entrando en Main");
            metodoA(); //Ejecutamos el metodo A
        }
        catch (ArithmeticException ex) {
            System.out.println("Error al ejecutar el programa");
            ex.printStackTrace();
        }
        catch (NullPointerException ex){
            System.out.println("Error al ejecutar el programa");
            ex.printStackTrace();
        }

        finally {
            System.out.println("Saliendo de Main");
            System.out.println("Fin Ejemplo 1.5");
        }
    }

    public static void metodoA() throws ArithmeticException, NullPointerException {
        System.out.println("Entrando en A");
        metodoB(); //Ejecutamos el metodo B
        System.out.println("Saliendo de A");
    }

    public static void metodoB() throws ArithmeticException, NullPointerException {
        System.out.println("Entrando en B");
        //Está primera operación queda comentada, para poder comprobar el segundo catch.
        //System.out.println(1/0); //Saltará ArithmeticException
        String texto = null;
        System.out.println(texto.length());
        System.out.println("Saliendo de B");
    }
}
