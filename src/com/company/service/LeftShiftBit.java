package com.company.service;

import java.util.Scanner;

public class LeftShiftBit {

    public void leftShift(Scanner scanner) {
        System.out.println("Przesunięcie bitowe w lewo: ");
        System.out.println("Podaj liczbę do przesunięcia bitowego: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj o ile miejsc bitowych chcesz przesunąć liczbę: ");
        int secondNumber = scanner.nextInt();
        scanner.nextLine();
        int resultRightShift = moveToLeft(firstNumber, secondNumber);
        System.out.println("Wynik przesunięcia w prawo to: " + resultRightShift);
        System.out.flush();
    }

    private int moveToLeft(int a, int b) {
        int resultLeftShift = a << b;
        return resultLeftShift;
    }

}
