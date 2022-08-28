//==================================
// Foundations of Computer Science
// Student: Yiqi Li
// id: your a1787585
// Semester: 2
// Year: 2020
// Practical Exam Number: 02
//===================================
import java.util.Arrays;

public class HandlingArrays {

    public static void printArray(double[] testArray) {
        String s = Arrays.toString(testArray);      //turn array to string
        System.out.println(s);
    }

    public static double[] sumElements(double[] firstArray, double[] secondArray) {
        //two arrays of different size
        if (firstArray.length != secondArray.length) {    
            System.out.println("Error - Arrays different shape.");
            return null;
        }
        //same size
        double[] array = new double[firstArray.length];
        for (int i = 0; i < firstArray.length; i++) {
            array[i] = firstArray[i] + secondArray[i];
        }
        return array;
    }

    public static double[] reverseArray(double[] testArray) {
        //reverse array
        double[] array = new double[testArray.length];
        for (int i = 0; i < testArray.length; i++) {
            array[i]=testArray[testArray.length-i-1];
        }
        return array;
    }

}

