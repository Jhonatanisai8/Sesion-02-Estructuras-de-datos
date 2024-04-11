package com.mycompany;

import java.util.Scanner;

/**
 *
 * @author Jhonatan
 */
public class Ejercicio06CalcularCociente {

    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ejemplo();
    }

    public static void ejemplo() {
        int numero1;
        int numero2;

        //pedimos los numeros
        System.out.print("Ingrese el primer numero: ");
        numero1 = sc.nextInt();
        do {
            System.out.print("Ingrese el segundo numero: (Mayor que 0) ");
            numero2 = sc.nextInt();
        } while (numero1 <= 0);
        // String mensaje = calcularDivisor(numero1, numero2);

        //System.out.println(mensaje);
        // int cociente = calcularDivisrRecursivo(numero1, numero2);
        //System.out.println("Cociente: "+cociente);
        System.out.printf("%d/%d = %d %n", numero1, numero2, calcularDivisrRecursivo(numero1, numero2));
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
    public static int calcularDivisrRecursivo(int n1, int n2) {
        if (n1 < n2) {
            return 0;
        } else {
            return 1 + calcularDivisrRecursivo(n1 - n2, n2);
        }
    }

}
