package com.company.service;

import java.util.Scanner;

public class HexConvert {

    public void hexConversion(Scanner scanner) {
        System.out.println("Przeliczanie dziesiętne na system szesnastkowy: ");
        System.out.println("Podaj liczbę: ");
        int input = scanner.nextInt();
        scanner.nextLine();
        String result = toHex(input);
        System.out.println("Wynik: " + result);

        System.out.flush();
    }

    private String toHex(int input) {
        int rem;
        StringBuilder hex = new StringBuilder();
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (input > 0) {
            rem = input % 16;
            hex.insert(0, hexChars[rem]);
            input = input / 16;
        }
        return hex.toString();
    }

}
