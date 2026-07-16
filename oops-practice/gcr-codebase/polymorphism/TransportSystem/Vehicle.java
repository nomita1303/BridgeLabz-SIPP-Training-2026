class Vehicle {

    protected String vehicleNumber;

    public Vehicle(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public double fuelCost(double km) {
        return 0;
    }

    public void display() {
        System.out.println("Vehicle Number : " + vehicleNumber);
    }
}