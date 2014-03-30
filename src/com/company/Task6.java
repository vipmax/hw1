package com.company;

/**
 * Created by max on 23.03.2014.
 */
public class Task6 {
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
        System.out.println("6.Ввести n слов с консоли. Найти слово, символы в котором идут в строгом порядке возрастания их кодов.Если таких слов несколько, найти первое из них.");
        Task6 task6 = new Task6();
        String[] words = General.inputWords();
        task6.showWordsCodeSymbol(words);
        String word = task6.wordSymbolCodeAsk(words);
        System.out.println("Первое слово, символы в котором идут в строгом порядке возрастания их кодов: "+ word);
        task6.showWordsCodeSymbol(word);
        General.printInfo();


    }


}
