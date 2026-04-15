package b.EjercicioAlumno;

public class Alumno {
    //Atributos:
    protected String nombre;
    protected int edad;
    protected int curso;

    //Constructor:
    public Alumno(String n, int e, int c){
        this.nombre = n;
        this.edad = e;
        this.curso = c;
    }

    //Getters:
    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public int getCurso(){
        return curso;
    }

    //Setters:
    public void setNombre(String newNombre){
        this.nombre = newNombre;
    }

    public void setEdad(int newEdad){
        this.edad = newEdad;
    }

    public void setCurso(int newCurso){
        this.curso = newCurso;
    }

    //ToString:
    @Override
    public String toString() {
        return "Alumno: {nombre = " + nombre + ", edad = " + edad + ", curso = " + curso + "}";
    }

}
