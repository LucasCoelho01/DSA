import java.util.Arrays;

public class MergeSort {

    public int[] sort(int[] array) {
        mergeSort(array, 0, array.length);
        return array;
    }

    private void mergeSort(int[] array, int start, int end) {
        if ((end - start) > 1) {
            int middle = (end + start) / 2;
            mergeSort(array, start, middle);
            mergeSort(array, middle, end);
            merge(array, start, middle, end);
        }
    }

    public void merge(int[] array, int start, int middle, int end) {
        int[] leftArray = Arrays.copyOfRange(array, start, middle);
        int[] rightArray = Arrays.copyOfRange(array, middle, end);
        int topRight = 0, topLeft = 0;

        for (int k = start; k < end; k++) {
            if (topLeft >= leftArray.length) {
                array[k] = rightArray[topRight];
                topRight++;
            } else if (topRight >= rightArray.length) {
                array[k] = leftArray[topLeft];
                topLeft++;
            } else if (leftArray[topLeft] < rightArray[topRight]) {
                array[k] = leftArray[topLeft];
                topLeft++;
            } else {
                array[k] = rightArray[topRight];
                topRight++;
            }
        }
    }
}
