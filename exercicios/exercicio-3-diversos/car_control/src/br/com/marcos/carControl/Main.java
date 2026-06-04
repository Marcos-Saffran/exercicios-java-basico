package br.com.marcos.carControl;

import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        scanner.useDelimiter("\\n");

        Car carro = new Car("Modelo de teste");

        var option = -1;

        do {
            System.out.println("===Escolha uma das opções===");
            System.out.println("1 - Ligar o carro");
            System.out.println("2 - Desligar o carro");
            System.out.println("3 - Acelerar");
            System.out.println("4 - Diminuir velocidade do carro");
            System.out.println("5 - Virar para esquerda / direita");
            System.out.println("6 - Verificar velocidade do carro");
            System.out.println("7 - Trocar a marcha");
            System.out.println("0 - sair");
            option = scanner.nextInt();

            switch (option) {
                case 1 -> carro.turnOn();
                case 2 -> carro.turnOff();
                case 3 -> carro.accelerate();
                case 4 -> carro.slowDown();
                case 5 -> turnTo(carro);
                case 6 -> System.out.println("Velocidade atual: " + carro.getSpeed() + " km/h");
                case 7 -> changeGear(carro);
                case 0 -> System.exit(0);
                default -> System.out.println("Opção inválida, tente novamente.");
            }
        } while (true);

    }

    private static void changeGear(Car carro) {
        System.out.println("Informe a nova marcha desejada (0 a 6): ");
        var chosenGear = scanner.nextInt();
        carro.changeGear(chosenGear);
    }

    private static void turnTo(Car carro) {
        System.out.println("Informe a direção: 1 - Esquerda, 2 - Direita");
        var chosenDirection = scanner.nextInt();
        if (chosenDirection < 1 || chosenDirection > 2) {
            System.out.println("Direção inválida, escolha 1 para esquerda ou 2 para direita.");
            return;
        }
        var textDirection = chosenDirection == 1 ? "Esquerda" : "Direita";
        carro.turnTo(textDirection);
    }
}

