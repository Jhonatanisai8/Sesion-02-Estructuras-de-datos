package com.mycompany;

import java.util.Scanner;

/**
 *
 * @author Jhonatan
 */
public class Ejercicio08CifrasNumeroRecursiva {

    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ejemplo();
    }

    public static void ejemplo() {
        int numero;
        do {
            System.out.print("Ingresa un numero: (O para finalizar) ");
            numero = sc.nextInt();

            // System.out.println("Nº de digitos: " + contadorBucle(numero));
            System.out.println("Nº de digitos: " + contador(numero));

        } while (numero != 0);
    }

    //forma ciclo
    public static int contadorBucle(int numero) {
        int d;
        int c = 0;
        while (numero != 0) {
            d = numero % 10;
            numero = (numero / 10);
            c++;
        }
        return c;
    }

    //forma recursiva
    public static int contador(int numero) {
        if (numero < 10) {
            return 1;
        } 
        return 1 + contador(numero/10);
    }

}
