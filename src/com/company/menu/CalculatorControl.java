package com.company.menu;

import com.company.service.*;

import java.util.Scanner;

public class CalculatorControl {

    private Add add = new Add();
    private Subtract subtract = new Subtract();
    private Multiple multiple = new Multiple();
    private Element element = new Element();
    private Divide divide = new Divide();
    private PowerOf powerOf = new PowerOf();
    private RightShiftBit rightShiftBit = new RightShiftBit();
    private LeftShiftBit leftShiftBit = new LeftShiftBit();
    private ConjunctionOfBit conjunctionOfBit = new ConjunctionOfBit();
    private AlternativeOfBit alternativeOfBit = new AlternativeOfBit();
    private BinaryConvert binaryConvert = new BinaryConvert();
    private HexConvert hexConvert = new HexConvert();
    private Scanner scanner = new Scanner(System.in);

    public void controlLoop() {
        Menu menu;
        printMenu();
        while ((menu = Menu.createFromInt(getInt())) != Menu.EXIT) {
            switch (menu) {
                case ADD:
                    add.calculateAdd(scanner);
                    break;
                case SUBTRACT:
                    subtract.calculateSubtract(scanner);
                    break;
                case MULTIPLE:
                    multiple.calculateMultiple(scanner);
                    break;
                case DIVIDE:
                    divide.calculateDivide(scanner);
                    break;
                case POWER_OF:
                    powerOf.calculatePower(scanner);
                    break;
                case ELEMENT:
                    element.calculateElement(scanner);
                    break;
                case RIGHT_SHIFT:
                    rightShiftBit.rightShift(scanner);
                    break;
                case LEFT_SHIFT:
                    leftShiftBit.leftShift(scanner);
                    break;
                case CONJUNCTION_OF_BIT:
                    conjunctionOfBit.conjunctionBits(scanner);
                    break;
                case ALTERNATIVE_OF_BIT:
                    alternativeOfBit.alternativeBits(scanner);
                    break;
                case BINARY_NUMERAL_SYSTEM:
                    binaryConvert.binarySystem(scanner);
                    break;
                case HEXADECIMAL_SYSTEM:
                    hexConvert.hexConversion(scanner);
                    break;
                case EXIT:
                    scanner.close();
            }
            printMenu();
        }
    }

    private int getInt() {
        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }

    private void printMenu() {
        System.out.println();
        System.out.println("Wybierz numer: ");
        for (Menu menu : Menu.values()) {
            System.out.println(menu);
        }
    }
}
