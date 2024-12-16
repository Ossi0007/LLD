package src.main.java.strategy.withStrategy;

import src.main.java.strategy.withStrategy.strategy.SpecialDriveStrategy;

public class SportsVehicle extends Vehicle {
    public SportsVehicle() {
        super(new SpecialDriveStrategy());
    }
}
