package br.com.tax.taxes;

public class Food extends Product implements ITax {

    private static final double TAX = 1.0 / 100;

    public Food(String name, int quantity, double price) {
        super(name, quantity, price);
    }

    @Override
    public double getTaxValue() {
        return (getQuantity() * getPrice()) * TAX;
    }
}
