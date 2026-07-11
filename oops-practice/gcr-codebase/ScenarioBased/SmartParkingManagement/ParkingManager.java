class ParkingManager {

    public static void displayCars(Vehicle[] vehicles) {

        System.out.println("\nCars Parked:\n");

        for (Vehicle v : vehicles) {
            if (v.getVehicleType().equalsIgnoreCase("Car")) {
                v.displayDetails();
            }
        }
    }

    public static void displayBikes(Vehicle[] vehicles) {

        System.out.println("\nBikes Parked:\n");

        for (Vehicle v : vehicles) {
            if (v.getVehicleType().equalsIgnoreCase("Bike")) {
                v.displayDetails();
            }
        }
    }
}