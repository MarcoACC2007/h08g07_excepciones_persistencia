package b.Ejercicios1_4;

public class RectangleD  implements GeometricObject { //implements nos sirve para hacer uso de la interfaz.

    //Variables:
    private double width;
    private double length;
    private double area;
    private double perimeter;

    //Constructores:
    public RectangleD(double w, double l, double a, double p) {
        this.width = w;
        this.length = l;
        this.area = a;
        this.perimeter = p;
    }

    //Getters:
    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public String toString() {
        return "Rectangle[width = " + width + ", lenght = " +length + "]";
    }
}