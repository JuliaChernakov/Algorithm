public class PeakElement {
//    Написать алгоритм PeakElement, который принимает на вход массив целых чисел
//    и возвращает значения пиковых элементов (элементы, которые больше своих соседей).

    public int[] peakElementAlgorithm(int[] array) {
        if (array.length > 0) {

            int count = 0;
            if (array[0] > array[1]) {
                count++;
            }
            for (int i = 1; i < (array.length - 1); i++) {
                if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                    count++;
                }
            }
            if (array[array.length - 1] > array[array.length - 2]) {
                count++;
            }

            int[] result = new int[count];
            if (array[0] > array[1]) {
                result[0] = array[0];
                count--;
            }
            for (int i = 1; i < (array.length - 1); i++) {
                if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                    result[result.length - count] = array[i];
                    count--;
                }
            }
            if (array[array.length - 1] > array[array.length - 2]) {
                result[result.length - 1] = array[array.length - 1];
            }

            return result;
        }

        return array;
    }
}
