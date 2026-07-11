public class DroneDemo {

    public static void main(String[] args) {

        // Creating Drone Objects
        Drone d1 = new Drone("DR101", 90);
        Drone d2 = new Drone("DR102", 60);
        Drone d3 = new Drone("DR103", 25);

        // Display Initial Status
        System.out.println("Initial Status");
        d1.displayStatus();
        d2.displayStatus();
        d3.displayStatus();

        // Start Delivery
        System.out.println("\nStarting Deliveries...");
        d1.startDelivery();
        d2.startDelivery();
        d3.startDelivery();

        // Display Updated Status
        System.out.println("\nUpdated Status");
        d1.displayStatus();
        d2.displayStatus();
        d3.displayStatus();

        // Changing Static Variable
        Drone.companyName = "FastFly Logistics";

        System.out.println("\nAfter Changing Company Name");
        d1.displayStatus();
        d2.displayStatus();
        d3.displayStatus();
    }
}