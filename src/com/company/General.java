package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by max on 22.03.2014.
 * This metods use's other Tasks
 */
public class General {
    /**
     * input strings
     *
     * @return input strings from console
     */
    public static String[] inputStrings() {
        Scanner scanner = new Scanner(System.in);
        int n = inputNumber();
        System.out.println("Введите строки:");
        String[] result = new String[n];
//        scanner.nextLine();                 //"" wtf?????
        for (int i = 0; i < n; i++) {
            result[i] = scanner.nextLine();
        }
        return result;
    }

    /**
     * input words
     *
     * @return input strings from console
     */
    public static String[] inputWords() {
        int n = inputNumber();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слова:");
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = scanner.next();
        }
        return result;
    }

    /**
     * @return input number
     */
    private static int inputNumber() {
        Boolean ok = false;
        Pattern numberPattern = Pattern.compile("[1-9]([0-9])*");
        int n = 0;
        while (!ok) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите количество слов:");
            try {
                String s = scanner.next(numberPattern);  // InputMismatchException если не удовлетворяет регулярному выражению
                ok = true;
                n = Integer.valueOf(s);
            } catch (InputMismatchException e) {
                ok = false;
            }
        }
        return n;
    }

    /**
     * show strings and  his lengths
     *
     * @param strings source strings
     */
    public static void showStrings(String... strings) {
        for (String str : strings) {
            System.out.println(str + " (" + str.length() + ")");
        }
    }


    /**
     * @param sourceStrings array of strings who will find average  length
     * @return average length of source strings
     */
    public static Integer findAVGLength(String... sourceStrings) {
        Integer totalLength = 0;
        for (String str : sourceStrings) {
            totalLength += str.length();
        }
        Integer result = totalLength / sourceStrings.length;
        return result;
    }

    /**
     * print develop info
     */
    public static void printInfo() {
        System.out.println();
        System.out.println("Разработчик: Петров М.В.");
        System.out.println("Дата получения задания: 14.03.2014 20:00");
        System.out.println("Дата сдачи задания:     30.03.2014 16:00");

    }


}
