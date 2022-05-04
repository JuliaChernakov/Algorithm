public class KthLargest {
//    Написать алгоритм KthLargest, который принимает на вход
//    массив целых чисел и число k, и возвращает k-тый максимальный элемент.

    public int[] removeOneMax(int[] array) {
        int max = Utils.findMax(array);
        int min = Utils.findMin(array);
        for (int i = 0; i < array.length; i++) {
            if(array[i] == max) {
                array[i] = min;
                return array;
            }
        }
        return null;
    }

    public int KthLargestAlgorithm(int[] array, int k) {
        if (k > array.length || array.length == 0) {
            return Integer.MIN_VALUE;
        }
        for (int i = 0; i < k - 1; i++) {
            array = removeOneMax(array);
            }

        return Utils.findMax(array);
    }
}
