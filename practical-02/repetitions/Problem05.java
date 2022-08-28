import java.util.Random;	//call out Random

public class Problem05 {
	public static void main(String[] args){
		Random r = new Random();
		int mean = 0;
		for(int i = 1; i <= 10; i++){
			int num = r.nextInt(21);	//random number range from 1 to 20
			mean += num;
			System.out.print("Number (" + num + "): ");	//print out "Number (num): "
			switch(num){
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
					while(num > 0){
						System.out.print("o");
						num--;				//print out enough 'o'
					}
					System.out.println();			//Line break
					break;
				case 6:
				case 7:
				case 8:
				case 9:
				case 10:
					while(num > 0){
						System.out.print("x");
						num--;				//print out enough 'x'
					}
					System.out.println();			//Line break
					break;
				case 11:
				case 12:
				case 13:
				case 14:
				case 15:
					while(num > 0){
						System.out.print("s");
						num--;				//print out enough 's'
					}
					System.out.println();			//Line break
					break;
				case 16:
				case 17:
				case 18:
				case 19:
				case 20:
					while(num > 0){
						System.out.print("*");
						num--;				//print out enough '*'
					}
					System.out.println();			//Line break
					break;
			}
		}
		mean = mean/10;	//calculate the average value
		System.out.print("Average (" + mean + "): ");
		for(int k = 1; k <= mean; k++){
			System.out.print("*");
		}
		System.out.println();
	}
}
