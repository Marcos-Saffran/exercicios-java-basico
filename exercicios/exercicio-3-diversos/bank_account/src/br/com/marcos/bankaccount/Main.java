package br.com.marcos.bankaccount;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        scanner.useDelimiter("\\n");
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.of("pt", "BR"));


        var option = -1;

        System.out.println("Bem-vindo ao Banco do XYZ!");
        System.out.println("Vamos criar uma conta para você. Por favor, informe seu nome:");
        String name = scanner.next();
        System.out.println("Olá, " + name + "! Agora, informe o valor inicial para a sua conta:");
        double initialBalance = scanner.nextDouble();

        Account conta = new Account(name, initialBalance);

        do {
            System.out.println("===Escolha uma das opções===");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Sacar dinheiro");
            System.out.println("5 - Pagar um boleto");
            System.out.println("6 - Verificar se a contar está usando cheque especial");
            System.out.println("0 - sair");
            option = scanner.nextInt();

            switch (option) {
                case 1 -> System.out.println("Saldo atual: " + format.format(conta.checkBalance()));
                case 2 -> conta.checkOverdraftLimit();
                case 3 -> deposit(conta);
                case 4 -> withdraw(conta);
                case 5 -> payABill(conta);
                case 6 -> isUsingOverdraft(conta);
                case 0 -> System.exit(0);
                default -> System.out.println("Opção inválida, tente novamente.");
            }
        } while (true);

    }

    private static void isUsingOverdraft(Account conta) {
        var message = conta.isUsingOverdraft() ? "A conta está usando o cheque especial" : "A conta não está usando o cheque especial";
        System.out.println(message);
    }

    private static void payABill(Account account) {
        System.out.println("Digite o valor do boleto que deseja pagar: ");
        double valor = scanner.nextDouble();

        account.pay(valor);
    }

    private static void deposit(Account account) {
        System.out.println("Digite o valor que deseja depositar: ");
        double valor = scanner.nextDouble();

        account.deposit(valor);
    }

    private static void withdraw(Account account) {
        System.out.println("Digite o valor que deseja sacar: ");
        double valor = scanner.nextDouble();

        account.withdraw(valor);
    }

}

