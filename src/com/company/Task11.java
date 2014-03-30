package com.company;

import java.util.Scanner;

/**
 * Created by max on 27.03.2014.
 */
public class Task11 {
    /**
     * find  interval
     * @param k number
     */
    private void findIntervall(Double k){
    final int i = k.intValue();

    switch (i>-10000 && i<0 ? 0:1 ){
        case 0:
            System.out.println("Число в интервале (-10000, 5]");
            break;
        case 1:
            switch (i>=0 && i<5? 0:1){
                case 0:
                    System.out.println("Число в интервале (-10000, 5] и [0,10] ");
                    break;
                case 1:
                    switch (i==5? 0:1){
                        case 0:
                            System.out.println("Число в интервале (-10000, 5] и [0,10] и [5,15] ");
                            break;
                        case 1:
                            switch (i>5 && i<10? 0:1){
                                case 0:
                                    System.out.println("Число в интервале [0,10] и [5,15] ");
                                    break;
                                case 1:
                                    switch (i==10? 0:1){
                                        case 0:
                                            System.out.println("Число в интервале  [0,10] и [5,15] и [10,10000] ");
                                            break;
                                        case 1:
                                            switch (i>10 && i<=15?0:1){
                                                case 0:
                                                    System.out.println("Число в интервале [5,15] и [10,10000] ");
                                                    break;
                                                case 1:
                                                    switch (i>15 && i<=10000?0:1){
                                                        case 0:
                                                            System.out.println("Число в интервале  [10,10000] ");
                                                            break;
                                                        case 1:
                                                            System.out.println("Число не интервале  ");
                                                            break;

                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                            }
                            break;

                    }
                    break;


            }
            break;

    }

}

    public static void main(String[] args) {
        System.out.println("11.Используя оператор switch, написать программу, которая выводит на экран сообщения о принадлежности некоторого значения k интервалам (-10k, 5], [0, 10], [5, 15], [10, 10k].");
        Task11 task11 = new Task11();
        System.out.println("Введите число: ");
        task11.findIntervall(new Scanner(System.in).nextDouble());
        General.printInfo();
    }


}
