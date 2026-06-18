package br.com.figure.figures;

public record Rectangle(double height, double width) implements IGeometricForm {

    @Override
    public double getArea() {
        return height * width;
    }
}
