package com.company;

import java.util.*;

/**
 * @author vipmax
 */
public class Task1 {


    /**
     * method return most long strings
     *@param sourceStrings vararg source strings
     *@return longest strings
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

        return General.toStringArray(result);

    }

    /**
      *@param sourceStrings vararg source strings
      *@return shortest strings
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

        return General.toStringArray(result);

    }


    public static void main(String... args) {
        Task1 task1 = new Task1();
        String[] inputStrings = General.inputStrings();
        System.out.println("Самая длинная: ");
        General.showStrings(task1.getLongestString(inputStrings));
        System.out.println("Самая короткая: ");
        General.showStrings(task1.getShortestString(inputStrings));
    }
}

