package br.com.figure.main;


import br.com.figure.figures.Circle;
import br.com.figure.figures.IGeometricForm;
import br.com.figure.figures.Rectangle;
import br.com.figure.figures.Square;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {



        IGeometricForm geometricForm = null;
        int option;
        while(true){
            System.out.println("Escolha a forma geométrica para calcular a área");
            System.out.println("1 - Quadrado");
            System.out.println("2 - Circulo");
            System.out.println("3 - Retângulo");
            System.out.println("4 - Sair do programa");

            double area = 0;

            option = scanner.nextInt();

            if (option == 1){
                geometricForm = createSquare();
            } else if (option == 2){
                geometricForm = createCircle();
            } else if (option == 3){
                geometricForm = createRectangle();
            } else if (option == 4){
                System.out.println("Saindo do programa...");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
                continue;
            }

            System.out.println("A área do " + geometricForm.getClass().getSimpleName() + " é: " + geometricForm.getArea());
        }

    }

    private static IGeometricForm createCircle() {
        System.out.println("Digite o raio do círculo");
        double radius = scanner.nextDouble();
        return new Circle(radius);
    }

    private static IGeometricForm createRectangle() {
        System.out.println("Digite a largura do retângulo");
        double width = scanner.nextDouble();
        System.out.println("Digite a altura do retângulo");
        double height = scanner.nextDouble();
        return new Rectangle(height, width);
    }

    private static IGeometricForm createSquare() {
        System.out.println("Digite o lado do quadrado");
        var side = scanner.nextDouble();
        return new Square(side);
    }
}