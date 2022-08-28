public class LinearSearch extends MySearchAlg {
    // index starts from 0, return -1 when it does not exist
    @Override
    int search(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return i;
            }
        }
        return -1;
    }
}
