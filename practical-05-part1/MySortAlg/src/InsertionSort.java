public class InsertionSort extends MySortAlg {
    @Override
    public void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int swapableEleIndex = i - 1;
            //          index >= 0 & the smaller number comes before the larger one
            while (swapableEleIndex >= 0 &&
                    Integer.compare(array[swapableEleIndex], array[swapableEleIndex + 1]) == -1) {
                this.swap(array, swapableEleIndex, swapableEleIndex + 1);
                swapableEleIndex--;
            }
        }
    }
}
