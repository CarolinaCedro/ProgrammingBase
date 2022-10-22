package algs01.Produto;

import java.math.BigDecimal;
import java.util.*;

public class Main {

    private static Set<Produto> produtos = new HashSet<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }


    public static void menu(){

        System.out.println("(1)Listar contatos");
        System.out.println("(2)Apagar contato");
        System.out.println("(3)Cadastrar contatos");
        System.out.println("(0)Sair");
        int op = sc.nextInt();

        switch (op){
            case 1:listar();
            break;
            case 2:deleteContato();
            break;
            case 3: cadastrar();
            break;
            case 4: sair();
            break;
            default:
                System.out.println("Atencao opcao nao encontrada. Saindo....");
        }
    }

    private static void sair() {
        System.out.println("Ok! saindo....");
    }

    private static void cadastrar() {
        char op;
        do {

            System.out.println("Entre com o nome do produto: ");
            String name = sc.nextLine();
            System.out.println("Entre com o preco: ");
            BigDecimal price = sc.nextBigDecimal();

            Produto produto = new Produto(name,price);
            produtos.add(produto);
            System.out.println("Cadastrado com suceso !");
            System.out.println();
            System.out.println("Deseja cadastrar um novo Produto? (y)/(n)");
            op = sc.next().charAt(0);
            sc.nextLine();
        }while (op != 'n');
    }

    private static void deleteContato() {
        System.out.println("Deletando");
    }

    private static void listar() {
        produtos.forEach(System.out::println);
    }
}
