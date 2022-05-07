package strategies;

import strategies.dynamic.DynamicFeesStrategyFactory;
import strategies.timebased.TimeBasedStrategyFactory;

public class FeesStrategyFactory {
    public static FeeCalculatorFactory getFactory(FeesStrategyType type){
        switch(type){
            case TIME:
                return new TimeBasedStrategyFactory();

            case DYNAMIC:
                return new DynamicFeesStrategyFactory();
        }

        throw new RuntimeException("invalid factory type");
    }
}
