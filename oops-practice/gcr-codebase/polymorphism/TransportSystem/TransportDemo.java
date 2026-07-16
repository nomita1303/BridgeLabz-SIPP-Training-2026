public class TransportDemo {

    public static void main(String[] args) {

        Vehicle[] fleet = {
                new Car("CAR101"),
                new Bus("BUS201"),
                new Bike("BIKE301"),
                new ElectricCar("EV401")
        };

        double km = 100;

        System.out.println("Fuel Cost Details\n");

        for (Vehicle v : fleet) {

            v.display();

            System.out.println("Distance : " + km + " km");
            System.out.println("Fuel Cost : ₹" + v.fuelCost(km));

            // instanceof before casting
            if (v instanceof Car) {
                Car c = (Car) v;
                System.out.println("Type : Car");
            } else if (v instanceof Bus) {
                Bus b = (Bus) v;
                System.out.println("Type : Bus");
            } else if (v instanceof Bike) {
                Bike b = (Bike) v;
                System.out.println("Type : Bike");
            } else if (v instanceof ElectricCar) {
                ElectricCar e = (ElectricCar) v;
                System.out.println("Type : Electric Car");
            }

            System.out.println("----------------------------");
        }
    }
}