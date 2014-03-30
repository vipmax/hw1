package com.company.Task9;


import com.company.General;

import java.util.Hashtable;
import java.util.Map;

/**
 * Created by max on 23.03.2014.
 */
public class Task94 {

    /**
     *
     * @param word source word
     * @return count Of Different SymbolIn Word
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
     * @param sourceString Strings who will handle
     * @return string where the number of different symbols is minimal
     */
    public String stringWhereNumberDifferentSymbolsIsMinimal(String... sourceString) {
        String result = sourceString[0];
        for (String word : sourceString) {
            if (countOfDifferentSymbolInWord(word) < countOfDifferentSymbolInWord(result)) {
                result = word;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("Нет аргументов командной строки");
            return;
        }
        Task94 task94 = new Task94();
        String[] inputWords = args;
        System.out.println("Cлово, в котором число различных символов минимально: ");
        String word = task94.stringWhereNumberDifferentSymbolsIsMinimal(inputWords);
        System.out.println(word + " различных символов : "+ task94.countOfDifferentSymbolInWord(word));
        General.printInfo();

    }
}
