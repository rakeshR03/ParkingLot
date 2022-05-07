package strategies;

import models.Ticket;

public interface FeesStrategy {
    public Integer calculateFees(Ticket ticket);
}
