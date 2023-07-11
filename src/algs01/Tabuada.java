package algs01;

import java.util.Scanner;

//Tabuada: Imprima a tabuada de um número fornecido pelo usuário.
public class Tabuada {


    public static String gerarTabuada(Integer number, char operation) {

        int sequence = 10;

        switch (operation) {
            case '+':
                for (int i = 0; i <= sequence; i++) {
                    System.out.println(number + " + " + i + " = " + (number + i));
                }
                break;
            case '-':
                for (int i = 0; i <= sequence; i++) {
                    System.out.println(number + " - " + i + " = " + (number - i));
                }
                break;
            case '*':
                for (int i = 0; i <= sequence; i++) {
                    System.out.println(number + " * " + i + " = " + (number * i));
                }
                break;
            case '/':
                for (int i = 1; i <= sequence; i++) {
                    System.out.println(number + " / " + i + " = " + (number / i));
                }
                break;
            default:
                return "Operação inválida";
        }

        return "";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um numero para gerar a tabuada: ");
        Integer number = sc.nextInt();
        System.out.println("Entre com a operacao desejada: ");
        System.out.println("+");
        System.out.println("-");
        System.out.println("*");
        System.out.println("/");
        char operation = sc.next().charAt(0);
        System.out.println(gerarTabuada(number, operation));

    }


}
