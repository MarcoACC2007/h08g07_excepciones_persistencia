package b.Ejercicios1_4;

public class Circle {

    // Variables:
    private double radius;

    // Constructores:
    public Circle(){
        radius = 1.0;
    }

    public Circle(double r){
        this.radius = r;
    }

    // Getters:
    public  double getRadius(){
        return radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public double getCircumference(){
        return 2*radius*Math.PI;
    }

    //Setters:
    public void setRadius(double newRadius){
        radius = newRadius;
    }

    //toString:
    public String toString(){
        return "Circle: [radius = " + radius + "]";
    }

}
