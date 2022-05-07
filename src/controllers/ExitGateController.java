package controllers;

import models.Ticket;
import services.ExitGateService;


public class ExitGateController {
    private ExitGateService exitGateService = new ExitGateService();
    public void exitCustomer(Ticket ticket, Integer payment){
        exitGateService.exitCustomer(ticket, payment);
    }


}

// Implement Exit gate
// check payment
// check price from ticket time
// make slot available
