package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int val = scan.nextInt();
        int N = 500;
        int[] A = {12,412,346,123,34};
        boolean resultOk = false;
        int pose = -1;


        for (int i = 0; i < A.length &&  pose == -1; i++) {
            if (A[i] == val) {
                pose = i;
                resultOk = true;
                break;
            }
        }

        if (resultOk){
            System.out.println("Элемент найден " + (pose+1));
        }else System.out.println("Элемент не найден");

    }


}

