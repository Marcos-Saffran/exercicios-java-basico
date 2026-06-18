package br.com.figure.figures;

public record Square(double side) implements IGeometricForm {

    @Override
    public double getArea() {
        return side * side;
    }
}
