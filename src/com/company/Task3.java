package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by max on 22.03.2014.
 */
public class Task3 {
    public static void main(String[] args) {
        System.out.println("3.Ввести n строк с консоли. Вывести на консоль те строки, длина которых меньше (больше) средней, а также длину.");
        Task3 task3 = new Task3();
        String[] inputStrings = General.inputStrings();
        System.out.println("Средняя длина строк: " + General.findAVGLength(inputStrings));
        System.out.println("Строки, длина которых меньше средней:  ");
        General.showStrings(task3.getStringsLessAVGLength(inputStrings));
        System.out.println("Строки, длина которых больше средней:  ");
        General.showStrings(task3.getStringsMoreAVGLength(inputStrings));
        General.printInfo();
    }

    /**
     * @param sourceStrings source strings
     * @return strings less average length
     */
    public String[] getStringsLessAVGLength(String... sourceStrings) {

        Integer avgLenght = General.findAVGLength(sourceStrings);
        List<String> result = new ArrayList<String>();

        for (String s : sourceStrings) {
            if (s.length() < avgLenght) {
                result.add(s);
            }
        }
        return result.toArray(new String[0]);
    }

    /**
     * @param sourceStrings source strings
     * @return strings more average length
     */
    public String[] getStringsMoreAVGLength(String... sourceStrings) {

        Integer avgLenght = General.findAVGLength(sourceStrings);
        List<String> result = new ArrayList<String>();
        for (String s : sourceStrings) {
            if (s.length() > avgLenght) {
                result.add(s);
            }
        }
        return result.toArray(new String[0]);
    }
}
