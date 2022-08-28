public abstract class Player {
    //enumeration elements
    enum RPS {
        ROCK, PAPER, SCISSORS
    }

    //abstract method performMove()
    public abstract void performMove(RPS element);

    //abstract resultMethod()
    public abstract RPS resultMethod();
}
