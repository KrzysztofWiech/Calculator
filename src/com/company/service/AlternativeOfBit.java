package com.company.service;

import java.util.Scanner;

public class AlternativeOfBit {

    public void alternativeBits(Scanner scanner) {
        System.out.println("Alternatywa bitowa: ");
        System.out.println("Podaj pierwszą liczbę: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int secondNumber = scanner.nextInt();
        scanner.nextLine();
        int resultAlternative = alternativeBit(firstNumber, secondNumber);
        System.out.println("Wynik alternatywy to: " + resultAlternative);
        System.out.flush();
    }

    private int alternativeBit(int a, int b) {
        int result = a | b;
        return result;
    }
}

