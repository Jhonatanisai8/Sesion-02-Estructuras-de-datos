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
        String cifras;
        System.out.println("Numero invertido 0 para finalizar: ");
        do {
            System.out.print("Ingresa un numero: ");
            numero = sc.nextInt();
            System.out.println("Numero invertido es: " + invertir(numero));
            cifras = String.valueOf(numero);
        System.out.println("Numer invertido recursivo: "+invertirNumero(numero,cifras.length()-1));

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
    
    //forma recursividad 
     private static int invertirNumero(int num, int pos){
        if(num<10){
            return num;
        } else {
            return (num%10) * (int) Math.pow(10, pos) + invertirNumero(num/10, pos-1); 
        }
    }
}
