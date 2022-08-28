import java.util.Random;

public class ShakingParty {
    private int nPeople;        //number of people in the party

    public ShakingParty() {
        Random r = new Random();
        int i = r.nextInt(9) + 2;        //generate a random integer >=2 and <= 9
        countHandShakes(i);
        System.out.printf("There are %d people in the party\n", i);
        this.nPeople = i;
    }

    public ShakingParty(int nTmp) {
        countHandShakes(nTmp);
        this.nPeople = nTmp;
    }

    //this function should recursively count the number of hand shakes
    public int countHandShakes(int n) {
        if (n >= 2) {
            return n == 2 ? 1 : countHandShakes(n - 1) + (n - 1);
        } else {
            System.err.println("Wrong input! The integer must greater than 1!");
            System.exit(1);
            return 0;
        }
    }

    public void show() {
        if (nPeople == 2) {
            System.out.println("There is 1 handshake");
        } else {
            System.out.println("There are " + countHandShakes(nPeople) + " handshakes");
        }
    }

    public int getnPeople() {
        return nPeople;
    }

    public void setnPeople(int nPeople) {
        if (nPeople > 1) {
            this.nPeople = nPeople;
        } else {
            System.err.println("The number of people should be greater than 1! Program exit!");
            System.exit(1);
        }
    }
}