package com.mycompany;

/**
 *
 * @author Jhonatan
 */
public class Ejercicio11MaximoMinimoArray {

    public static void main(String[] args) {
        ejemplo();
    }

    private static void ejemplo() {
        int arreglo[] = {99995, 7, 5, 678,1 ,-3,3, 4, 8, 7654,1,234567};
        System.out.println("Maximo Numero del Vector: " + maximoMinimo(arreglo, 0));
        System.out.println("Maximo : " + maiximo(arreglo, 0, arreglo[0]));
        System.out.println("Minimo: "+minimo(arreglo, 0, arreglo[0]));
    }

    //forma bucle
    private static int maximoMinimo(int arreglo[], int pos) {
        int mayor = arreglo[pos];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > mayor) {
                mayor = arreglo[i];
            }
        }
        return mayor;
    }

    //forma recursiva
    private static int maiximo(int arreglo[], int indice, int max) {
        if (indice == arreglo.length) {

        } else {
            if (arreglo[indice] > max) {
                max = maiximo(arreglo, indice + 1, arreglo[indice]);
            } else {
                max = maiximo(arreglo, indice + 1, max);
            }
        }
        return max;
    }

    private static int minimo(int arreglo[], int indice, int max) {
        if (indice == arreglo.length) {
            
        } else {
            if (arreglo[indice] < max) {
                max = minimo(arreglo, indice + 1, arreglo[indice]);
            } else {
                max = minimo(arreglo, indice + 1, max);
            }
        }
        return max;
    }

}
