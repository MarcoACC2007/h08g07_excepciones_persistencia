package b.Ejercicios1_4;

public class Person {

    //Variables:
    private String name;
    private String adress;

    //Constructores:
    public Person(String n, String a){
        this.name = n;
        this.adress = a;
    }

    //Getters:
    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    //Setters:
    public void setAdress(String newAdress){
        this.adress = newAdress;
    }

    //ToString:
    public String toString() {
        return "Person: [name = " + name + ", adress = " + adress + "]";
    }
}
