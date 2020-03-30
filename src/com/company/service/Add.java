package com.company.service;

import java.util.Scanner;

public class Add {

    public void calculateAdd(Scanner scanner) {
        System.out.println("DODAWANIE: ");
        System.out.println("Podaj pierwszą liczbę: ");
        double firstNumberAdded = scanner.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        double secondNumberAdded = scanner.nextInt();
        scanner.nextLine();
        double resultAdded = addNumber(firstNumberAdded, secondNumberAdded);
        System.out.println("Wynik dodawania: " + resultAdded);
        System.out.flush();
    }

    private double addNumber(double a, double b) {
        double result = a + b;
        return result;
    }
}
