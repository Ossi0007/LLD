package src.main.java.strategy.withStrategy.strategy;

public class AutomaticDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Special Drive");
    }
}
