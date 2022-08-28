import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Please, insert a number:");
            double num1 = sc.nextDouble();      //input the first number
            System.out.println("Please, insert a number:");
            double num2 = sc.nextDouble();      //input the second number
            double max = num1;      //use 'max' to record the maximum value
            if(num1 < num2){
                max = num2;     //'max' will be the bigger value
            }
            System.out.println("The bigger number is " + max);      //output maximum value
        }catch(Exception e){
            System.err.println("The tokens retrived should be integers! Program exit!");
            System.exit(1);     //exception --> exit
        }
    }
}