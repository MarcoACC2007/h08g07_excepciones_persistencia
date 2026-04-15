package b.Ejercicios1_4;

import com.google.gson.Gson;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;

public class MainClasesAnteriores {
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

        //Circle
        Circle circle = new Circle(1.0);
        String rutaArchivoCircle = "circle.json";
        guardarObjetoEnArchivo(rutaArchivoCircle, circle);
        Circle circleCargado = cargarObjetoDesdeArchivo(rutaArchivoCircle, Circle.class);
        if (circleCargado != null) {
            System.out.println("Circle cargado: " + circleCargado.getRadius());
        }

        //Rectangle
        Rectangle rectangle = new Rectangle(2.0f, 3.4f);
        String rutaArchivoRectangle = "rectangle.json";
        guardarObjetoEnArchivo(rutaArchivoRectangle, rectangle);
        Rectangle rectangleCargado = cargarObjetoDesdeArchivo(rutaArchivoRectangle, Rectangle.class);
        if (rectangleCargado != null) {
            System.out.println("Rectangle cargado: " + rectangleCargado.getLength());
        }

        //Account
        Customer customerAccount = new Customer(832475, "Juan", 'M');
        Account account = new Account(832475, customerAccount, 2.0);
        String rutaArchivoAccount = "account.json";
        guardarObjetoEnArchivo(rutaArchivoAccount, account);
        Account accountCargado = cargarObjetoDesdeArchivo(rutaArchivoAccount, Account.class);
        if (accountCargado != null) {
            System.out.println("Account cargado: " + accountCargado.getCustomerName());
        }

        //Customer
        Customer customer = new Customer(832475, "Juan", 'M');
        String rutaArchivoCustomer = "customer.json";
        guardarObjetoEnArchivo(rutaArchivoCustomer, customer);
        Customer customerCargado = cargarObjetoDesdeArchivo(rutaArchivoCustomer, Customer.class);
        if (customerCargado != null) {
            System.out.println("Customer cargado: " + customerCargado.getName());
        }

        //Animal
        Animal animal = new Animal("Cat");
        String rutaArchivoAnimal = "animal.json";
        guardarObjetoEnArchivo(rutaArchivoAnimal, animal);
        Animal animalCargado = cargarObjetoDesdeArchivo(rutaArchivoAnimal, Animal.class);
        if (animalCargado != null) {
            System.out.println("Animal cargado: " + animalCargado.name);
        }

        //Person
        Person person = new Person("Pedro", "El Casar");
        String rutaArchivoPerson = "person.json";
        guardarObjetoEnArchivo(rutaArchivoPerson, person);
        Person personCargado = cargarObjetoDesdeArchivo(rutaArchivoPerson, Person.class);
        if (personCargado != null) {
            System.out.println("Person cargado: " + personCargado.getName());
        }

        //CircleD
        CircleD circleD = new CircleD(2.3, 8.3, 5.4);
        String rutaArchivoCircleD = "circleD.json";
        guardarObjetoEnArchivo(rutaArchivoCircleD, circleD);
        CircleD circleDCargado = cargarObjetoDesdeArchivo(rutaArchivoCircleD, CircleD.class);
        if (circleDCargado != null) {
            System.out.println("CircleD cargado: " + circleDCargado.getArea());
        }

        //RectangleD
        RectangleD rectangleD = new RectangleD(2.3, 1.0, 7.8, 6.4);
        String rutaArchivoRectangleD = "rectangleD.json";
        guardarObjetoEnArchivo(rutaArchivoRectangleD, rectangleD);
        RectangleD rectangleDCargado = cargarObjetoDesdeArchivo(rutaArchivoRectangleD, RectangleD.class);
        if (rectangleDCargado != null) {
            System.out.println("RectangleD cargado: " + rectangleDCargado.getArea());
        }
    }
}
