package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task2 {


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

        Collections.sort(listString, (a, b) -> a.length() - b.length());         //WOW!!!    lambdas since java 8


        return General.toStringArray(listString);
    }

    /**
     * longest strings first
     *
     * @param sourceStrings
     * @return sorted strings array
     */
    public String[] sortStringsByLenghtDesk(String... sourceStrings) {
        List<String> listString = new ArrayList<String>();

        for (String str : sourceStrings) {
            listString.add(str);
        }

        java.util.Collections.sort(listString, (a, b) -> b.length() - a.length());  //lambdas since java 8


        return General.toStringArray(listString);
    }


    public static void main(String... args) {

        Task2 task2 = new Task2();
        String[] inputStrings = General.inputStrings();
        System.out.println("Сортировка по длине: ");
        General.showStrings(task2.sortStringsByLenght(inputStrings));
        System.out.println("Сортировка по длине в обратном порядке: ");
        General.showStrings(task2.sortStringsByLenghtDesk(inputStrings));


    }
}
