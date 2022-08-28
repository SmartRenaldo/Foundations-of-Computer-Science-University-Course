//==================================
// Foundations of Computer Science
// Student: Yiqi Li
// id: a1787585
// Semester: Senemter 2
// Year: 2020
// Practical Number: 4
//===================================

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Please enter the number of disks:");
        Scanner sc = new Scanner(System.in);
        int i;
        while (true) {
            try {
                i = sc.nextInt();
                new HanoiTower(i);
                break;
            } catch (IntegerInputException e) {
                System.out.println("The integer must greater than 0! Please enter again!\n");
                sc = new Scanner(System.in);
            } catch (Exception e) {
                System.out.println("Please enter an integer! Please enter again!\n");
                sc = new Scanner(System.in);
            }
            System.out.println("Thanks for your playing. Have a good day.");
        }
    }
}