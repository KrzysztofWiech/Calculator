package com.company.service;

import java.util.Scanner;

public class PowerOf {

    public void calculatePower(Scanner scanner) {
        System.out.println("POTĘGOWANIE: ");
        System.out.println("Podaj liczbę którą chcesz spotęgować: ");
        double firstNumberPower = scanner.nextInt();
        System.out.println("Podaj potęgę: ");
        double secondNumberPower = scanner.nextInt();
        scanner.nextLine();
        double resultPower = calculatePowerOf(firstNumberPower, secondNumberPower);
        System.out.println("Wynik potęgowania to: " + resultPower);
        System.out.flush();
    }

    private double calculatePowerOf(double firstInput, double secondInput) {
        double result = 1;
        for (double i = 0; i < secondInput; i++) {
            result = result * firstInput;
        }
        return result;
    }
}
