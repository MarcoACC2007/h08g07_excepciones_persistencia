package b.Ejercicios1_4;

public class Customer {
    //Variables:
    private int id;
    private String name;
    private char gender;

    //Constructores:
    public Customer(int i, String n, char g) {
        this.id = i;
        this.name = n;
        this.gender = g;
    }

    //Getters:
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    //ToString:
    public String toString() {
        return name + "(" + id + ")";
    }
}
