class ChargingStation {

    // Static Variables
    static int totalStations = 0;
    static double electricityRate = 8.5;

    // Instance Variables
    private String stationId;
    private double unitsConsumed;

    // Constructor
    public ChargingStation(String stationId, double unitsConsumed) {
        this.stationId = stationId;
        this.unitsConsumed = unitsConsumed;
        totalStations++;
    }

    // Calculate Bill
    public double calculateBill() {
        return unitsConsumed * electricityRate;
    }

    // Display Details
    public void displayStationDetails() {
        System.out.println("----------------------------");
        System.out.println("Station ID        : " + stationId);
        System.out.println("Units Consumed    : " + unitsConsumed);
        System.out.println("Electricity Rate  : ₹" + electricityRate + "/unit");
        System.out.println("Bill              : ₹" + calculateBill());
        System.out.println("----------------------------");
    }
}