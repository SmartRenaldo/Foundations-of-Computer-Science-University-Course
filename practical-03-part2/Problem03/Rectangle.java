import java.util.Scanner;

public class Rectangle {
    //attributes
    private double width;
    private double height;

    //default constructor
    public Rectangle() {
    }

    //parametric Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    //Mutator
    public double getWidth() {
        return width;
    }

    //Accessor
    public void setWidth(double width) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            if (width >= 1) {
                this.width = width;
                break;
            }else {
                System.out.println("Width should be greater than or equal to one! Please input width again!");
                width = sc.nextDouble();
            }
        }
    }

    //Mutator
    public double getHeight() {
        return height;
    }

    //Accessor
    public void setHeight(double height) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            if (height > 0 && height <= 1000) {
                this.height = height;
                break;
            }else {
                System.out.println("Height should be less than or equals to 1000 and greater than zero! Please input height again!");
                height = sc.nextDouble();
            }
        }
    }

    //method
    public void display() {
        System.out.println(width + " " + height);
    }
}
