package com.company;

import java.util.Scanner;

/**
 * Created by max on 27.03.2014.
 */
public class Task10 {


    /**
     * find interval
     * @param k number
     */
    void findInterval(Double k) {

        final int i = k.intValue();
        System.out.println(i);
        switch (i > 0 ? 0 : 1) {
            case 0:
                switch (i <= 5 ? 0 : 1) {
                    case 0:
                        System.out.println("Число в интервале (0,5]");
                        break;
                    case 1:
                        switch (i <= 10 ? 0 : 1) {
                            case 0:
                                System.out.println("Число в интервале (5, 10]");
                                break;

                            case 1:
                                switch (i<=10000? 0 : 1){
                                    case 0:
                                        System.out.println("Число в интервале (10, 10000]");
                                        break;
                                    case 1:
                                        System.out.println("Число не в интервале");
                                        break;

                                }
                                break;
                        }
                        break;
                }
                break;
            case 1:
                switch (i > -10000 || i==0 ? 0 : 1) {
                    case 0:
                        System.out.println("Число в интервале (-10000, 0]");
                        break;
                    case 1:

                        System.out.println("Число не в интервале");
                        break;


                }
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        System.out.println("10.Используя оператор switch, написать программу, которая выводит на экран сообщения о принадлежности некоторого значения k интервалам (-10k, 0], (0, 5], (5, 10], (10, 10k].");
        Task10 task10 = new Task10();
        System.out.println("Введите число: ");
        task10.findInterval(new Scanner(System.in).nextDouble());
        General.printInfo();

    }
}
