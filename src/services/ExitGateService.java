package services;

import models.ParkingSpot;
import models.SpotStatus;
import models.Ticket;
import models.TicketStatus;
import repositories.ParkingSpotRepository;

public class ExitGateService {

    private ParkingSpotService parkingSpotService = new ParkingSpotService();
    private ParkingSpotRepository parkingSpotRepository = new ParkingSpotRepository();
    private FeeCalculatorService feeCalculatorService = new FeeCalculatorService();
    private PaymentService paymentService = new PaymentService();

    public void exitCustomer(Ticket ticket, Integer payment){
        int totalAmount = feeCalculatorService.calculateFees(ticket);

        //if fullAmount is paid
        if(ticket.getStatus() == TicketStatus.DONE && payment == totalAmount){
            checkOutCustomer(ticket);
        }

        //partially paid
        if(ticket.getStatus() == TicketStatus.DONE && payment != totalAmount){
            Integer amount_to_be_paid = totalAmount - payment;
            paymentService.createPayment(ticket, amount_to_be_paid);
            checkOutCustomer(ticket);
        }

        //not paid
        if(ticket.getStatus() == TicketStatus.PENDING){
            paymentService.createPayment(ticket, totalAmount);
            checkOutCustomer(ticket);
        }
    }

    private void checkOutCustomer(Ticket ticket){

        ParkingSpot spot = parkingSpotRepository.getSpot(ticket.getSpotNumber());
        parkingSpotService.markSpotStatus(spot, SpotStatus.AVAILABLE);
    }
}
