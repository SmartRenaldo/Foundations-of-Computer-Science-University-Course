public class Problem01 {
    public static void main(String[] args) {
        int[] arr_i = {1,2,3,4,5};
        String[] arr_s = {"a","b","c","d","e","f","g"};
        float[] arr_f = {1.1F,2.2F,3.3F,4.4F,5.5F,6.6F};
        printArray(arr_i);
        printArray(arr_s);
        printArray(arr_f);
        reverseArray(arr_i);
        reverseArray(arr_s);
        reverseArray(arr_f);
    }
    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1){
                System.out.print(arr[i] + "]");
                break;
            }
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }
    public static void printArray(String[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1){
                System.out.print(arr[i] + "]");
                break;
            }
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }
    public static void printArray(float[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1){
                System.out.print(arr[i] + "]");
                break;
            }
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }
    public static void reverseArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1){
                System.out.print(arr[0] + "]");
                break;
            }
            System.out.print(arr[arr.length-i-1] + ",");
        }
        System.out.println();
    }
    public static void reverseArray(String[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1){
                System.out.print(arr[0] + "]");
                break;
            }
            System.out.print(arr[arr.length-i-1] + ",");
        }
        System.out.println();
    }
    public static void reverseArray(float[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1){
                System.out.print(arr[0] + "]");
                break;
            }
            System.out.print(arr[arr.length-i-1] + ",");
        }
        System.out.println();
    }
}