package com.company;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

/**
 * Created by max on 23.03.2014.
 */
public class Task7 {


    public Integer countOfDifferentSymbolInWord(String word) {

        if (word.isEmpty())
            return 0;

        Map<Character, Integer> map = new Hashtable<Character, Integer>();

        for (int i = 0; i < word.length(); ++i)
            map.put(word.charAt(i), 1);

        return map.size();
    }

    public String wordFromDifferentSymbols(String... words){

        for (String word : words) {
            if(countOfDifferentSymbolInWord(word)==word.length())
            {
                return word;
            }
        }

        return  null;
    }

    public static void main(String[] args) {
        Task7 task7 = new Task7();
        String[] words = General.inputWords();
        System.out.println("Первое слово, состоящее только из различных символов: ");
        System.out.println(task7.wordFromDifferentSymbols(words));


    }
}
