package services;

import models.ParkingSpot;
import models.Ticket;
import models.VehicleType;
import repositories.TicketRepository;

import java.time.LocalDateTime;

public class TicketService {
    private TicketRepository ticketRepository = new TicketRepository();

    public Ticket createTicket(VehicleType type, ParkingSpot spot){
        Ticket ticket = Ticket.builder()
                .ticketId("01")
                .entryTime(LocalDateTime.now())
                .floorNumber(spot.getFloorNumber())
                .spotNumber(spot.getSpotId())
                .build();
        return ticketRepository.save(ticket);

    }
}
