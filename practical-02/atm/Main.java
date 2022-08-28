import java.util.Scanner;
public class Main{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Please enter an amount of cash: ");
		int num = input.nextInt();
		int a = num - 50;	//record a number for later remainder
		int countF;		//store the number of $50 notes
		int countT;		//store the number of $20 notes
		if(num % 10 != 0 || num < 20){		//Under such conditions, the value cannot be shown.
			System.out.println("Sorry, the value you input cannot be withdrew.");
		}else if(num < 50 && num % 20 != 0){		//Under such conditions, the value cannot be shown.
			System.out.println("Sorry, the value you input cannot be withdrew.");
		}else if(num % 50 == 0){
			countF = num / 50;
			System.out.println("Here is 0 $20 notes and " + countF + " $50 notes.");
		}else if(num % 50 == 10){
			countF = a / 50;		//the amount cannot be showed by "num / 50" $50 notes, as it cannot be showned by $20 notes later. To solve this, it is necessary to cut down on one $50 note.
			countT = (50 + 10) / 20;		//Calculate the number of $20 notes required
			System.out.println("Here is " + countT + " $20 notes and " + countF + " $50 notes.");
		}else if(num % 50 == 20){
			countF = num / 50;
			countT = 20 / 20;
			System.out.println("Here is " + countT + " $20 notes and " + countF + " $50 notes.");
		}else if(num % 50 == 30){
			countF = a / 50;		//the amount cannot be showed by "num / 50" $50 notes, either. The solution is similar to "else if(num % 50 == 10)".
			countT = (50 + 30) / 20;		//Calculate the number of $20 notes required
			System.out.println("Here is " + countT + " $20 notes and " + countF + " $50 notes.");
		}else if(num % 50 == 40){
			countF = num / 50;
			countT = 40 / 20;
			System.out.println("Here is " + countT + " $20 notes and " + countF + " $50 notes.");
		}
	}
}
