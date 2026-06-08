package br.com.marcos.tickets;

public final class HalfpriceTicket extends Ticket{

    public HalfpriceTicket(String filmName, double price, String dubbedOrSubtitled) {
        super(filmName, price, dubbedOrSubtitled);
    }

    @Override
    public double getTicketPrice() {
        return price / 2;
    }
}
