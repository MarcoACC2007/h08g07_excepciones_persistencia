package b.Ejercicios1_4;

public class Estudiante {
    //Atributos:
    private String name;
    private int edad;

    //Constructores:
    public Estudiante(String n, int e){
        this.name = n;
        this.edad = e;
    }

    //Getters:
    public String getName(){
        return name;
    }

    public int getEdad(){
        return edad;
    }

    //Setters:
    public void setName(String newName){
        this.name = newName;
    }

    public void setEdad(int newEdad){
        this.edad = newEdad;
    }

    //toString:
    public String toString(){
        return "Estudiante: [nombre = " + name + " edad = " + edad + "]";
    }
}
