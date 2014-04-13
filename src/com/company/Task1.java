package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by max on 22.03.2014.
 */
public class Task1 {


    public static void main(String... args) {
        System.out.println("1.Ввести n строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.");
        Task1 task1 = new Task1();
        String[] inputStrings = General.inputStrings();
        System.out.println("Самая длинная: ");
        General.showStrings(task1.getLongestString(inputStrings));
        System.out.println("Самая короткая: ");
        General.showStrings(task1.getShortestString(inputStrings));
        General.printInfo();
    }

    /**
     * method return most long strings
     *
     * @param sourceStrings vararg source strings
     * @return longest strings
     */
    public String[] getLongestString(String... sourceStrings) {

        Integer longest = sourceStrings[0].length();
        for (String s : sourceStrings) {
            if (s.length() > longest) {
                longest = s.length();
            }
        }
        List<String> result = new ArrayList<String>();
        for (String s : sourceStrings) {
            if (s.length() == longest)
                result.add(s);
        }
        return result.toArray(new String[0]);

    }

    /**
     * @param sourceStrings vararg source strings
     * @return shortest strings
     */
    public String[] getShortestString(String... sourceStrings) {

        Integer longest = sourceStrings[0].length();
        for (String s : sourceStrings) {
            if (s.length() < longest) {
                longest = s.length();
            }
        }
        List<String> result = new ArrayList<String>();
        for (String s : sourceStrings) {
            if (s.length() == longest)
                result.add(s);
        }
        return result.toArray(new String[0]);

    }
}

