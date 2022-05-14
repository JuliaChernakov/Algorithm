package HW9;

public class OddIndices {
//    Написать алгоритм HW9.OddIndices, который принимает массив чисел,
//    и возвращает массив значений нечетных индексов

    public int[] oddIndicesAlgorithm(int[] array) {
        if (array.length == 0) {
            return array;
        }
        int[] result = new int[array.length / 2];
        for (int i = 0; i < result.length; i++) {
            result[i] = array[i * 2 + 1];
        }
        return result;
    }
}
