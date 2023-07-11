package algs01;


import java.util.Scanner;

//S = (N * (N + 1)) / 2
//Soma dos Números Naturais: Calcule a soma dos números naturais de 1 a N.
public class SumNumberNaturals {


    public static Double sumNumber(Double number) {


        if (number == 0) {
            System.out.println("Numero não pode ser 0");
        }
        return (number * (number + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Entre com um numero: ");
        Double number = sc.nextDouble();
        System.out.println("a soma dos numeros naturais é: " + sumNumber(number));

    }
}
