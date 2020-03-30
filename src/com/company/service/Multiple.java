package com.company.service;

import java.util.Scanner;

public class Multiple {

    public void calculateMultiple(Scanner scanner) {
        System.out.println("MNOŻENIE: ");
        System.out.println("Podaj pierwszą liczbę: ");
        double firstNumberMultiple = scanner.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        double secondNumberMultiple = scanner.nextInt();
        scanner.nextLine();
        double resultMultiple = multipleNumber(firstNumberMultiple, secondNumberMultiple);
        System.out.println("Wynik mnożenia to: " + resultMultiple);
        System.out.flush();
    }

    private double multipleNumber(double a, double b) {
        double result = a * b;
        return result;
    }
}
