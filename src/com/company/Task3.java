package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by max on 22.03.2014.
 */
public class Task3 {

    public String[] getStringsLessAVGLenght(String... sourseStrings) {

        Integer avgLenght = General.findAVGLength(sourseStrings);
        List<String> result = new ArrayList<String>();

        for (String s : sourseStrings) {
            if (s.length() < avgLenght) {
                result.add(s);
            }
        }
        return result.toArray(new String[0]);
    }

    public String[] getStringsMoreAVGLenght(String... sourseStrings) {

        Integer avgLenght = General.findAVGLength(sourseStrings);
        List<String> result = new ArrayList<String>();

        for (String s : sourseStrings) {
            if (s.length() > avgLenght) {
                result.add(s);
            }
        }
        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        System.out.println("3.Ввести n строк с консоли. Вывести на консоль те строки, длина которых меньше (больше) средней, а также длину.");
        Task3 task3 = new Task3();
        String[] inputStrings = General.inputStrings();
        System.out.println("Средняя длина строк: " + General.findAVGLength(inputStrings));
        System.out.println("Строки, длина которых меньше средней:  ");
        General.showStrings(task3.getStringsLessAVGLenght(inputStrings));
        System.out.println("Строки, длина которых больше средней:  ");
        General.showStrings(task3.getStringsMoreAVGLenght(inputStrings));
        General.printInfo();
    }
}
