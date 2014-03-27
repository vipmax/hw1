package com.company.Task9;

/**
 * Created by max on 27.03.2014.
 */
public class Task12 {
    public static void main(String[] args) throws InterruptedException {
        Integer count =1;
        for (int i = 0; i<5;i++) {
            for (int j=0; j<5;j++) {
                System.out.printf("%3s", count++);
                Thread.currentThread().sleep(1000);
            }
            System.out.println();
        }
  }
}
