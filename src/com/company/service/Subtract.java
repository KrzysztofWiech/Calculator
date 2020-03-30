package com.company.service;

import java.util.Scanner;

public class Subtract {

    public void calculateSubtract(Scanner scanner) {
        System.out.println("ODEJMOWANIE: ");
        System.out.println("Podaj pierwszą liczbę: ");
        double firstNumberSubtract = scanner.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        double secondNumberSubtract = scanner.nextInt();
        scanner.nextLine();
        double resultSubtract = subtractNumber(firstNumberSubtract, secondNumberSubtract);
        System.out.println("Wynik odejmowania to: " + resultSubtract);
        System.out.flush();
    }

    private double subtractNumber(double a, double b) {
        double resultSubtract = a - b;
        return resultSubtract;
    }
}
