package br.com.tax.taxes;

public class HealthAndWellbeing extends Product implements ITax {

    private static final double TAX = 1.5 / 100;

    public HealthAndWellbeing(String name, int quantity, double price) {
        super(name, quantity, price);
    }

    @Override
    public double getTaxValue() {
        return (getQuantity() * getPrice()) * TAX;
    }
}
