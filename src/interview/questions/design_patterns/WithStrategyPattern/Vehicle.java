package interview.questions.design_patterns.WithStrategyPattern;

import interview.questions.design_patterns.WithStrategyPattern.Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveObject;

    //this is constructor dependency injection
    Vehicle(DriveStrategy driveObj) {
        this.driveObject = driveObj;
    }

    public void drive() {
        driveObject.drive();
    }
}
