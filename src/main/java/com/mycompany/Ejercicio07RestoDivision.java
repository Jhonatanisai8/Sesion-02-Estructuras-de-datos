package com.mycompany;

import java.util.Scanner;

/**
 *
 * @author Jhonatan
 */
public class Ejercicio07RestoDivision {

    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ejemplo();
    }

    public static void ejemplo() {
        int numero1;
        int numero2;
        System.out.print("Ingresa el numero 1: ");
        numero1 = sc.nextInt();
        do {
            System.out.println("Ingresa el numero 2: (Maypr que 0)");
            numero2 = sc.nextInt();
        } while (numero1 <= 0);
        System.out.println("Residuo => " + residuoRecursivo(numero1, numero2));
    }

    //forma de bucle
    public static String calcularDivisor(int n1, int n2) {
        String mensaje;
        int cociente = 0;
        int residuo = 0;

        while (n1 >= n2) {
            cociente++;
            residuo = n1 - n2;
            n1 = n1 - n2;
        }

        mensaje = "Cociente: " + cociente
                + "\nResiduo: " + residuo;
        return mensaje;
    }

    //forma recursiva
    public static int residuoRecursivo(int numA, int numB) {
        if (numA < numB) {
            return numA;
        } else {
            numA = numA - numB;
            return residuoRecursivo(numA, numB);
        }
    }
}
