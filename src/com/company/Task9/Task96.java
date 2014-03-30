package com.company.Task9;

import com.company.General;

/**
 * Created by max on 23.03.2014.
 */
public class Task96 {
    /**
     * The first word in which the characters are strictly increasing order of their codes
     * @param  sourceWords source words
     * @return that wofd
     */
    public String wordSymbolCodeAsk(String... sourceWords) {
        Boolean isConditoinOk =true;

        for (String word : sourceWords) {
//            showWordCodeSymbol(word);
            for(int i=0; i< word.length()-1;++i){

                if(((int)word.charAt(i))>((int)word.charAt(i+1)))
                {
                    isConditoinOk = false;
                }
            }

            if (isConditoinOk){
                return  word;
            }
            isConditoinOk=true;
        }
        return null;
    }

    /**
     * show Word Code Symbol
     * @param word source word
     */
    public void showWordCodeSymbol(String word){
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i) +" code " + (int)word.charAt(i));
        }

    }

    /**
     * show Words Code Symbol
     * @param words source words
     */
    public void showWordsCodeSymbol(String... words){

        for (String word: words) {
            showWordCodeSymbol(word);
            System.out.println("");
        }

    }


    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("Нет аргументов командной строки");
            return;
        }
        Task96 task96 = new Task96();
        String[] words = args;
        task96.showWordsCodeSymbol(words);
        String word = task96.wordSymbolCodeAsk(words);
        System.out.println("Первое слово, символы в котором идут в строгом порядке возрастания их кодов: " + word);
        task96.showWordsCodeSymbol(word);
        General.printInfo();


    }

}
