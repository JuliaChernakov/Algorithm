public class MinMaxAve {
//    Написать алгоритм MinMaxAve, который принимает массив чисел int[]  и 2 значения индексов.
//    Алгоритм возвращает массив, который содержит минимальное значение, максимальное значение,
//    и среднее среди всех значений между 2-мя индексами.

    public double[] minMaxAveAlgorithm (int[] array, int a, int b) {
        if (array.length == 0 || a >= array.length || b >= array.length) {
            return new double[]{};
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double count = 0;
        for (int i = a; i <= b; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
            count += array[i];
        }

        double[] result = new double[3];
        result[0] = min;
        result[1] = max;
        result[2] = (Math.round((count / (b - a + 1)) * 10)) / 10.0;

        return result;
    }
}
