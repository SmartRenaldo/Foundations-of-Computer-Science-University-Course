public class MergeSort extends MySortAlg {
    @Override
    public void sort(int[] array) {
        this.sortRec(array, 0, array.length - 1);
    }

    private void sortRec(int[] array, int start, int end) {
        if (start < end) {
            int middle = (start + end) / 2;
            // Sort an array recursively
            this.sortRec(array, start, middle);
            this.sortRec(array, middle + 1, end);
            this.merge(array, start, middle, end);
        }
    }

    private void merge(int[] array, int start, int middle, int end) {
        // Lengths of subarrays
        int numLeft = middle - start + 1;    //left part
        int numRight = end - middle;        //right part

        // Copy two parts into tmp arrays
        int[] left = new int[numLeft];
        int[] right = new int[numRight];
        System.arraycopy(array, start, left, 0, numLeft);
        System.arraycopy(array, middle + 1, right, 0, numRight);

        // Merge elements
        int iLeft = 0;
        int iRight = 0;
        int j = start;

        // While both arrays still have elements to compare
        while (iLeft < numLeft && iRight < numRight) {
            if (left[iLeft] > right[iRight]) {
                array[j] = left[iLeft];
                j++;
                iLeft++;
            } else {
                array[j] = right[iRight];
                j++;
                iRight++;
            }
        }

        // Add all elements that left in any array
        while (iLeft < numLeft) {
            array[j] = left[iLeft];
            j++;
            iLeft++;
        }
        while (iRight < numRight) {
            array[j] = right[iRight];
            j++;
            iRight++;
        }
    }
}
