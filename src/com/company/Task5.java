package com.company;

public class Task5 {
    public static void main(String[] args) {
        /* #5: Вывести первые 10 чисел последовательности Фибоначчи. Последовательность строится по следующему правилу:
– Каждое следующее число равняется сумме двух предыдущих.
Дано: две целочисленные переменные, первая равна 0, вторая равна 1.
Эти два числа — первые числа последовательности. Следующие восемь нужно вычислить и вывести.
Должно получиться следующее:
0 1 1 2 3 5 8 13 21 34 */
        int num1 = 0; int num2 = 1;
        String textOut=""; int sumNum1Num2;

        for(int i=2;i<10;i++) {
            if(i==2) {
                textOut = num1 + " " + num2;
            }
            sumNum1Num2=num1+num2;
            num1=num2;
            num2=sumNum1Num2;
            textOut = textOut + " " + sumNum1Num2;
        }
        System.out.println(textOut);
    }
}
