package HW10;

public class LongestCommonSubstring {
//    Написать алгоритм LongestCommonSubstring, который принимает 3 строки
//    и ищет самое длинное общее пересечение

    public String LongestCommonSubstringAlgorithm(String str1, String str2, String str3) {
        if ((str1 != null && str2 != null && str3 != null)
                || (str1.length() > 0 && str2.length() > 0 && str3.length() > 0)) {
            str1 = str1.trim();
            str2 = str2.trim();
            str3 = str3.trim();
            String smallest = str1;
            String subString = "";
            String common = "";
            String result = "";

            if ((str2.length() < str1.length()) && (str2.length() < str3.length())) {
                smallest = str2;
                str2 = str1;
            } else if ((str3.length() < str1.length()) && (str3.length() < str2.length())) {
                smallest = str3;
                str3 = str1;
            }

            for (int i = 0; i < smallest.length() - 1; i++) {
                for (int j = i + 1; j <= smallest.length(); j++) {
                    subString = smallest.substring(i, j);
                    if ((str2.contains(subString)) && (str3.contains(subString))) {
                        common = subString;
                    }
                }
                if (common.length() > result.length()) {
                    result = common;
                }
            }

            return result;
        }

        return "";
    }
}
