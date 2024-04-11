package com.mycompany;

import java.util.Scanner;

/**
 *
 * @author Jhonatan
 */
public class Ejercicio09SumaNumeros {

    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ejemplo();
    }

    public static final void ejemplo() {
        int numero;
        System.out.println("""
                           Programa que te muestra la suma desde 0 hasta
                           el numero Ingresao (0 para finalizar)""");
        do {
            System.out.print("Ingresa un numero: ");
            numero = sc.nextInt();
            System.out.println("Suma desde 0 hasta " + numero + " es: " + sumaR(numero));
        } while (numero != 0);
    }

    //forma de bucle
    public static int suma(int numero) {
        int suma = 0;
        int i = 0;
//        for (i = 0; i <= numero; i++) {
//            suma = suma + i;
//        }
        while (i <= numero) {
            suma = suma + i;
            i++;
        }
        return suma;
    }

    //forma recursiva
    public static int sumaR(int n) {
        if (n == 1) {
            return 1;
        }
        return n + suma(n - 1);
    }

}
