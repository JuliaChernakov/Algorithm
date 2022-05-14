package HW9;

public class SumArray {

    //    Написать алгоритм HW9.SumArray, который возвращает сумму всех чисел массива

    public double sumArrayAlgorithm(double[] array) {
        if (array.length == 0) {

            return Double.MIN_VALUE;
        }
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        return sum;
    }
}