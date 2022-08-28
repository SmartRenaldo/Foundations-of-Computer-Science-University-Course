public class Lion extends Animal {
    //Basic Constructor
    public Lion() {
    }

    //Parametric Constructor
    public Lion(String title, double weight, String favouriteFood, int age) {
        super(title, weight, favouriteFood, age);
    }

    //method
    public void makeSound(){
        System.out.println("awwwwww");
    }
}
