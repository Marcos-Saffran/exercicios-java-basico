package br.com.tax.taxes;

public class Clothing extends Product implements ITax {

    private static final double TAX = 2.5 / 100;

    public Clothing(String name, int quantity, double price) {
        super(name, quantity, price);
    }

    @Override
    public double getTaxValue() {
        return (getQuantity() * getPrice()) * TAX;
    }
}
