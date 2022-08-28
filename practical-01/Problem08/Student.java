import java.util.Scanner;  //to input information
public class Student
{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Please enter your name: ");   //print out "Please enter your name: " and receive information
    String name = input.nextLine();  //When the information of the matching type is received, then go to the next line.
    
    System.out.print("Please enter your age: ");
    int age = input.nextInt();
     
    System.out.print("Please enter your favorate food: ");
    String favorate_food = input.nextLine();
    input.nextLine();  //If input.nextLine() was used after input.nextInt() and input.nextDouble(), there may be a problem. NextLine() will recognize the carriage return of the previous input and output a space. As a result, if input.nextLine() was used after input.nextInt() and input.nextDouble(), you must first add an input.nextLine() to wrap.
    
    System.out.print("Please enter your maths grade: ");
    float maths_grade = input.nextFloat();
    
    System.out.print("Please enter your English grade: ");
    float English_grade = input.nextFloat();
    
    System.out.print("Please enter your height in meters: ");
    float height = input.nextFloat();

    System.out.print("Please enter your weight in kilogramme: ");
    float weight = input.nextFloat();
    
    System.out.print("Please enter your number of subject: ");
    int number_of_subject = input.nextInt();
    }
}
