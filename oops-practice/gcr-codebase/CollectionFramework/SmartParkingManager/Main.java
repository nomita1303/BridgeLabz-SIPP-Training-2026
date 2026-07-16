public class Main {

    public static void main(String[] args) {

        ParkingManager parking = new ParkingManager();

        parking.addVehicle("UP85AB1234");
        parking.addVehicle("DL10CD5678");
        parking.addVehicle("HR26EF9090");

        parking.searchVehicle("DL10CD5678");

        parking.removeVehicle("UP85AB1234");

        parking.displayVehicles();
    }
}