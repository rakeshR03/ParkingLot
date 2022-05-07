package repositories;

import models.Ticket;

import java.util.ArrayList;
import java.util.List;

public class TicketRepository {
    private List<Ticket> tickets = new ArrayList<>();

    public Ticket save(Ticket ticket){
        tickets.add(ticket);
        return ticket;
    }
}
