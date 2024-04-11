package com.mycompany;

import java.util.Scanner;

/**
 *
 * @author Jhonatan
 */
public class Ejericio04DecimalABinario {

    static final Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        ejemplo();
    }

    public static void ejemplo() {
        int numero;
        do {
            System.out.println("Ingresa un numero: (0 para finalizar)");
            numero = leer.nextInt();
            // System.out.println("El numero en binario de: " + numero + " es: ");
            // decimalBinarioRecursivo(numero);
            decimalBinarioBucle(numero);
            System.out.println("");
        } while (numero != 0);
    }

    public static void decimalBinarioRecursivo(int numero) {
        if (numero < 2) {
            System.out.print(numero);
        } else {
            decimalBinarioRecursivo(numero / 2);
            System.out.print(numero % 2);
        }
    }

    //ejemplo con bucle
    public static void decimalBinarioBucle(int numero) {
        int exp = 0;
        double binario = 0;
        int digito;
        while (numero != 0) {
            digito = numero % 2;
            binario = (binario + digito * Math.pow(10, exp));
            exp++;
            numero = numero / 2;
        }
        System.out.printf("Binario: %.0f %n", binario);
    }
}
