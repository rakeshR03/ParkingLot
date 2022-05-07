package controllers;

import dtos.GetTicketDTO;
import models.VehicleType;
import services.EntryGateService;

public class EntryGateController {
    EntryGateService entryGateService = new EntryGateService();

    public GetTicketDTO createTicket(VehicleType type){
        return entryGateService.createTicket(type);
    }
}
