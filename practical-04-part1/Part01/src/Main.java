public class Main {
    /*
        Inheritance tree:
            super class: Player
                subclasses: Computer, Human

        Player
            1. enumeration elements --> used by subclasses
            2. abstract method performMove() --> overridden by subclasses
            3. abstract method resultMethod() --> overridden by subclasses

        Computer & Human
            override method performMove() & resultMethod()

        Referee
            1. prompt user to choose
            2. judge the result
            3. show the result
            4. ask user whether to play again or not

        Main
            execute programme
    */
    public static void main(String[] args) {
        new Referee().refereeMethod();           //call refereeMethod()
    }
}
