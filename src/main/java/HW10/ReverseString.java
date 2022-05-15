package HW10;

public class ReverseString {
//    Написать алгоритм ReverseString, который переворачивает строку

    public String ReverseStringAlgorithm (String string) {
        if (!string.isEmpty()) {
            String result = "";
            for (int i = 0; i < string.length(); i++) {
                result = result.concat(String.valueOf(string.charAt(string.length() - i - 1)));
            }

            return result;
        }

        return string;
    }
}
