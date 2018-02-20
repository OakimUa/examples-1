package task2;

/*
Реализовать поиск элемента в целочисленном массиве
Входные данные:
- Имя файла с целочисленным массивом
- Тип алгоритма
- Искомый элемент
Выходные данные:
Если элемент присутствует в массиве, индекс искомого элемента, в обратном случае - null

Структура входного файла:
1я строка - размер массива
каждая следующая строка - один элемент массива

Реализовать 2 алгоритма поиска:
- Линейный поиск
- Бинарный поиск

Каждый алгоритм должен замерять время поиска и количество проведенных сравнений.
 */
public abstract class ArraySearch {
    private Long lastRunTime = 0L;
    private Long lastComparisionCounter = 0L;

    public Long find(final Integer element) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected abstract Long findElement(final Integer element);

    public Long getLastRunTime() {
        return lastRunTime;
    }

    public Long getLastComparisionCounter() {
        return lastComparisionCounter;
    }

}
