package com.mycompany;

import java.util.Scanner;

/**
 *
 * @author Jhonatam
 */
public class Ejercicio10InvertirNumero {

    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ejemplo();
    }

    public static void ejemplo() {
        int numero;
        System.out.println("Numero invertido 0 para finalizar: ");
        do {
            System.out.print("Ingresa un numero: ");
            numero = sc.nextInt();
            System.out.println("Numero invertido es: " + invertir(numero));

        } while (numero != 0);
    }

    //forma bucle
    public static int invertir(int numero) {
        int invertido = 0;
        while (numero > 0) {
            invertido = invertido * 10 + numero % 10;
            numero = numero / 10;
        }
        return invertido;
    }
}
