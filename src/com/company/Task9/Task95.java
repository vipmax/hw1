package com.company.Task9;

import com.company.General;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by max on 23.03.2014.
 */
public class Task95 {

    /**
     *
     * @param sourceWords source words
     * @return latin words
     */
    public String[] getLatinWords(String... sourceWords) {
        Pattern latinPattern = Pattern.compile("[a-z]+");
        List<String> result = new ArrayList<String>();
        for (String word : sourceWords) {
            Matcher latinMatcher = latinPattern.matcher(word.toLowerCase());
            if (latinMatcher.matches()) {
                result.add(word);
            }
        }
        return result.toArray(new String[0]);
    }

    /**
     * Number of words containing only Latin letters, and among them the number of words with an equal number of vowels and consonants
     * @param sourceWords source words
     * @return count of that strings
     */
    public Integer findThatStrings(String...sourceWords){
        String[] words = getLatinWords(sourceWords);

        List<String> result = new ArrayList<String>();
        int vowelsCount=0, consonantsCount=0;

        for (String word : words) {
            vowelsCount = word.replaceAll("[^aeiou]", "").length();
            consonantsCount = word.replaceAll("[aeiou]", "").length();
            if (vowelsCount == consonantsCount) {
                result.add(word);
                System.out.println((word + "(" + vowelsCount + ", " + consonantsCount + "), "));
            }
        }
        return result.size();
    }

    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("Нет аргументов командной строки");
            return;
        }
        Task95 task95 = new Task95();
        String[] str = args;
        System.out.println("Количество слов, содержащих только символы латинского алфавита, а среди них – количество слов с равным числом гласных и согласных букв: ");
        System.out.println(task95.findThatStrings(str));
        General.printInfo();

    }
}
