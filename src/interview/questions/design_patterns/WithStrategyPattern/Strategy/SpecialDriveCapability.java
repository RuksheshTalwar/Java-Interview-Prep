package interview.questions.design_patterns.WithStrategyPattern.Strategy;

public class SpecialDriveCapability implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("special drive capability");
    }
}
