package interview.questions.design_patterns.WithStrategyPattern;

import interview.questions.design_patterns.WithStrategyPattern.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle{
    GoodsVehicle() {
        super( new NormalDriveStrategy());
    }
}
