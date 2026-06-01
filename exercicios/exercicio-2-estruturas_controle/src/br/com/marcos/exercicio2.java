package br.com.marcos;

import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int opcao;
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
        System.out.println("Informe o seu peso em kg:");
        double peso = input.nextDouble();
        System.out.println("Informe a sua altura em metros:");
        double altura = input.nextDouble();
        var IMC = peso/(altura*altura);
        if  (IMC <= 18.5) {
            System.out.println("IMC: " + IMC + " - Abaixo do peso");
        } else if (IMC > 18.5 && IMC <= 24.9) {
            System.out.println("IMC: " + IMC + " - Peso ideal");
        } else if (IMC > 24.9 && IMC <= 29.9) {
            System.out.println("IMC: " + IMC + " - Levemente acima do peso");
        } else if (IMC > 29.9 && IMC <= 34.9) {
            System.out.println("IMC: " + IMC + " - Obesidade Grau I");
        } else if (IMC > 34.9 && IMC <= 39.9) {
            System.out.println("IMC: " + IMC + " - Obesidade Grau II (Severa)");
        } else if (IMC > 39.9) {
            System.out.println("IMC: " + IMC + " - Obesidade Grau III (Mórbida)");
        }
    }

    private static void exibirNumerosParesImpares(Scanner input) {
        System.out.println("Digite o primeiro numero:");
        int primeiroNumero = input.nextInt();
        int segundoNumero = primeiroNumero;
        while (segundoNumero <= primeiroNumero) {
            System.out.println("Digite o segundo numero (maior que o primeiro numero):");
            segundoNumero = input.nextInt();
        }
        System.out.println("Escolha uma opção: 1 - Exibir números pares, 2 - Exibir números ímpares");
        int opcao = input.nextInt();
        System.out.println("Os números " + (opcao == 1 ? "pares" : "ímpares") + " do " + segundoNumero + " ao " + primeiroNumero + " são:");
        for (int i = segundoNumero; i >= primeiroNumero; i--){
            if (opcao == 1 && i % 2 == 0) {
                System.out.println(i);
            } else if (opcao == 2 && i % 2 != 0) {
                System.out.println(i);
            }
        }

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
        System.out.println("Digite a opção desejada: ");

    }
}
