//==================================
// Foundations of Computer Science
// Student: Yiqi Li
// id: a1787585
// Semester: 2
// Year: 2020
// Practical Exam Number: final
//===================================
public class Player extends Person {
    //attributes
    private int id;
    private int numWins;
    private int numPlayed;
    private static int idCounter = 0;

    //a constructor with parameters
    public Player(String name, int age, int numWins, int numPlayed) {
        super(name, age);
        this.numWins = numWins;
        this.numPlayed = numPlayed;
        this.id = ++idCounter;
    }

    //a void method called win() that takes no parameters and increments the number of wins
    //and the number of games played by this player.
    public void win() {
        this.numWins++;
        this.numPlayed++;
    }

    //a void method called lose() that takes no parameters and just increments the number of games played.
    public void lose() {
        this.numPlayed++;
    }

    //a method called getRanking() that takes no parameters and returns an integer value representing this player's ranking score
    public int getRanking() {
        //if a player has played zero times getRanking should just return zero.
        if (this.numPlayed == 0) {
            return 0;
        }
        return this.numPlayed * (numWins / numPlayed);
    }

    //returns the integer id of this player
    public int getId() {
        return this.id;
    }

    //a toString() method
    @Override
    public String toString() {
        return "Person: " + this.getName() + " is age: " + this.getAge() + " Id: " + getId() + " Ranking: " + this.getRanking();
    }
}
