package com.company;

/**
 * Created by max on 27.03.2014.
 */
public class Task12 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("12.Написать программу, которая выводит числа от 1 до 25 в виде матрицы 5x5 слева направо и сверху вниз.");
        Integer count = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%3s", count++);
                Thread.currentThread().sleep(500);
            }
            System.out.println();
        }
        General.printInfo();
    }
}
