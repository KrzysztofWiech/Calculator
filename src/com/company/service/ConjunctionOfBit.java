package com.company.service;

import java.util.Scanner;

public class ConjunctionOfBit {

    public void conjunctionBits(Scanner scanner) {
        System.out.println("Koniunkcja bitowa: ");
        System.out.println("Podaj pierwszą liczbę: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int secondNumber = scanner.nextInt();
        scanner.nextLine();
        int resultConjunction = conjunctionBit(firstNumber, secondNumber);
        System.out.println("Wynik koniunkcji to: " + resultConjunction);
        System.out.flush();
    }

    private int conjunctionBit(int a, int b) {
        int result = a & b;
        return result;
    }
}
