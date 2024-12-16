package src.main.java.strategy.withStrategy;

import src.main.java.strategy.withStrategy.strategy.SpecialDriveStrategy;

public class OffRoadVehicle extends Vehicle {

    public OffRoadVehicle() {
        super(new SpecialDriveStrategy());
    }
}
