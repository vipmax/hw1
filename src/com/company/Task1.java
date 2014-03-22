package com.company;

import java.util.*;

/**@author vipmax */
public class Task1 {


    /** @param sourceStrings  vararg source strings*/
    public  void findShortestAndLongestString(String... sourceStrings) {
        String longest = sourceStrings[0];
        String shortest = sourceStrings[0];
        
        for (int i = 1; i < sourceStrings.length; i++) {
            if (shortest.length() > sourceStrings[i].length()) {
                shortest = sourceStrings[i];
            } else if (longest.length() < sourceStrings[i].length()) {
                longest = sourceStrings[i];
            }
        }
        System.out.println("Самая короткая строка : " + shortest + " длина: "
                + shortest.length());
        System.out.println("Самая длинная строка : " + longest + " длина: "
                + longest.length());
    }
    
    
    /** @return result strings*/
    public  String[] inputStrings(){
	Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк:");
        int n = scanner.nextInt();
	
        System.out.println("Введите строки:");

     	String[] result = new String[n];
        scanner.nextLine();                 //"" wtf?????
        for (int i = 0; i < n; i++) {
           result[i] = scanner.nextLine();
           if(n-i-1>0)
            System.out.println("Прекрасно! осталось еще " + (n-i-1) );
           if(n-i-1==0)
               System.out.println("Прекрасно!");
        }
	
	
	return result;
    }

    public static void main(String... args) {
        Task1 task = new Task1();
	    task.findShortestAndLongestString(task.inputStrings());
    }
}

