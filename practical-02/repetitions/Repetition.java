import java.util.Random;	//call out Random

public class Repetition {
	public static void main(String[] args){
		Random r = new Random();
		for(int i = 1; i <= 10; i++){
			int num = r.nextInt(20)+1;	//random number range from 1 to 20
			System.out.print("Number (" + num + "): ");	//print put "Number (num): "
			for(int j = 1; j <= num; j++){
				System.out.print("*");
			}
		System.out.println();	//line break
		}
	}
}
