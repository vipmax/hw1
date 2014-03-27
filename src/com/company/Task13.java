package com.company;

/**
 * Created by max on 27.03.2014.
 */
public class Task13 {
    public static void main(String[] args) {
        if(args.length<3){
            System.out.println("неверно введены коэффициенты ");
            return;
        }
        Double a=Double.valueOf(args[0]),b= Double.valueOf(args[1]),c= Double.valueOf(args[2]);

        System.out.println("("+ a +")x^2 + (" + b + ")x + " + c + "=0");

        System.out.println("Решение : ");

        System.out.println("D = "+ (b * b - 4 * a * c));
        if((b * b - 4 * a * c) <0){
            System.out.println("Реальных корней нет ");
            return;
        }
        double x1 = (-b+Math.sqrt(b * b - 4 * a * c))/(2*a);
        double x2 = (-b-Math.sqrt(b * b - 4 * a * c))/(2*a);
        System.out.println("x1 = "+x1);
        System.out.println("x2 = "+x2);
    }
}
