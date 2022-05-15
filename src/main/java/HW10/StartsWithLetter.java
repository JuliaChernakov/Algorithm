package HW10;

public class StartsWithLetter {
//    Написать алгоритм StartsWithLetter, который принимает на вход текст,
//    и возвращает в виде строки все слова, которые начинаются с буквы l.

    public String StartsWithLetter (String string) {
        String result = "";

        for (int i = 0; i < string.length() - 1; i++) {
            if ((string.charAt(i) == 32 && string.charAt(i + 1) == 108) || string.charAt(i + 1) == 76) {
                for (int j = i + 2; j < string.length(); j++) {
                    if (string.charAt(j) < 97 || string.charAt(j) > 122) {
                        if (!result.equals("")) {
                            result = result.concat(", ");
                        }
                        result = result.concat(string.substring((i + 1), j));
                        j = string.length();
                    }
                }
            }
        }

        return result;
    }
}
