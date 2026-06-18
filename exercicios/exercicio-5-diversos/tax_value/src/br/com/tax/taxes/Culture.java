package br.com.tax.taxes;

public class Culture extends Product implements ITax {

    private static final double TAX = 4.0 / 100;

    public Culture(String name, int quantity, double price) {
        super(name, quantity, price);
    }

    @Override
    public double getTaxValue() {
        return (getQuantity() * getPrice()) * TAX;
    }
}
