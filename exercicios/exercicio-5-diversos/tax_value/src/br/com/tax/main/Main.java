package br.com.tax.main;

import br.com.tax.taxes.Clothing;
import br.com.tax.taxes.Culture;
import br.com.tax.taxes.Food;
import br.com.tax.taxes.HealthAndWellbeing;
import br.com.tax.taxes.ITax;
import br.com.tax.taxes.Product;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        System.out.println("Bem vindo ao cálculo de impostos.");
        boolean continuar = true;
        while(continuar){
            System.out.println("---------------------------------------------");
            System.out.println("Escolha o tipo de produto para calcular o imposto:");
            System.out.println("1 - Cultura");
            System.out.println("2 - Alimentação");
            System.out.println("3 - Saúde e Bem-estar");
            System.out.println("4 - Vestuário");
            System.out.println("0 - sair");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao){
                case 1 -> {
                    System.out.println("Digite o nome do produto:");
                    String nome = scanner.nextLine();
                    System.out.println("Digite a quantidade do produto:");
                    var quantidade = scanner.nextInt();
                    System.out.println("Digite o valor do produto:");
                    var valor = scanner.nextDouble();
                    Culture culture = new Culture(nome, quantidade, valor);
                    printTax(culture);
                }
                case 2 -> {
                    System.out.println("Digite o nome do produto:");
                    String nome = scanner.nextLine();
                    System.out.println("Digite a quantidade do produto:");
                    var quantidade = scanner.nextInt();
                    System.out.println("Digite o valor do produto:");
                    var valor = scanner.nextDouble();
                    Food food = new Food(nome, quantidade, valor);
                    printTax(food);
                }
                case 3 -> {
                    System.out.println("Digite o nome do produto:");
                    String nome = scanner.nextLine();
                    System.out.println("Digite a quantidade do produto:");
                    var quantidade = scanner.nextInt();
                    System.out.println("Digite o valor do produto:");
                    var valor = scanner.nextDouble();
                    HealthAndWellbeing healthAndWellbeing = new HealthAndWellbeing(nome, quantidade, valor);
                    printTax(healthAndWellbeing);
                }
                case 4 -> {
                    System.out.println("Digite o nome do produto:");
                    String nome = scanner.nextLine();
                    System.out.println("Digite a quantidade do produto:");
                    var quantidade = scanner.nextInt();
                    System.out.println("Digite o valor do produto:");
                    var valor = scanner.nextDouble();
                    Clothing clothing = new Clothing(nome, quantidade, valor);
                    printTax(clothing);
                }
                case 0 -> {
                    continuar = false;
                    System.out.println("Encerrando  o programa. Obrigado por usar nosso serviço!");
                }
            }
        }


    }
    private static void printTax(Product product) {
        ITax taxable = (ITax) product;
        System.out.println("O valor do imposto para o produto "
                + product.getName()
                + " é: "
                + taxable.getTaxValue());
    }
}
