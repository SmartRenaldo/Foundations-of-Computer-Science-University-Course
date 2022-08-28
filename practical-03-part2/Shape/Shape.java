public class Shape {
    //attributes
    private double width;
    private double height;
    private double radius;
    private double length;

    //Basic Constructor
    public Shape() {
    }

    //Parametric Constructor
    public Shape(double width, double height, double radius, double length) {
        this.width = width;
        this.height = height;
        this.radius = radius;
        this.length = length;
    }

    //Accessor
    public double getWidth() {
        return width;
    }

    //Mutator
    public void setWidth(double width) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            if (width > 0) {
                this.width = width;
                break;
            }else {
                System.out.println("Width should be greater than zero! Please input width again!");
                width = sc.nextDouble();
            }
        }
    }

    //Accessor
    public double getHeight() {
        return height;
    }

    //Mutator
    public void setHeight(double height) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            if (height > 0) {
                this.height = height;
                break;
            }else {
                System.out.println("Height should be greater than zero! Please input height again!");
                height = sc.nextDouble();
            }
        }
    }

    //Accessor
    public double getRadius() {
        return radius;
    }

    //Mutator
    public void setRadius(double radius) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            if (radius > 0) {
                this.radius = radius;
                break;
            }else {
                System.out.println("Radius should be greater than zero! Please input radius again!");
                radius = sc.nextDouble();
            }
        }
    }

    //Accessor
    public double getLength() {
        return length;
    }

    //Mutator
    public void setLength(double length) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            if (length > 0) {
                this.length = length;
                break;
            }else {
                System.out.println("Length should be greater than zero! Please input length again!");
                length = sc.nextDouble();
            }
        }
    }
}
