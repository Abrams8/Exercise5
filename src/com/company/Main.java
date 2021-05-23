package com.company;

public class Main {

    public static void main(String[] args) {
        int s = 9649857;
        int sek = s % 60;
        int m = (s - sek) / 60;
        int min = m % 60;
        int h = (m - min) / 60;
        int hour = h % 24;
        int sytk = (h - hour) / 24;
        int w = sytk % 7;
        int week = (sytk - w) / 7;
        System.out.println(s + " секунд = " + week + " недель, " + w + " суток, " + hour + " часов, " + min + " минут, " + sek + " секунд!");
    }
}
