package src.main.java.strategy.withStrategy;

import src.main.java.strategy.withStrategy.strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {
    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
