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

    public int kthLargestAlgorithm(int[] array, int k) {
        if (k <= array.length && array.length > 0 && k > 0) {
            for (int i = 0; i < k - 1; i++) {
                array = removeOneMax(array);
            }

            return Utils.findMax(array);
        }

        return Integer.MIN_VALUE;
    }

//    Option 2

//    public int kthLargestAlgorithm(int[] array, int k) {
//        if (k > 0 && k <= array.length) {
//
//            for (int i = 0; i < array.length; i++) {
//                for (int j = i + 1; j < array.length; j++) {
//                    int count;
//
//                    if (array[i] < array[j]) {
//                        count = array[i];
//                        array[i] = array[j];
//                        array[j] = count;
//                    }
//                }
//            }
//
//            return array[k - 1];
//        }
//
//        return Integer.MIN_VALUE;
//    }
}

