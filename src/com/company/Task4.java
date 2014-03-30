package com.company;

import java.util.Hashtable;
import java.util.Map;

/**
 * Created by max on 23.03.2014.
 */
public class Task4 {

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
        System.out.println("4.Ввести n слов с консоли. Найти слово, в котором число различных символов минимально. Если таких слов несколько, найти первое из них.");
        Task4 task4 = new Task4();
        String[] inputWords = General.inputWords();
        System.out.println("Первое слово, в котором число различных символов минимально: ");
        String word = task4.stringWhereNumberDifferentSymbolsIsMinimal(inputWords);
        System.out.println(word + " различных символов : "+ task4.countOfDifferentSymbolInWord(word));
        General.printInfo();

    }
}
