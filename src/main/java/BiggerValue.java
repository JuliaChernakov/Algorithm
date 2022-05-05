public class BiggerValue {
//    Напишите алгоритм BiggerValue, который из двух параметров типа int возвращает бОльшее значение.

    public int biggerValueAlgorithm(int number1, int number2) {
//        return Math.max(number1, number2);

        int result = number1;
        if (number2 > result) {
            result = number2;
        }

        return result;
    }
}
