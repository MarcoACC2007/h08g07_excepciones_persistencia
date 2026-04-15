package a;

public class EJ1_2Error {

    public static void cargar() {
        System.out.println("Ejemplo 1.2 (Con Error)");

        System.out.println("Entrando en Main");
        metodoA(); //Ejecutamos el metodo A
        System.out.println("Saliendo de Main");
        System.out.println("Fin Ejemplo 1.2");
    }

    public static void metodoA(){
        System.out.println("Entrando en A");
        metodoB(); //Ejecutamos el metodo B
        System.out.println("Saliendo de A");
    }

    public static void metodoB(){
        System.out.println("Entrando en B");
        metodoC(); //Ejecutamos el metodo C
        System.out.println("Saliendo de B");
    }

    public static void metodoC(){
        System.out.println("Entrando en C");
        System.out.println(1/0); //Saltará ArithmeticException
        System.out.println("Saliendo de C");
    }
}