package b.Ejercicios1_4;

public class Rectangle {
    // Variables:
    private float lenght;
    private float width;

    // Constructores:

    public Rectangle(){
        lenght = 1.0f;
        width = 1.0f;
    }

    public Rectangle(float l, float w){
        lenght = l;
        width = w;
    }

    //Getters:

    public float getLength(){
        return lenght;
    }

    public float getWidth(){
        return width;
    }

    public double getArea(){
        return lenght*width;
    }

    public double getPerimeter(){
        return 2*lenght + 2*width;
    }

    //Setters:
    public void setLength(float newLenght){
        lenght = newLenght;
    }

    public void setWidth(float newWidht){
        width = newWidht;
    }

    //toString:
    public String toString(){
        return "Rectangle: [lenght = " + lenght + " width = " +  width + "]";
    }
}
