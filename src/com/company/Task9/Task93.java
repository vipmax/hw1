package com.company.Task9;

/**
 * Created by max on 23.03.2014.
 */

import com.company.General;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by max on 22.03.2014.
 */
public class Task93 {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Нет аргументов командной строки");
            return;
        }

        Task93 task93 = new Task93();
        String[] inputStrings = args;
        System.out.println("Средняя длина строк: " + General.findAVGLength(inputStrings));
        System.out.println("Строки, длина которых меньше средней:  ");
        General.showStrings(task93.getStringsLessAVGLenght(inputStrings));
        System.out.println("Строки, длина которых больше средней:  ");
        General.showStrings(task93.getStringsMoreAVGLenght(inputStrings));
        General.printInfo();

    }

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
}
