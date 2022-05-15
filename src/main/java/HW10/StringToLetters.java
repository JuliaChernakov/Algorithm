package HW10;

public class StringToLetters {
//    Написать алгоритм StringToLetters. Алгоритм принимает строку и удаляет ненужные символы

    public String stringToLettersAlgorithm(String string) {
        String result = "";

        if (!string.isEmpty()) {
            for (int i = 0; i < string.length(); i++) {
//          Латиница:
//                if (string.charAt(i) > 64 && string.charAt(i) < 91
//                        || string.charAt(i) > 96 && string.charAt(i) < 123) {
//          Кириллица:
                if (string.charAt(i) > 1039 && string.charAt(i) < 1103) {
//          Иврит:
//                if (string.charAt(i) > 1487 && string.charAt(i) < 1515) {

                }
            }

            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) > 1039 && string.charAt(i) < 1103)
                    result = result.concat(string.substring(i, i + 1));
            }
        }

        return result;
    }
}
