import java.util.Scanner;

public class Human extends Player {
    //user input method
    @Override
    public RPS resultMethod() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = "";
            s = sc.next().toUpperCase();
            if ("ROCK".equals(s) || "PAPER".equals(s) || "SCISSORS".equals(s)) {
                return Enum.valueOf(RPS.class, s);
            } else {
                System.err.println("You should enter one option " +
                        "among 'ROCK', 'PAPER', and 'SCISSORS'. Please enter again:");
            }
        }
    }

    @Override
    public void performMove(RPS element) {
        System.out.println("You chose: " + element);
    }
}
