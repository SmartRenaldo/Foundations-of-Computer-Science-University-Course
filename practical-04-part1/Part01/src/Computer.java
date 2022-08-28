import java.util.Random;

public class Computer extends Player {
    //generate random enumeration element
    @Override
    public RPS resultMethod() {
        int pick = new Random().nextInt(RPS.values().length);
        return RPS.values()[pick];
    }

    @Override
    public void performMove(RPS element) {
        System.out.println("Computer chose: " + element);
    }
}
