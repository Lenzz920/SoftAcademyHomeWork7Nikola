package Task2;

public class Vehicle {

    private String model;
    private int horsePower;
    private double fuel;
    private double defaultFuelConsumption = 1.25;
    private double fuelConsumption;

    public Vehicle(String model, int horsePower, double fuel, double fuelConsumption) {
        this.model = model;
        this.horsePower = horsePower;
        this.fuel = fuel;
        this.fuelConsumption = fuelConsumption;
    }

    public void drive (double kilometers) {
        System.out.println("Drive like a " + this.getClass().getSimpleName());
        this.fuel -= kilometers * fuelConsumption/100;
        System.out.println(this.fuel + " fuel left");
    }



}
