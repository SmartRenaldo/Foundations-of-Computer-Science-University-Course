import java.util.Random;	//call out Random

public class Problem02 {
	public static void main(String[] args){
		Random r = new Random();
		int mean = 0;
		for(int i = 1; i <= 10; i++){
			int num = r.nextInt(21);	//random number range from 1 to 20
			mean += num;
			System.out.print("Number (" + num + "): ");	//print out "Number (num): "
			for(int j = 1; j <= num; j++){
				System.out.print("*");
			}
		System.out.println();	//line break
		}
		mean = mean/10;	//calculate the average value
		System.out.print("Average (" + mean + "): ");
		for(int k = 1; k <= mean; k++){
			System.out.print("*");
		}
		System.out.println();
	}
}
