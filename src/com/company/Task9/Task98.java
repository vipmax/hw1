package com.company.Task9;

import com.company.General;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by max on 23.03.2014.
 */
public class Task98 {

    /**
     *
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
     *
     * @param sourceWords source words
     * @return  number words
     */
    public String[] getNumberWords(String... sourceWords) {

        List<String> result = new ArrayList<String>();
        for (String word : sourceWords) {
            if (isNumericWord(word)) {
                result.add(word);
            }
        }
        return result.toArray(new String[0]);
    }

    /**
     * Consisting only of digits word palindrome.If more than one of these words returns the second of them.
     * @param words source words
     * @return first word-polindrom.If more than one of these words returns the second of them.
     */
    public String getPilondromNumberWord(String... words) {

        words = getNumberWords(words);
        boolean isOk = true;
        List<String> result = new ArrayList<>();
        for (String word : words) {

            for (int i = 0;i<word.length() ; i++) {
//                System.out.println(word.charAt(i)+" = " +word.charAt(word.length()-i-1)+ " "+ new Boolean(word.charAt(i)==word.charAt(word.length()-i-1)).toString());
                if(word.charAt(i)!=word.charAt(word.length()-i-1)){
                    isOk=false;
                }

            }
//            System.out.println(isOk);
            if(isOk == true) {
                result.add(word);
            }
            isOk = true;
//            System.out.println("");
        }
        if (result.size()>1)
            return result.get(1);


        return result.get(0);

    }



    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("Нет аргументов командной строки");
            return;
        }
        Task98 task98 = new Task98();
        String[] words = args;
        General.showStrings(task98.getPilondromNumberWord(words));
        General.printInfo();
    }
}
