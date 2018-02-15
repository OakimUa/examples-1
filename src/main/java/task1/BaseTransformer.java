package task1;

/*
    Реализовать алгоритм перевода числа из одной системы счисления в другую
    Входные данные:
    - Число, представленное строкой
    - Система счисления числа
    - Система счисления, в которую надо перевести число
    Выходные данные:
    - Число, представленное строкой в заданной системе счисления
 */
class BaseTransformer {
    static char[] BASE_2 = new char[] {'0', '1'};
    static char[] BASE_10 = new char[] {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    static char[] BASE_16 = new char[] {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    BaseTransformer(char[] baseFrom, char[] baseTo) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    String transform(String input) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
