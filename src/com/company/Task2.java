package com.company;

import java.util.ArrayList;
import java.util.List;

public class Task2{
    private String[] str;
    public String[] getStr(){
            return str;
    }
    
    public Task2(){
    
    }
    public Task2(String...str){
    this.str = str;
    }
    public class MyComparator implements java.util.Comparator<String> {

    private int referenceLength;

       

        public int compare(String s1, String s2) {
                            int dist1 = Math.abs(s1.length() - referenceLength);
                            int dist2 = Math.abs(s2.length() - referenceLength);

                            return dist1 - dist2;
        }
    }

    public String[] sortStrings(String... sourceStrings){
            List<String> listString = new ArrayList<String>();
            
            for(String str : sourceStrings){
                listString.add(str);                
            }
            
            java.util.Collections.sort(listString, new MyComparator());
            
            System.out.println("Сортировка по длине : "+listString);
            
            return toStringArray(listString);
    }
     public static String[] toStringArray(java.util.Collection<String> list) {
        String[] result = new String[list.size()];
        java.util.Iterator<String> it = list.iterator();
        for (int i = 0; i < list.size(); i++) {
            result[i] = it.next();
        }
        return result;
    }
    public static void showStrings(String...strings){
                 for(String str : strings){
                       System.out.println(str);          
                  }
    }
    public static void main(String...args){
               Task1 task1 = new Task1();
               Task2 task2 = new Task2(task1.inputStrings());
               
               
               task2.sortStrings(task2.getStr());
        
    }
}
