package task2;

/*
Реализовать сортировку целочисленного массива
Входные данные:
- Имя файла с целочисленным массивом
- Тип алгоритма
Выходные данные:
Файл с отсортированным массивом - имя файла то же что и входное + ".sorted"

Структура входного файла:
1я строка - размер массива
каждая следующая строка - один элемент массива

Реализовать минимум 3 алгоритма сортировки:
- Сортировка пузырьком
- Сортировка выбором
- Быстрая сортировка

Каждый алгоритм должен замерять время сортировки и количество проведенных сравнений и перестановок.
 */
public abstract class ArraySort {
    private Long lastRunTime = 0L;
    private Long lastComparisionCounter = 0L;
    private Long lastSwappingCounter = 0L;

    public void sort() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected abstract void sortArray();

    public Long getLastRunTime() {
        return lastRunTime;
    }

    public Long getLastComparisionCounter() {
        return lastComparisionCounter;
    }

    public Long getLastSwappingCounter() {
        return lastSwappingCounter;
    }
}
