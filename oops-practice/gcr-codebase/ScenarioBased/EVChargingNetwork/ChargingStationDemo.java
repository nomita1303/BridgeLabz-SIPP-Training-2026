public class ChargingStationDemo {

    public static void main(String[] args) {

        ChargingStation s1 = new ChargingStation("CS101", 120);
        ChargingStation s2 = new ChargingStation("CS102", 150);
        ChargingStation s3 = new ChargingStation("CS103", 180);
        ChargingStation s4 = new ChargingStation("CS104", 100);
        ChargingStation s5 = new ChargingStation("CS105", 90);

        System.out.println("Initial Bills\n");

        s1.displayStationDetails();
        s2.displayStationDetails();
        s3.displayStationDetails();
        s4.displayStationDetails();
        s5.displayStationDetails();

        System.out.println("Total Stations: " + ChargingStation.totalStations);

        // Change electricity rate
        ChargingStation.electricityRate = 10.0;

        System.out.println("\nAfter Changing Electricity Rate\n");

        s1.displayStationDetails();
        s2.displayStationDetails();
        s3.displayStationDetails();
        s4.displayStationDetails();
        s5.displayStationDetails();
    }
}