public class Main {

    public static void main(String[] args) {

        EventManager event = new EventManager();

        event.register("nomita@gmail.com");
        event.register("rahul@gmail.com");
        event.register("nomita@gmail.com");

        event.displayParticipants();
    }
}