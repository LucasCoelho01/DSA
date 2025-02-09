public class BinarySearch {

    public int search(int[] array, int number) {
        int baixo = 0;
        int alto = array.length - 1;

        while (baixo <= alto) {
            int meio = (baixo + alto) / 2;
            int chute = array[meio];

            if (chute == number) {
                return meio;
            }

            if (chute > number) {
                alto = meio - 1;
            } else {
                baixo = meio + 1;
            }
        }

        return -1;
    }
}
