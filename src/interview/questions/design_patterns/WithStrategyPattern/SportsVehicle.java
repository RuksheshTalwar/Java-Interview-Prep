package interview.questions.design_patterns.WithStrategyPattern;

import interview.questions.design_patterns.WithStrategyPattern.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{
    public SportsVehicle() {
        super( new SportsDriveStrategy());
    }
}
