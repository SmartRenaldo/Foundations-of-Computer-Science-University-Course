import java.util.Scanner;

public class RectangleArea extends Rectangle {
    //default constructor
    public RectangleArea() {
    }

    //parametric Constructor
    public RectangleArea(double width, double height) {
        super(width, height);
    }

    @Override       //override display
    public void display(){
        System.out.println("Output:");
        System.out.println(super.getWidth()+ " " + super.getHeight());
        System.out.println(super.getWidth() * super.getHeight());
    }

    public void read_input(){
        System.out.println("Input:");
        Scanner sc = new Scanner(System.in);

        //input width and height
        double width = sc.nextDouble();
        double height = sc.nextDouble();

        super.setWidth(width);
        super.setHeight(height);

        System.out.println();
    }
}
