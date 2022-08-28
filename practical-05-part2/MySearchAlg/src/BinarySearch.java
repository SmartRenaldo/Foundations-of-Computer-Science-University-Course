public class BinarySearch extends MySearchAlg {
    private int searchRec(int[] array, int num, int lower, int upper) {
        // Base case
        if (upper < lower) {
            return -1; // no item found
        }

        // Find middle element
        int middle = (upper + lower) >>> 1;
        if (array[middle] == num) {
            return middle; // base case - item is found
        }

        if (num < array[middle]) { // use lower half
            return this.searchRec(array, num, lower, middle - 1);
        } else { // use upper half
            return this.searchRec(array, num, middle + 1, upper);
        }
    }

    public int search(int[] array, int num) {
        int[] indexMap = new Insert().sortByIndex(array); // Sorting array first
        int sortedPos = this.searchRec(array, num, 0, array.length - 1);
        return indexMap[sortedPos];
    }
}
