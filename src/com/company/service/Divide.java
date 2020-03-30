package com.company.service;

import com.company.exceptions.DivideByZeroException;

import java.util.Scanner;

public class Divide {

    public void calculateDivide(Scanner scanner) {
        System.out.println("DZIELENIE: ");
        System.out.println("Podaj pierwszą liczbę: ");
        double firstNumberDivide = scanner.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        double secondNumberDivide = scanner.nextInt();
        scanner.nextLine();
        try {
            if (secondNumberDivide == 0) {
                throw new DivideByZeroException("Wyjątek dzielenia przez zero");
            } else {
                double resultDivide = divideNumber(firstNumberDivide, secondNumberDivide);
                System.out.println("Wynik dzielenia to: " + resultDivide);
                System.out.flush();
            }
        } catch (DivideByZeroException e) {
            System.out.println("Nie mozna dzielic przez zero!");

        }
    }

    private double divideNumber(double a, double b) {
        double resultDivide = a / b;
        return resultDivide;
    }
}
