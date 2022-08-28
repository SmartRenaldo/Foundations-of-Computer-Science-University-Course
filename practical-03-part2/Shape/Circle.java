public class Circle extends Shape {
    //method
    public double area() {
        return Math.PI * super.getRadius() * super.getRadius();
    }

    //Basic Constructor
    public Circle() {
    }

    //Parametric constructor
    public Circle(double width, double height, double radius, double length) {
        super(width, height, radius, length);
    }
}
