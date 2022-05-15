package HW10;

public class StringToNumbersAndSpaces {
//    Написать алгоритм StringToNumbersAndSpaces. Алгоритм принимает строку и удаляет ненужные символы

    public String stringToNumbersAndSpacesAlgorithm(String string) {
        String result = "";

        if (!string.isEmpty()) {
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) > 47 && string.charAt(i) < 58 || string.charAt(i) == 32) {
                }
            }

            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) > 47 && string.charAt(i) < 58 || string.charAt(i) == 32)
                    result = result.concat(string.substring(i, i + 1));
            }
        }

        return result;
    }
}
