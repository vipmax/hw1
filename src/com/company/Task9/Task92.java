package com.company.Task9;

import com.company.General;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task92 {


    private Comparator<String> c;

    public static void main(String... args) {
        if (args.length == 0) {
            System.out.println("Нет аргументов командной строки");
            return;
        }
        Task92 task92 = new Task92();
        String[] inputStrings = args;
        System.out.println("Сортировка по длине: ");
        General.showStrings(task92.sortStringsByLenght(inputStrings));
        System.out.println("Сортировка по длине в обратном порядке: ");
        General.showStrings(task92.sortStringsByLenghtDesk(inputStrings));
        General.printInfo();


    }

    /**
     * shortest strings first
     *
     * @param sourceStrings source strings
     * @return sorted strings array
     */
    public String[] sortStringsByLenght(String... sourceStrings) {
        List<String> listString = new ArrayList<String>();

        for (String str : sourceStrings) {
            listString.add(str);
        }

        Collections.sort(listString, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.length() - b.length();
            }
        });         //WOW!!!    lambdas since java 8


        return listString.toArray(new String[0]);

    }

    /**
     * longest strings first
     *
     * @param sourceStrings source strings
     * @return sorted strings array
     */
    public String[] sortStringsByLenghtDesk(String... sourceStrings) {
        List<String> listString = new ArrayList<String>();

        for (String str : sourceStrings) {
            listString.add(str);
        }

        c = new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.length() - a.length();
            }
        };
        java.util.Collections.sort(listString, c);  //lambdas since java 8


        return listString.toArray(new String[0]);
    }
}
