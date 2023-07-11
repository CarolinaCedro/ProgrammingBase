package algs01;

import java.util.Scanner;

//2. Verificação de Número Par: Verifique se um número é par ou ímpar.

public class ParOrImpar {

    public static String parOrImpar(Integer number) {

        if (number % 2 == 0) {
            return "O numero " + number + " e um numero Par";
        }
        return "O numero " + number + " e um numero Impar";
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um numero: ");
        Integer number = sc.nextInt();
        System.out.println(parOrImpar(number));
    }


}
