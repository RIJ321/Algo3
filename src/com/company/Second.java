package com.company;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int val = scan.nextInt();
        int[] A = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        int pose = 0;
        boolean result = false;
        int first = 0;
        int last = A.length - 1;
        while (first <= last) {
            int middle = (first + last) / 2;
            pose++;
            if (A[middle] == val) {
                result = true;
                break;
            } else if (A[middle] > val) {
                last = middle - 1;
            } else if (A[middle] < val) {
                first = middle + 1;
            }
        }if (result) {
            System.out.println("Количество шагов:" + pose);
        }else
            System.out.println("Элемент не найден");
    }
}
