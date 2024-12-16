package src.main.java.strategy.withStrategy;

import src.main.java.strategy.withStrategy.strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle {


    public PassengerVehicle() {
        super(new NormalDriveStrategy());
    }
}
