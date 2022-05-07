package strategies.dynamic;

import models.VehicleType;
import strategies.FeeCalculatorFactory;
import strategies.FeesStrategy;

public class DynamicFeesStrategyFactory implements FeeCalculatorFactory {
    public FeesStrategy getStrategy(VehicleType type){
        switch(type){
            case LARGE:
                return new LargeVehicleDynamicFeesStrategy();

            case MEDIUM:
                return new MediumVehicleDynamicFeesStrategy();

            case SMALL:
                return new SmallVehicleDynamicFeesStrategy();
        }

        throw new RuntimeException("Invalid vehicle type");
    }


}
