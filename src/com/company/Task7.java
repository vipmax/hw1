package com.company;

import java.util.Hashtable;
import java.util.Map;

/**
 * Created by max on 23.03.2014.
 */
public class Task7 {

    /**
     *
     * @param word source word
     * @return count of different symbol
     */
    public Integer countOfDifferentSymbolInWord(String word) {

        if (word.isEmpty())
            return 0;

        Map<Character, Integer> map = new Hashtable<Character, Integer>();

        for (int i = 0; i < word.length(); ++i)
            map.put(word.charAt(i), 1);

        return map.size();
    }

    /**
     *
     * @param words source words
     * @return  word with different symbol
     */
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
        System.out.println("7.Ввести n слов с консоли. Найти слово, состоящее только из различных символов. Если таких слов несколько, найти первое из них.");
        Task7 task7 = new Task7();
        String[] words = General.inputWords();
        System.out.println("Первое слово, состоящее только из различных символов: ");
        System.out.println(task7.wordFromDifferentSymbols(words));
        General.printInfo();


    }
}
