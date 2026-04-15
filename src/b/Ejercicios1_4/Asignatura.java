package b.Ejercicios1_4;

import java.util.Arrays;

public class Asignatura {
    //Atributos:
    private String name;
    private Estudiante[] alumnos; //Los estudiantes seran un array para que se muestre en forma de lista.

    //Constructores:
    public Asignatura(String n, Estudiante[] a){
        this.name = n;
        this.alumnos = a;
    }

    //Getters:
    public String getName(){
        return name;
    }

    public Estudiante[] getAlumnos(){
        return alumnos;
    }

    //Setters:
    public void setName(String newName){
        this.name = newName;
    }

    public void setAlumnos(Estudiante[] newAlumnos){
        this.alumnos = newAlumnos;
    }

    //toString:
    public String toString(){
        return "Asignatura: [nombre = " + name + " Alumnos = " + Arrays.toString(alumnos) + "]";
    }
}
