public class NegativeOnTheRight {
    //    Написать алгоритм NegativeOnTheRight, который принимает на вход массив целых чисел,
//    и возвращает массив,  в котором все негативные числа находятся во второй половине массива
    public static int countNegative(int[] array) {
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                k++;
            }
        }
        return k;
    }

    public int[] negativeOnTheRightAlgorithm(int[] array) {

// меняется порядок отрицательных чисел
//        int[] result = new int[array.length];
//        int k = 0;
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < 0) {
//                result[result.length - 1 - k] = array[i];
//                k++;
//            } else {
//                result[i - k] = array[i];
//            }
//        }
//        return result;

// не меняется порядок

        int[] result = new int[array.length];
        int n = countNegative(array);
        int p = n;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                result[result.length - n] = array[i];
                n--;
            } else {
                result[i - p + n] = array[i];
            }
        }
        return result;
    }
}
