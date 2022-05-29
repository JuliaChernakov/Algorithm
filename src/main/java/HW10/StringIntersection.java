package HW10;

public class StringIntersection {
//    Написать алгоритм StringIntersection, который принимает на вход 2 строки
//    и возвращает общее вхождение в этих строках

    public String stringIntersectionAlgorithm(String str1, String str2) {
        if (!str1.isEmpty() && !str2.isEmpty()) {
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();
            if (str1.length() > str2.length()) {
                String help = str2;
                str2 = str1;
                str1 = help;
            }

            String result = "";
            int j = 0;
            for (int i = 1; i <= str1.length(); i++) {
                if (str2.contains(str1.substring(j, i))) {
                    result = str1.substring(j, i);
                } else {
                    j++;
                }
            }

            return result;
        }

        return "";
    }
}
