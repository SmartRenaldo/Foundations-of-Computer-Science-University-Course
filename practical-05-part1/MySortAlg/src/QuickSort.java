public class QuickSort extends MySortAlg {
    @Override
    public void sort(int[] array) {
        this.sortRec(array, 0, array.length - 1);
    }

    // Sort an array recursively
    private void sortRec(int[] array, int start, int end) {
        if (start < end) {
            int pivotIndex = partition(array, start, end);

            // Call sort recursively for left and right parts
            this.sortRec(array, start, pivotIndex - 1);
            this.sortRec(array, pivotIndex + 1, end);
        }
    }

    private int partition(int[] array, int start, int end) {
        int pivot = array[end];
        // Swap all element that are smaller than pivot to the left part
        int i = start;
        for (int j = start; j < end; j++) {
            // If current element is bigger than the pivot
            if (array[j] > pivot) {
                // Put this element in the left part
                this.swap(array, i, j);
                // Position i is already occupied with bigger element -> increment
                i++;
            }
        }
        // Put pivot at its place
        this.swap(array, i, end);
        return i;

    }
}
