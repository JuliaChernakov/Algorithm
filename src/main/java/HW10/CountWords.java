package HW10;

public class CountWords {

    public int CountWordsAlgorithm(String string, String word) {
        string = string.toLowerCase();
        word = word.toLowerCase();
        int length = string.length();

        string = string.replace(word, "");

        return (length - string.length()) / word.length();
    }
}

