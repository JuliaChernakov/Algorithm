package HW9;

public class OddEven {
    // Создать алгоритм HW9.OddEven, который принимает на вход целое число, возвращает “Odd”,
    // если число нечетное, и “Even”, если число четное. Во всех остальных случаях результат будет “Undefined”.

    public String oddEvenAlgorithm(long number) {
        if (number < 2147483648L && number > -2147483648L) {
            if (number % 2 == 0) {

                return "Even";
            } else {

                return "Odd";
            }
        }

        return "Undefined";
    }
}
