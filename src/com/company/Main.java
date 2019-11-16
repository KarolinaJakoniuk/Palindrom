package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Podaj słowo aby sprawdzić czy jest palindromem: ");
        String słowo;
        słowo = scanner.next();
        int a = słowo.length();

        int kk = 0;
        int k = (a - 1);
        for (int i = 0; i < a; i++) {
            if (słowo.charAt(i) != słowo.charAt(k)) {
                kk = 1;
                break;
            }
            k--;
        }
        if (k == 1) {
            System.out.println("Słowo nie jest palindromem");
        } else {
            System.out.println("Słowo jest palindromem");
        }

    }
}
