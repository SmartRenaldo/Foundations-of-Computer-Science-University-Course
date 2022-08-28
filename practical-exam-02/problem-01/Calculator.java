//==================================
// Foundations of Computer Science
// Student: Yiqi Li
// id: your a1787585
// Semester: 2
// Year: 2020
// Practical Exam Number: 02
//===================================
public class Cauculator {
    public int sum(int numA, int numB) {	//Addition method
        return numA + numB;
    }

    public int sub(int numA, int numB) {	//Subtraction method
        return numA - numB;
    }

    public float multiply(float numA, float numB) {		//Multiplication method
        return numA * numB;
    }

    public float division(float numA, float numB) {		//Division method
        if (numB == 0) {
            return (float) -99.0;
        }
        return numA / numB;
    }
}
