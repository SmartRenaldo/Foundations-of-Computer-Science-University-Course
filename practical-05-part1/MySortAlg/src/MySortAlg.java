public abstract class MySortAlg {
    public abstract void sort(int[] array);
    // be extended by all subclasses
    public void swap(int[] array, int i, int j) {
        int tmp = array[j];
        array[j] = array[i];
        array[i] = tmp;
    }
}
