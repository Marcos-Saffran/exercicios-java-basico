package br.com.marcos.tickets;

public non-sealed class StandardTicket extends Ticket {

    public StandardTicket(String filmName, double price, String dubbedOrSubtitled) {
        super(filmName, price, dubbedOrSubtitled);
    }

    @Override
    public double getTicketPrice() {
        return price;
    }
}
