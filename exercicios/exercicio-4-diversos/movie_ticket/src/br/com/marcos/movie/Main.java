package br.com.marcos.movie;

import br.com.marcos.tickets.FamilyTicket;
import br.com.marcos.tickets.HalfpriceTicket;
import br.com.marcos.tickets.StandardTicket;
import br.com.marcos.tickets.Ticket;

public class Main {
    public static void main(String[] args) {
        Ticket standardTicket = new StandardTicket("Super Mario", 20.0, "Dubbed") {
        };
        Ticket halfPriceTicket = new HalfpriceTicket("Super Mario", 20.0, "Dubbed");
        FamilyTicket familyTicket3 = new FamilyTicket("Super Mario", 20.0, "Dubbed", 3);
        FamilyTicket familyTicket4 = new FamilyTicket("Super Mario", 20.0, "Dubbed", 4);

        System.out.println("====== Regular Ticket ======");
        System.out.println("Film: " + standardTicket.getFilmName());
        System.out.println("Price: " + standardTicket.getTicketPrice());
        System.out.println("Dubbed/Subtitled: " + standardTicket.getDubbedOrSubtitled());


        System.out.println("\n====== Half-price Ticket ======");
        System.out.println("Film: " + halfPriceTicket.getFilmName());
        System.out.println("Price: " + halfPriceTicket.getTicketPrice());
        System.out.println("Dubbed/Subtitled: " + halfPriceTicket.getDubbedOrSubtitled());




        System.out.println("\n====== Family Ticket with 3 tickets ======");
        System.out.println("Film: " + familyTicket3.getFilmName());
        System.out.println("Quantity: " + familyTicket3.getQuantity());
        System.out.println("Price: " + familyTicket3.getTicketPrice());
        System.out.println("Dubbed/Subtitled: " + familyTicket3.getDubbedOrSubtitled());

        System.out.println("\n====== Family Ticket with 4 tickets ======");
        System.out.println("Film: " + familyTicket4.getFilmName());
        System.out.println("Quantity: " + familyTicket4.getQuantity());
        System.out.println("Price: " + familyTicket4.getTicketPrice());
        System.out.println("Dubbed/Subtitled: " + familyTicket4.getDubbedOrSubtitled());


    }
}