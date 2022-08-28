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
        System.out.println("This is the first line of the code!");		//print out "This is the first line of the code!""
        int ths = 25;
        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                for (int k = j; k < 10; k++) {
                    int value = i * j * k;
                    if (value != 0) {					//can not output when i, j or k = 0
                        if (value % ths == 0) {			//The product must be a multiple of 25 to output
                            System.out.print("i: " + i);		//print out "i" part
                            System.out.print(" j: " + j);		//print out "j" part
                            System.out.println(" k: " + k + " - value " + value);		//print out "k" part and "value" part
                        }
                    }
                }
            }
        }
        System.out.println("This is the last line of the code!");		//print out "This is the last line of the code!"
    }
}
