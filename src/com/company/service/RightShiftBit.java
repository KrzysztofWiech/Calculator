package com.company.service;
import java.util.Scanner;

public class RightShiftBit {

    public void rightShift(Scanner scanner) {
        System.out.println("Przesunięcie bitowe w prawo: ");
        System.out.println("Podaj liczbę do przesunięcia bitowego: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj o ile miejsc bitowych chcesz przesunąć liczbę: ");
        int secondNumber = scanner.nextInt();
        scanner.nextLine();
        int resultRightShift = moveToRight(firstNumber, secondNumber);
        System.out.println("Wynik przesunięcia w prawo to: " + resultRightShift);
        System.out.flush();
    }

    private int moveToRight(int a, int b) {
        int resultRightShift = a >> b;
        return resultRightShift;
    }
}
