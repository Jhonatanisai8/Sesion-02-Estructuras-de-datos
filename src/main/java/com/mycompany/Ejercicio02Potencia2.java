package com.mycompany;

import javax.swing.JOptionPane;

/**
 *
 * @author Jhonatan
 */
public class Ejercicio02Potencia2 {

    public static void main(String[] args) {
        ejercicio2();
    }

    public static void ejercicio2() {
        int potencia;
        do {
            potencia = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un numero (0 para terminar)", "INGRESANDO DATOS", 2));
            JOptionPane.showMessageDialog(null, "2 elevado a la Potencia de: " + potencia + " es: " + pottencia(potencia), "Total", 2);
        } while (potencia != 0);
    }

    public static int pottencia(int poten) {
        if (poten == 0) {
            return 1;
        } else {
            return 2 * pottencia(poten - 1);
        }
    }

}
