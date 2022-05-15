package HW10;

public class CountWords {
//    Напишите алгоритм CountWords, который принимает на вход текст и слово,
//    и считает все вариации этого слова в тексте

    public int CountWordsAlgorithm(String string, String word) {
        string = string.toLowerCase();
        word = word.toLowerCase();
        int length = string.length();

        string = string.replace(word, "");

        return (length - string.length()) / word.length();
    }
}

