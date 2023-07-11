package algs01;

import java.util.Scanner;

//Números Primos em um Intervalo: Encontre e imprima todos os números primos em um intervalo dado.
public class NumerosPrimos {


    public static boolean isPrimo(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void achandoNumeroPrimo(int intervalo01, int intervalor02) {
        int inicial = Math.min(intervalo01, intervalor02);
        int intervaloFinal = Math.max(intervalo01, intervalor02);

        for (int i = inicial; i <= intervaloFinal; i++) {
            if (isPrimo(i)) {
                System.out.println(i + " é um número primo");
            }
        }
    }

    public static void main(String[] args) {
        achandoNumeroPrimo(1, 100);
    }

}
