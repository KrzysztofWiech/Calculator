package com.company.service;

import java.util.Scanner;

public class BinaryConvert {

    public void binarySystem(Scanner scanner) {
        System.out.println("Przeliczanie dziesiętne na system binarny: ");
        System.out.println("Podaj liczbę: ");
        int input = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Wynik: ");
        calculateToBinarySystem(input);

        System.out.flush();
    }

    private int[] calculateToBinarySystem(int input) {
        int[] binary = new int[40];
        int index = 0;
        while (input > 0) {
            binary[index++] = input % 2;
            input = input / 2;
        }
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
            System.out.println();
        }
        return binary;
    }
}
