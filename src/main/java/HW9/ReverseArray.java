package HW9;

public class ReverseArray {
//    Написать алгоритм HW9.ReverseArray, который принимает на вход
//    массив целых чисел, и возвращает “перевернутый” массив.

    public int[] reverseArrayAlgorithm(int[] array) {

        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[array.length - 1 - i];
        }
        return result;
    }
}
