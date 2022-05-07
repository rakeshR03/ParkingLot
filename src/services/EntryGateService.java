package services;

import dtos.GetTicketDTO;
import models.ParkingSpot;
import models.SpotStatus;
import models.Ticket;
import models.VehicleType;

import java.security.PrivateKey;

public class EntryGateService {
    private SpotAllocationService spotAllocationService = new SpotAllocationService();
    private ParkingSpotService parkingSpotService = new ParkingSpotService();
    private TicketService ticketService = new TicketService();

    public GetTicketDTO createTicket(VehicleType type){
        ParkingSpot spot = spotAllocationService.allocateSpot(type);
        if(spot == null){
            throw new RuntimeException("No space available");
        }
        parkingSpotService.markSpotStatus(spot, SpotStatus.FILLED);
        Ticket ticket = ticketService.createTicket(type, spot);
        GetTicketDTO ticketDTO = GetTicketDTO.builder()
                .entryTime(ticket
                        .getEntryTime())
                .type(type).build();

        return ticketDTO;
    }
}

// 1. find available spot
// 2. mark spot booked
// 3. create ticket
// 4. transform ticket to DTO and return.
