public class QuickSort {

    public int [] sort(int[] array) {
        if (array.length <= 1) {
            return array;
        }

        executeSort(array, 0, array.length - 1);

        return array;
    }

    public void executeSort(int[] array, int startArray, int endArray) {
        int pivot = array[startArray];
        int left = startArray;
        int right = endArray;

        while (left <= right) {
            while (array[left] < pivot) left++;
            while (array[right] > pivot) right--;

            if (left <= right) {
                int aux = array[left];
                array[left] = array[right];
                array[right] = aux;

                left++;
                right--;
            }
        }

        if (startArray < right) executeSort(array, startArray, right);
        if (left < endArray) executeSort(array, left, endArray);

    }
}
