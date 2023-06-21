package Task2;

public class Main {

    public static void main(String[] args) {

        Vehicle car = new Car("car", 120, 50, 6);
        Vehicle familyCar = new FamilyCar("family car", 120, 60, 7);
        Vehicle sportCar = new SportCar("sport car", 120, 70, 8);
        Vehicle motorcycle = new Motorcycle("motor", 120, 80, 10);
        Vehicle raceMotorcycle = new RaceMotorcycle("race motor", 120, 40, 15);
        Vehicle crossMotorcycle = new CrossMotorcycle("cross motor", 120, 45, 20);

        Vehicle[] vehicles = new Vehicle[] {car, familyCar, sportCar, motorcycle, raceMotorcycle, crossMotorcycle};

        for(Vehicle vehicle : vehicles) {
            vehicle.drive(20);
        }

    }

}
