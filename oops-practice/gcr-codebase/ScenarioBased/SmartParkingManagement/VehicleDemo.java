public class VehicleDemo {

    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[10];

        vehicles[0] = new Vehicle("UP80AB1234", "Rahul", "Car");
        vehicles[1] = new Vehicle("UP80CD5678", "Priya", "Bike");
        vehicles[2] = new Vehicle("DL10EF4321", "Aman", "Car");
        vehicles[3] = new Vehicle("HR26GH9876", "Neha", "Bike");
        vehicles[4] = new Vehicle("UP32IJ2468", "Rohan", "Car");
        vehicles[5] = new Vehicle("RJ14KL1357", "Anjali", "Bike");
        vehicles[6] = new Vehicle("MP09MN3698", "Karan", "Car");
        vehicles[7] = new Vehicle("PB10OP7412", "Simran", "Bike");
        vehicles[8] = new Vehicle("UK07QR8521", "Vikas", "Car");
        vehicles[9] = new Vehicle("MH12ST9630", "Pooja", "Bike");

        ParkingManager.displayCars(vehicles);
        ParkingManager.displayBikes(vehicles);
    }
}