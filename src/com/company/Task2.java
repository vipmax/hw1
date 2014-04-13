package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by max on 22.03.2014.
 */
public class Task2 {


    public static void main(String... args) {
        System.out.println("2.Ввести n строк с консоли. Упорядочить и вывести строки в порядке возрастания (убывания) значений их длины.");
        Task2 task2 = new Task2();
        String[] inputStrings = General.inputStrings();
        System.out.println("Сортировка по длине: ");
        General.showStrings(task2.sortStringsByLength(inputStrings));
        System.out.println("Сортировка по длине в обратном порядке: ");
        General.showStrings(task2.sortStringsByLengthDesk(inputStrings));
        General.printInfo();
    }

    /**
     * shortest strings first
     *
     * @param sourceStrings source strings
     * @return sorted strings array
     */
    public String[] sortStringsByLength(String... sourceStrings) {

        List<String> listString = new ArrayList<String>();
        for (String str : sourceStrings) {
            listString.add(str);
        }
        Collections.sort(listString, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.length() - b.length();
            }
        });
        return listString.toArray(new String[0]);
    }

    /**
     * longest strings first
     *
     * @param sourceStrings source strings
     * @return sorted strings array
     */
    public String[] sortStringsByLengthDesk(String... sourceStrings) {

        List<String> listString = new ArrayList<String>();
        for (String str : sourceStrings) {
            listString.add(str);
        }
        Collections.sort(listString, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.length() - a.length();
            }
        });
        return listString.toArray(new String[0]);
    }
}
