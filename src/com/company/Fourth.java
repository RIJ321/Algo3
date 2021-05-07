package com.company;

import java.util.Scanner;

public class Fourth {

    static boolean perfect(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == num)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("min value:");
        int start = obj.nextInt();
        System.out.println("max value:");
        int max = obj.nextInt();
        for (int i = start; i <= max; i++) {
            if (perfect(i))
                System.out.println(i);
        }
    }
        //сложность алгоритма O (max * num)
}
