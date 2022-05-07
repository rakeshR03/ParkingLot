package services;

import models.Payment;
import models.Ticket;

public class PaymentService {


    public Payment createPayment(Ticket ticket, Integer dueAmount){
        Payment payment = new Payment();
        payment.setAmount(dueAmount);
        payment.setMode("Cash");
        return payment;
    }
}
