public class OddIndices {
//    Написать алгоритм OddIndices, который принимает массив чисел,
//    и возвращает массив значений нечетных индексов

    public int[] oddIndicesAlgorithm(int[] array) {
        int[] result = new int[array.length / 2];
        for (int i = 0; i < result.length; i++) {
            result[i] = array[i * 2 + 1];
        }
        return result;
    }
}
