package com.company;

import java.util.Scanner;

/**
 * Created by max on 22.03.2014.
 */
public class General {
    /**
     *
     *
     * @return input strings from console
     */
    public static String[] inputStrings() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк:");
        int n = scanner.nextInt();
        System.out.println("Введите строки:");
        String[] result = new String[n];
        scanner.nextLine();                 //"" wtf?????
        for (int i = 0; i < n; i++) {
            result[i] = scanner.nextLine();
        }
        return result;
    }
    /**
     *
     *
     * @return input strings from console
     */
    public static String[] inputWords() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество слов:");
        int n = scanner.nextInt(); scanner.nextLine();
        System.out.println("Введите слова:");
        String[] result = new String[n];
                       //"" wtf?????
        for (int i = 0; i < n; i++) {
            result[i] = scanner.next();
        }
        return result;
    }

    /**
     * show strings and  his lenghts
     * @param strings sourse strings
     */
    public static void showStrings(String... strings) {
        for (String str : strings) {
            System.out.println(str + " " + str.length());
        }
    }




    /**
     *
     * @param sourceStrings array of strings who will find average  lenght
     * @return average lenght of source strings
     */
    public static Integer findAVGLength(String... sourceStrings) {
        Integer totalLength = 0;
        for (String str : sourceStrings) {
            totalLength += str.length();
        }
        Integer result = totalLength / sourceStrings.length;
        return result;
    }


}
