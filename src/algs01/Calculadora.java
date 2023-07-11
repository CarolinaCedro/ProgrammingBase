package algs01;

import java.text.DecimalFormat;
import java.util.Scanner;

//Calculadora Simples: Implemente as operações básicas de uma calculadora (adição, subtração, multiplicação, divisão).
public class Calculadora {


    public static Double process(Double firstNumber, Double secondNumber, char operation) {
        switch (operation) {
            case '+':
                return firstNumber + secondNumber;
            case '-':
                return firstNumber - secondNumber;
            case '*':
                return firstNumber * secondNumber;
            case '/':
                if (secondNumber == 0) {
                    throw new IllegalArgumentException("Divisão por zero não é permitida.");
                }
                return firstNumber / secondNumber;
            default:
                throw new IllegalArgumentException("Operação inválida.");
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo a calculadora");
        System.out.println("entre com o primeiro numero : ");
        Double numOne = sc.nextDouble();
        System.out.println("entre com o segundo numero : ");
        Double numTwo = sc.nextDouble();
        System.out.println("entre com a operacao: ");
        System.out.println("(+)");
        System.out.println("(-)");
        System.out.println("(*)");
        System.out.println("(/)");
        char operation = sc.next().charAt(0);

        Double result = process(numOne, numTwo, operation);
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        String formattedResult = decimalFormat.format(result);

        System.out.printf("O resultado da sua operação é: %s", formattedResult);

    }

}
