package com.company;

public class Task1 {
    public static void main(String[] args) {
        /* #1: Выведите в одну строку через пробел числа от 1 до 10, используя цикл while.
На следующей строке выведите числа в обратном порядке от 10 до 1, используя оператор for.
Для обоих циклов можно использовать как одну общую переменную, так и в каждом цикле свою.
Не забудьте выполнить переход на новую строку между двумя циклами.
В результате программы вывод должен получиться следующий:
1 2 3 4 5 6 7 8 9 10
10 9 8 7 6 5 4 3 2 1 */
        String textLine = ""; byte i = 1;

        while(i<=10) {
            textLine = textLine +" "+i;
            i++;
        }
        System.out.println(textLine.trim());

        textLine = ""; i = 10;
        for(;i>=1;i--) {
            textLine = textLine + " "+i;
        }
        System.out.println(textLine.trim());
    }
}
