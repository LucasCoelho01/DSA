import java.util.Arrays;

public class BublleSort {

    public int [] sort(int[] array) {
        int arraySize = array.length;

        for (int j = 0; j < arraySize - 1; j++) {
            boolean isSorted = true;

            System.out.println(Arrays.toString(array));

            for (int i = 0; i < arraySize - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    int aux = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = aux;
                }
            }

            if (isSorted) return array;
        }

        return array;
    }
}
