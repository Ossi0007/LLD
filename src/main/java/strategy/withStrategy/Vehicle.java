package src.main.java.strategy.withStrategy;

import src.main.java.strategy.withStrategy.strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategyObj;

    public Vehicle(DriveStrategy driveStrategyObj){
        this.driveStrategyObj=driveStrategyObj;
    }

    public void drive() {
        driveStrategyObj.drive();
    }
}
