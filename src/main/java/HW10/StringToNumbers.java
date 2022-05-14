package HW10;

public class StringToNumbers {

//    Написать алгоритм StringToNumbers, который принимает строку, и возвращает массив чисел

    public int[] stringToNumbersAlgorithm (String string) {
        if (!string.isEmpty()) {
            int count = 0;
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) >= 48 && string.charAt(i) < 58) {
                    count++;
                }
            }

            int[] array = new int[count];
            count = 0;
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) >= 48 && string.charAt(i) < 58) {
                    array[count] = string.charAt(i) - '0';
                    count++;
                }
            }

            return  array;
        }

        return new int[0];
    }
}
