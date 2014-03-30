package com.company.Task9;

import com.company.General;

import java.util.*;

/**
 * @author vipmax
 */
public class Task91 {


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

        return result.toArray(new String[0]);

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


        return result.toArray(new String[0]);

    }


    public static void main(String... args) {
        if(args.length==0){
            System.out.println("Нет аргументов командной строки");
            return;
        }
        Task91 task91 = new Task91();
        String[] inputStrings = args;
        System.out.println("Самая длинная: ");
        General.showStrings(task91.getLongestString(inputStrings));
        System.out.println("Самая короткая: ");
        General.showStrings(task91.getShortestString(inputStrings));
        General.printInfo();

    }
}

