package HW10;

public class StringToLettersAndSpaces {
//    Написать алгоритм StringToLettersAndSpaces. Алгоритм принимает строку и удаляет ненужные символы

    public String stringToLettersAndSpacesAlgorithm(String string) {
        String result = "";

        if (!string.isEmpty()) {
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) > 1039 && string.charAt(i) < 1103 || string.charAt(i) == 32) {
                }
            }

            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) > 1039 && string.charAt(i) < 1103 || string.charAt(i) == 32)
                    result = result.concat(string.substring(i, i + 1));
            }
        }

        return result;
    }
}
