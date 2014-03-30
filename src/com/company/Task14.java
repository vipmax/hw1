package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by max on 30.03.2014.
 */

/**
 * January, February, March, April, May, June, July, August, September, October, November, December
 */
enum Months {
    January, February, March, April, May, June, July, August, September, October, November, December;

    static Months getMonth(Integer index) {
      if(index == January.ordinal()+1) return January;
      if(index == February.ordinal()+1) return February;
      if(index == March.ordinal()+1) return March;
      if(index == April.ordinal()+1) return April;
      if(index == May.ordinal()+1) return May;
      if(index == June.ordinal()+1) return June;
      if(index == July.ordinal()+1) return July;
      if(index == August.ordinal()+1) return August;
      if(index == September.ordinal()+1) return September;
      if(index == October.ordinal()+1) return October;
      if(index == November.ordinal()+1) return November;
      if(index == December.ordinal()+1) return December;
        throw new IllegalArgumentException("Недопустимый индекс");

    }
}

public class Task14 {



    public static void main(String[] args) {
        System.out.println("14. Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу.(Осуществить проверку корректности ввода чисел)");


        Boolean ok = false;
        Pattern monthNumberPattern = Pattern.compile("[1-9][0-2]?");

        String n = null;
        while (!ok) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите номер месяца:");
                n = scanner.next(monthNumberPattern);  // InputMismatchException если не удовлетворяет регулярному выражению
                ok = true;

            } catch (InputMismatchException e) {
                System.out.println("Номер от 1 до 12");
                ok = false;

            }
        }

        if(n!=null)
            System.out.println("Номер " +n +": "+ Months.getMonth(Integer.parseInt(n)));


        General.printInfo();
    }
}
