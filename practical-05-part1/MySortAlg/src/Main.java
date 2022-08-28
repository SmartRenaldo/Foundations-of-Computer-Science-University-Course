import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //test insertion sort
        int[] result1 = {-40, 88, 8, 15, 20, 45, 17, -5};
        int[] ans1 = {88, 45, 20, 17, 15, 8, -5, -40};
        System.out.println(test1(result1, ans1));

        //test merge sort
        int[] result2 = {-40, 88, 8, 15, 20, 45, 17, -5};
        int[] ans2 = {88, 45, 20, 17, 15, 8, -5, -40};
        System.out.println(test2(result2, ans2));

        //test quick sort
        int[] result3 = {-40, 88, 8, 15, 20, 45, 17, -5};
        int[] ans3 = {88, 45, 20, 17, 15, 8, -5, -40};
        System.out.println(test3(result3, ans3));

        //test compare(int[] arr1, int[] arr2)
        int[] arr1 = {2, 4, 1, 3, 5};
        int[] arr2 = {2, 4, 1, 3, 5};
        System.out.println(compare(arr1, arr2));

        int[] arr3 = {1, 3, 5, 2, 4};
        int[] arr4 = {2, 4, 1, 3, 5};
        System.out.println(compare(arr3, arr4));

        int[] arr5 = {1, 7, 2, 8, 5};
        int[] arr6 = {2, 4, 1, 3, 5};
        System.out.println(compare(arr5, arr6));

        //test findSmallestSum(int[] array)
        int[] array = {4, 7, 0, 0, 2, 9, 10};
        System.out.println(findSmallestSum(array));
    }

    public static boolean test1(int[] result, int[] ans) {
        new InsertionSort().sort(result);
        return Arrays.toString(result).equals(Arrays.toString(ans));
    }

    public static boolean test2(int[] result, int[] ans) {
        new MergeSort().sort(result);
        return Arrays.toString(result).equals(Arrays.toString(ans));
    }

    public static boolean test3(int[] result, int[] ans) {
        new QuickSort().sort(result);
        return Arrays.toString(result).equals(Arrays.toString(ans));
    }

    public static boolean compare(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.toString(arr1).equals(Arrays.toString(arr2));
    }

    public static int findSmallestSum(int[] array) {
        Arrays.sort(array);
        return array[0] + array[1];
    }
}
