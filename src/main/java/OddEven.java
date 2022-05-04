public class OddEven {
    // Создать алгоритм OddEven, который принимает на вход целое число, возвращает “Odd”,
    // если число нечетное, и “Even”, если число четное. Во всех остальных случаях результат будет “Undefined”.

    public String oddEvenAlgorithm(int number) {
        if (number < Integer.MAX_VALUE && number > Integer.MIN_VALUE) {
            if (number % 2 == 0) {
                return "Even";
            } else if (Math.abs(number % 2) == 1) {
                return "Odd";
            }
        }
        return "Undefined";
    }
}
