package com.company;

import java.util.Scanner;

/**
 * Created by max on 27.03.2014.
 */
public class Task10 {

    void findInterval(Double k) {
        final int mTenK_to_zero = 1;
        final int zero_to_five = 2;
        final int five_to_ten = 3;
        final int ten_to_tenK = 4;

        int m = 0;
        if (k > -10000 && k <= 0) m = mTenK_to_zero;
        else if (k > 0 && k <= 5) m = zero_to_five;
        else if (k > 5 && k <= 10) m = five_to_ten;
        else if (k > 10 && k <= 10000) m = ten_to_tenK;

        String s = null;
        switch (m) {
            case mTenK_to_zero:
                s = "(-10K, 0]";
                break;
            case zero_to_five:
                s = "(0, 5]";
                break;
            case five_to_ten:
                s = "(5, 10]";
                break;
            case ten_to_tenK:
                s = "(10, 10K]";
                break;
        }

        if (s == null) {

            System.out.println("k not in range");
        } else {

            System.out.println(k + " in range: " + s);
        }
    }

    void findIntervall(Double k) {

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
        Task10 task10 = new Task10();
        Boolean isExeption = false;
        System.out.println("Введите число: ");
        task10.findIntervall(new Scanner(System.in).nextDouble());


    }
}
