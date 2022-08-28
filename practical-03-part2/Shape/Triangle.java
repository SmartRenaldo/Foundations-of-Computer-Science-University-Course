public class Triangle extends Shape {
    //method
    public double area() {
        return (super.getHeight() * super.getLength()) / 2;
    }

    //Basic Constructor
    public Triangle() {
    }

    //Parametric constructor
    public Triangle(double width, double height, double radius, double length) {
        super(width, height, radius, length);
    }
}
