package br.com.marcos;

import java.time.OffsetDateTime;
import java.util.Scanner;

public class exercicio1 {

    public static final Scanner scanner = new Scanner(System.in);

    /**
     * The main method is the entry point of the application.
     * It is where the program starts execution.
     * This method is static, which means it can be called without creating an instance of the Main class.
     * The String[] args parameter allows for command-line arguments to be passed to the program.
     */
    public static void main(String[] args) {

        exercicio01();
        exercicio02();
        exercicio03();
        exercicio04();

    }

    private static void exercicio04() {

        System.out.println("Digite o nome da primeira pessoa: ");
        String nomePrimeiroPessoa = scanner.next();

        System.out.println("Digite a idade da primeira pessoa: ");
        int idadePrimeiraPessoa = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente

        System.out.println("Digite o nome da segunda pessoa: ");
        String nomeSegundaPessoa = scanner.next();

        System.out.println("Digite a idade da segunda pessoa: ");
        int idadeSegundaPessoa = scanner.nextInt();
        scanner.nextLine();

        int diferencaDeIdade = idadePrimeiraPessoa - idadeSegundaPessoa;
        System.out.printf("A diferença de idade entre %s e %s é de %d anos. \n", nomePrimeiroPessoa, nomeSegundaPessoa, Math.abs(diferencaDeIdade));
    }

    private static void exercicio03() {
        System.out.println("Digite o base do retângulo: ");
        int base = scanner.nextInt();
        System.out.println("Digite a altura do retângulo: ");
        int altura = scanner.nextInt();
        var area = (base * altura);
        System.out.printf("A área do retângulo é %s \n", area);
    }

    private static void exercicio02() {
        System.out.println("Digite o tamanho do lado de um quadrado: ");
        int lado = scanner.nextInt();
        int area = lado * lado;
        System.out.printf("A área do quadrado é %s \n", area);
    }

    private static void exercicio01() {
        var anoAtual = OffsetDateTime.now().getYear();
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite seu ano de nascimento: ");
        int anoDeNascimento = scanner.nextInt();
        int idade = anoAtual - anoDeNascimento;
        System.out.printf("Olá %s, você tem %d anos.\n", nome, idade);
    }





}
