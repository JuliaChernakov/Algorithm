package HW10;

public class StringToNumbers {

    public String stringToNumbersAlgorithm(String string) {
        String result = "";

        if (!string.isEmpty()) {
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) > 47 && string.charAt(i) < 58) {
                }
            }

            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) > 47 && string.charAt(i) < 58)
                    result = result.concat(string.substring(i, i + 1));
            }
        }

        return result;
    }
}