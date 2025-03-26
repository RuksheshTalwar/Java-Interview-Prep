package interview.questions.design_patterns.WithStrategyPattern;

import interview.questions.design_patterns.WithStrategyPattern.Strategy.DriveStrategy;
import interview.questions.design_patterns.WithStrategyPattern.Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle{

    OffRoadVehicle() {
        super( new SportsDriveStrategy());
    }
}
