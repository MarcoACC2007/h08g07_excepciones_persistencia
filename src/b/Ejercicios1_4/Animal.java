package b.Ejercicios1_4;

public class Animal{

    //Variables:
    protected String name;

    //Constructores:
    public Animal(){
        this.name = "";
    }

    public Animal(String n) {
        this.name = n;
    }

    //ToString:
    public String toString() {
        return "Animal: [name = " + name + "]";
    }
}
