package Example01;

import java.util.Random;

public class ShakingParty {
    private int nCouple;        //number of couple in the party

    public ShakingParty() {
        Random r = new Random();
        int i = r.nextInt(9) + 2;        //generate a random integer >=2 and <= 9
        countHandShakes(i);
        System.out.printf("There are %d couples in the party\n", i);
        this.nCouple = i;
    }

    public ShakingParty(int nTmp) {
        countHandShakes(nTmp);
        this.nCouple = nTmp;
    }

    //this function should recursively count the number of hand shakes
    public int countHandShakes(int n) {
        if (n >= 2) {
            return n == 2 ? 2 : countHandShakes(n - 1) + (2 * n - 2);
        } else {
            System.err.println("Wrong input! The integer must greater than 1!");
            System.exit(1);
            return 0;
        }
    }

    public void show() {
        System.out.println("There are " + countHandShakes(nCouple) + " handshakes");
    }

    public int getnCouple() {
        return nCouple;
    }

    public void setnCouple(int nCouple) {
        if (nCouple > 1) {
            this.nCouple = nCouple;
        } else {
            System.err.println("The number of couple should be greater than 1! Program exit!");
            System.exit(1);
        }
    }
}