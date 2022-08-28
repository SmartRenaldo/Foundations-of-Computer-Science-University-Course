public class Main {
    /*
     compare if these two integers are the same,
     return true when they are the same and false when they not
     */
    private static boolean test(int result, int ans) {
        return result == ans;
    }

    //According to Question 6, the same element will not appear in one array twice
    private static int findMaxVal(int[] array) {
        int max = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] array = {5, 8, 3, 2};
        int result = new LinearSearch().search(array, 8);
        System.out.println(test(result, 1));

        int[] array2 = {5, 8, 3, 0, 2};
        int result2 = new BinarySearch().search(array2, 3);
        System.out.println(test(result2, 1));

        int[] array3 = {5, 8, 3, 1, 15, 2};
        int result3 = new BinarySearch().search(array3, 3);
        System.out.println(test(result3, 2));

        int[] array4 = {1, 5, 8, 12, 9, 7, -1};
        int[] array5 = {1, 15, 0};
        System.out.println(findMaxVal(array4));
        System.out.println(findMaxVal(array5));
    }
}
