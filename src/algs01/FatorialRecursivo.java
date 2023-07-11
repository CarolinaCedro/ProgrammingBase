package algs01;

//Fatorial Recursivo: Calcule o fatorial de um número de forma recursiva.
public class FatorialRecursivo {


    public static int fatorial(int number) {
        if (number == 0) {
            return 1;
        } else {
            return number * fatorial(number - 1);
        }
    }

    public static void main(String[] args) {
        int number = 5;
        int resultado = fatorial(number);
        System.out.println("O fatorial de " + number + " é: " + resultado);
    }


}
