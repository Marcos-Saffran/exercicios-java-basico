package br.com.figure.figures;

public record  Circle(double radius) implements IGeometricForm {

    private static final double PI = 3.14;

    @Override
    public double getArea() {
        return PI * (radius * radius);
    }
}
