public class PhysicalBook {
    //attributes
    private int shelf;
    private int aisle;
    private int floor;

    //Basic Constructor
    public PhysicalBook() {
    }

    //Parametric Constructor
    public PhysicalBook(int shelf, int aisle, int floor) {
        this.shelf = shelf;
        this.aisle = aisle;
        this.floor = floor;
    }

    //Method
    public void displayBookLocation() {
        System.out.printf("%d shelf, %d aisle, %d floor", getShelf(), getAisle(), getFloor());
        System.out.println();
    }

    //Mutator
    public int getShelf() {
        return shelf;
    }

    //Accessor
    public void setShelf(int shelf) {
    Scanner sc = new Scanner(System.in);
        while (true) {
            if (shelf >= 1) {
                this.shelf = shelf;
                break;
            }else {
                System.out.println("Shelf should be greater than or equal to one! Please input shelf again!");
                shelf = sc.nextInt();
            }
        }
    }

    //Mutator
    public int getAisle() {
        return aisle;
    }

    //Accessor
    public void setAisle(int aisle) {
    Scanner sc = new Scanner(System.in);
        while (true) {
            if (aisle >= 1) {
                this.aisle = aisle;
                break;
            }else {
                System.out.println("Aisle should be greater than or equal to one! Please input aisle again!");
                aisle = sc.nextInt();
            }
        }
    }

    //Mutator
    public int getFloor() {
        return floor;
    }

    //Accessor
    public void setFloor(int floor) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            if (floor >= 1) {
                this.floor = floor;
                break;
            }else {
                System.out.println("Floor should be greater than or equal to one! Please input floor again!");
                floor = sc.nextInt();
            }
        }
    }
}
