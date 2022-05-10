public class NumberOccurrences {
//    Написать алгоритм NumberOccurrences, который принимает на вход массив целых чисел,
//    и возвращает массив пар {число, сколько раз число встречается в массиве}

    int findEnd(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i][1] == 0) {
                return i;
            }
        }
        return 0;
    }

    public int[][] numberOccurrencesAlgorithm(int[] array) {
        if (array.length == 0) {
            return new int[][]{};
        }

        int[] arrayHelp = Utils.sortArrayMinMax(array);
        int[][] resultWithZero = new int[array.length][2];
        int j = 0;
        int count = 0;

        for (int i = 0; i < arrayHelp.length - 1; i++) {
            if (arrayHelp[i] != arrayHelp[i + 1]) {
                if (count > 1) {
                    resultWithZero[j][0] = arrayHelp[i];
                    resultWithZero[j++][1] = count + 1;
                }
                count = 0;
            } else {
                count++;
            }
        }
        if (arrayHelp[arrayHelp.length - 1] == arrayHelp[arrayHelp.length - 2]) {
            resultWithZero[j][0] = arrayHelp[arrayHelp.length - 1];
            resultWithZero[j][1] = count + 1;
        }

        int end = findEnd(resultWithZero);
        int[][] result = new int[end][2];
        for (int i = 0; i < result.length; i++) {
            result[i][0] = resultWithZero[i][0];
            result[i][1] = resultWithZero[i][1];
        }

        return result;
    }
}
