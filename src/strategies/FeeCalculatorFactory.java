package strategies;

import models.VehicleType;

public interface FeeCalculatorFactory {
    public FeesStrategy getStrategy(VehicleType type);
}
