package br.com.marcos.bankaccount;

import java.text.NumberFormat;
import java.util.Locale;

public class Account {

    private final String _ClientName;

    private double balance;

    private final double overdraftLimit;

    public Account(String ClientName, double balance) {
        _ClientName = ClientName;
        this.balance = balance;
        if (balance <= 500){
            overdraftLimit = 50.0d;
        } else {
            overdraftLimit = balance * 0.5;
        }
    }

    public double checkBalance() {
        return this.balance + overdraftLimit;

    }

    public void deposit(double amount) {
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.of("pt", "BR"));
        if (amount > 0) {
            balance += amount;
            System.out.println("Depósito de " + format.format(amount) + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido. O valor deve ser positivo.");
        }

    }

    public void checkOverdraftLimit() {
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.of("pt", "BR"));
        System.out.println("Limite de cheque especial: " + format.format(overdraftLimit));
    }

    public void withdraw(double amount) {
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.of("pt", "BR"));

        if (amount > 0) {
            if (amount <= balance + overdraftLimit) {
                balance -= amount;
                System.out.println("Saque de " + format.format(amount) + " realizado com sucesso.");
            } else {
                System.out.println("Saldo insuficiente para realizar o saque.");
            }
        } else {
            System.out.println("Valor de saque inválido. O valor deve ser positivo.");
        }

    }

    public boolean isUsingOverdraft() {
        return balance < 0;
    }

    public void pay(double amount) {
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.of("pt", "BR"));

        if (amount > 0) {
            if (amount <= balance + overdraftLimit) {
                balance -= amount;
                System.out.println("Pagamento de " + format.format(amount) + " realizado com sucesso.");
            } else {
                System.out.println("Saldo insuficiente para realizar o pagamento.");
            }
        } else {
            System.out.println("Valor de pagamento inválido. O valor deve ser positivo.");
        }
    }
}
