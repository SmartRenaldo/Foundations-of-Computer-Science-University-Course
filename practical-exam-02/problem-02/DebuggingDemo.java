//==================================
// Foundations of Computer Science
// Student: Yiqi Li
// id: your a1787585
// Semester: 2
// Year: 2020
// Practical Exam Number: 02
//===================================
public class DebuggingDemo {

    public void bugMethod() {
        int num[] = {1, 2, 3, 4};
        System.out.println(num[3]);     //there is no num[5]; index out of bound exception
    }

    public float bugMethod2() {       //return type wrong
        //float ans = 0.0;     '0.0' is how to expressed by double
        float ans = 0.0F;     //'0.0F' is how to expressed by double
        System.out.println("This method had a bug!");
        return ans;
    }


}

