package com.company.menu;

import com.company.exceptions.MenuChoiceException;

public enum Menu {

    EXIT(0, "Wyjście z programu: "),
    ADD(1, "'+' Dodawanie: "),
    SUBTRACT(2, "'-' Odejmowanie: "),
    MULTIPLE(3, "'*' Mnożenie: "),
    DIVIDE(4, "'/' Dzielenie: "),
    POWER_OF(5, "'^' Operacaja potęgowania: "),
    ELEMENT(6, "'√' Operacaja pierwiastkowania: "),
    RIGHT_SHIFT(7, "'>>' Operacaja przesunięcia bitowego w prawo: "),
    LEFT_SHIFT(8, "'<<' Operacja przesunięcia bitowego w lewo: "),
    CONJUNCTION_OF_BIT(9, "'&' Koniunkcja bitowa: "),
    ALTERNATIVE_OF_BIT(10, "'|' Alternatywa bitowa: "),
    BINARY_NUMERAL_SYSTEM(11, "'01001' Konwerter binarny: "),
    HEXADECIMAL_SYSTEM(12, "'7ABF' Konwerter szesnastkowy: ");

    private int option;
    private String description;

    Menu(int option, String description) {
        this.option = option;
        this.description = description;
    }

    public static Menu createFromInt(Integer option) {
        try {
            if (option >= Menu.values().length || option < 0) {
                throw new MenuChoiceException("Nie ma takiej opcji!");
            } else {
                return Menu.values()[option];
            }
        } catch (MenuChoiceException e) {
            System.out.println("Nie ma takiej opcji!");
        }
        return EXIT;
    }

    @Override
    public String toString() {
        return description + option;
    }
}