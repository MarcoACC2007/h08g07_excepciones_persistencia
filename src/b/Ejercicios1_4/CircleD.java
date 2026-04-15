package b.Ejercicios1_4;

public class CircleD implements GeometricObject { //implements nos sirve para hacer uso de la interfaz.

    //Variables:
    private double radius;
    private double area;
    private double perimeter;

    //Constructores:
    public CircleD(double r, double a, double p) {
        this.radius = r;
        this.area = a;
        this.perimeter = p;
    }

    //Getters:
    public double getArea(){
        double area = Math.PI * radius * radius;
        return area;
    }

    public double getPerimeter() {
        double perimeter = 2 * radius * Math.PI;
        return perimeter;
    }

    //ToString:
    @Override
    public String toString() {
        return "Circle: [radius = " + radius + "]";
    }
}
