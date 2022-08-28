import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, insert a number: ");
        try {
            int num = sc.nextInt();
            while (num < 2) {
                System.err.println("The integer must be greater than or equal to 2. Please enter again: ");
                num = sc.nextInt();
                // Integer < 2 --> enter again.
            }
            if (num == 2 || num == 3) {
                //Square root of 2 or 3 is less than 2; cannot be judged by the next 'for' loop
                System.out.println("Your number is prime");
            } else {
                boolean judge = true;       //Initialise and then record T/F
                for (int i = 2; i <= Math.sqrt(num); i += 2) {
                    //Not need to be tested by number > Math.sqrt(num)
                    //Not need to be divided by multiples of two
                    if (num % i == 0) {
                        judge = false;
                        //false: not prime
                        break;
                    } else {
                        judge = true;
                        //true: prime
                    }
                }
                if (judge) {
                    System.out.println("Your number is prime");
                } else {
                    System.out.println("Your number is not prime");
                }
            }
        }catch(Exception e){
            System.err.println("The token retrived is not an integer! Program exit!");
            System.exit(1);     //exit JVM
        }
    }
}