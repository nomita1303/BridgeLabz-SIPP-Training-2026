class Drone {

    // Instance Variables
    private String droneId;
    private int batteryPercentage;

    // Static Variable
    static String companyName = "Sky Logistics";

    // Constructor
    public Drone(String droneId, int batteryPercentage) {
        this.droneId = droneId;
        this.batteryPercentage = batteryPercentage;
    }

    // Start Delivery Method
    public void startDelivery() {
        if (batteryPercentage >= 30) {
            System.out.println(droneId + " started delivery.");
            batteryPercentage -= 20;
        } else {
            System.out.println(droneId + " cannot start delivery. Battery is too low.");
        }
    }

    // Display Status Method
    public void displayStatus() {
        System.out.println("---------------------------");
        System.out.println("Company Name : " + companyName);
        System.out.println("Drone ID     : " + droneId);
        System.out.println("Battery      : " + batteryPercentage + "%");
        System.out.println("---------------------------");
    }
}