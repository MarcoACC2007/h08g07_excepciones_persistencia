package a;

public class EJ1_7 {

    public static void cargar() {
        System.out.println("Ejemplo 1.7: Clases de Excepción usadas comúnmente");

        //ArrayIndexOutOfBoundsException
        try {
            int[] numeros = new int[3];
            System.out.println(numeros[3]); // Se sale del rango
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Error: Fuera de rango");
            ex.printStackTrace();
        }

        //NullPointerException
        try {
            String[] textos = new String[3];
            System.out.println(textos[1].length()); // Tamaño nulo.
        } catch (NullPointerException ex) {
            System.out.println("Error: Tamaño nulo");
            ex.printStackTrace();
        }

        //NumberFormatException
        try {
            int numero = Integer.parseInt("abc"); // Formato incorrecto.
        } catch (NumberFormatException ex) {
            System.out.println("Error: Formato incorrecto");
            ex.printStackTrace();
        }

        //ClassCastException
        try {
            Object o = new Object();
            Integer i = (Integer) o; // conversión de tipo incorrecta
        } catch (ClassCastException ex) {
            System.out.println("Error: conversión de tipo inválida");
            ex.printStackTrace();
        }

        System.out.println("Fin Ejemplo 1.7");
    }
}

