package com.mycompany;

import javax.swing.JOptionPane;

/**
 *
 * @author Jhonatan
 */
public class Ejercicio01Factorial {

    public static void main(String[] args) {
        ejercio01();
    }

    public static void ejercio01() {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un numero: ", "CALCULAR EL FACTORIAL", 3));
        JOptionPane.showMessageDialog(null, "Factorial del numero: " + numero + " es: " + factorial(numero), "TOTAL", 2);
    }

    //metodo para calcular el factorial
    public static int factorial(int numero) {
        if (numero < 0) {
            return 1;
        } else {
            if (numero == 1) {
                return 1;
            } else {
                return numero * factorial(numero - 1);
            }
        }
    }
}
