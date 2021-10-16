package com.company;

public class Task4 {
    public static void main(String[] args) {
        /* #4: Это задание очень любят давать на собеседованиях в разных вариациях, потому мы предлагаем его вам,
чтобы вы оценили свои силы.
Необходимо пройти циклом по числам от 1 до 30 включительно и, если число делится на 3 без остатка,
вывести ping, а если число делится на 5 без остатка, вывести pong.
Если число делится без остатка и на 3, и на 5, необходимо вывести ping pong.
Допускается наличие пустых строк в выводе. */
        int startNum = 1; int finishNum = 30; String textOut;
        for(int i=startNum;i<=finishNum;i++) {
            if(i%3==0 && i%5!=0) {
                textOut="ping";
            } else if(i%3!=0 && i%5==0) {
                textOut="pong";
            } else if (i%3==0 && i%5==0) {
                textOut="ping pong";
            } else {
                textOut = "";
            }
            System.out.println(textOut);
        }
    }
}
