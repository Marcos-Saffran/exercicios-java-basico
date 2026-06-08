package br.com.marcos.tickets;

public sealed abstract class Ticket permits StandardTicket, FamilyTicket, HalfpriceTicket{

    protected String filmName;
    protected double price;
    protected String dubbedOrSubtitled;

    public Ticket(String filmName, double price, String dubbedOrSubtitled) {
        this.filmName = filmName;
        this.price = price;
        this.dubbedOrSubtitled = dubbedOrSubtitled;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDubbedOrSubtitled() {
        return dubbedOrSubtitled;
    }

    public void setDubbedOrSubtitled(String dubbedOrSubtitled) {
        this.dubbedOrSubtitled = dubbedOrSubtitled;
    }

    public abstract double getTicketPrice();
}
