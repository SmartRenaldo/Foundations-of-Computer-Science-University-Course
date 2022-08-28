import java.util.Random;	//call out Random

public class Random_Numbers {
	public static void main(String[] args){
		int sum = 0;
		Random r = new Random();
		for(int i = 1; i <= 10; i++){
			int num = r.nextInt(10)+1;	//random number range from 1 to 10
			System.out.println("Random number " + i + ": " + num);	//show random numbers
			sum += num;
		}
		double mean = sum/10.0;
		System.out.println("The average number is: " + mean);	//print out average
	}
}
