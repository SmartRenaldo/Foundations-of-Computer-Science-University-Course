//==================================
// Foundations of Computer Science
// Student: Yiqi Li
// id: a1787585
// Semester: Semester2
// Year: 2020
// Practical Exam Number:
//===================================
import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a distance in miles: ");        //Input data
        double a = sc.nextDouble();
        if (a >= 0 && a <= 1000) {                              //Determine whether the range of a is 0 to 1000
            double b = 1.6093 * a;                              //Calculate kilometers
            System.out.printf("The distance in kilometres is %.2f km",b);       //Output the result with 2 decimal places
            System.out.println();                               //Next line
        }else {
            System.out.printf("The distance %.2f is out of range",a);           ////Output the result with 2 decimal places
            System.out.println();                               //Next line
        }
    }
}
