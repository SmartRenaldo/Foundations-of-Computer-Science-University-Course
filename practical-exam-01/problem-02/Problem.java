//==================================
// Foundations of Computer Science
// Student: Yiqi Li
// id: a1787585
// Semester: Semester2
// Year: 2020
// Practical Exam Number:
//===================================
public class Problem {
    public static void main(String[] args) {
        System.out.print("[");      //print out "[" at the beginning
        for (int i = 101; i >= 89 ; i--) {      //create a loop to output information
            if(i == 89){
                System.out.println(i + "]");    //print out "89]"
                break;      //do not execute this line "System.out.print(i + ", ");"
            }
            System.out.print(i + ", ");     //print out "number, "
        }
    }
}
