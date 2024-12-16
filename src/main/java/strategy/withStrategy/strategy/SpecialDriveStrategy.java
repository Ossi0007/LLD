package src.main.java.strategy.withStrategy.strategy;

public class SpecialDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Special Drive");
    }
}
