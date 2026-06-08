package br.com.marcos.tickets;

public final class FamilyTicket extends Ticket {

    private int quantity;

    public FamilyTicket(String filmName, double price, String dubbedOrSubtitled, int quantity) {
        super(filmName, price, dubbedOrSubtitled);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public double getTicketPrice() {
        double ticketPrice = this.price * this.quantity;
        if (quantity >= 4) ticketPrice *= 0.95; // Apply a 5% discount for 4 or more tickets
        return ticketPrice;
    }
}
