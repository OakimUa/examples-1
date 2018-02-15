package task1;

/*
    Написать функцию вычисления наибольшего общего делителя используя бинарный алгоритм Евклида:
    1. НОД(0, n) = n; НОД(m, 0) = m; НОД(m, m) = m;
    2. НОД(1, n) = 1; НОД(m, 1) = 1;
    3. Если m, n чётные, то НОД(m, n) = 2*НОД(m/2, n/2);
    4. Если m чётное, n нечётное, то НОД(m, n) = НОД(m/2, n);
    5. Если n чётное, m нечётное, то НОД(m, n) = НОД(m, n/2);
    6. Если m, n нечётные и n > m, то НОД(m, n) = НОД((n-m)/2, m);
    7. Если m, n нечётные и n < m, то НОД(m, n) = НОД((m-n)/2, n);
 */
class NOD {
    long calculate(final long m, final long n) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
