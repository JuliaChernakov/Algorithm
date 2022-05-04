public class Intersection {
    //    Написать алгоритм Intersection, который принимает на вход
    //    2 массива целых чисел и возвращает массив общих элементов.

    public int[] intersectionAlgorithm(int[] array1, int[] array2) {
        if (array1.length > 0 && array2.length > 0) {
            /** записываем общие элементы в новый массив */
            int[] arrayHelp = new int[array1.length];
            int n = 0;
            boolean haveZero = false;
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array2.length; j++) {
                    if (array1[i] == array2[j]) {
                        arrayHelp[n] = array1[i];
                        n++;
                        if (array1[i] == 0) {
                            haveZero = true;
                        }
                    }
                }
            }
            /** копируем уникальные элементы в новый массив */
            int[] arrayHelp1 = new int[n];
            for (int i = 0; i < arrayHelp1.length; i++) {
                int x = 0;
                for (int j = i + 1; j < arrayHelp1.length; j++) {
                    if (arrayHelp[i] == arrayHelp[j]) {
                        x++;
                    }
                }
                if (x == 0) {
                    arrayHelp1[i] = arrayHelp[i];
                }
            }
            /** считаем количество пустых мест */
            int x = 0;
            for (int i = 0; i < arrayHelp1.length; i++) {
                if (arrayHelp1[i] == 0) {
                    x++;
                }
            }
            if (haveZero) {
                x--;
            }
//            System.out.println(x);
            /** убираем пустые места */
            int[] arrayNew = new int[arrayHelp1.length - x];
//            System.out.println(arrayNew.length);
            int k = 0;
            for (int i = 0; i < arrayHelp1.length; i++) {
                if (haveZero) {
                for (int j = 0; j < arrayHelp1.length; j += arrayHelp1.length) {
                    if (arrayHelp1[i] == 0) {
                        arrayNew[k] = arrayHelp1[i];
                        k++;
                    }
                }
                }
                if (arrayHelp1[i] != 0) {
                    arrayNew[k] = arrayHelp1[i];
                    k++;
                }
            }

            return arrayNew;
        }

        return new int[]{};
    }
}
