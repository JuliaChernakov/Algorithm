package HW9;

public class SumOfTwo {
//    Написать алгоритм HW9.SumOfTwo, который принимает на вход массив целых чисел,
//    и число n. Алгоритм  возвращает пары элементов, которые в сумме дают число n.

    public int[][] SumOfTwoAlgorithm(int[] array, int n) {
        int[][] result = {};

        if (array.length > 0) {
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] + array[j] == n) {
                        count++;
                    }
                }
            }

            result = new int[count][2];
            int r = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] + array[j] == n) {
                        result[r][0] = array[i];
                        result[r][1] = array[j];
                        r++;
                    }
                }
            }
        }

        return result;
    }
}
