package src.main.java.strategy.withStrategy;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new GoodsVehicle();
        vehicle.drive();
        vehicle = new SportsVehicle();
        vehicle.drive();
        vehicle = new PassengerVehicle();
        vehicle.drive();
        vehicle = new OffRoadVehicle();
        vehicle.drive();
    }
}
