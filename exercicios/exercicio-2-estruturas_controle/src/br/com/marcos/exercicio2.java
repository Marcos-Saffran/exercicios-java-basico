package br.com.marcos;

import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int opcao = 0;
        do {
            exibirMenu();
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    calcularTabuada(input);
                    break;
                case 2:
                    calcularIMC(input);
                    break;
                case 3:
                    exibirNumerosParesImpares(input);
                    break;
                case 4:
                    verificarDivisibilidade(input);
                    break;
                case 5:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        } while (opcao != 5);

    }

    private static void calcularTabuada(Scanner input) {
        System.out.println("Digite um número para calcular a tabuada de 1 até 10:");
        int numero = input.nextInt();
        for (int i = 1; i <=10; i++){
            int resultado = i * numero;
            System.out.printf("%d x %d = %d%n", numero, i, resultado);
        }
    }

    private static void calcularIMC(Scanner input) {
        System.out.println("Ainda não implementado.");

    }

    private static void exibirNumerosParesImpares(Scanner input) {
        System.out.println("Ainda não implementado.");

    }

    private static void verificarDivisibilidade(Scanner input) {
        System.out.println("Ainda não implementado.");

    }

    private static void exibirMenu() {
        System.out.println("Olá escolha uma das opções abaixo: ");
        System.out.println("---------------------------------------------");

        System.out.println("1 - Tabuada de 1 até 10 de um número desejado");
        System.out.println("2 - Calcular o IMC (Índice de Massa Corporal)");
        System.out.println("3 - Exibir números ímpares ou pares entre dois números");
        System.out.println("4 - Informar um número inicial e ler números até que um não seja divisível pelo número inicial");
        System.out.println("5 - Sair");
        System.out.println("---------------------------------------------");
    }
}
