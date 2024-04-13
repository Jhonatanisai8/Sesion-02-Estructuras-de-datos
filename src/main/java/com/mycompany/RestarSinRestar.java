package com.mycompany;

import java.util.Scanner;

/**
 *
 * @author Jhpnatan
 */
public class RestarSinRestar {

    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ejemplo();
    }

    public static void ejemplo() {
        int numero1, numero2;
        System.out.print("Ingresa un numero: ");
        numero1 = sc.nextInt();
        System.out.print("Ingresa otro numero: ");
        numero2 = sc.nextInt();
        System.out.println("Resta : " + restar(numero1, numero2));
    }

    //funcion
    public static int restar(int n1, int n2) {
        int value = 0;
        while (n1 > n2) {
            n2++;
            value++;            
        }
        return value;
    }
}
