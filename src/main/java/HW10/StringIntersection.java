package HW10;

public class StringIntersection {
//    Написать алгоритм StringIntersection, который принимает на вход 2 строки
//    и возвращает общее вхождение в этих строках

    public String stringIntersectionAlgorithm (String string1, String string2) {
        if (!string1.isEmpty() && !string2.isEmpty()) {
            for (int i = 0; i < string1.length(); i++) {
                for (int j = 0; j < string2.length(); j++) {
                    if (string1.charAt(i) == string2.charAt(j)) {



                    }
                }
            }


        }

        return "";
    }
}
