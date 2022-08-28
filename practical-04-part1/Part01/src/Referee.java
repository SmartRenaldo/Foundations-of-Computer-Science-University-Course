import java.util.Scanner;

public class Referee {
    public void refereeMethod() {
        //prompt user to input
        System.out.println("Welcome to the RPS game.");
        lo:
        while (true) {
            System.out.println("Please choose one option among 'ROCK', 'PAPER', and 'SCISSORS':");
            Player human = new Human();
            Player.RPS rpsHuman = human.resultMethod();
            System.out.println();       //print a new line to show the result
            human.performMove(rpsHuman);

            Player computer = new Computer();
            Player.RPS rpsComputer = computer.resultMethod();
            computer.performMove(rpsComputer);

            if (rpsComputer.equals(rpsHuman)) {         //same choose --> tie
                System.out.println("Tie");
            } else if (rpsComputer.equals(Player.RPS.ROCK)) {      //different choose --> compare one by one
                switch (rpsHuman) {
                    case PAPER -> System.out.println("You won");
                    case SCISSORS -> System.out.println("You lost");
                }
            } else if (rpsComputer.equals(Player.RPS.PAPER)) {
                switch (rpsHuman) {
                    case SCISSORS -> System.out.println("You won");
                    case ROCK -> System.out.println("You lost");
                }
            } else {
                switch (rpsHuman) {
                    case ROCK -> System.out.println("You won");
                    case PAPER -> System.out.println("You lost");
                }
            }

            System.out.println();       //print out a new line to ask the user whether to play the game again
            System.out.println("Do you want to play again?");
            System.out.println("PLease enter Y/N:");
            Scanner sc = new Scanner(System.in);
            String str = sc.next().toUpperCase();
            loo:
            while (true) {
                switch (str) {
                    case "Y":
                        System.out.println();
                        System.out.println("Welcome to a new game");
                        break loo;      //end the inner loop
                    case "N":
                        break lo;       //end the outer loop
                    default:
                        System.err.println("Wrong input! PLease enter Y/N:");
                        str = sc.next().toUpperCase();
                }
            }
        }

        System.out.println();       //print out a new line to appreciate the user
        System.out.println("Thanks for your using. Have a nice day~");
    }
}
