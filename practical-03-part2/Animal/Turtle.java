public class Turtle extends Animal {
    //Basic Constructor
    public Turtle() {
    }

    //Parametric Constructor
    public Turtle(String title, double weight, String favouriteFood, int age) {
        super(title, weight, favouriteFood, age);
    }

    //method
    public void makeSound(){
        System.out.println("waaaaa");
    }
}
