import java.util.ArrayList;

public class ParkingManager {

    private ArrayList<String> vehicles = new ArrayList<>();

    public void addVehicle(String number) {

        vehicles.add(number);
        System.out.println(number + " Entered.");
    }

    public void removeVehicle(String number) {

        if (vehicles.remove(number))
            System.out.println(number + " Exited.");
        else
            System.out.println("Vehicle Not Found.");
    }

    public void searchVehicle(String number) {

        if (vehicles.contains(number))
            System.out.println("Vehicle is Parked.");
        else
            System.out.println("Vehicle Not Found.");
    }

    public void displayVehicles() {

        System.out.println("\nParked Vehicles");

        for (String v : vehicles)
            System.out.println(v);

        System.out.println("Occupied Slots = " + vehicles.size());
    }
}