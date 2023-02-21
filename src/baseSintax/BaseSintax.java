package baseSintax;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaseSintax {

    /**
     * Qual a função de uma classe main em um programa java ?
     * Esse método é o ponto de partida para a execução do programa e é o primeiro a ser executado.
     * Dentro do método main, é possível incluir todas as instruções necessárias para a execução
     * do programa, como chamadas a outras classes e métodos, entrada e saída de dados, manipulação
     * de arquivos, entre outras.
     *
     * @author Carolina Cedro
     */

    public static void main(String[] args) {

        List<Pessoa> listaPessoas = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        Pessoa pessoa01 = new Pessoa("Ana","908987798","Feminino",67,false);
        Pessoa pessoa02 = new Pessoa("Marta","908987798","Feminino",67,true);
        Pessoa pessoa03 = new Pessoa("Julia","908987798","Feminino",67,false);
        Pessoa pessoa04 = new Pessoa("Lisa","908987798","Feminino",67,true);

        listaPessoas.add(pessoa01);
        listaPessoas.add(pessoa02);
        listaPessoas.add(pessoa03);
        listaPessoas.add(pessoa04);

        listaPessoas.forEach(System.out::println);


    }


}
