package HW10;

public class RemoveDuplicates {
//    Написать алгоритм RemoveDuplicates, который принимает строку и возвращает строку уникальных букв

    public String RemoveDuplicatesAlgorithm(String string) {
        if (string != null && !string.isEmpty()) {
            string = string.toLowerCase();
            String result = "";

            /** Option 1 (the quickest) */
//            for (int i = 0; i < string.length(); i++) {
//                if (string.charAt(i) > 96 && string.charAt(i) < 123) {
//                    result = result.concat(string.substring(i, i + 1));
//                    string = string.replace(string.charAt(i), ' ');
//                }
//            }
            /** End of option 1 */

            /** Option 2 */ // стираем все что нашли - строка сокращается
//            if (!string.equals("")) {
//                for (int i = 0; i < string.length(); ) {
//                    if (string.charAt(i) > 96 && string.charAt(i) < 123) {
//                        result += String.valueOf(string.charAt(i));
//                    }
//                    string = string.replace(String.valueOf(string.charAt(i)), "");
//                }
//            }
            /** End of option 2 */

            /** Option 3 */ //только проверяем результат, ничего не меняем
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) > 96 && string.charAt(i) < 123) {
                    if (!result.contains(String.valueOf(string.charAt(i)))) {
                        result = result.concat(string.substring(i, i + 1));
                    }
                }
            }
            /** End of option 3 */

            return result;
        }

        return "";
    }
}
