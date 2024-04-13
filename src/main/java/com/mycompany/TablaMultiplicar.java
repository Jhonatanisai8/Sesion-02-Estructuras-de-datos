package com.mycompany;

import java.util.Scanner;

/**
 *
 * @author Jhonatan
 */
public class TablaMultiplicar {

    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ejemplo();
    }

    public static void ejemplo() {

        multiplicacion();
    }

    public static void multiplicacion() {
        for (int i = 1; i <= 15; i++) {
            for (int j = 1; j < 15; j++) {
                System.out.println(i + " X " + j + " = " + (i*j));
            }
            System.out.println("");
        }
    }
}
