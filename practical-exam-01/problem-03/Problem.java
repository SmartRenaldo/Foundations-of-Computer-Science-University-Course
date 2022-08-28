//==================================
// Foundations of Computer Science
// Student: Yiqi Li
// id: a1787585
// Semester: Semester2
// Year: 2020
// Practical Exam Number:
//===================================
public class Problem {
    public static void main(String[] args) {
        int num;                            //Define a count variable
        for (int i = 0; i <= 9; i++) {
            num = i;                        //Assign the value of i to num
            for (int j = 0; j < num; j++) {
                System.out.print("*");      //Output "*"; the number of "*" in each line is num 
            }
            System.out.println();           //Next line
        }
        for (int i = 10; i <= 19; i++) {
            num = i;                        //Assign the value of i to num
            for (int j = 0; j < num; j++) {
                System.out.print("=");      //Output "="; the number of "=" in each line is num 
            }
            System.out.println();           //Next line
        }
        for (int i = 20; i <= 29; i++) {
            num = i;                        //Assign the value of i to num
            for (int j = 0; j < num; j++) {
                System.out.print("x");      //Output "x"; the number of "x" in each line is num 
            }
            System.out.println();           //Next line
        }
        for (int i = 30; i <= 40; i++) {
            num = i;                        //Assign the value of i to num
            for (int j = 0; j < num; j++) {
                System.out.print("o");      //Output "o"; the number of "o" in each line is num
            }
            System.out.println();           //Next line
        }
    }
}

