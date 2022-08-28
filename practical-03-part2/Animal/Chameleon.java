public class Chameleon extends Animal {
    //Basic Constructor
    public Chameleon() {
    }

    //Parametric Constructor
    public Chameleon(String title, double weight, String favouriteFood, int age) {
        super(title, weight, favouriteFood, age);
    }

    //method
    public void makeSound(){
        System.out.println("qiuuuuu");
    }
}
