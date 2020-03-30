package com.company.service;

import java.util.Scanner;

public class Element {

    public void calculateElement(Scanner scanner) {
        System.out.println("PIERWIASTEK: ");
        System.out.println("Podaj liczbę: ");
        double elementNumber = scanner.nextInt();
        scanner.nextLine();
        double resultElement = calculateElement(elementNumber);
        System.out.println("Pierwiastek z: " + elementNumber + " to: " + resultElement);
        System.out.flush();
    }

    private double calculateElement(double a) {
        return Math.sqrt(a);
    }
}
