public class SortArray {
//    Написать алгоритм SortArray, который принимает на вход
//    массив целых чисел, и сортирует элементы массива в порядке возрастания.

//    public int[] sortArrayAlgorithm(int[] array) {
//
//        return Utils.sortArrayMinMax (array);
//    }

    public int[] sortArrayAlgorithm(int[] array) {

        if (array.length == 0) {

            return array;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int count;

                if (array[i] > array[j]) {
                    count = array[i];
                    array[i] = array[j];
                    array[j] = count;
                }
            }
        }

        return array;
    }


}
