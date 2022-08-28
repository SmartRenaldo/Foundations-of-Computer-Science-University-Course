import java.util.Scanner;	//call out Random

public class User_Interface {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome dear user!");
		while(true){
			System.out.print("Please, insert the first number: ");
			int c = sc.nextInt();
			System.out.print("Please, insert the second number: ");
			int d = sc.nextInt();
			int e = c + d;
			System.out.println("Thank you for your enquiry, the sum between " + c + " and " + d + " is " + e + ".");
			System.out.println("a) sum again");
			System.out.println("b) exit");
			String option = sc.next();
			if(option.equals("a")){
				System.out.println();
			}
			else if(option.equals("b")){
				System.out.println("Thank you! Have a good day.");
				break;
			}
		}
	}
}
