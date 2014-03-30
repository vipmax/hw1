package com.company.Task9;

import com.company.General;

import java.util.Hashtable;
import java.util.Map;

/**
 * Created by max on 23.03.2014.
 */
public class Task97 {


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
        if(args.length==0){
            System.out.println("Нет аргументов командной строки");
            return;
        }
        Task97 task97 = new Task97();
        String[] words = args;
        System.out.println("Первое слово, состоящее только из различных символов: ");
        System.out.println(task97.wordFromDifferentSymbols(words));
        General.printInfo();


    }
}
