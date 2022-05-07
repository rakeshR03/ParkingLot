package services;

import models.*;
import strategies.FeeCalculatorFactory;
import strategies.FeesStrategy;
import strategies.FeesStrategyFactory;
import strategies.FeesStrategyType;
import strategies.timebased.TimeBasedStrategyFactory;

public class FeeCalculatorService {
    public Integer calculateFees(Ticket ticket){
        FeesStrategy feesStrategy = FeesStrategyFactory
                .getFactory(FeesStrategyType.TIME)
                .getStrategy(ticket.getVehicleType());
        feesStrategy.calculateFees(ticket);
        return 0;
    }
}

// Model fee calculation as strategy DP.
// Get relevant strategy by vehicle type and registration
// Strategy + Abstract factory
