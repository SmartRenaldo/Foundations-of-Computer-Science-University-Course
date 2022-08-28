import java.util.Scanner;  //to input information
public class Dog
{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Please enter dog's name:");    //print out "Please enter dog's name:" and receive information
    String name = input.nextLine();    //When the information of the matching type is received, then go to the next line.
    
    System.out.print("Please enter dog's age:");    //print out "Please enter dog's age:" and receive information
    int age = input.nextInt();
     
    System.out.print("Please enter dog's favorate food:");    //print out "Please enter dog's favorate food:" and receive information
    String favorate_food = input.nextLine();
    input.nextLine();    //If input.nextLine() was used after input.nextInt() and input.nextDouble(), there may be a problem. NextLine() will recognize the carriage return of the previous input and output a space. As a result, if input.nextLine() was used after input.nextInt() and input.nextDouble(), you must first add an input.nextLine() to wrap.
    
    System.out.print("Please enter dog's height in centimeters:");    //print out "Please enter dog's height in centimeters " and receive information
    float height = input.nextFloat();

    System.out.print("Please enter dog's weight in kilogramme:");    //print out "Please enter dog's weight in kilogramme:" and receive information
    float weight = input.nextFloat();
    
    System.out.print("Please enter dog's favorite toy:");    //print out "Please enter dog's favorite toy:" and receive information
    String favorite_toy = input.nextLine();
    input.nextLine();
    
    System.out.print("Please enter dog's owner's name:");    //print out "Please enter dog's owner's name:" and receive information
    String dogOwnerName = input.nextLine();
    }
}
