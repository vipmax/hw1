package com.company;

import java.util.Scanner;

/**
 * Created by max on 22.03.2014.
 */
public class General {

    public static   String[] inputStrings(){
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

    public static void showStrings(String...strings){
        for(String str : strings){
            System.out.println(str +" "+ str.length());
        }
    }

    public static String[] toStringArray(java.util.Collection<String> list) {
        String[] result = new String[list.size()];
        java.util.Iterator<String> it = list.iterator();
        for (int i = 0; i < list.size(); i++) {
            result[i] = it.next();
        }
        return result;
    }

    public static Integer findAVGLength(String... sourceStrings) {
        Integer totalLength = 0;

        for (String str : sourceStrings) {
            totalLength += str.length();
        }
        Integer result = totalLength / sourceStrings.length;
        return result;
    }



}
