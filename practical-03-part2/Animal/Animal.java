public class Animal {
    //attributes
    private String title;
    private double weight;
    private String favouriteFood;
    private int age;

    //Basic Constructor
    public Animal() {
    }

    //Parametric Constructor
    public Animal(String title, double weight, String favouriteFood, int age) {
        this.title = title;
        this.weight = weight;
        this.favouriteFood = favouriteFood;
        this.age = age;
    }

    //Accessor
    public String getTitle() {
        return title;
    }

    //Mutator
    public void setTitle(String title) {
        this.title = title;
    }

    //Accessor
    public double getWeight() {
        return weight;
    }

    //Mutator
    public void setWeight(double weight) {
        this.weight = weight;
    }

    //Accessor
    public String getFavouriteFood() {
        return favouriteFood;
    }

    //Mutator
    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    //Accessor
    public int getAge() {
        return age;
    }

    //Mutator
    public void setAge(int age) {
    Scanner sc = new Scanner(System.in);
        while (true) {
            if (age >= 0 ) {
                this.age = age;
                break;
            }else {
                System.out.println("Age should be greater than or equal to zero! Please input age again!");
                age = sc.nextInt();
            }
        }
    }
}
