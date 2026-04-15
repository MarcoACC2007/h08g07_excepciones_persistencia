package b;

public class Persona {
    //Atributos:
    private String nombre = "John Doe";
    private int edad = 18;

    //Constructor:
    public Persona(String n, int e){
        this.nombre = n;
        this.edad = e;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
