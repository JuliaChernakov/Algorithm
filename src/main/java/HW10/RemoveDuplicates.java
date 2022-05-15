package HW10;

public class RemoveDuplicates {
//    Написать алгоритм RemoveDuplicates, который принимает строку и возвращает строку уникальных букв

    public String RemoveDuplicatesAlgorithm(String string) {
        if (!string.isEmpty()) {
            string = string.toLowerCase();
            String result = "";
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) > 96 && string.charAt(i) < 123) {
                    result = result.concat(string.substring(i, i + 1));
                    string = string.replace(string.charAt(i), ' ');
                }
            }

            return result;
        }

        return string;
    }
}
