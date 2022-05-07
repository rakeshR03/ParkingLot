package strategies.timebased;

import models.VehicleType;
import strategies.FeeCalculatorFactory;
import strategies.FeesStrategy;

public class TimeBasedStrategyFactory implements FeeCalculatorFactory {

    public FeesStrategy getStrategy(VehicleType type){
        switch(type){
            case SMALL:
                return new SmallVehicleFeesStrategy();

            case MEDIUM:
                return new MediumVehicleFeesStrategy();

            case LARGE:
                return new LargeVehicleFeesStrategy();
        }
        throw new RuntimeException("Invalid Vehicle type");
    }



}
