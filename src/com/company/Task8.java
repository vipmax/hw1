package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by max on 23.03.2014.
 */
public class Task8 {
    public static void main(String[] args) {
        System.out.println("8.Ввести n слов с консоли. Среди слов, состоящих только из цифр, найти слово-палиндром. Если таких слов больше одного, найти второе из них.");
        Task8 task8 = new Task8();
        String[] words = General.inputWords();

        String s = task8.getPilondromNumberWord(words);
        if (s != null) {
            System.out.println("Результат: ");
            General.showStrings(s);
        } else System.out.println("Нет таких слов");

        General.printInfo();

    }

    /**
     * @param word source word
     * @return if word is numeric - true
     */
    public Boolean isNumericWord(String word) {
        Pattern numericPattern = Pattern.compile("[/\\d/]+");
        Matcher numericMatcher = numericPattern.matcher(word);
        if (numericMatcher.matches()) {
            return true;
        }
        return false;
    }

    /**
     * @param sourceWords source words
     * @return number words
     */
    public String[] getNumberWords(String... sourceWords) {

        List<String> result = new ArrayList<String>();
        for (String word : sourceWords) {
            if (isNumericWord(word)) {
                result.add(word);
            }
        }
        if (!result.isEmpty())
            return result.toArray(new String[0]);
        return null;
    }

    /**
     * Consisting only of digits word palindrome.If more than one of these words returns the second of them.
     *
     * @param words source words
     * @return first word-polindrom. If more than one of these words returns the second of them.
     */
    public String getPilondromNumberWord(String... words) {

        words = getNumberWords(words);
        if (words == null) return null;
        boolean isOk = true;
        List<String> result = new ArrayList<>();
        for (String word : words) {

            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                    isOk = false;
                }

            }
            if (isOk == true) {
                result.add(word);
            }
            isOk = true;

        }
        if (result.isEmpty()) return null;
        if (result.size() > 1)
            return result.get(1);


        return result.get(0);

    }
}
