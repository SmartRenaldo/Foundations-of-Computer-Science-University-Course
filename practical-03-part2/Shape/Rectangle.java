public class Rectangle extends Shape {
    //method
    public double area() {
        return super.getWidth() * super.getLength();
    }

    //Basic Constructor
    public Rectangle() {
    }

    //Parametric Constructor
    public Rectangle(double width, double height, double radius, double length) {
        super(width, height, radius, length);
    }
}
